// #Sireum
package tc.TempControlMixedSeL4CAmKES

import org.sireum._

object Defs {
  val defaultTemp: Temperature = Temperature(72.0f, TempUnit.Fahrenheit)

  val defaultSetPoint: SetPoint = SetPoint(
    low = Temperature(70.0f, TempUnit.Fahrenheit),
    high = Temperature(90.0f, TempUnit.Fahrenheit)
  )
}
