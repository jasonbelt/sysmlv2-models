// #Sireum

package tc.TempControlMixedSeL4CAmKES

import org.sireum._
import org.sireum.Random.Impl.Xoshiro256
import tc._

// This file will not be overwritten so is safe to edit
object TempSensor_tsp_tst {

  val rand: Random.Gen64Impl = Random.Gen64Impl(Xoshiro256.create)
  var delta: F32 = 4f

  var lastTemperature: Temperature = Temperature(72.0f, TempUnit.Fahrenheit)

  def initialise(api: TempSensor_Initialization_Api): Unit = {
    Contract(
      Requires(
        // BEGIN INITIALIZES REQUIRES
        // assume AADL_Requirement
        //   All outgoing event ports must be empty
        api.tempChanged.isEmpty
        // END INITIALIZES REQUIRES
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee initializes
        api.currentTemp.degrees == 72.0f
        // END INITIALIZES ENSURES
      )
    )
    api.put_currentTemp(Temperature(72.0f, TempUnit.Fahrenheit))
    // DEMO seeded BUG:
    // api.put_currentTemp(Temperature(-72.0f, TempUnit.Fahrenheit))
  }

  def timeTriggered(api: TempSensor_Operational_Api): Unit = {
    // read temperature from HARDWARE temperature sensor,
    // via interface realized via Slang Extension "TempSensorNative"
    val temp = currentTempGet()
    // set the out data port currentTemp to hold the read temperature
    //  BUG - unauthorized mod of temperature data
    // val adjDegrees = temp.degrees + 13.0f // adjust temperature upward
    // temp = Temperature_i(adjDegrees)
    api.put_currentTemp(temp)
    // put an event on tempChanged out event port to
    // notify subscribers (e.g., tempControl thermostat) that the
    // temperature has changed
    api.put_tempChanged()
  }

  def currentTempGet(): Temperature = {
    // seL4 will place the fan and temp sensor in separate partitions so
    // there is no way to 'query' the fan to see what its state is

    delta =
      if (lastTemperature.degrees > Defs.defaultSetPoint.high.degrees) -4.0f
      else if (lastTemperature.degrees < Defs.defaultSetPoint.low.degrees) 4.0f
      else delta

    val nextTemperature: F32 = {
      if (delta > 0f)
        // fan should be off so the temperature should be increasing
        rand.nextF32Between(lastTemperature.degrees, lastTemperature.degrees + delta)
      else
        // fan should be on so the temperature should be decreasing
        rand.nextF32Between(lastTemperature.degrees + delta, lastTemperature.degrees)
    }

    lastTemperature = Temperature(nextTemperature, TempUnit.Fahrenheit)
    return lastTemperature
  }

  def finalise(api: TempSensor_Operational_Api): Unit = { }
}
