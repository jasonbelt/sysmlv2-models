// #Sireum

package tc.TempControlMixedSeL4CAmKES

import org.sireum._
import art._
import tc._

object TempSensor_Api {
  // guarantee Sensor_Temperature_Range
  @strictpure def Sensor_Temperature_Range(currentTemp: TempControlMixedSeL4CAmKES.Temperature): B =
    currentTemp.degrees >= -40.0f &
      currentTemp.degrees <= 122.0f
}

import TempSensor_Api._

@sig trait TempSensor_Api {
  def id: Art.BridgeId
  def currentTemp_Id : Art.PortId
  def tempChanged_Id : Art.PortId

  // Logika spec var representing port state for outgoing data port
  @spec var currentTemp: TempControlMixedSeL4CAmKES.Temperature = $
  @spec def currentTemp_Inv = Invariant(
    Sensor_Temperature_Range(currentTemp)
  )

  def put_currentTemp(value : TempControlMixedSeL4CAmKES.Temperature) : Unit = {
    Contract(
      Requires(
        Sensor_Temperature_Range(value)
      ),
      Modifies(currentTemp),
      Ensures(
        currentTemp == value
      )
    )
    Spec {
      currentTemp = value
    }

    Art.putValue(currentTemp_Id, TempControlMixedSeL4CAmKES.Temperature_Payload(value))
  }

  // Logika spec var representing port state for outgoing event port
  @spec var tempChanged: Option[art.Empty] = $

  def put_tempChanged() : Unit = {
    Contract(
      Modifies(tempChanged),
      Ensures(
        tempChanged == Some(Empty())
      )
    )
    Spec {
      tempChanged = Some(Empty())
    }

    Art.putValue(tempChanged_Id, art.Empty())
  }

  def logInfo(msg: String): Unit = {
    Art.logInfo(id, msg)
  }

  def logDebug(msg: String): Unit = {
    Art.logDebug(id, msg)
  }

  def logError(msg: String): Unit = {
    Art.logError(id, msg)
  }
}

@datatype class TempSensor_Initialization_Api (
  val id: Art.BridgeId,
  val currentTemp_Id : Art.PortId,
  val tempChanged_Id : Art.PortId) extends TempSensor_Api

@datatype class TempSensor_Operational_Api (
  val id: Art.BridgeId,
  val currentTemp_Id : Art.PortId,
  val tempChanged_Id : Art.PortId) extends TempSensor_Api {

}
