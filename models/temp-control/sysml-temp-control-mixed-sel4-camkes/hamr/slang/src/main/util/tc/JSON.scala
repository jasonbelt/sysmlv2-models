// #Sireum
// @formatter:off

// This file is auto-generated from Temperature.scala, TempUnit.scala, SetPoint.scala, FanCmd.scala, FanAck.scala, Base_Types.scala, TempSensor_tsp_tst_Containers.scala, TempControl_tcp_tct_Containers.scala, Fan_fp_ft_Containers.scala, Container.scala, DataContent.scala, Aux_Types.scala

package tc

import org.sireum._
import org.sireum.Json.Printer._

object JSON {

  object Printer {

    @pure def printTempControlMixedSeL4CAmKESTemperature(o: TempControlMixedSeL4CAmKES.Temperature): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlMixedSeL4CAmKES.Temperature""""),
        ("degrees", printF32(o.degrees)),
        ("unit", printTempControlMixedSeL4CAmKESTempUnitType(o.unit))
      ))
    }

    @pure def printTempControlMixedSeL4CAmKESTemperature_Payload(o: TempControlMixedSeL4CAmKES.Temperature_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlMixedSeL4CAmKES.Temperature_Payload""""),
        ("value", printTempControlMixedSeL4CAmKESTemperature(o.value))
      ))
    }

    @pure def printTempControlMixedSeL4CAmKESTempUnitType(o: TempControlMixedSeL4CAmKES.TempUnit.Type): ST = {
      val value: String = o match {
        case TempControlMixedSeL4CAmKES.TempUnit.Fahrenheit => "Fahrenheit"
      }
      return printObject(ISZ(
        ("type", printString("TempControlMixedSeL4CAmKES.TempUnit")),
        ("value", printString(value))
      ))
    }

    @pure def printTempControlMixedSeL4CAmKESTempUnit_Payload(o: TempControlMixedSeL4CAmKES.TempUnit_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlMixedSeL4CAmKES.TempUnit_Payload""""),
        ("value", printTempControlMixedSeL4CAmKESTempUnitType(o.value))
      ))
    }

    @pure def printTempControlMixedSeL4CAmKESSetPoint(o: TempControlMixedSeL4CAmKES.SetPoint): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlMixedSeL4CAmKES.SetPoint""""),
        ("low", printTempControlMixedSeL4CAmKESTemperature(o.low)),
        ("high", printTempControlMixedSeL4CAmKESTemperature(o.high))
      ))
    }

    @pure def printTempControlMixedSeL4CAmKESSetPoint_Payload(o: TempControlMixedSeL4CAmKES.SetPoint_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlMixedSeL4CAmKES.SetPoint_Payload""""),
        ("value", printTempControlMixedSeL4CAmKESSetPoint(o.value))
      ))
    }

    @pure def printTempControlMixedSeL4CAmKESFanCmdType(o: TempControlMixedSeL4CAmKES.FanCmd.Type): ST = {
      val value: String = o match {
        case TempControlMixedSeL4CAmKES.FanCmd.On => "On"
        case TempControlMixedSeL4CAmKES.FanCmd.Off => "Off"
      }
      return printObject(ISZ(
        ("type", printString("TempControlMixedSeL4CAmKES.FanCmd")),
        ("value", printString(value))
      ))
    }

    @pure def printTempControlMixedSeL4CAmKESFanCmd_Payload(o: TempControlMixedSeL4CAmKES.FanCmd_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlMixedSeL4CAmKES.FanCmd_Payload""""),
        ("value", printTempControlMixedSeL4CAmKESFanCmdType(o.value))
      ))
    }

    @pure def printTempControlMixedSeL4CAmKESFanAckType(o: TempControlMixedSeL4CAmKES.FanAck.Type): ST = {
      val value: String = o match {
        case TempControlMixedSeL4CAmKES.FanAck.Ok => "Ok"
        case TempControlMixedSeL4CAmKES.FanAck.Error => "Error"
      }
      return printObject(ISZ(
        ("type", printString("TempControlMixedSeL4CAmKES.FanAck")),
        ("value", printString(value))
      ))
    }

    @pure def printTempControlMixedSeL4CAmKESFanAck_Payload(o: TempControlMixedSeL4CAmKES.FanAck_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlMixedSeL4CAmKES.FanAck_Payload""""),
        ("value", printTempControlMixedSeL4CAmKESFanAckType(o.value))
      ))
    }

    @pure def printBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Boolean_Payload""""),
        ("value", printB(o.value))
      ))
    }

    @pure def printBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_Payload""""),
        ("value", printZ(o.value))
      ))
    }

    @pure def printBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_8_Payload""""),
        ("value", printS8(o.value))
      ))
    }

    @pure def printBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_16_Payload""""),
        ("value", printS16(o.value))
      ))
    }

    @pure def printBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_32_Payload""""),
        ("value", printS32(o.value))
      ))
    }

    @pure def printBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Integer_64_Payload""""),
        ("value", printS64(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_8_Payload""""),
        ("value", printU8(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_16_Payload""""),
        ("value", printU16(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_32_Payload""""),
        ("value", printU32(o.value))
      ))
    }

    @pure def printBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Unsigned_64_Payload""""),
        ("value", printU64(o.value))
      ))
    }

    @pure def printBase_TypesFloat_Payload(o: Base_Types.Float_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_Payload""""),
        ("value", printR(o.value))
      ))
    }

    @pure def printBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_32_Payload""""),
        ("value", printF32(o.value))
      ))
    }

    @pure def printBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Float_64_Payload""""),
        ("value", printF64(o.value))
      ))
    }

    @pure def printBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Character_Payload""""),
        ("value", printC(o.value))
      ))
    }

    @pure def printBase_TypesString_Payload(o: Base_Types.String_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.String_Payload""""),
        ("value", printString(o.value))
      ))
    }

    @pure def printBase_TypesBits_Payload(o: Base_Types.Bits_Payload): ST = {
      return printObject(ISZ(
        ("type", st""""Base_Types.Bits_Payload""""),
        ("value", printISZ(T, o.value, printB _))
      ))
    }

    @pure def printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container): ST = {
      o match {
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P => return printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS => return printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(o)
      }
    }

    @pure def printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P"""")
      ))
    }

    @pure def printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS"""")
      ))
    }

    @pure def printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container): ST = {
      o match {
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P => return printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS => return printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(o)
      }
    }

    @pure def printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P""""),
        ("api_tempChanged", printOption(F, o.api_tempChanged, print_artEmpty _)),
        ("api_currentTemp", printTempControlMixedSeL4CAmKESTemperature(o.api_currentTemp))
      ))
    }

    @pure def printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS""""),
        ("api_tempChanged", printOption(F, o.api_tempChanged, print_artEmpty _)),
        ("api_currentTemp", printTempControlMixedSeL4CAmKESTemperature(o.api_currentTemp))
      ))
    }

    @pure def printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container): ST = {
      o match {
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P => return printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS => return printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(o)
      }
    }

    @pure def printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P""""),
        ("api_tempChanged", printOption(F, o.api_tempChanged, print_artEmpty _)),
        ("api_fanAck", printOption(F, o.api_fanAck, printTempControlMixedSeL4CAmKESFanAckType _)),
        ("api_setPoint", printOption(F, o.api_setPoint, printTempControlMixedSeL4CAmKESSetPoint _)),
        ("api_currentTemp", printTempControlMixedSeL4CAmKESTemperature(o.api_currentTemp))
      ))
    }

    @pure def printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS""""),
        ("In_currentFanState", printTempControlMixedSeL4CAmKESFanCmdType(o.In_currentFanState)),
        ("In_currentSetPoint", printTempControlMixedSeL4CAmKESSetPoint(o.In_currentSetPoint)),
        ("In_fanError", printB(o.In_fanError)),
        ("In_latestTemp", printTempControlMixedSeL4CAmKESTemperature(o.In_latestTemp)),
        ("api_tempChanged", printOption(F, o.api_tempChanged, print_artEmpty _)),
        ("api_fanAck", printOption(F, o.api_fanAck, printTempControlMixedSeL4CAmKESFanAckType _)),
        ("api_setPoint", printOption(F, o.api_setPoint, printTempControlMixedSeL4CAmKESSetPoint _)),
        ("api_currentTemp", printTempControlMixedSeL4CAmKESTemperature(o.api_currentTemp))
      ))
    }

    @pure def printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container): ST = {
      o match {
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P => return printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS => return printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(o)
      }
    }

    @pure def printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P""""),
        ("api_fanCmd", printOption(F, o.api_fanCmd, printTempControlMixedSeL4CAmKESFanCmdType _))
      ))
    }

    @pure def printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS""""),
        ("currentFanState", printTempControlMixedSeL4CAmKESFanCmdType(o.currentFanState)),
        ("currentSetPoint", printTempControlMixedSeL4CAmKESSetPoint(o.currentSetPoint)),
        ("fanError", printB(o.fanError)),
        ("latestTemp", printTempControlMixedSeL4CAmKESTemperature(o.latestTemp)),
        ("api_fanCmd", printOption(F, o.api_fanCmd, printTempControlMixedSeL4CAmKESFanCmdType _))
      ))
    }

    @pure def printTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container): ST = {
      o match {
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P => return printTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS => return printTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(o)
      }
    }

    @pure def printTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P""""),
        ("api_fanCmd", printOption(F, o.api_fanCmd, printTempControlMixedSeL4CAmKESFanCmdType _))
      ))
    }

    @pure def printTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS""""),
        ("api_fanCmd", printOption(F, o.api_fanCmd, printTempControlMixedSeL4CAmKESFanCmdType _))
      ))
    }

    @pure def printTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container): ST = {
      o match {
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P => return printTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS => return printTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(o)
      }
    }

    @pure def printTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P""""),
        ("api_fanAck", printOption(F, o.api_fanAck, printTempControlMixedSeL4CAmKESFanAckType _))
      ))
    }

    @pure def printTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS): ST = {
      return printObject(ISZ(
        ("type", st""""TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS""""),
        ("api_fanAck", printOption(F, o.api_fanAck, printTempControlMixedSeL4CAmKESFanAckType _))
      ))
    }

    @pure def printutilContainer(o: util.Container): ST = {
      o match {
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P => return printTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS => return printTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(o)
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P => return printTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS => return printTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(o)
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P => return printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS => return printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(o)
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P => return printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS => return printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(o)
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P => return printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS => return printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(o)
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P => return printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS => return printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(o)
      }
    }

    @pure def printutilEmptyContainer(o: util.EmptyContainer): ST = {
      return printObject(ISZ(
        ("type", st""""util.EmptyContainer"""")
      ))
    }

    @pure def print_artDataContent(o: art.DataContent): ST = {
      o match {
        case o: Base_Types.Boolean_Payload => return printBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => return printBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => return printBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => return printBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => return printBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => return printBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => return printBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => return printBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => return printBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => return printBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => return printBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => return printBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => return printBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => return printBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => return printBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => return printBase_TypesBits_Payload(o)
        case o: art.Empty => return print_artEmpty(o)
        case o: util.EmptyContainer => return printutilEmptyContainer(o)
        case o: TempControlMixedSeL4CAmKES.FanCmd_Payload => return printTempControlMixedSeL4CAmKESFanCmd_Payload(o)
        case o: TempControlMixedSeL4CAmKES.FanAck_Payload => return printTempControlMixedSeL4CAmKESFanAck_Payload(o)
        case o: TempControlMixedSeL4CAmKES.TempUnit_Payload => return printTempControlMixedSeL4CAmKESTempUnit_Payload(o)
        case o: TempControlMixedSeL4CAmKES.SetPoint_Payload => return printTempControlMixedSeL4CAmKESSetPoint_Payload(o)
        case o: TempControlMixedSeL4CAmKES.Temperature_Payload => return printTempControlMixedSeL4CAmKESTemperature_Payload(o)
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P => return printTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS => return printTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(o)
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P => return printTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS => return printTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(o)
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P => return printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS => return printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(o)
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P => return printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS => return printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(o)
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P => return printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS => return printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(o)
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P => return printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS => return printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(o)
      }
    }

    @pure def print_artEmpty(o: art.Empty): ST = {
      return printObject(ISZ(
        ("type", st""""art.Empty"""")
      ))
    }

  }

  @record class Parser(val input: String) {
    val parser: Json.Parser = Json.Parser.create(input)

    def errorOpt: Option[Json.ErrorMsg] = {
      return parser.errorOpt
    }

    def parseTempControlMixedSeL4CAmKESTemperature(): TempControlMixedSeL4CAmKES.Temperature = {
      val r = parseTempControlMixedSeL4CAmKESTemperatureT(F)
      return r
    }

    def parseTempControlMixedSeL4CAmKESTemperatureT(typeParsed: B): TempControlMixedSeL4CAmKES.Temperature = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlMixedSeL4CAmKES.Temperature")
      }
      parser.parseObjectKey("degrees")
      val degrees = parser.parseF32()
      parser.parseObjectNext()
      parser.parseObjectKey("unit")
      val unit = parseTempControlMixedSeL4CAmKESTempUnitType()
      parser.parseObjectNext()
      return TempControlMixedSeL4CAmKES.Temperature(degrees, unit)
    }

    def parseTempControlMixedSeL4CAmKESTemperature_Payload(): TempControlMixedSeL4CAmKES.Temperature_Payload = {
      val r = parseTempControlMixedSeL4CAmKESTemperature_PayloadT(F)
      return r
    }

    def parseTempControlMixedSeL4CAmKESTemperature_PayloadT(typeParsed: B): TempControlMixedSeL4CAmKES.Temperature_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlMixedSeL4CAmKES.Temperature_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseTempControlMixedSeL4CAmKESTemperature()
      parser.parseObjectNext()
      return TempControlMixedSeL4CAmKES.Temperature_Payload(value)
    }

    def parseTempControlMixedSeL4CAmKESTempUnitType(): TempControlMixedSeL4CAmKES.TempUnit.Type = {
      val r = parseTempControlMixedSeL4CAmKESTempUnitT(F)
      return r
    }

    def parseTempControlMixedSeL4CAmKESTempUnitT(typeParsed: B): TempControlMixedSeL4CAmKES.TempUnit.Type = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlMixedSeL4CAmKES.TempUnit")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      TempControlMixedSeL4CAmKES.TempUnit.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for TempControlMixedSeL4CAmKES.TempUnit.")
          return TempControlMixedSeL4CAmKES.TempUnit.byOrdinal(0).get
      }
    }

    def parseTempControlMixedSeL4CAmKESTempUnit_Payload(): TempControlMixedSeL4CAmKES.TempUnit_Payload = {
      val r = parseTempControlMixedSeL4CAmKESTempUnit_PayloadT(F)
      return r
    }

    def parseTempControlMixedSeL4CAmKESTempUnit_PayloadT(typeParsed: B): TempControlMixedSeL4CAmKES.TempUnit_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlMixedSeL4CAmKES.TempUnit_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseTempControlMixedSeL4CAmKESTempUnitType()
      parser.parseObjectNext()
      return TempControlMixedSeL4CAmKES.TempUnit_Payload(value)
    }

    def parseTempControlMixedSeL4CAmKESSetPoint(): TempControlMixedSeL4CAmKES.SetPoint = {
      val r = parseTempControlMixedSeL4CAmKESSetPointT(F)
      return r
    }

    def parseTempControlMixedSeL4CAmKESSetPointT(typeParsed: B): TempControlMixedSeL4CAmKES.SetPoint = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlMixedSeL4CAmKES.SetPoint")
      }
      parser.parseObjectKey("low")
      val low = parseTempControlMixedSeL4CAmKESTemperature()
      parser.parseObjectNext()
      parser.parseObjectKey("high")
      val high = parseTempControlMixedSeL4CAmKESTemperature()
      parser.parseObjectNext()
      return TempControlMixedSeL4CAmKES.SetPoint(low, high)
    }

    def parseTempControlMixedSeL4CAmKESSetPoint_Payload(): TempControlMixedSeL4CAmKES.SetPoint_Payload = {
      val r = parseTempControlMixedSeL4CAmKESSetPoint_PayloadT(F)
      return r
    }

    def parseTempControlMixedSeL4CAmKESSetPoint_PayloadT(typeParsed: B): TempControlMixedSeL4CAmKES.SetPoint_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlMixedSeL4CAmKES.SetPoint_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseTempControlMixedSeL4CAmKESSetPoint()
      parser.parseObjectNext()
      return TempControlMixedSeL4CAmKES.SetPoint_Payload(value)
    }

    def parseTempControlMixedSeL4CAmKESFanCmdType(): TempControlMixedSeL4CAmKES.FanCmd.Type = {
      val r = parseTempControlMixedSeL4CAmKESFanCmdT(F)
      return r
    }

    def parseTempControlMixedSeL4CAmKESFanCmdT(typeParsed: B): TempControlMixedSeL4CAmKES.FanCmd.Type = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlMixedSeL4CAmKES.FanCmd")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      TempControlMixedSeL4CAmKES.FanCmd.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for TempControlMixedSeL4CAmKES.FanCmd.")
          return TempControlMixedSeL4CAmKES.FanCmd.byOrdinal(0).get
      }
    }

    def parseTempControlMixedSeL4CAmKESFanCmd_Payload(): TempControlMixedSeL4CAmKES.FanCmd_Payload = {
      val r = parseTempControlMixedSeL4CAmKESFanCmd_PayloadT(F)
      return r
    }

    def parseTempControlMixedSeL4CAmKESFanCmd_PayloadT(typeParsed: B): TempControlMixedSeL4CAmKES.FanCmd_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlMixedSeL4CAmKES.FanCmd_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseTempControlMixedSeL4CAmKESFanCmdType()
      parser.parseObjectNext()
      return TempControlMixedSeL4CAmKES.FanCmd_Payload(value)
    }

    def parseTempControlMixedSeL4CAmKESFanAckType(): TempControlMixedSeL4CAmKES.FanAck.Type = {
      val r = parseTempControlMixedSeL4CAmKESFanAckT(F)
      return r
    }

    def parseTempControlMixedSeL4CAmKESFanAckT(typeParsed: B): TempControlMixedSeL4CAmKES.FanAck.Type = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlMixedSeL4CAmKES.FanAck")
      }
      parser.parseObjectKey("value")
      var i = parser.offset
      val s = parser.parseString()
      parser.parseObjectNext()
      TempControlMixedSeL4CAmKES.FanAck.byName(s) match {
        case Some(r) => return r
        case _ =>
          parser.parseException(i, s"Invalid element name '$s' for TempControlMixedSeL4CAmKES.FanAck.")
          return TempControlMixedSeL4CAmKES.FanAck.byOrdinal(0).get
      }
    }

    def parseTempControlMixedSeL4CAmKESFanAck_Payload(): TempControlMixedSeL4CAmKES.FanAck_Payload = {
      val r = parseTempControlMixedSeL4CAmKESFanAck_PayloadT(F)
      return r
    }

    def parseTempControlMixedSeL4CAmKESFanAck_PayloadT(typeParsed: B): TempControlMixedSeL4CAmKES.FanAck_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlMixedSeL4CAmKES.FanAck_Payload")
      }
      parser.parseObjectKey("value")
      val value = parseTempControlMixedSeL4CAmKESFanAckType()
      parser.parseObjectNext()
      return TempControlMixedSeL4CAmKES.FanAck_Payload(value)
    }

    def parseBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = parseBase_TypesBoolean_PayloadT(F)
      return r
    }

    def parseBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Boolean_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseB()
      parser.parseObjectNext()
      return Base_Types.Boolean_Payload(value)
    }

    def parseBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = parseBase_TypesInteger_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseZ()
      parser.parseObjectNext()
      return Base_Types.Integer_Payload(value)
    }

    def parseBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = parseBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS8()
      parser.parseObjectNext()
      return Base_Types.Integer_8_Payload(value)
    }

    def parseBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = parseBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS16()
      parser.parseObjectNext()
      return Base_Types.Integer_16_Payload(value)
    }

    def parseBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = parseBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS32()
      parser.parseObjectNext()
      return Base_Types.Integer_32_Payload(value)
    }

    def parseBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = parseBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def parseBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Integer_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseS64()
      parser.parseObjectNext()
      return Base_Types.Integer_64_Payload(value)
    }

    def parseBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = parseBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_8_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU8()
      parser.parseObjectNext()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def parseBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = parseBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_16_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU16()
      parser.parseObjectNext()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def parseBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = parseBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU32()
      parser.parseObjectNext()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def parseBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = parseBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def parseBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Unsigned_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseU64()
      parser.parseObjectNext()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def parseBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = parseBase_TypesFloat_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseR()
      parser.parseObjectNext()
      return Base_Types.Float_Payload(value)
    }

    def parseBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = parseBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_32_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF32()
      parser.parseObjectNext()
      return Base_Types.Float_32_Payload(value)
    }

    def parseBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = parseBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def parseBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Float_64_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseF64()
      parser.parseObjectNext()
      return Base_Types.Float_64_Payload(value)
    }

    def parseBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = parseBase_TypesCharacter_PayloadT(F)
      return r
    }

    def parseBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Character_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseC()
      parser.parseObjectNext()
      return Base_Types.Character_Payload(value)
    }

    def parseBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = parseBase_TypesString_PayloadT(F)
      return r
    }

    def parseBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.String_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseString()
      parser.parseObjectNext()
      return Base_Types.String_Payload(value)
    }

    def parseBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = parseBase_TypesBits_PayloadT(F)
      return r
    }

    def parseBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        parser.parseObjectType("Base_Types.Bits_Payload")
      }
      parser.parseObjectKey("value")
      val value = parser.parseISZ(parser.parseB _)
      parser.parseObjectNext()
      return Base_Types.Bits_Payload(value)
    }

    def parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container(): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P", "TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS"))
      t.native match {
        case "TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P" => val r = parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PT(T); return r
        case "TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS" => val r = parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PST(T); return r
        case _ => val r = parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PST(T); return r
      }
    }

    def parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P = {
      val r = parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PT(F)
      return r
    }

    def parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PT(typeParsed: B): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P")
      }
      return TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P()
    }

    def parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS = {
      val r = parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PST(F)
      return r
    }

    def parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PST(typeParsed: B): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS")
      }
      return TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS()
    }

    def parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container(): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P", "TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS"))
      t.native match {
        case "TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P" => val r = parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PT(T); return r
        case "TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS" => val r = parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PST(T); return r
        case _ => val r = parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PST(T); return r
      }
    }

    def parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P = {
      val r = parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PT(F)
      return r
    }

    def parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PT(typeParsed: B): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P")
      }
      parser.parseObjectKey("api_tempChanged")
      val api_tempChanged = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_currentTemp")
      val api_currentTemp = parseTempControlMixedSeL4CAmKESTemperature()
      parser.parseObjectNext()
      return TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P(api_tempChanged, api_currentTemp)
    }

    def parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS = {
      val r = parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PST(F)
      return r
    }

    def parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PST(typeParsed: B): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS")
      }
      parser.parseObjectKey("api_tempChanged")
      val api_tempChanged = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_currentTemp")
      val api_currentTemp = parseTempControlMixedSeL4CAmKESTemperature()
      parser.parseObjectNext()
      return TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS(api_tempChanged, api_currentTemp)
    }

    def parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container(): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P", "TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS"))
      t.native match {
        case "TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P" => val r = parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PT(T); return r
        case "TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS" => val r = parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PST(T); return r
        case _ => val r = parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PST(T); return r
      }
    }

    def parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P = {
      val r = parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PT(F)
      return r
    }

    def parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PT(typeParsed: B): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P")
      }
      parser.parseObjectKey("api_tempChanged")
      val api_tempChanged = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_fanAck")
      val api_fanAck = parser.parseOption(parseTempControlMixedSeL4CAmKESFanAckType _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_setPoint")
      val api_setPoint = parser.parseOption(parseTempControlMixedSeL4CAmKESSetPoint _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_currentTemp")
      val api_currentTemp = parseTempControlMixedSeL4CAmKESTemperature()
      parser.parseObjectNext()
      return TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P(api_tempChanged, api_fanAck, api_setPoint, api_currentTemp)
    }

    def parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS = {
      val r = parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PST(F)
      return r
    }

    def parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PST(typeParsed: B): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS")
      }
      parser.parseObjectKey("In_currentFanState")
      val In_currentFanState = parseTempControlMixedSeL4CAmKESFanCmdType()
      parser.parseObjectNext()
      parser.parseObjectKey("In_currentSetPoint")
      val In_currentSetPoint = parseTempControlMixedSeL4CAmKESSetPoint()
      parser.parseObjectNext()
      parser.parseObjectKey("In_fanError")
      val In_fanError = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("In_latestTemp")
      val In_latestTemp = parseTempControlMixedSeL4CAmKESTemperature()
      parser.parseObjectNext()
      parser.parseObjectKey("api_tempChanged")
      val api_tempChanged = parser.parseOption(parse_artEmpty _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_fanAck")
      val api_fanAck = parser.parseOption(parseTempControlMixedSeL4CAmKESFanAckType _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_setPoint")
      val api_setPoint = parser.parseOption(parseTempControlMixedSeL4CAmKESSetPoint _)
      parser.parseObjectNext()
      parser.parseObjectKey("api_currentTemp")
      val api_currentTemp = parseTempControlMixedSeL4CAmKESTemperature()
      parser.parseObjectNext()
      return TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS(In_currentFanState, In_currentSetPoint, In_fanError, In_latestTemp, api_tempChanged, api_fanAck, api_setPoint, api_currentTemp)
    }

    def parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container(): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P", "TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS"))
      t.native match {
        case "TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P" => val r = parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PT(T); return r
        case "TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS" => val r = parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PST(T); return r
        case _ => val r = parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PST(T); return r
      }
    }

    def parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P = {
      val r = parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PT(F)
      return r
    }

    def parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PT(typeParsed: B): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P")
      }
      parser.parseObjectKey("api_fanCmd")
      val api_fanCmd = parser.parseOption(parseTempControlMixedSeL4CAmKESFanCmdType _)
      parser.parseObjectNext()
      return TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P(api_fanCmd)
    }

    def parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS = {
      val r = parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PST(F)
      return r
    }

    def parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PST(typeParsed: B): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS")
      }
      parser.parseObjectKey("currentFanState")
      val currentFanState = parseTempControlMixedSeL4CAmKESFanCmdType()
      parser.parseObjectNext()
      parser.parseObjectKey("currentSetPoint")
      val currentSetPoint = parseTempControlMixedSeL4CAmKESSetPoint()
      parser.parseObjectNext()
      parser.parseObjectKey("fanError")
      val fanError = parser.parseB()
      parser.parseObjectNext()
      parser.parseObjectKey("latestTemp")
      val latestTemp = parseTempControlMixedSeL4CAmKESTemperature()
      parser.parseObjectNext()
      parser.parseObjectKey("api_fanCmd")
      val api_fanCmd = parser.parseOption(parseTempControlMixedSeL4CAmKESFanCmdType _)
      parser.parseObjectNext()
      return TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS(currentFanState, currentSetPoint, fanError, latestTemp, api_fanCmd)
    }

    def parseTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container(): TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container = {
      val t = parser.parseObjectTypes(ISZ("TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P", "TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS"))
      t.native match {
        case "TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P" => val r = parseTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PT(T); return r
        case "TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS" => val r = parseTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PST(T); return r
        case _ => val r = parseTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PST(T); return r
      }
    }

    def parseTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(): TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P = {
      val r = parseTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PT(F)
      return r
    }

    def parseTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PT(typeParsed: B): TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P")
      }
      parser.parseObjectKey("api_fanCmd")
      val api_fanCmd = parser.parseOption(parseTempControlMixedSeL4CAmKESFanCmdType _)
      parser.parseObjectNext()
      return TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P(api_fanCmd)
    }

    def parseTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(): TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS = {
      val r = parseTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PST(F)
      return r
    }

    def parseTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PST(typeParsed: B): TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS")
      }
      parser.parseObjectKey("api_fanCmd")
      val api_fanCmd = parser.parseOption(parseTempControlMixedSeL4CAmKESFanCmdType _)
      parser.parseObjectNext()
      return TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS(api_fanCmd)
    }

    def parseTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container(): TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container = {
      val t = parser.parseObjectTypes(ISZ("TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P", "TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS"))
      t.native match {
        case "TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P" => val r = parseTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PT(T); return r
        case "TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS" => val r = parseTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PST(T); return r
        case _ => val r = parseTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PST(T); return r
      }
    }

    def parseTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(): TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P = {
      val r = parseTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PT(F)
      return r
    }

    def parseTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PT(typeParsed: B): TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P")
      }
      parser.parseObjectKey("api_fanAck")
      val api_fanAck = parser.parseOption(parseTempControlMixedSeL4CAmKESFanAckType _)
      parser.parseObjectNext()
      return TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P(api_fanAck)
    }

    def parseTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(): TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS = {
      val r = parseTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PST(F)
      return r
    }

    def parseTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PST(typeParsed: B): TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS = {
      if (!typeParsed) {
        parser.parseObjectType("TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS")
      }
      parser.parseObjectKey("api_fanAck")
      val api_fanAck = parser.parseOption(parseTempControlMixedSeL4CAmKESFanAckType _)
      parser.parseObjectNext()
      return TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS(api_fanAck)
    }

    def parseutilContainer(): util.Container = {
      val t = parser.parseObjectTypes(ISZ("util.EmptyContainer", "TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P", "TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS", "TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P", "TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS", "TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P", "TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS", "TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P", "TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS", "TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P", "TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS", "TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P", "TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS"))
      t.native match {
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P" => val r = parseTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PT(T); return r
        case "TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS" => val r = parseTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PST(T); return r
        case "TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P" => val r = parseTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PT(T); return r
        case "TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS" => val r = parseTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PST(T); return r
        case "TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P" => val r = parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PT(T); return r
        case "TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS" => val r = parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PST(T); return r
        case "TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P" => val r = parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PT(T); return r
        case "TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS" => val r = parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PST(T); return r
        case "TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P" => val r = parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PT(T); return r
        case "TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS" => val r = parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PST(T); return r
        case "TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P" => val r = parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PT(T); return r
        case "TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS" => val r = parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PST(T); return r
        case _ => val r = parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PST(T); return r
      }
    }

    def parseutilEmptyContainer(): util.EmptyContainer = {
      val r = parseutilEmptyContainerT(F)
      return r
    }

    def parseutilEmptyContainerT(typeParsed: B): util.EmptyContainer = {
      if (!typeParsed) {
        parser.parseObjectType("util.EmptyContainer")
      }
      return util.EmptyContainer()
    }

    def parse_artDataContent(): art.DataContent = {
      val t = parser.parseObjectTypes(ISZ("Base_Types.Boolean_Payload", "Base_Types.Integer_Payload", "Base_Types.Integer_8_Payload", "Base_Types.Integer_16_Payload", "Base_Types.Integer_32_Payload", "Base_Types.Integer_64_Payload", "Base_Types.Unsigned_8_Payload", "Base_Types.Unsigned_16_Payload", "Base_Types.Unsigned_32_Payload", "Base_Types.Unsigned_64_Payload", "Base_Types.Float_Payload", "Base_Types.Float_32_Payload", "Base_Types.Float_64_Payload", "Base_Types.Character_Payload", "Base_Types.String_Payload", "Base_Types.Bits_Payload", "art.Empty", "util.EmptyContainer", "TempControlMixedSeL4CAmKES.FanCmd_Payload", "TempControlMixedSeL4CAmKES.FanAck_Payload", "TempControlMixedSeL4CAmKES.TempUnit_Payload", "TempControlMixedSeL4CAmKES.SetPoint_Payload", "TempControlMixedSeL4CAmKES.Temperature_Payload", "TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P", "TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS", "TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P", "TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS", "TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P", "TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS", "TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P", "TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS", "TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P", "TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS", "TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P", "TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS"))
      t.native match {
        case "Base_Types.Boolean_Payload" => val r = parseBase_TypesBoolean_PayloadT(T); return r
        case "Base_Types.Integer_Payload" => val r = parseBase_TypesInteger_PayloadT(T); return r
        case "Base_Types.Integer_8_Payload" => val r = parseBase_TypesInteger_8_PayloadT(T); return r
        case "Base_Types.Integer_16_Payload" => val r = parseBase_TypesInteger_16_PayloadT(T); return r
        case "Base_Types.Integer_32_Payload" => val r = parseBase_TypesInteger_32_PayloadT(T); return r
        case "Base_Types.Integer_64_Payload" => val r = parseBase_TypesInteger_64_PayloadT(T); return r
        case "Base_Types.Unsigned_8_Payload" => val r = parseBase_TypesUnsigned_8_PayloadT(T); return r
        case "Base_Types.Unsigned_16_Payload" => val r = parseBase_TypesUnsigned_16_PayloadT(T); return r
        case "Base_Types.Unsigned_32_Payload" => val r = parseBase_TypesUnsigned_32_PayloadT(T); return r
        case "Base_Types.Unsigned_64_Payload" => val r = parseBase_TypesUnsigned_64_PayloadT(T); return r
        case "Base_Types.Float_Payload" => val r = parseBase_TypesFloat_PayloadT(T); return r
        case "Base_Types.Float_32_Payload" => val r = parseBase_TypesFloat_32_PayloadT(T); return r
        case "Base_Types.Float_64_Payload" => val r = parseBase_TypesFloat_64_PayloadT(T); return r
        case "Base_Types.Character_Payload" => val r = parseBase_TypesCharacter_PayloadT(T); return r
        case "Base_Types.String_Payload" => val r = parseBase_TypesString_PayloadT(T); return r
        case "Base_Types.Bits_Payload" => val r = parseBase_TypesBits_PayloadT(T); return r
        case "art.Empty" => val r = parse_artEmptyT(T); return r
        case "util.EmptyContainer" => val r = parseutilEmptyContainerT(T); return r
        case "TempControlMixedSeL4CAmKES.FanCmd_Payload" => val r = parseTempControlMixedSeL4CAmKESFanCmd_PayloadT(T); return r
        case "TempControlMixedSeL4CAmKES.FanAck_Payload" => val r = parseTempControlMixedSeL4CAmKESFanAck_PayloadT(T); return r
        case "TempControlMixedSeL4CAmKES.TempUnit_Payload" => val r = parseTempControlMixedSeL4CAmKESTempUnit_PayloadT(T); return r
        case "TempControlMixedSeL4CAmKES.SetPoint_Payload" => val r = parseTempControlMixedSeL4CAmKESSetPoint_PayloadT(T); return r
        case "TempControlMixedSeL4CAmKES.Temperature_Payload" => val r = parseTempControlMixedSeL4CAmKESTemperature_PayloadT(T); return r
        case "TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P" => val r = parseTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PT(T); return r
        case "TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS" => val r = parseTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PST(T); return r
        case "TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P" => val r = parseTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PT(T); return r
        case "TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS" => val r = parseTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PST(T); return r
        case "TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P" => val r = parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PT(T); return r
        case "TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS" => val r = parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PST(T); return r
        case "TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P" => val r = parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PT(T); return r
        case "TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS" => val r = parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PST(T); return r
        case "TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P" => val r = parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PT(T); return r
        case "TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS" => val r = parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PST(T); return r
        case "TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P" => val r = parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PT(T); return r
        case "TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS" => val r = parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PST(T); return r
        case _ => val r = parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PST(T); return r
      }
    }

    def parse_artEmpty(): art.Empty = {
      val r = parse_artEmptyT(F)
      return r
    }

    def parse_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        parser.parseObjectType("art.Empty")
      }
      return art.Empty()
    }

    def eof(): B = {
      val r = parser.eof()
      return r
    }

  }

  def to[T](s: String, f: Parser => T): Either[T, Json.ErrorMsg] = {
    val parser = Parser(s)
    val r = f(parser)
    parser.eof()
    parser.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromTempControlMixedSeL4CAmKESTemperature(o: TempControlMixedSeL4CAmKES.Temperature, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESTemperature(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESTemperature(s: String): Either[TempControlMixedSeL4CAmKES.Temperature, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTemperature(parser: Parser): TempControlMixedSeL4CAmKES.Temperature = {
      val r = parser.parseTempControlMixedSeL4CAmKESTemperature()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESTemperature _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTemperature_Payload(o: TempControlMixedSeL4CAmKES.Temperature_Payload, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESTemperature_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESTemperature_Payload(s: String): Either[TempControlMixedSeL4CAmKES.Temperature_Payload, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTemperature_Payload(parser: Parser): TempControlMixedSeL4CAmKES.Temperature_Payload = {
      val r = parser.parseTempControlMixedSeL4CAmKESTemperature_Payload()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESTemperature_Payload _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempUnit_Payload(o: TempControlMixedSeL4CAmKES.TempUnit_Payload, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESTempUnit_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESTempUnit_Payload(s: String): Either[TempControlMixedSeL4CAmKES.TempUnit_Payload, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempUnit_Payload(parser: Parser): TempControlMixedSeL4CAmKES.TempUnit_Payload = {
      val r = parser.parseTempControlMixedSeL4CAmKESTempUnit_Payload()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESTempUnit_Payload _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESSetPoint(o: TempControlMixedSeL4CAmKES.SetPoint, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESSetPoint(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESSetPoint(s: String): Either[TempControlMixedSeL4CAmKES.SetPoint, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESSetPoint(parser: Parser): TempControlMixedSeL4CAmKES.SetPoint = {
      val r = parser.parseTempControlMixedSeL4CAmKESSetPoint()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESSetPoint _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESSetPoint_Payload(o: TempControlMixedSeL4CAmKES.SetPoint_Payload, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESSetPoint_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESSetPoint_Payload(s: String): Either[TempControlMixedSeL4CAmKES.SetPoint_Payload, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESSetPoint_Payload(parser: Parser): TempControlMixedSeL4CAmKES.SetPoint_Payload = {
      val r = parser.parseTempControlMixedSeL4CAmKESSetPoint_Payload()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESSetPoint_Payload _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESFanCmd_Payload(o: TempControlMixedSeL4CAmKES.FanCmd_Payload, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESFanCmd_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESFanCmd_Payload(s: String): Either[TempControlMixedSeL4CAmKES.FanCmd_Payload, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESFanCmd_Payload(parser: Parser): TempControlMixedSeL4CAmKES.FanCmd_Payload = {
      val r = parser.parseTempControlMixedSeL4CAmKESFanCmd_Payload()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESFanCmd_Payload _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESFanAck_Payload(o: TempControlMixedSeL4CAmKES.FanAck_Payload, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESFanAck_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESFanAck_Payload(s: String): Either[TempControlMixedSeL4CAmKES.FanAck_Payload, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESFanAck_Payload(parser: Parser): TempControlMixedSeL4CAmKES.FanAck_Payload = {
      val r = parser.parseTempControlMixedSeL4CAmKESFanAck_Payload()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESFanAck_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBoolean_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBoolean_Payload(s: String): Either[Base_Types.Boolean_Payload, Json.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(parser: Parser): Base_Types.Boolean_Payload = {
      val r = parser.parseBase_TypesBoolean_Payload()
      return r
    }
    val r = to(s, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_Payload(s: String): Either[Base_Types.Integer_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_Payload(parser: Parser): Base_Types.Integer_Payload = {
      val r = parser.parseBase_TypesInteger_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_8_Payload(s: String): Either[Base_Types.Integer_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(parser: Parser): Base_Types.Integer_8_Payload = {
      val r = parser.parseBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_16_Payload(s: String): Either[Base_Types.Integer_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(parser: Parser): Base_Types.Integer_16_Payload = {
      val r = parser.parseBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_32_Payload(s: String): Either[Base_Types.Integer_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(parser: Parser): Base_Types.Integer_32_Payload = {
      val r = parser.parseBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesInteger_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesInteger_64_Payload(s: String): Either[Base_Types.Integer_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(parser: Parser): Base_Types.Integer_64_Payload = {
      val r = parser.parseBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_8_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_8_Payload(s: String): Either[Base_Types.Unsigned_8_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(parser: Parser): Base_Types.Unsigned_8_Payload = {
      val r = parser.parseBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_16_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_16_Payload(s: String): Either[Base_Types.Unsigned_16_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(parser: Parser): Base_Types.Unsigned_16_Payload = {
      val r = parser.parseBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_32_Payload(s: String): Either[Base_Types.Unsigned_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(parser: Parser): Base_Types.Unsigned_32_Payload = {
      val r = parser.parseBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesUnsigned_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesUnsigned_64_Payload(s: String): Either[Base_Types.Unsigned_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(parser: Parser): Base_Types.Unsigned_64_Payload = {
      val r = parser.parseBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_Payload(s: String): Either[Base_Types.Float_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_Payload(parser: Parser): Base_Types.Float_Payload = {
      val r = parser.parseBase_TypesFloat_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_32_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_32_Payload(s: String): Either[Base_Types.Float_32_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(parser: Parser): Base_Types.Float_32_Payload = {
      val r = parser.parseBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesFloat_64_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesFloat_64_Payload(s: String): Either[Base_Types.Float_64_Payload, Json.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(parser: Parser): Base_Types.Float_64_Payload = {
      val r = parser.parseBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(s, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesCharacter_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesCharacter_Payload(s: String): Either[Base_Types.Character_Payload, Json.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(parser: Parser): Base_Types.Character_Payload = {
      val r = parser.parseBase_TypesCharacter_Payload()
      return r
    }
    val r = to(s, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesString_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesString_Payload(s: String): Either[Base_Types.String_Payload, Json.ErrorMsg] = {
    def fBase_TypesString_Payload(parser: Parser): Base_Types.String_Payload = {
      val r = parser.parseBase_TypesString_Payload()
      return r
    }
    val r = to(s, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, isCompact: B): String = {
    val st = Printer.printBase_TypesBits_Payload(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toBase_TypesBits_Payload(s: String): Either[Base_Types.Bits_Payload, Json.ErrorMsg] = {
    def fBase_TypesBits_Payload(parser: Parser): Base_Types.Bits_Payload = {
      val r = parser.parseBase_TypesBits_Payload()
      return r
    }
    val r = to(s, fBase_TypesBits_Payload _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container(s: String): Either[TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container(parser: Parser): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container = {
      val r = parser.parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(s: String): Either[TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(parser: Parser): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P = {
      val r = parser.parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(s: String): Either[TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(parser: Parser): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS = {
      val r = parser.parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container(s: String): Either[TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container(parser: Parser): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container = {
      val r = parser.parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(s: String): Either[TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(parser: Parser): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P = {
      val r = parser.parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(s: String): Either[TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(parser: Parser): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS = {
      val r = parser.parseTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container(s: String): Either[TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container(parser: Parser): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container = {
      val r = parser.parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(s: String): Either[TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(parser: Parser): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P = {
      val r = parser.parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(s: String): Either[TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(parser: Parser): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS = {
      val r = parser.parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container(s: String): Either[TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container(parser: Parser): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container = {
      val r = parser.parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(s: String): Either[TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(parser: Parser): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P = {
      val r = parser.parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(s: String): Either[TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(parser: Parser): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS = {
      val r = parser.parseTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container(s: String): Either[TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container(parser: Parser): TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container = {
      val r = parser.parseTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(s: String): Either[TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(parser: Parser): TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P = {
      val r = parser.parseTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(s: String): Either[TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(parser: Parser): TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS = {
      val r = parser.parseTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container(s: String): Either[TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container(parser: Parser): TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container = {
      val r = parser.parseTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(s: String): Either[TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(parser: Parser): TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P = {
      val r = parser.parseTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS, isCompact: B): String = {
    val st = Printer.printTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(s: String): Either[TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS, Json.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(parser: Parser): TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS = {
      val r = parser.parseTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS()
      return r
    }
    val r = to(s, fTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS _)
    return r
  }

  def fromutilContainer(o: util.Container, isCompact: B): String = {
    val st = Printer.printutilContainer(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toutilContainer(s: String): Either[util.Container, Json.ErrorMsg] = {
    def futilContainer(parser: Parser): util.Container = {
      val r = parser.parseutilContainer()
      return r
    }
    val r = to(s, futilContainer _)
    return r
  }

  def fromutilEmptyContainer(o: util.EmptyContainer, isCompact: B): String = {
    val st = Printer.printutilEmptyContainer(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def toutilEmptyContainer(s: String): Either[util.EmptyContainer, Json.ErrorMsg] = {
    def futilEmptyContainer(parser: Parser): util.EmptyContainer = {
      val r = parser.parseutilEmptyContainer()
      return r
    }
    val r = to(s, futilEmptyContainer _)
    return r
  }

  def from_artDataContent(o: art.DataContent, isCompact: B): String = {
    val st = Printer.print_artDataContent(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artDataContent(s: String): Either[art.DataContent, Json.ErrorMsg] = {
    def f_artDataContent(parser: Parser): art.DataContent = {
      val r = parser.parse_artDataContent()
      return r
    }
    val r = to(s, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, isCompact: B): String = {
    val st = Printer.print_artEmpty(o)
    if (isCompact) {
      return st.renderCompact
    } else {
      return st.render
    }
  }

  def to_artEmpty(s: String): Either[art.Empty, Json.ErrorMsg] = {
    def f_artEmpty(parser: Parser): art.Empty = {
      val r = parser.parse_artEmpty()
      return r
    }
    val r = to(s, f_artEmpty _)
    return r
  }

}