// #Sireum
// @formatter:off

// This file is auto-generated from Temperature.scala, TempUnit.scala, SetPoint.scala, FanCmd.scala, FanAck.scala, Base_Types.scala, TempSensor_tsp_tst_Containers.scala, TempControl_tcp_tct_Containers.scala, Fan_fp_ft_Containers.scala, Container.scala, DataContent.scala, Aux_Types.scala

package tc

import org.sireum._

object MsgPack {

  object Constants {

    val TempControlMixedSeL4CAmKESTemperature: Z = -32

    val TempControlMixedSeL4CAmKESTemperature_Payload: Z = -31

    val TempControlMixedSeL4CAmKESTempUnit_Payload: Z = -30

    val TempControlMixedSeL4CAmKESSetPoint: Z = -29

    val TempControlMixedSeL4CAmKESSetPoint_Payload: Z = -28

    val TempControlMixedSeL4CAmKESFanCmd_Payload: Z = -27

    val TempControlMixedSeL4CAmKESFanAck_Payload: Z = -26

    val Base_TypesBoolean_Payload: Z = -25

    val Base_TypesInteger_Payload: Z = -24

    val Base_TypesInteger_8_Payload: Z = -23

    val Base_TypesInteger_16_Payload: Z = -22

    val Base_TypesInteger_32_Payload: Z = -21

    val Base_TypesInteger_64_Payload: Z = -20

    val Base_TypesUnsigned_8_Payload: Z = -19

    val Base_TypesUnsigned_16_Payload: Z = -18

    val Base_TypesUnsigned_32_Payload: Z = -17

    val Base_TypesUnsigned_64_Payload: Z = -16

    val Base_TypesFloat_Payload: Z = -15

    val Base_TypesFloat_32_Payload: Z = -14

    val Base_TypesFloat_64_Payload: Z = -13

    val Base_TypesCharacter_Payload: Z = -12

    val Base_TypesString_Payload: Z = -11

    val Base_TypesBits_Payload: Z = -10

    val TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P: Z = -9

    val TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS: Z = -8

    val TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P: Z = -7

    val TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS: Z = -6

    val TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P: Z = -5

    val TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS: Z = -4

    val TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P: Z = -3

    val TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS: Z = -2

    val TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P: Z = -1

    val TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS: Z = 0

    val TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P: Z = 1

    val TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS: Z = 2

    val utilEmptyContainer: Z = 3

    val _artEmpty: Z = 4

  }

  object Writer {

    @record class Default(val writer: MessagePack.Writer.Impl) extends Writer

  }

  @msig trait Writer {

    def writer: MessagePack.Writer

    def writeTempControlMixedSeL4CAmKESTemperature(o: TempControlMixedSeL4CAmKES.Temperature): Unit = {
      writer.writeZ(Constants.TempControlMixedSeL4CAmKESTemperature)
      writer.writeF32(o.degrees)
      writeTempControlMixedSeL4CAmKESTempUnitType(o.unit)
    }

    def writeTempControlMixedSeL4CAmKESTemperature_Payload(o: TempControlMixedSeL4CAmKES.Temperature_Payload): Unit = {
      writer.writeZ(Constants.TempControlMixedSeL4CAmKESTemperature_Payload)
      writeTempControlMixedSeL4CAmKESTemperature(o.value)
    }

    def writeTempControlMixedSeL4CAmKESTempUnitType(o: TempControlMixedSeL4CAmKES.TempUnit.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeTempControlMixedSeL4CAmKESTempUnit_Payload(o: TempControlMixedSeL4CAmKES.TempUnit_Payload): Unit = {
      writer.writeZ(Constants.TempControlMixedSeL4CAmKESTempUnit_Payload)
      writeTempControlMixedSeL4CAmKESTempUnitType(o.value)
    }

    def writeTempControlMixedSeL4CAmKESSetPoint(o: TempControlMixedSeL4CAmKES.SetPoint): Unit = {
      writer.writeZ(Constants.TempControlMixedSeL4CAmKESSetPoint)
      writeTempControlMixedSeL4CAmKESTemperature(o.low)
      writeTempControlMixedSeL4CAmKESTemperature(o.high)
    }

    def writeTempControlMixedSeL4CAmKESSetPoint_Payload(o: TempControlMixedSeL4CAmKES.SetPoint_Payload): Unit = {
      writer.writeZ(Constants.TempControlMixedSeL4CAmKESSetPoint_Payload)
      writeTempControlMixedSeL4CAmKESSetPoint(o.value)
    }

    def writeTempControlMixedSeL4CAmKESFanCmdType(o: TempControlMixedSeL4CAmKES.FanCmd.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeTempControlMixedSeL4CAmKESFanCmd_Payload(o: TempControlMixedSeL4CAmKES.FanCmd_Payload): Unit = {
      writer.writeZ(Constants.TempControlMixedSeL4CAmKESFanCmd_Payload)
      writeTempControlMixedSeL4CAmKESFanCmdType(o.value)
    }

    def writeTempControlMixedSeL4CAmKESFanAckType(o: TempControlMixedSeL4CAmKES.FanAck.Type): Unit = {
      writer.writeZ(o.ordinal)
    }

    def writeTempControlMixedSeL4CAmKESFanAck_Payload(o: TempControlMixedSeL4CAmKES.FanAck_Payload): Unit = {
      writer.writeZ(Constants.TempControlMixedSeL4CAmKESFanAck_Payload)
      writeTempControlMixedSeL4CAmKESFanAckType(o.value)
    }

    def writeBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBoolean_Payload)
      writer.writeB(o.value)
    }

    def writeBase_TypesInteger_Payload(o: Base_Types.Integer_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_Payload)
      writer.writeZ(o.value)
    }

    def writeBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_8_Payload)
      writer.writeS8(o.value)
    }

    def writeBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_16_Payload)
      writer.writeS16(o.value)
    }

    def writeBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_32_Payload)
      writer.writeS32(o.value)
    }

    def writeBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesInteger_64_Payload)
      writer.writeS64(o.value)
    }

    def writeBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_8_Payload)
      writer.writeU8(o.value)
    }

    def writeBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_16_Payload)
      writer.writeU16(o.value)
    }

    def writeBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_32_Payload)
      writer.writeU32(o.value)
    }

    def writeBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesUnsigned_64_Payload)
      writer.writeU64(o.value)
    }

    def writeBase_TypesFloat_Payload(o: Base_Types.Float_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_Payload)
      writer.writeR(o.value)
    }

    def writeBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_32_Payload)
      writer.writeF32(o.value)
    }

    def writeBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesFloat_64_Payload)
      writer.writeF64(o.value)
    }

    def writeBase_TypesCharacter_Payload(o: Base_Types.Character_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesCharacter_Payload)
      writer.writeC(o.value)
    }

    def writeBase_TypesString_Payload(o: Base_Types.String_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesString_Payload)
      writer.writeString(o.value)
    }

    def writeBase_TypesBits_Payload(o: Base_Types.Bits_Payload): Unit = {
      writer.writeZ(Constants.Base_TypesBits_Payload)
      writer.writeISZ(o.value, writer.writeB _)
    }

    def writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container): Unit = {
      o match {
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P => writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS => writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(o)
      }
    }

    def writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P): Unit = {
      writer.writeZ(Constants.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P)
    }

    def writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS)
    }

    def writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container): Unit = {
      o match {
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P => writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS => writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(o)
      }
    }

    def writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P): Unit = {
      writer.writeZ(Constants.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P)
      writer.writeOption(o.api_tempChanged, write_artEmpty _)
      writeTempControlMixedSeL4CAmKESTemperature(o.api_currentTemp)
    }

    def writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS)
      writer.writeOption(o.api_tempChanged, write_artEmpty _)
      writeTempControlMixedSeL4CAmKESTemperature(o.api_currentTemp)
    }

    def writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container): Unit = {
      o match {
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P => writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS => writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(o)
      }
    }

    def writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P): Unit = {
      writer.writeZ(Constants.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P)
      writer.writeOption(o.api_tempChanged, write_artEmpty _)
      writer.writeOption(o.api_fanAck, writeTempControlMixedSeL4CAmKESFanAckType _)
      writer.writeOption(o.api_setPoint, writeTempControlMixedSeL4CAmKESSetPoint _)
      writeTempControlMixedSeL4CAmKESTemperature(o.api_currentTemp)
    }

    def writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS)
      writeTempControlMixedSeL4CAmKESFanCmdType(o.In_currentFanState)
      writeTempControlMixedSeL4CAmKESSetPoint(o.In_currentSetPoint)
      writer.writeB(o.In_fanError)
      writeTempControlMixedSeL4CAmKESTemperature(o.In_latestTemp)
      writer.writeOption(o.api_tempChanged, write_artEmpty _)
      writer.writeOption(o.api_fanAck, writeTempControlMixedSeL4CAmKESFanAckType _)
      writer.writeOption(o.api_setPoint, writeTempControlMixedSeL4CAmKESSetPoint _)
      writeTempControlMixedSeL4CAmKESTemperature(o.api_currentTemp)
    }

    def writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container): Unit = {
      o match {
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P => writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS => writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(o)
      }
    }

    def writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P): Unit = {
      writer.writeZ(Constants.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P)
      writer.writeOption(o.api_fanCmd, writeTempControlMixedSeL4CAmKESFanCmdType _)
    }

    def writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS)
      writeTempControlMixedSeL4CAmKESFanCmdType(o.currentFanState)
      writeTempControlMixedSeL4CAmKESSetPoint(o.currentSetPoint)
      writer.writeB(o.fanError)
      writeTempControlMixedSeL4CAmKESTemperature(o.latestTemp)
      writer.writeOption(o.api_fanCmd, writeTempControlMixedSeL4CAmKESFanCmdType _)
    }

    def writeTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container): Unit = {
      o match {
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P => writeTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS => writeTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(o)
      }
    }

    def writeTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P): Unit = {
      writer.writeZ(Constants.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P)
      writer.writeOption(o.api_fanCmd, writeTempControlMixedSeL4CAmKESFanCmdType _)
    }

    def writeTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS): Unit = {
      writer.writeZ(Constants.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS)
      writer.writeOption(o.api_fanCmd, writeTempControlMixedSeL4CAmKESFanCmdType _)
    }

    def writeTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container): Unit = {
      o match {
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P => writeTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS => writeTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(o)
      }
    }

    def writeTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P): Unit = {
      writer.writeZ(Constants.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P)
      writer.writeOption(o.api_fanAck, writeTempControlMixedSeL4CAmKESFanAckType _)
    }

    def writeTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS): Unit = {
      writer.writeZ(Constants.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS)
      writer.writeOption(o.api_fanAck, writeTempControlMixedSeL4CAmKESFanAckType _)
    }

    def writeutilContainer(o: util.Container): Unit = {
      o match {
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P => writeTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS => writeTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(o)
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P => writeTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS => writeTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(o)
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P => writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS => writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(o)
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P => writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS => writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(o)
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P => writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS => writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(o)
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P => writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS => writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(o)
      }
    }

    def writeutilEmptyContainer(o: util.EmptyContainer): Unit = {
      writer.writeZ(Constants.utilEmptyContainer)
    }

    def write_artDataContent(o: art.DataContent): Unit = {
      o match {
        case o: Base_Types.Boolean_Payload => writeBase_TypesBoolean_Payload(o)
        case o: Base_Types.Integer_Payload => writeBase_TypesInteger_Payload(o)
        case o: Base_Types.Integer_8_Payload => writeBase_TypesInteger_8_Payload(o)
        case o: Base_Types.Integer_16_Payload => writeBase_TypesInteger_16_Payload(o)
        case o: Base_Types.Integer_32_Payload => writeBase_TypesInteger_32_Payload(o)
        case o: Base_Types.Integer_64_Payload => writeBase_TypesInteger_64_Payload(o)
        case o: Base_Types.Unsigned_8_Payload => writeBase_TypesUnsigned_8_Payload(o)
        case o: Base_Types.Unsigned_16_Payload => writeBase_TypesUnsigned_16_Payload(o)
        case o: Base_Types.Unsigned_32_Payload => writeBase_TypesUnsigned_32_Payload(o)
        case o: Base_Types.Unsigned_64_Payload => writeBase_TypesUnsigned_64_Payload(o)
        case o: Base_Types.Float_Payload => writeBase_TypesFloat_Payload(o)
        case o: Base_Types.Float_32_Payload => writeBase_TypesFloat_32_Payload(o)
        case o: Base_Types.Float_64_Payload => writeBase_TypesFloat_64_Payload(o)
        case o: Base_Types.Character_Payload => writeBase_TypesCharacter_Payload(o)
        case o: Base_Types.String_Payload => writeBase_TypesString_Payload(o)
        case o: Base_Types.Bits_Payload => writeBase_TypesBits_Payload(o)
        case o: art.Empty => write_artEmpty(o)
        case o: util.EmptyContainer => writeutilEmptyContainer(o)
        case o: TempControlMixedSeL4CAmKES.FanCmd_Payload => writeTempControlMixedSeL4CAmKESFanCmd_Payload(o)
        case o: TempControlMixedSeL4CAmKES.FanAck_Payload => writeTempControlMixedSeL4CAmKESFanAck_Payload(o)
        case o: TempControlMixedSeL4CAmKES.TempUnit_Payload => writeTempControlMixedSeL4CAmKESTempUnit_Payload(o)
        case o: TempControlMixedSeL4CAmKES.SetPoint_Payload => writeTempControlMixedSeL4CAmKESSetPoint_Payload(o)
        case o: TempControlMixedSeL4CAmKES.Temperature_Payload => writeTempControlMixedSeL4CAmKESTemperature_Payload(o)
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P => writeTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS => writeTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(o)
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P => writeTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS => writeTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(o)
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P => writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS => writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(o)
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P => writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS => writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(o)
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P => writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS => writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(o)
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P => writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(o)
        case o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS => writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(o)
      }
    }

    def write_artEmpty(o: art.Empty): Unit = {
      writer.writeZ(Constants._artEmpty)
    }

    def result: ISZ[U8] = {
      return writer.result
    }

  }

  object Reader {

    @record class Default(val reader: MessagePack.Reader.Impl) extends Reader {
      def errorOpt: Option[MessagePack.ErrorMsg] = {
        return reader.errorOpt
      }
    }

  }

  @msig trait Reader {

    def reader: MessagePack.Reader

    def readTempControlMixedSeL4CAmKESTemperature(): TempControlMixedSeL4CAmKES.Temperature = {
      val r = readTempControlMixedSeL4CAmKESTemperatureT(F)
      return r
    }

    def readTempControlMixedSeL4CAmKESTemperatureT(typeParsed: B): TempControlMixedSeL4CAmKES.Temperature = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlMixedSeL4CAmKESTemperature)
      }
      val degrees = reader.readF32()
      val unit = readTempControlMixedSeL4CAmKESTempUnitType()
      return TempControlMixedSeL4CAmKES.Temperature(degrees, unit)
    }

    def readTempControlMixedSeL4CAmKESTemperature_Payload(): TempControlMixedSeL4CAmKES.Temperature_Payload = {
      val r = readTempControlMixedSeL4CAmKESTemperature_PayloadT(F)
      return r
    }

    def readTempControlMixedSeL4CAmKESTemperature_PayloadT(typeParsed: B): TempControlMixedSeL4CAmKES.Temperature_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlMixedSeL4CAmKESTemperature_Payload)
      }
      val value = readTempControlMixedSeL4CAmKESTemperature()
      return TempControlMixedSeL4CAmKES.Temperature_Payload(value)
    }

    def readTempControlMixedSeL4CAmKESTempUnitType(): TempControlMixedSeL4CAmKES.TempUnit.Type = {
      val r = reader.readZ()
      return TempControlMixedSeL4CAmKES.TempUnit.byOrdinal(r).get
    }

    def readTempControlMixedSeL4CAmKESTempUnit_Payload(): TempControlMixedSeL4CAmKES.TempUnit_Payload = {
      val r = readTempControlMixedSeL4CAmKESTempUnit_PayloadT(F)
      return r
    }

    def readTempControlMixedSeL4CAmKESTempUnit_PayloadT(typeParsed: B): TempControlMixedSeL4CAmKES.TempUnit_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlMixedSeL4CAmKESTempUnit_Payload)
      }
      val value = readTempControlMixedSeL4CAmKESTempUnitType()
      return TempControlMixedSeL4CAmKES.TempUnit_Payload(value)
    }

    def readTempControlMixedSeL4CAmKESSetPoint(): TempControlMixedSeL4CAmKES.SetPoint = {
      val r = readTempControlMixedSeL4CAmKESSetPointT(F)
      return r
    }

    def readTempControlMixedSeL4CAmKESSetPointT(typeParsed: B): TempControlMixedSeL4CAmKES.SetPoint = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlMixedSeL4CAmKESSetPoint)
      }
      val low = readTempControlMixedSeL4CAmKESTemperature()
      val high = readTempControlMixedSeL4CAmKESTemperature()
      return TempControlMixedSeL4CAmKES.SetPoint(low, high)
    }

    def readTempControlMixedSeL4CAmKESSetPoint_Payload(): TempControlMixedSeL4CAmKES.SetPoint_Payload = {
      val r = readTempControlMixedSeL4CAmKESSetPoint_PayloadT(F)
      return r
    }

    def readTempControlMixedSeL4CAmKESSetPoint_PayloadT(typeParsed: B): TempControlMixedSeL4CAmKES.SetPoint_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlMixedSeL4CAmKESSetPoint_Payload)
      }
      val value = readTempControlMixedSeL4CAmKESSetPoint()
      return TempControlMixedSeL4CAmKES.SetPoint_Payload(value)
    }

    def readTempControlMixedSeL4CAmKESFanCmdType(): TempControlMixedSeL4CAmKES.FanCmd.Type = {
      val r = reader.readZ()
      return TempControlMixedSeL4CAmKES.FanCmd.byOrdinal(r).get
    }

    def readTempControlMixedSeL4CAmKESFanCmd_Payload(): TempControlMixedSeL4CAmKES.FanCmd_Payload = {
      val r = readTempControlMixedSeL4CAmKESFanCmd_PayloadT(F)
      return r
    }

    def readTempControlMixedSeL4CAmKESFanCmd_PayloadT(typeParsed: B): TempControlMixedSeL4CAmKES.FanCmd_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlMixedSeL4CAmKESFanCmd_Payload)
      }
      val value = readTempControlMixedSeL4CAmKESFanCmdType()
      return TempControlMixedSeL4CAmKES.FanCmd_Payload(value)
    }

    def readTempControlMixedSeL4CAmKESFanAckType(): TempControlMixedSeL4CAmKES.FanAck.Type = {
      val r = reader.readZ()
      return TempControlMixedSeL4CAmKES.FanAck.byOrdinal(r).get
    }

    def readTempControlMixedSeL4CAmKESFanAck_Payload(): TempControlMixedSeL4CAmKES.FanAck_Payload = {
      val r = readTempControlMixedSeL4CAmKESFanAck_PayloadT(F)
      return r
    }

    def readTempControlMixedSeL4CAmKESFanAck_PayloadT(typeParsed: B): TempControlMixedSeL4CAmKES.FanAck_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlMixedSeL4CAmKESFanAck_Payload)
      }
      val value = readTempControlMixedSeL4CAmKESFanAckType()
      return TempControlMixedSeL4CAmKES.FanAck_Payload(value)
    }

    def readBase_TypesBoolean_Payload(): Base_Types.Boolean_Payload = {
      val r = readBase_TypesBoolean_PayloadT(F)
      return r
    }

    def readBase_TypesBoolean_PayloadT(typeParsed: B): Base_Types.Boolean_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBoolean_Payload)
      }
      val value = reader.readB()
      return Base_Types.Boolean_Payload(value)
    }

    def readBase_TypesInteger_Payload(): Base_Types.Integer_Payload = {
      val r = readBase_TypesInteger_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_PayloadT(typeParsed: B): Base_Types.Integer_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_Payload)
      }
      val value = reader.readZ()
      return Base_Types.Integer_Payload(value)
    }

    def readBase_TypesInteger_8_Payload(): Base_Types.Integer_8_Payload = {
      val r = readBase_TypesInteger_8_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_8_PayloadT(typeParsed: B): Base_Types.Integer_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_8_Payload)
      }
      val value = reader.readS8()
      return Base_Types.Integer_8_Payload(value)
    }

    def readBase_TypesInteger_16_Payload(): Base_Types.Integer_16_Payload = {
      val r = readBase_TypesInteger_16_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_16_PayloadT(typeParsed: B): Base_Types.Integer_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_16_Payload)
      }
      val value = reader.readS16()
      return Base_Types.Integer_16_Payload(value)
    }

    def readBase_TypesInteger_32_Payload(): Base_Types.Integer_32_Payload = {
      val r = readBase_TypesInteger_32_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_32_PayloadT(typeParsed: B): Base_Types.Integer_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_32_Payload)
      }
      val value = reader.readS32()
      return Base_Types.Integer_32_Payload(value)
    }

    def readBase_TypesInteger_64_Payload(): Base_Types.Integer_64_Payload = {
      val r = readBase_TypesInteger_64_PayloadT(F)
      return r
    }

    def readBase_TypesInteger_64_PayloadT(typeParsed: B): Base_Types.Integer_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesInteger_64_Payload)
      }
      val value = reader.readS64()
      return Base_Types.Integer_64_Payload(value)
    }

    def readBase_TypesUnsigned_8_Payload(): Base_Types.Unsigned_8_Payload = {
      val r = readBase_TypesUnsigned_8_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_8_PayloadT(typeParsed: B): Base_Types.Unsigned_8_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_8_Payload)
      }
      val value = reader.readU8()
      return Base_Types.Unsigned_8_Payload(value)
    }

    def readBase_TypesUnsigned_16_Payload(): Base_Types.Unsigned_16_Payload = {
      val r = readBase_TypesUnsigned_16_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_16_PayloadT(typeParsed: B): Base_Types.Unsigned_16_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_16_Payload)
      }
      val value = reader.readU16()
      return Base_Types.Unsigned_16_Payload(value)
    }

    def readBase_TypesUnsigned_32_Payload(): Base_Types.Unsigned_32_Payload = {
      val r = readBase_TypesUnsigned_32_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_32_PayloadT(typeParsed: B): Base_Types.Unsigned_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_32_Payload)
      }
      val value = reader.readU32()
      return Base_Types.Unsigned_32_Payload(value)
    }

    def readBase_TypesUnsigned_64_Payload(): Base_Types.Unsigned_64_Payload = {
      val r = readBase_TypesUnsigned_64_PayloadT(F)
      return r
    }

    def readBase_TypesUnsigned_64_PayloadT(typeParsed: B): Base_Types.Unsigned_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesUnsigned_64_Payload)
      }
      val value = reader.readU64()
      return Base_Types.Unsigned_64_Payload(value)
    }

    def readBase_TypesFloat_Payload(): Base_Types.Float_Payload = {
      val r = readBase_TypesFloat_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_PayloadT(typeParsed: B): Base_Types.Float_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_Payload)
      }
      val value = reader.readR()
      return Base_Types.Float_Payload(value)
    }

    def readBase_TypesFloat_32_Payload(): Base_Types.Float_32_Payload = {
      val r = readBase_TypesFloat_32_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_32_PayloadT(typeParsed: B): Base_Types.Float_32_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_32_Payload)
      }
      val value = reader.readF32()
      return Base_Types.Float_32_Payload(value)
    }

    def readBase_TypesFloat_64_Payload(): Base_Types.Float_64_Payload = {
      val r = readBase_TypesFloat_64_PayloadT(F)
      return r
    }

    def readBase_TypesFloat_64_PayloadT(typeParsed: B): Base_Types.Float_64_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesFloat_64_Payload)
      }
      val value = reader.readF64()
      return Base_Types.Float_64_Payload(value)
    }

    def readBase_TypesCharacter_Payload(): Base_Types.Character_Payload = {
      val r = readBase_TypesCharacter_PayloadT(F)
      return r
    }

    def readBase_TypesCharacter_PayloadT(typeParsed: B): Base_Types.Character_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesCharacter_Payload)
      }
      val value = reader.readC()
      return Base_Types.Character_Payload(value)
    }

    def readBase_TypesString_Payload(): Base_Types.String_Payload = {
      val r = readBase_TypesString_PayloadT(F)
      return r
    }

    def readBase_TypesString_PayloadT(typeParsed: B): Base_Types.String_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesString_Payload)
      }
      val value = reader.readString()
      return Base_Types.String_Payload(value)
    }

    def readBase_TypesBits_Payload(): Base_Types.Bits_Payload = {
      val r = readBase_TypesBits_PayloadT(F)
      return r
    }

    def readBase_TypesBits_PayloadT(typeParsed: B): Base_Types.Bits_Payload = {
      if (!typeParsed) {
        reader.expectZ(Constants.Base_TypesBits_Payload)
      }
      val value = reader.readISZ(reader.readB _)
      return Base_Types.Bits_Payload(value)
    }

    def readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container(): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P => val r = readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PT(T); return r
        case Constants.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS => val r = readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container.")
          val r = readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PST(T)
          return r
      }
    }

    def readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P = {
      val r = readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PT(F)
      return r
    }

    def readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PT(typeParsed: B): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P)
      }
      return TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P()
    }

    def readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS = {
      val r = readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PST(F)
      return r
    }

    def readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PST(typeParsed: B): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS)
      }
      return TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS()
    }

    def readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container(): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P => val r = readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PT(T); return r
        case Constants.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS => val r = readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container.")
          val r = readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PST(T)
          return r
      }
    }

    def readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P = {
      val r = readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PT(F)
      return r
    }

    def readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PT(typeParsed: B): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P)
      }
      val api_tempChanged = reader.readOption(read_artEmpty _)
      val api_currentTemp = readTempControlMixedSeL4CAmKESTemperature()
      return TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P(api_tempChanged, api_currentTemp)
    }

    def readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS = {
      val r = readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PST(F)
      return r
    }

    def readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PST(typeParsed: B): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS)
      }
      val api_tempChanged = reader.readOption(read_artEmpty _)
      val api_currentTemp = readTempControlMixedSeL4CAmKESTemperature()
      return TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS(api_tempChanged, api_currentTemp)
    }

    def readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container(): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P => val r = readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PT(T); return r
        case Constants.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS => val r = readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container.")
          val r = readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PST(T)
          return r
      }
    }

    def readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P = {
      val r = readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PT(F)
      return r
    }

    def readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PT(typeParsed: B): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P)
      }
      val api_tempChanged = reader.readOption(read_artEmpty _)
      val api_fanAck = reader.readOption(readTempControlMixedSeL4CAmKESFanAckType _)
      val api_setPoint = reader.readOption(readTempControlMixedSeL4CAmKESSetPoint _)
      val api_currentTemp = readTempControlMixedSeL4CAmKESTemperature()
      return TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P(api_tempChanged, api_fanAck, api_setPoint, api_currentTemp)
    }

    def readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS = {
      val r = readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PST(F)
      return r
    }

    def readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PST(typeParsed: B): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS)
      }
      val In_currentFanState = readTempControlMixedSeL4CAmKESFanCmdType()
      val In_currentSetPoint = readTempControlMixedSeL4CAmKESSetPoint()
      val In_fanError = reader.readB()
      val In_latestTemp = readTempControlMixedSeL4CAmKESTemperature()
      val api_tempChanged = reader.readOption(read_artEmpty _)
      val api_fanAck = reader.readOption(readTempControlMixedSeL4CAmKESFanAckType _)
      val api_setPoint = reader.readOption(readTempControlMixedSeL4CAmKESSetPoint _)
      val api_currentTemp = readTempControlMixedSeL4CAmKESTemperature()
      return TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS(In_currentFanState, In_currentSetPoint, In_fanError, In_latestTemp, api_tempChanged, api_fanAck, api_setPoint, api_currentTemp)
    }

    def readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container(): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P => val r = readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PT(T); return r
        case Constants.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS => val r = readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container.")
          val r = readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PST(T)
          return r
      }
    }

    def readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P = {
      val r = readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PT(F)
      return r
    }

    def readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PT(typeParsed: B): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P)
      }
      val api_fanCmd = reader.readOption(readTempControlMixedSeL4CAmKESFanCmdType _)
      return TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P(api_fanCmd)
    }

    def readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS = {
      val r = readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PST(F)
      return r
    }

    def readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PST(typeParsed: B): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS)
      }
      val currentFanState = readTempControlMixedSeL4CAmKESFanCmdType()
      val currentSetPoint = readTempControlMixedSeL4CAmKESSetPoint()
      val fanError = reader.readB()
      val latestTemp = readTempControlMixedSeL4CAmKESTemperature()
      val api_fanCmd = reader.readOption(readTempControlMixedSeL4CAmKESFanCmdType _)
      return TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS(currentFanState, currentSetPoint, fanError, latestTemp, api_fanCmd)
    }

    def readTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container(): TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P => val r = readTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PT(T); return r
        case Constants.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS => val r = readTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container.")
          val r = readTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PST(T)
          return r
      }
    }

    def readTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(): TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P = {
      val r = readTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PT(F)
      return r
    }

    def readTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PT(typeParsed: B): TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P)
      }
      val api_fanCmd = reader.readOption(readTempControlMixedSeL4CAmKESFanCmdType _)
      return TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P(api_fanCmd)
    }

    def readTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(): TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS = {
      val r = readTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PST(F)
      return r
    }

    def readTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PST(typeParsed: B): TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS)
      }
      val api_fanCmd = reader.readOption(readTempControlMixedSeL4CAmKESFanCmdType _)
      return TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS(api_fanCmd)
    }

    def readTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container(): TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P => val r = readTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PT(T); return r
        case Constants.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS => val r = readTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container.")
          val r = readTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PST(T)
          return r
      }
    }

    def readTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(): TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P = {
      val r = readTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PT(F)
      return r
    }

    def readTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PT(typeParsed: B): TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P)
      }
      val api_fanAck = reader.readOption(readTempControlMixedSeL4CAmKESFanAckType _)
      return TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P(api_fanAck)
    }

    def readTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(): TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS = {
      val r = readTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PST(F)
      return r
    }

    def readTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PST(typeParsed: B): TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS = {
      if (!typeParsed) {
        reader.expectZ(Constants.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS)
      }
      val api_fanAck = reader.readOption(readTempControlMixedSeL4CAmKESFanAckType _)
      return TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS(api_fanAck)
    }

    def readutilContainer(): util.Container = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P => val r = readTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PT(T); return r
        case Constants.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS => val r = readTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PST(T); return r
        case Constants.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P => val r = readTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PT(T); return r
        case Constants.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS => val r = readTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PST(T); return r
        case Constants.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P => val r = readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PT(T); return r
        case Constants.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS => val r = readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PST(T); return r
        case Constants.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P => val r = readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PT(T); return r
        case Constants.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS => val r = readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PST(T); return r
        case Constants.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P => val r = readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PT(T); return r
        case Constants.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS => val r = readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PST(T); return r
        case Constants.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P => val r = readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PT(T); return r
        case Constants.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS => val r = readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of util.Container.")
          val r = readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PST(T)
          return r
      }
    }

    def readutilEmptyContainer(): util.EmptyContainer = {
      val r = readutilEmptyContainerT(F)
      return r
    }

    def readutilEmptyContainerT(typeParsed: B): util.EmptyContainer = {
      if (!typeParsed) {
        reader.expectZ(Constants.utilEmptyContainer)
      }
      return util.EmptyContainer()
    }

    def read_artDataContent(): art.DataContent = {
      val i = reader.curr
      val t = reader.readZ()
      t match {
        case Constants.Base_TypesBoolean_Payload => val r = readBase_TypesBoolean_PayloadT(T); return r
        case Constants.Base_TypesInteger_Payload => val r = readBase_TypesInteger_PayloadT(T); return r
        case Constants.Base_TypesInteger_8_Payload => val r = readBase_TypesInteger_8_PayloadT(T); return r
        case Constants.Base_TypesInteger_16_Payload => val r = readBase_TypesInteger_16_PayloadT(T); return r
        case Constants.Base_TypesInteger_32_Payload => val r = readBase_TypesInteger_32_PayloadT(T); return r
        case Constants.Base_TypesInteger_64_Payload => val r = readBase_TypesInteger_64_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_8_Payload => val r = readBase_TypesUnsigned_8_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_16_Payload => val r = readBase_TypesUnsigned_16_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_32_Payload => val r = readBase_TypesUnsigned_32_PayloadT(T); return r
        case Constants.Base_TypesUnsigned_64_Payload => val r = readBase_TypesUnsigned_64_PayloadT(T); return r
        case Constants.Base_TypesFloat_Payload => val r = readBase_TypesFloat_PayloadT(T); return r
        case Constants.Base_TypesFloat_32_Payload => val r = readBase_TypesFloat_32_PayloadT(T); return r
        case Constants.Base_TypesFloat_64_Payload => val r = readBase_TypesFloat_64_PayloadT(T); return r
        case Constants.Base_TypesCharacter_Payload => val r = readBase_TypesCharacter_PayloadT(T); return r
        case Constants.Base_TypesString_Payload => val r = readBase_TypesString_PayloadT(T); return r
        case Constants.Base_TypesBits_Payload => val r = readBase_TypesBits_PayloadT(T); return r
        case Constants._artEmpty => val r = read_artEmptyT(T); return r
        case Constants.utilEmptyContainer => val r = readutilEmptyContainerT(T); return r
        case Constants.TempControlMixedSeL4CAmKESFanCmd_Payload => val r = readTempControlMixedSeL4CAmKESFanCmd_PayloadT(T); return r
        case Constants.TempControlMixedSeL4CAmKESFanAck_Payload => val r = readTempControlMixedSeL4CAmKESFanAck_PayloadT(T); return r
        case Constants.TempControlMixedSeL4CAmKESTempUnit_Payload => val r = readTempControlMixedSeL4CAmKESTempUnit_PayloadT(T); return r
        case Constants.TempControlMixedSeL4CAmKESSetPoint_Payload => val r = readTempControlMixedSeL4CAmKESSetPoint_PayloadT(T); return r
        case Constants.TempControlMixedSeL4CAmKESTemperature_Payload => val r = readTempControlMixedSeL4CAmKESTemperature_PayloadT(T); return r
        case Constants.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P => val r = readTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PT(T); return r
        case Constants.TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS => val r = readTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PST(T); return r
        case Constants.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P => val r = readTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PT(T); return r
        case Constants.TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS => val r = readTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PST(T); return r
        case Constants.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P => val r = readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PT(T); return r
        case Constants.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS => val r = readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PST(T); return r
        case Constants.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P => val r = readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PT(T); return r
        case Constants.TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS => val r = readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PST(T); return r
        case Constants.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P => val r = readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PT(T); return r
        case Constants.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS => val r = readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PST(T); return r
        case Constants.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P => val r = readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PT(T); return r
        case Constants.TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS => val r = readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PST(T); return r
        case _ =>
          reader.error(i, s"$t is not a valid type of art.DataContent.")
          val r = readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PST(T)
          return r
      }
    }

    def read_artEmpty(): art.Empty = {
      val r = read_artEmptyT(F)
      return r
    }

    def read_artEmptyT(typeParsed: B): art.Empty = {
      if (!typeParsed) {
        reader.expectZ(Constants._artEmpty)
      }
      return art.Empty()
    }

  }

  def to[T](data: ISZ[U8], f: Reader => T): Either[T, MessagePack.ErrorMsg] = {
    val rd = Reader.Default(MessagePack.reader(data))
    rd.reader.init()
    val r = f(rd)
    rd.errorOpt match {
      case Some(e) => return Either.Right(e)
      case _ => return Either.Left(r)
    }
  }

  def fromTempControlMixedSeL4CAmKESTemperature(o: TempControlMixedSeL4CAmKES.Temperature, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESTemperature(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESTemperature(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.Temperature, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTemperature(reader: Reader): TempControlMixedSeL4CAmKES.Temperature = {
      val r = reader.readTempControlMixedSeL4CAmKESTemperature()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESTemperature _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTemperature_Payload(o: TempControlMixedSeL4CAmKES.Temperature_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESTemperature_Payload(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESTemperature_Payload(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.Temperature_Payload, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTemperature_Payload(reader: Reader): TempControlMixedSeL4CAmKES.Temperature_Payload = {
      val r = reader.readTempControlMixedSeL4CAmKESTemperature_Payload()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESTemperature_Payload _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempUnit_Payload(o: TempControlMixedSeL4CAmKES.TempUnit_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESTempUnit_Payload(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESTempUnit_Payload(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.TempUnit_Payload, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempUnit_Payload(reader: Reader): TempControlMixedSeL4CAmKES.TempUnit_Payload = {
      val r = reader.readTempControlMixedSeL4CAmKESTempUnit_Payload()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESTempUnit_Payload _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESSetPoint(o: TempControlMixedSeL4CAmKES.SetPoint, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESSetPoint(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESSetPoint(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.SetPoint, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESSetPoint(reader: Reader): TempControlMixedSeL4CAmKES.SetPoint = {
      val r = reader.readTempControlMixedSeL4CAmKESSetPoint()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESSetPoint _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESSetPoint_Payload(o: TempControlMixedSeL4CAmKES.SetPoint_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESSetPoint_Payload(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESSetPoint_Payload(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.SetPoint_Payload, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESSetPoint_Payload(reader: Reader): TempControlMixedSeL4CAmKES.SetPoint_Payload = {
      val r = reader.readTempControlMixedSeL4CAmKESSetPoint_Payload()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESSetPoint_Payload _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESFanCmd_Payload(o: TempControlMixedSeL4CAmKES.FanCmd_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESFanCmd_Payload(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESFanCmd_Payload(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.FanCmd_Payload, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESFanCmd_Payload(reader: Reader): TempControlMixedSeL4CAmKES.FanCmd_Payload = {
      val r = reader.readTempControlMixedSeL4CAmKESFanCmd_Payload()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESFanCmd_Payload _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESFanAck_Payload(o: TempControlMixedSeL4CAmKES.FanAck_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESFanAck_Payload(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESFanAck_Payload(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.FanAck_Payload, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESFanAck_Payload(reader: Reader): TempControlMixedSeL4CAmKES.FanAck_Payload = {
      val r = reader.readTempControlMixedSeL4CAmKESFanAck_Payload()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESFanAck_Payload _)
    return r
  }

  def fromBase_TypesBoolean_Payload(o: Base_Types.Boolean_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBoolean_Payload(o)
    return w.result
  }

  def toBase_TypesBoolean_Payload(data: ISZ[U8]): Either[Base_Types.Boolean_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBoolean_Payload(reader: Reader): Base_Types.Boolean_Payload = {
      val r = reader.readBase_TypesBoolean_Payload()
      return r
    }
    val r = to(data, fBase_TypesBoolean_Payload _)
    return r
  }

  def fromBase_TypesInteger_Payload(o: Base_Types.Integer_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_Payload(data: ISZ[U8]): Either[Base_Types.Integer_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_Payload(reader: Reader): Base_Types.Integer_Payload = {
      val r = reader.readBase_TypesInteger_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_Payload _)
    return r
  }

  def fromBase_TypesInteger_8_Payload(o: Base_Types.Integer_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_8_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_8_Payload(data: ISZ[U8]): Either[Base_Types.Integer_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_8_Payload(reader: Reader): Base_Types.Integer_8_Payload = {
      val r = reader.readBase_TypesInteger_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_8_Payload _)
    return r
  }

  def fromBase_TypesInteger_16_Payload(o: Base_Types.Integer_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_16_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_16_Payload(data: ISZ[U8]): Either[Base_Types.Integer_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_16_Payload(reader: Reader): Base_Types.Integer_16_Payload = {
      val r = reader.readBase_TypesInteger_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_16_Payload _)
    return r
  }

  def fromBase_TypesInteger_32_Payload(o: Base_Types.Integer_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_32_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_32_Payload(data: ISZ[U8]): Either[Base_Types.Integer_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_32_Payload(reader: Reader): Base_Types.Integer_32_Payload = {
      val r = reader.readBase_TypesInteger_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_32_Payload _)
    return r
  }

  def fromBase_TypesInteger_64_Payload(o: Base_Types.Integer_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesInteger_64_Payload(o)
    return w.result
  }

  def toBase_TypesInteger_64_Payload(data: ISZ[U8]): Either[Base_Types.Integer_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesInteger_64_Payload(reader: Reader): Base_Types.Integer_64_Payload = {
      val r = reader.readBase_TypesInteger_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesInteger_64_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_8_Payload(o: Base_Types.Unsigned_8_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_8_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_8_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_8_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_8_Payload(reader: Reader): Base_Types.Unsigned_8_Payload = {
      val r = reader.readBase_TypesUnsigned_8_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_8_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_16_Payload(o: Base_Types.Unsigned_16_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_16_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_16_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_16_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_16_Payload(reader: Reader): Base_Types.Unsigned_16_Payload = {
      val r = reader.readBase_TypesUnsigned_16_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_16_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_32_Payload(o: Base_Types.Unsigned_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_32_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_32_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_32_Payload(reader: Reader): Base_Types.Unsigned_32_Payload = {
      val r = reader.readBase_TypesUnsigned_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_32_Payload _)
    return r
  }

  def fromBase_TypesUnsigned_64_Payload(o: Base_Types.Unsigned_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesUnsigned_64_Payload(o)
    return w.result
  }

  def toBase_TypesUnsigned_64_Payload(data: ISZ[U8]): Either[Base_Types.Unsigned_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesUnsigned_64_Payload(reader: Reader): Base_Types.Unsigned_64_Payload = {
      val r = reader.readBase_TypesUnsigned_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesUnsigned_64_Payload _)
    return r
  }

  def fromBase_TypesFloat_Payload(o: Base_Types.Float_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_Payload(data: ISZ[U8]): Either[Base_Types.Float_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_Payload(reader: Reader): Base_Types.Float_Payload = {
      val r = reader.readBase_TypesFloat_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_Payload _)
    return r
  }

  def fromBase_TypesFloat_32_Payload(o: Base_Types.Float_32_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_32_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_32_Payload(data: ISZ[U8]): Either[Base_Types.Float_32_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_32_Payload(reader: Reader): Base_Types.Float_32_Payload = {
      val r = reader.readBase_TypesFloat_32_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_32_Payload _)
    return r
  }

  def fromBase_TypesFloat_64_Payload(o: Base_Types.Float_64_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesFloat_64_Payload(o)
    return w.result
  }

  def toBase_TypesFloat_64_Payload(data: ISZ[U8]): Either[Base_Types.Float_64_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesFloat_64_Payload(reader: Reader): Base_Types.Float_64_Payload = {
      val r = reader.readBase_TypesFloat_64_Payload()
      return r
    }
    val r = to(data, fBase_TypesFloat_64_Payload _)
    return r
  }

  def fromBase_TypesCharacter_Payload(o: Base_Types.Character_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesCharacter_Payload(o)
    return w.result
  }

  def toBase_TypesCharacter_Payload(data: ISZ[U8]): Either[Base_Types.Character_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesCharacter_Payload(reader: Reader): Base_Types.Character_Payload = {
      val r = reader.readBase_TypesCharacter_Payload()
      return r
    }
    val r = to(data, fBase_TypesCharacter_Payload _)
    return r
  }

  def fromBase_TypesString_Payload(o: Base_Types.String_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesString_Payload(o)
    return w.result
  }

  def toBase_TypesString_Payload(data: ISZ[U8]): Either[Base_Types.String_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesString_Payload(reader: Reader): Base_Types.String_Payload = {
      val r = reader.readBase_TypesString_Payload()
      return r
    }
    val r = to(data, fBase_TypesString_Payload _)
    return r
  }

  def fromBase_TypesBits_Payload(o: Base_Types.Bits_Payload, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeBase_TypesBits_Payload(o)
    return w.result
  }

  def toBase_TypesBits_Payload(data: ISZ[U8]): Either[Base_Types.Bits_Payload, MessagePack.ErrorMsg] = {
    def fBase_TypesBits_Payload(reader: Reader): Base_Types.Bits_Payload = {
      val r = reader.readBase_TypesBits_Payload()
      return r
    }
    val r = to(data, fBase_TypesBits_Payload _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container(reader: Reader): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container = {
      val r = reader.readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P(reader: Reader): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_P = {
      val r = reader.readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS(reader: Reader): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PreState_Container_PS = {
      val r = reader.readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container(reader: Reader): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container = {
      val r = reader.readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P(reader: Reader): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_P = {
      val r = reader.readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(o: TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS(reader: Reader): TempControlMixedSeL4CAmKES.TempSensor_tsp_tst_PostState_Container_PS = {
      val r = reader.readTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container(reader: Reader): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container = {
      val r = reader.readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(reader: Reader): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_P = {
      val r = reader.readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(reader: Reader): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PreState_Container_PS = {
      val r = reader.readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container(reader: Reader): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container = {
      val r = reader.readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P(reader: Reader): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_P = {
      val r = reader.readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(o: TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS(reader: Reader): TempControlMixedSeL4CAmKES.TempControl_tcp_tct_PostState_Container_PS = {
      val r = reader.readTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container(reader: Reader): TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container = {
      val r = reader.readTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P(reader: Reader): TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_P = {
      val r = reader.readTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS(reader: Reader): TempControlMixedSeL4CAmKES.Fan_fp_ft_PreState_Container_PS = {
      val r = reader.readTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container(reader: Reader): TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container = {
      val r = reader.readTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P(reader: Reader): TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_P = {
      val r = reader.readTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P _)
    return r
  }

  def fromTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(o: TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(o)
    return w.result
  }

  def toTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(data: ISZ[U8]): Either[TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS, MessagePack.ErrorMsg] = {
    def fTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS(reader: Reader): TempControlMixedSeL4CAmKES.Fan_fp_ft_PostState_Container_PS = {
      val r = reader.readTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS()
      return r
    }
    val r = to(data, fTempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS _)
    return r
  }

  def fromutilContainer(o: util.Container, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilContainer(o)
    return w.result
  }

  def toutilContainer(data: ISZ[U8]): Either[util.Container, MessagePack.ErrorMsg] = {
    def futilContainer(reader: Reader): util.Container = {
      val r = reader.readutilContainer()
      return r
    }
    val r = to(data, futilContainer _)
    return r
  }

  def fromutilEmptyContainer(o: util.EmptyContainer, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.writeutilEmptyContainer(o)
    return w.result
  }

  def toutilEmptyContainer(data: ISZ[U8]): Either[util.EmptyContainer, MessagePack.ErrorMsg] = {
    def futilEmptyContainer(reader: Reader): util.EmptyContainer = {
      val r = reader.readutilEmptyContainer()
      return r
    }
    val r = to(data, futilEmptyContainer _)
    return r
  }

  def from_artDataContent(o: art.DataContent, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artDataContent(o)
    return w.result
  }

  def to_artDataContent(data: ISZ[U8]): Either[art.DataContent, MessagePack.ErrorMsg] = {
    def f_artDataContent(reader: Reader): art.DataContent = {
      val r = reader.read_artDataContent()
      return r
    }
    val r = to(data, f_artDataContent _)
    return r
  }

  def from_artEmpty(o: art.Empty, pooling: B): ISZ[U8] = {
    val w = Writer.Default(MessagePack.writer(pooling))
    w.write_artEmpty(o)
    return w.result
  }

  def to_artEmpty(data: ISZ[U8]): Either[art.Empty, MessagePack.ErrorMsg] = {
    def f_artEmpty(reader: Reader): art.Empty = {
      val r = reader.read_artEmpty()
      return r
    }
    val r = to(data, f_artEmpty _)
    return r
  }

}