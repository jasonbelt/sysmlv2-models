// #Sireum

package tc.SlangTypeLibrary

import org.sireum._
import art._
import tc._

object SlangTypeLibrary extends App {
  def main(args: ISZ[String]): Z = {

    // touch each payload/type in case some are only used as a field in a record
    def printDataContent(a: art.DataContent): Unit = { println(s"${a}") }

    printDataContent(Base_Types.Boolean_Payload(Base_Types.Boolean_example()))
    printDataContent(Base_Types.Integer_Payload(Base_Types.Integer_example()))
    printDataContent(Base_Types.Integer_8_Payload(Base_Types.Integer_8_example()))
    printDataContent(Base_Types.Integer_16_Payload(Base_Types.Integer_16_example()))
    printDataContent(Base_Types.Integer_32_Payload(Base_Types.Integer_32_example()))
    printDataContent(Base_Types.Integer_64_Payload(Base_Types.Integer_64_example()))
    printDataContent(Base_Types.Unsigned_8_Payload(Base_Types.Unsigned_8_example()))
    printDataContent(Base_Types.Unsigned_16_Payload(Base_Types.Unsigned_16_example()))
    printDataContent(Base_Types.Unsigned_32_Payload(Base_Types.Unsigned_32_example()))
    printDataContent(Base_Types.Unsigned_64_Payload(Base_Types.Unsigned_64_example()))
    printDataContent(Base_Types.Float_Payload(Base_Types.Float_example()))
    printDataContent(Base_Types.Float_32_Payload(Base_Types.Float_32_example()))
    printDataContent(Base_Types.Float_64_Payload(Base_Types.Float_64_example()))
    printDataContent(Base_Types.Character_Payload(Base_Types.Character_example()))
    printDataContent(Base_Types.String_Payload(Base_Types.String_example()))
    printDataContent(TempControlMixedSeL4CAmKES.Temperature_Payload(TempControlMixedSeL4CAmKES.Temperature.example()))
    printDataContent(TempControlMixedSeL4CAmKES.TempUnit_Payload(TempControlMixedSeL4CAmKES.TempUnit.byOrdinal(0).get))
    printDataContent(TempControlMixedSeL4CAmKES.SetPoint_Payload(TempControlMixedSeL4CAmKES.SetPoint.example()))
    printDataContent(TempControlMixedSeL4CAmKES.FanCmd_Payload(TempControlMixedSeL4CAmKES.FanCmd.byOrdinal(0).get))
    printDataContent(TempControlMixedSeL4CAmKES.FanAck_Payload(TempControlMixedSeL4CAmKES.FanAck.byOrdinal(0).get))
    printDataContent(art.Empty())

    return 0
  }
}
