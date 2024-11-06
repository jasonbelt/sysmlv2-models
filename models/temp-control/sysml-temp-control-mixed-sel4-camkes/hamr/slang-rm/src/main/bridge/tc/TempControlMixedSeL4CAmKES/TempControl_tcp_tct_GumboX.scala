// #Sireum

package tc.TempControlMixedSeL4CAmKES

import org.sireum._
import tc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun
object TempControl_tcp_tct_GumboX {
  /** I-Assm: Integration constraint on tct's incoming data port currentTemp
    *
    * assume currentTempRange
    */
  @strictpure def I_Assm_currentTemp(currentTemp: TempControlMixedSeL4CAmKES.Temperature): B =
    currentTemp.degrees >= -128.6f &
      currentTemp.degrees <= 134.0f

  // I-Assm-Guard: Integration constraint on tct's incoming data port currentTemp
  @strictpure def I_Assm_Guard_currentTemp(currentTemp: TempControlMixedSeL4CAmKES.Temperature): B =
    I_Assm_currentTemp(currentTemp)

  /** Initialize Entrypoint Contract
    *
    * guarantee defaultSetPoint
    * @param currentSetPoint post-state state variable
    */
  @strictpure def initialize_defaultSetPoint (
      currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint): B =
    currentSetPoint.low.degrees == 70.0f &
      currentSetPoint.high.degrees == 90.0f

  /** Initialize Entrypoint Contract
    *
    * guarantee defaultFanStates
    * @param currentFanState post-state state variable
    */
  @strictpure def initialize_defaultFanStates (
      currentFanState: TempControlMixedSeL4CAmKES.FanCmd.Type): B =
    currentFanState == FanCmd.Off

  /** Initialize Entrypoint Contract
    *
    * guarantee defaultLatestTemp
    * @param latestTemp post-state state variable
    */
  @strictpure def initialize_defaultLatestTemp (
      latestTemp: TempControlMixedSeL4CAmKES.Temperature): B =
    latestTemp.degrees == 72.0f

  /** IEP-Guar: Initialize Entrypoint Contracts for tct
    *
    * @param currentFanState post-state state variable
    * @param currentSetPoint post-state state variable
    * @param fanError post-state state variable
    * @param latestTemp post-state state variable
    * @param api_fanCmd outgoing event data port
    */
  @strictpure def initialize_IEP_Guar (
      currentFanState: TempControlMixedSeL4CAmKES.FanCmd.Type,
      currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint,
      fanError: Base_Types.Boolean,
      latestTemp: TempControlMixedSeL4CAmKES.Temperature,
      api_fanCmd: Option[TempControlMixedSeL4CAmKES.FanCmd.Type]): B =
    initialize_defaultSetPoint(currentSetPoint) &
    initialize_defaultFanStates(currentFanState) &
    initialize_defaultLatestTemp(latestTemp)

  /** IEP-Post: Initialize Entrypoint Post-Condition
    *
    * @param currentFanState post-state state variable
    * @param currentSetPoint post-state state variable
    * @param fanError post-state state variable
    * @param latestTemp post-state state variable
    * @param api_fanCmd outgoing event data port
    */
  @strictpure def inititialize_IEP_Post (
      currentFanState: TempControlMixedSeL4CAmKES.FanCmd.Type,
      currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint,
      fanError: Base_Types.Boolean,
      latestTemp: TempControlMixedSeL4CAmKES.Temperature,
      api_fanCmd: Option[TempControlMixedSeL4CAmKES.FanCmd.Type]): B =
    (// D-Inv-Guard: Datatype invariants for the types associated with tct's state variables and outgoing ports
     TempControlMixedSeL4CAmKES.SetPoint.D_Inv_SetPoint(currentSetPoint) &
     TempControlMixedSeL4CAmKES.Temperature.D_Inv_Temperature(latestTemp) & 

     // IEP-Guar: Initialize Entrypoint contract for tct
     initialize_IEP_Guar(currentFanState, currentSetPoint, fanError, latestTemp, api_fanCmd))

  /** IEP-Post: Initialize Entrypoint Post-Condition via container
    *
    * @param post Container holding the value of incoming ports and the pre-state values of state variables
    */
  @strictpure def inititialize_IEP_Post_Container (post: TempControl_tcp_tct_PostState_Container_PS): B =
    inititialize_IEP_Post (
      currentFanState = post.currentFanState,
      currentSetPoint = post.currentSetPoint,
      fanError = post.fanError,
      latestTemp = post.latestTemp,
      api_fanCmd = post.api_fanCmd)

  /** Compute Entrypoint Contract
    *
    * assumes a1
    *   "If the previously received currentTemp was less than the previously
    *   received setPoint then the last fan command must have been Off"
    * @param In_currentFanState pre-state state variable
    * @param In_currentSetPoint pre-state state variable
    * @param In_fanError pre-state state variable
    * @param In_latestTemp pre-state state variable
    */
  @strictpure def compute_spec_a1_assume(
      In_currentFanState: TempControlMixedSeL4CAmKES.FanCmd.Type,
      In_currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint,
      In_fanError: Base_Types.Boolean,
      In_latestTemp: TempControlMixedSeL4CAmKES.Temperature): B =
    !In_fanError &
      In_latestTemp.degrees < In_currentSetPoint.low.degrees __>:
      In_currentFanState == FanCmd.Off

  /** Compute Entrypoint Contract
    *
    * assumes a2
    *   "If the previously received currentTemp was more than the previously
    *   received setPoint then the last fan command must have been On"
    * @param In_currentFanState pre-state state variable
    * @param In_currentSetPoint pre-state state variable
    * @param In_fanError pre-state state variable
    * @param In_latestTemp pre-state state variable
    */
  @strictpure def compute_spec_a2_assume(
      In_currentFanState: TempControlMixedSeL4CAmKES.FanCmd.Type,
      In_currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint,
      In_fanError: Base_Types.Boolean,
      In_latestTemp: TempControlMixedSeL4CAmKES.Temperature): B =
    !In_fanError &
      In_latestTemp.degrees > In_currentSetPoint.high.degrees __>:
      In_currentFanState == FanCmd.On

  /** CEP-T-Assm: Top-level assume contracts for tct's compute entrypoint
    *
    * @param In_currentFanState pre-state state variable
    * @param In_currentSetPoint pre-state state variable
    * @param In_fanError pre-state state variable
    * @param In_latestTemp pre-state state variable
    */
  @strictpure def compute_CEP_T_Assm (
      In_currentFanState: TempControlMixedSeL4CAmKES.FanCmd.Type,
      In_currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint,
      In_fanError: Base_Types.Boolean,
      In_latestTemp: TempControlMixedSeL4CAmKES.Temperature): B =
    compute_spec_a1_assume(In_currentFanState, In_currentSetPoint, In_fanError, In_latestTemp) &
    compute_spec_a2_assume(In_currentFanState, In_currentSetPoint, In_fanError, In_latestTemp)

  /** CEP-Pre: Compute Entrypoint Pre-Condition for tct
    *
    * @param In_currentFanState pre-state state variable
    * @param In_currentSetPoint pre-state state variable
    * @param In_fanError pre-state state variable
    * @param In_latestTemp pre-state state variable
    * @param api_tempChanged incoming event port
    * @param api_fanAck incoming event data port
    * @param api_setPoint incoming event data port
    * @param api_currentTemp incoming data port
    */
  @strictpure def compute_CEP_Pre (
      In_currentFanState: TempControlMixedSeL4CAmKES.FanCmd.Type,
      In_currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint,
      In_fanError: Base_Types.Boolean,
      In_latestTemp: TempControlMixedSeL4CAmKES.Temperature,
      api_tempChanged: Option[art.Empty],
      api_fanAck: Option[TempControlMixedSeL4CAmKES.FanAck.Type],
      api_setPoint: Option[TempControlMixedSeL4CAmKES.SetPoint],
      api_currentTemp: TempControlMixedSeL4CAmKES.Temperature): B =
    {// D-Inv-Guard: Datatype invariants for the types associated with tct's state variables and incoming ports
     val a = TempControlMixedSeL4CAmKES.SetPoint.D_Inv_SetPoint(In_currentSetPoint)
     val b = TempControlMixedSeL4CAmKES.Temperature.D_Inv_Temperature(In_latestTemp)
     val c = TempControlMixedSeL4CAmKES.SetPoint.D_Inv_Guard_SetPoint(api_setPoint)
     val d = TempControlMixedSeL4CAmKES.Temperature.D_Inv_Temperature(api_currentTemp)

     // I-Assm-Guard: Integration constraints for tct's incoming ports
     val e =I_Assm_Guard_currentTemp(api_currentTemp)

     // CEP-Assm: assume clauses of tct's compute entrypoint
     val f = compute_CEP_T_Assm (In_currentFanState, In_currentSetPoint, In_fanError, In_latestTemp)

      val ret = a & b & c & d & e & f
      if (!ret){
        assert (T)
      }
      ret
    }
  /** CEP-Pre: Compute Entrypoint Pre-Condition for tct via container
    *
    * @param pre Container holding the value of incoming ports and the pre-state values of state variables
    */
  @strictpure def compute_CEP_Pre_Container(pre: TempControl_tcp_tct_PreState_Container_PS): B =
    compute_CEP_Pre(
      In_currentFanState = pre.In_currentFanState,
      In_currentSetPoint = pre.In_currentSetPoint,
      In_fanError = pre.In_fanError,
      In_latestTemp = pre.In_latestTemp,
      api_tempChanged = pre.api_tempChanged,
      api_fanAck = pre.api_fanAck,
      api_setPoint = pre.api_setPoint,
      api_currentTemp = pre.api_currentTemp)

  /** Compute Entrypoint Contract
    *
    * guarantee errorState
    *   "If the fan sent FanAck.Error then continue sending the
    *   last fan command until the fan sends FanAck.Ok"
    * @param In_currentFanState pre-state state variable
    * @param currentFanState post-state state variable
    * @param fanError post-state state variable
    * @param api_fanCmd outgoing event data port
    */
  @strictpure def compute_spec_errorState_guarantee(
      In_currentFanState: TempControlMixedSeL4CAmKES.FanCmd.Type,
      currentFanState: TempControlMixedSeL4CAmKES.FanCmd.Type,
      fanError: Base_Types.Boolean,
      api_fanCmd: Option[TempControlMixedSeL4CAmKES.FanCmd.Type]): B =
    fanError __>:
      In_currentFanState == currentFanState &&
        (api_fanCmd.nonEmpty &&
          api_fanCmd.get == currentFanState)

  /** Compute Entrypoint Contract
    *
    * guarantee TC_Req_01
    *   "If the current temperature is less than the set point, then the fan state shall be Off."
    * @param currentFanState post-state state variable
    * @param currentSetPoint post-state state variable
    * @param fanError post-state state variable
    * @param latestTemp post-state state variable
    */
  @strictpure def compute_spec_TC_Req_01_guarantee(
      currentFanState: TempControlMixedSeL4CAmKES.FanCmd.Type,
      currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint,
      fanError: Base_Types.Boolean,
      latestTemp: TempControlMixedSeL4CAmKES.Temperature): B =
    !fanError &
      latestTemp.degrees < currentSetPoint.low.degrees __>:
      currentFanState == FanCmd.Off

  /** Compute Entrypoint Contract
    *
    * guarantee TC_Req_02
    *   "If the current temperature is greater than the set point,
    *   then the fan state shall be On."
    * @param currentFanState post-state state variable
    * @param currentSetPoint post-state state variable
    * @param fanError post-state state variable
    * @param latestTemp post-state state variable
    */
  @strictpure def compute_spec_TC_Req_02_guarantee(
      currentFanState: TempControlMixedSeL4CAmKES.FanCmd.Type,
      currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint,
      fanError: Base_Types.Boolean,
      latestTemp: TempControlMixedSeL4CAmKES.Temperature): B =
    !fanError &
      latestTemp.degrees > currentSetPoint.high.degrees __>:
      currentFanState == FanCmd.On

  /** Compute Entrypoint Contract
    *
    * guarantee TC_Req_03
    *   "If the current temperature is greater than or equal to the
    *   current low set point and less than or equal to the current high set point,
    *   then the current fan state is maintained."
    * @param In_currentFanState pre-state state variable
    * @param currentFanState post-state state variable
    * @param currentSetPoint post-state state variable
    * @param fanError post-state state variable
    * @param latestTemp post-state state variable
    */
  @strictpure def compute_spec_TC_Req_03_guarantee(
      In_currentFanState: TempControlMixedSeL4CAmKES.FanCmd.Type,
      currentFanState: TempControlMixedSeL4CAmKES.FanCmd.Type,
      currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint,
      fanError: Base_Types.Boolean,
      latestTemp: TempControlMixedSeL4CAmKES.Temperature): B =
    !fanError &
      (latestTemp.degrees >= currentSetPoint.low.degrees &
        latestTemp.degrees <= currentSetPoint.high.degrees) __>:
      currentFanState == In_currentFanState

  /** Compute Entrypoint Contract
    *
    * guarantee mustSendFanCmd
    *   "If the local record of the fan state was updated,
    *   then send a fan command event with this updated value."
    * @param In_currentFanState pre-state state variable
    * @param currentFanState post-state state variable
    * @param fanError post-state state variable
    * @param api_fanCmd outgoing event data port
    */
  @strictpure def compute_spec_mustSendFanCmd_guarantee(
      In_currentFanState: TempControlMixedSeL4CAmKES.FanCmd.Type,
      currentFanState: TempControlMixedSeL4CAmKES.FanCmd.Type,
      fanError: Base_Types.Boolean,
      api_fanCmd: Option[TempControlMixedSeL4CAmKES.FanCmd.Type]): B =
    (!fanError &
       In_currentFanState != currentFanState __>:
       api_fanCmd.nonEmpty &&
         api_fanCmd.get == currentFanState) &&
      (!fanError &
        currentFanState == In_currentFanState __>:
        api_fanCmd.isEmpty)

  /** CEP-T-Guar: Top-level guarantee contracts for tct's compute entrypoint
    *
    * @param In_currentFanState pre-state state variable
    * @param currentFanState post-state state variable
    * @param currentSetPoint post-state state variable
    * @param fanError post-state state variable
    * @param latestTemp post-state state variable
    * @param api_fanCmd outgoing event data port
    */
  @strictpure def compute_CEP_T_Guar (
      In_currentFanState: TempControlMixedSeL4CAmKES.FanCmd.Type,
      currentFanState: TempControlMixedSeL4CAmKES.FanCmd.Type,
      currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint,
      fanError: Base_Types.Boolean,
      latestTemp: TempControlMixedSeL4CAmKES.Temperature,
      api_fanCmd: Option[TempControlMixedSeL4CAmKES.FanCmd.Type]): B = {
    val a = compute_spec_errorState_guarantee(In_currentFanState, currentFanState, fanError, api_fanCmd)
    val b = compute_spec_TC_Req_01_guarantee(currentFanState, currentSetPoint, fanError, latestTemp)
    val c = compute_spec_TC_Req_02_guarantee(currentFanState, currentSetPoint, fanError, latestTemp)
    val d = compute_spec_TC_Req_03_guarantee(In_currentFanState, currentFanState, currentSetPoint, fanError, latestTemp)
    val e = compute_spec_mustSendFanCmd_guarantee(In_currentFanState, currentFanState, fanError, api_fanCmd)
    val ret = a & b & c & d & e
    if (!ret) {
      assert (T)
    }
    ret
  }

  /** Compute Entrypoint Contract for setPoint's setPointChanged guarantee clause
    *
    * guarantee setPointChanged
    * @param currentSetPoint post-state state variable
    * @param api_setPoint incoming event data port
    */
  @strictpure def compute_handle_setPoint_setPointChanged_guarantee(
      currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint,
      api_setPoint: Option[TempControlMixedSeL4CAmKES.SetPoint]): B =
    currentSetPoint == api_setPoint.get

  /** Compute Entrypoint Contract for setPoint's latestTempNotModified guarantee clause
    *
    * guarantee latestTempNotModified
    * @param In_latestTemp pre-state state variable
    * @param latestTemp post-state state variable
    */
  @strictpure def compute_handle_setPoint_latestTempNotModified_guarantee(
      In_latestTemp: TempControlMixedSeL4CAmKES.Temperature,
      latestTemp: TempControlMixedSeL4CAmKES.Temperature): B =
    latestTemp == In_latestTemp

  /** CEP-T-Handle_setPoint_Guar: Top-level guarantee contracts for tct's compute setPoint handler
    *
    * @param In_latestTemp pre-state state variable
    * @param currentSetPoint post-state state variable
    * @param latestTemp post-state state variable
    * @param api_setPoint incoming event data port
    */
  @strictpure def compute_CEP_Handler_setPoint_Guar (
      In_latestTemp: TempControlMixedSeL4CAmKES.Temperature,
      currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint,
      latestTemp: TempControlMixedSeL4CAmKES.Temperature,
      api_setPoint: Option[TempControlMixedSeL4CAmKES.SetPoint]): B =
    api_setPoint.nonEmpty -->: (
      compute_handle_setPoint_setPointChanged_guarantee(currentSetPoint, api_setPoint) &
      compute_handle_setPoint_latestTempNotModified_guarantee(In_latestTemp, latestTemp))

  /** Compute Entrypoint Contract for tempChanged's tempChanged guarantee clause
    *
    * guarantee tempChanged
    * @param latestTemp post-state state variable
    * @param api_currentTemp incoming data port
    */
  @strictpure def compute_handle_tempChanged_tempChanged_guarantee(
      latestTemp: TempControlMixedSeL4CAmKES.Temperature,
      api_currentTemp: TempControlMixedSeL4CAmKES.Temperature): B =
    latestTemp == api_currentTemp

  /** Compute Entrypoint Contract for tempChanged's setPointNotModified guarantee clause
    *
    * guarantee setPointNotModified
    * @param In_currentSetPoint pre-state state variable
    * @param currentSetPoint post-state state variable
    */
  @strictpure def compute_handle_tempChanged_setPointNotModified_guarantee(
      In_currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint,
      currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint): B =
    currentSetPoint == In_currentSetPoint

  /** CEP-T-Handle_tempChanged_Guar: Top-level guarantee contracts for tct's compute tempChanged handler
    *
    * @param In_currentSetPoint pre-state state variable
    * @param currentSetPoint post-state state variable
    * @param latestTemp post-state state variable
    * @param api_tempChanged incoming event port
    * @param api_currentTemp incoming data port
    */
  @strictpure def compute_CEP_Handler_tempChanged_Guar (
      In_currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint,
      currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint,
      latestTemp: TempControlMixedSeL4CAmKES.Temperature,
      api_tempChanged: Option[art.Empty],
      api_currentTemp: TempControlMixedSeL4CAmKES.Temperature): B =
    api_tempChanged.nonEmpty -->: (
      compute_handle_tempChanged_tempChanged_guarantee(latestTemp, api_currentTemp) &
      compute_handle_tempChanged_setPointNotModified_guarantee(In_currentSetPoint, currentSetPoint))

  /** Compute Entrypoint Contract for fanAck's setPointNotModified guarantee clause
    *
    * guarantee setPointNotModified
    * @param In_currentSetPoint pre-state state variable
    * @param currentSetPoint post-state state variable
    */
  @strictpure def compute_handle_fanAck_setPointNotModified_guarantee(
      In_currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint,
      currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint): B =
    currentSetPoint == In_currentSetPoint

  /** Compute Entrypoint Contract for fanAck's lastTempNotModified guarantee clause
    *
    * guarantee lastTempNotModified
    * @param In_latestTemp pre-state state variable
    * @param latestTemp post-state state variable
    */
  @strictpure def compute_handle_fanAck_lastTempNotModified_guarantee(
      In_latestTemp: TempControlMixedSeL4CAmKES.Temperature,
      latestTemp: TempControlMixedSeL4CAmKES.Temperature): B =
    latestTemp == In_latestTemp

  /** Compute Entrypoint Contract for fanAck's manageErrorState guarantee clause
    *
    * guarantee manageErrorState
    * @param fanError post-state state variable
    * @param api_fanAck incoming event data port
    */
  @strictpure def compute_handle_fanAck_manageErrorState_guarantee(
      fanError: Base_Types.Boolean,
      api_fanAck: Option[TempControlMixedSeL4CAmKES.FanAck.Type]): B =
    (api_fanAck.get == FanAck.Ok __>:
       !fanError) &
      (api_fanAck.get == FanAck.Error __>:
        fanError)

  /** CEP-T-Handle_fanAck_Guar: Top-level guarantee contracts for tct's compute fanAck handler
    *
    * @param In_currentSetPoint pre-state state variable
    * @param In_latestTemp pre-state state variable
    * @param currentSetPoint post-state state variable
    * @param fanError post-state state variable
    * @param latestTemp post-state state variable
    * @param api_fanAck incoming event data port
    */
  @strictpure def compute_CEP_Handler_fanAck_Guar (
      In_currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint,
      In_latestTemp: TempControlMixedSeL4CAmKES.Temperature,
      currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint,
      fanError: Base_Types.Boolean,
      latestTemp: TempControlMixedSeL4CAmKES.Temperature,
      api_fanAck: Option[TempControlMixedSeL4CAmKES.FanAck.Type]): B =
    api_fanAck.nonEmpty -->: (
      compute_handle_fanAck_setPointNotModified_guarantee(In_currentSetPoint, currentSetPoint) &
      compute_handle_fanAck_lastTempNotModified_guarantee(In_latestTemp, latestTemp) &
      compute_handle_fanAck_manageErrorState_guarantee(fanError, api_fanAck))

  /** CEP-Post: Compute Entrypoint Post-Condition for tct
    *
    * @param In_currentFanState pre-state state variable
    * @param In_currentSetPoint pre-state state variable
    * @param In_fanError pre-state state variable
    * @param In_latestTemp pre-state state variable
    * @param currentFanState post-state state variable
    * @param currentSetPoint post-state state variable
    * @param fanError post-state state variable
    * @param latestTemp post-state state variable
    * @param api_tempChanged incoming event port
    * @param api_fanAck incoming event data port
    * @param api_setPoint incoming event data port
    * @param api_currentTemp incoming data port
    * @param api_fanCmd outgoing event data port
    */
  @strictpure def compute_CEP_Post (
      In_currentFanState: TempControlMixedSeL4CAmKES.FanCmd.Type,
      In_currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint,
      In_fanError: Base_Types.Boolean,
      In_latestTemp: TempControlMixedSeL4CAmKES.Temperature,
      currentFanState: TempControlMixedSeL4CAmKES.FanCmd.Type,
      currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint,
      fanError: Base_Types.Boolean,
      latestTemp: TempControlMixedSeL4CAmKES.Temperature,
      api_tempChanged: Option[art.Empty],
      api_fanAck: Option[TempControlMixedSeL4CAmKES.FanAck.Type],
      api_setPoint: Option[TempControlMixedSeL4CAmKES.SetPoint],
      api_currentTemp: TempControlMixedSeL4CAmKES.Temperature,
      api_fanCmd: Option[TempControlMixedSeL4CAmKES.FanCmd.Type]): B = { // D-Inv-Guard: Datatype invariants for the types associated with tct's state variables and outgoing ports
    val a = TempControlMixedSeL4CAmKES.SetPoint.D_Inv_SetPoint(In_currentSetPoint)
    val b = TempControlMixedSeL4CAmKES.Temperature.D_Inv_Temperature(In_latestTemp)
    val c = TempControlMixedSeL4CAmKES.SetPoint.D_Inv_SetPoint(currentSetPoint)
    val d = TempControlMixedSeL4CAmKES.Temperature.D_Inv_Temperature(latestTemp)
    val e = TempControlMixedSeL4CAmKES.SetPoint.D_Inv_Guard_SetPoint(api_setPoint)
    val f = TempControlMixedSeL4CAmKES.Temperature.D_Inv_Temperature(api_currentTemp)

    // CEP-Guar: guarantee clauses of tct's compute entrypoint
    val g = compute_CEP_T_Guar(In_currentFanState, currentFanState, currentSetPoint, fanError, latestTemp, api_fanCmd)

    // CEP-T-Handlers: handler clauses of tct's compute entrypoint
    val h = compute_CEP_Handler_setPoint_Guar(In_latestTemp, currentSetPoint, latestTemp, api_setPoint)
    val i = compute_CEP_Handler_tempChanged_Guar(In_currentSetPoint, currentSetPoint, latestTemp, api_tempChanged, api_currentTemp)
    val j = compute_CEP_Handler_fanAck_Guar(In_currentSetPoint, In_latestTemp, currentSetPoint, fanError, latestTemp, api_fanAck)

    val ret = a & b & c & d & e & f & g & h & i & j
    if (!ret) {
      assert (T)
    }
    ret
  }

  /** CEP-Post: Compute Entrypoint Post-Condition for tct via containers
    *
    * @param pre Container holding the values of incoming ports and the pre-state values of state variables
    * @param post Container holding the values of outgoing ports and the post-state values of state variables
    */
  @strictpure def compute_CEP_Post_Container(
      pre: TempControl_tcp_tct_PreState_Container_PS,
      post: TempControl_tcp_tct_PostState_Container_PS): B =
    compute_CEP_Post(
      In_currentFanState = pre.In_currentFanState,
      In_currentSetPoint = pre.In_currentSetPoint,
      In_fanError = pre.In_fanError,
      In_latestTemp = pre.In_latestTemp,
      currentFanState = post.currentFanState,
      currentSetPoint = post.currentSetPoint,
      fanError = post.fanError,
      latestTemp = post.latestTemp,
      api_tempChanged = pre.api_tempChanged,
      api_fanAck = pre.api_fanAck,
      api_setPoint = pre.api_setPoint,
      api_currentTemp = pre.api_currentTemp,
      api_fanCmd = post.api_fanCmd)
}
