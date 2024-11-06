// #Sireum

package tc

import org.sireum._
import org.sireum.Random.Gen64

/*
GENERATED FROM

Temperature.scala

TempUnit.scala

SetPoint.scala

FanCmd.scala

FanAck.scala

Base_Types.scala

TempSensor_tsp_tst_Containers.scala

TempControl_tcp_tct_Containers.scala

Fan_fp_ft_Containers.scala

Container.scala

DataContent.scala

Aux_Types.scala

*/

@enum object _artDataContent_DataTypeId {
   "_artEmpty_Id"
   "Base_TypesBits_Payload_Id"
   "Base_TypesBoolean_Payload_Id"
   "Base_TypesCharacter_Payload_Id"
   "Base_TypesFloat_32_Payload_Id"
   "Base_TypesFloat_64_Payload_Id"
   "Base_TypesFloat_Payload_Id"
   "Base_TypesInteger_16_Payload_Id"
   "Base_TypesInteger_32_Payload_Id"
   "Base_TypesInteger_64_Payload_Id"
   "Base_TypesInteger_8_Payload_Id"
   "Base_TypesInteger_Payload_Id"
   "Base_TypesString_Payload_Id"
   "Base_TypesUnsigned_16_Payload_Id"
   "Base_TypesUnsigned_32_Payload_Id"
   "Base_TypesUnsigned_64_Payload_Id"
   "Base_TypesUnsigned_8_Payload_Id"
   "TempControlMixedSeL4CAmKESFanAck_Payload_Id"
   "TempControlMixedSeL4CAmKESFanCmd_Payload_Id"
   "TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P_Id"
   "TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS_Id"
   "TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P_Id"
   "TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS_Id"
   "TempControlMixedSeL4CAmKESSetPoint_Payload_Id"
   "TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P_Id"
   "TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS_Id"
   "TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P_Id"
   "TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS_Id"
   "TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P_Id"
   "TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS_Id"
   "TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P_Id"
   "TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS_Id"
   "TempControlMixedSeL4CAmKESTempUnit_Payload_Id"
   "TempControlMixedSeL4CAmKESTemperature_Payload_Id"
   "utilEmptyContainer_Id"
}

@enum object TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_DataTypeId {
   "TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P_Id"
   "TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS_Id"
}

@enum object TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_DataTypeId {
   "TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P_Id"
   "TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS_Id"
}

@enum object TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_DataTypeId {
   "TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P_Id"
   "TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS_Id"
}

@enum object TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_DataTypeId {
   "TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P_Id"
   "TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS_Id"
}

@enum object TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_DataTypeId {
   "TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P_Id"
   "TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS_Id"
}

@enum object TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_DataTypeId {
   "TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P_Id"
   "TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS_Id"
}

@enum object utilContainer_DataTypeId {
   "TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_P_Id"
   "TempControlMixedSeL4CAmKESFan_fp_ft_PostState_Container_PS_Id"
   "TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_P_Id"
   "TempControlMixedSeL4CAmKESFan_fp_ft_PreState_Container_PS_Id"
   "TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_P_Id"
   "TempControlMixedSeL4CAmKESTempControl_tcp_tct_PostState_Container_PS_Id"
   "TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P_Id"
   "TempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS_Id"
   "TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_P_Id"
   "TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PostState_Container_PS_Id"
   "TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_P_Id"
   "TempControlMixedSeL4CAmKESTempSensor_tsp_tst_PreState_Container_PS_Id"
   "utilEmptyContainer_Id"
}

