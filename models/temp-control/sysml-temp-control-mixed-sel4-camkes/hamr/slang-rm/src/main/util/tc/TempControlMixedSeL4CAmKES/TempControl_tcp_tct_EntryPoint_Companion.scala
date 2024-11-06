// #Sireum

package tc.TempControlMixedSeL4CAmKES

import org.sireum._
import art._
import tc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object TempControl_tcp_tct_EntryPoint_Companion {

  var preStateContainer_wL: Option[TempControl_tcp_tct_PreState_Container_PS] = None()

  def pre_initialise(): Unit = {
    // assume/require contracts cannot refer to incoming ports or
    // state variables so nothing to do here
  }

  def post_initialise(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      TempControl_tcp_tct_PostState_Container_PS(
        currentFanState = tc.TempControlMixedSeL4CAmKES.TempControl_tcp_tct.currentFanState,
        currentSetPoint = tc.TempControlMixedSeL4CAmKES.TempControl_tcp_tct.currentSetPoint,
        fanError = tc.TempControlMixedSeL4CAmKES.TempControl_tcp_tct.fanError,
        latestTemp = tc.TempControlMixedSeL4CAmKES.TempControl_tcp_tct.latestTemp,
        api_fanCmd = 
          if (Art.observeOutPortVariable(Arch.TempControlSystem_Instance_tcp_tct.operational_api.fanCmd_Id).nonEmpty)
            Some(Art.observeOutPortVariable(Arch.TempControlSystem_Instance_tcp_tct.operational_api.fanCmd_Id).get.asInstanceOf[TempControlMixedSeL4CAmKES.FanCmd_Payload].value)
          else None())

    // the rest can now be performed via a different thread
    tc.runtimemonitor.RuntimeMonitor.observeInitialisePostState(Arch.TempControlSystem_Instance_tcp_tct.id, tc.runtimemonitor.ObservationKind.TempControlSystem_Instance_tcp_tct_postInit, postStateContainer_wL)
  }

  def pre_compute(dispatchedEventPortId: Art.PortId): Unit = {
    // block the component while its pre-state values are retrieved
    preStateContainer_wL = Some(
      TempControl_tcp_tct_PreState_Container_PS(
        In_currentFanState = tc.TempControlMixedSeL4CAmKES.TempControl_tcp_tct.currentFanState, 
        In_currentSetPoint = tc.TempControlMixedSeL4CAmKES.TempControl_tcp_tct.currentSetPoint, 
        In_fanError = tc.TempControlMixedSeL4CAmKES.TempControl_tcp_tct.fanError, 
        In_latestTemp = tc.TempControlMixedSeL4CAmKES.TempControl_tcp_tct.latestTemp, 
        api_tempChanged = 
          if (dispatchedEventPortId == Arch.TempControlSystem_Instance_tcp_tct.operational_api.tempChanged_Id)
            Art.observeInPortVariable(Arch.TempControlSystem_Instance_tcp_tct.operational_api.tempChanged_Id).asInstanceOf[Option[art.Empty]]
          else None(), 
        api_fanAck = 
          if (dispatchedEventPortId == Arch.TempControlSystem_Instance_tcp_tct.operational_api.fanAck_Id)
            if (Art.observeInPortVariable(Arch.TempControlSystem_Instance_tcp_tct.operational_api.fanAck_Id).nonEmpty)
              Some(Art.observeInPortVariable(Arch.TempControlSystem_Instance_tcp_tct.operational_api.fanAck_Id).get.asInstanceOf[TempControlMixedSeL4CAmKES.FanAck_Payload].value)
            else None()
          else None(), 
        api_setPoint = 
          if (dispatchedEventPortId == Arch.TempControlSystem_Instance_tcp_tct.operational_api.setPoint_Id)
            if (Art.observeInPortVariable(Arch.TempControlSystem_Instance_tcp_tct.operational_api.setPoint_Id).nonEmpty)
              Some(Art.observeInPortVariable(Arch.TempControlSystem_Instance_tcp_tct.operational_api.setPoint_Id).get.asInstanceOf[TempControlMixedSeL4CAmKES.SetPoint_Payload].value)
            else None()
          else None(), 
        api_currentTemp = Art.observeInPortVariable(Arch.TempControlSystem_Instance_tcp_tct.operational_api.currentTemp_Id).get.asInstanceOf[TempControlMixedSeL4CAmKES.Temperature_Payload].value))

    // the rest can now be performed via a different thread
    tc.runtimemonitor.RuntimeMonitor.observeComputePreState(Arch.TempControlSystem_Instance_tcp_tct.id, tc.runtimemonitor.ObservationKind.TempControlSystem_Instance_tcp_tct_preCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]])
  }

  def post_compute(): Unit = {
    // block the component while its post-state values are retrieved
    val postStateContainer_wL =
      TempControl_tcp_tct_PostState_Container_PS(
        currentFanState = tc.TempControlMixedSeL4CAmKES.TempControl_tcp_tct.currentFanState,
        currentSetPoint = tc.TempControlMixedSeL4CAmKES.TempControl_tcp_tct.currentSetPoint,
        fanError = tc.TempControlMixedSeL4CAmKES.TempControl_tcp_tct.fanError,
        latestTemp = tc.TempControlMixedSeL4CAmKES.TempControl_tcp_tct.latestTemp,
        api_fanCmd = 
          if (Art.observeOutPortVariable(Arch.TempControlSystem_Instance_tcp_tct.operational_api.fanCmd_Id).nonEmpty)
            Some(Art.observeOutPortVariable(Arch.TempControlSystem_Instance_tcp_tct.operational_api.fanCmd_Id).get.asInstanceOf[TempControlMixedSeL4CAmKES.FanCmd_Payload].value)
          else None())

    // the rest can now be performed via a different thread
    tc.runtimemonitor.RuntimeMonitor.observeComputePrePostState(Arch.TempControlSystem_Instance_tcp_tct.id, tc.runtimemonitor.ObservationKind.TempControlSystem_Instance_tcp_tct_postCompute, preStateContainer_wL.asInstanceOf[Option[art.DataContent]], postStateContainer_wL)
  }
}