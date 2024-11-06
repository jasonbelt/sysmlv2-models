// #Sireum

package rts.Actuators

import org.sireum._
import art._
import rts.SystemTestSuiteSlang.runtimeMonitorStream
import rts._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object ActuatorsMockThread_actuatorsMock_actuatorsMockThread_SystemTestAPI {
  /** helper method to set the values of all incoming ports
    * @param api_saturationActuate incoming data port
    * @param api_tempPressureActuate incoming data port
    */
  def put_concrete_inputs(api_saturationActuate: Base_Types.Boolean,
                          api_tempPressureActuate: Base_Types.Boolean): Unit = {
    put_saturationActuate(api_saturationActuate)
    put_tempPressureActuate(api_tempPressureActuate)
  }

  // setter for incoming data port
  def put_saturationActuate(value: Base_Types.Boolean): Unit = {
    Art.insertInInfrastructurePort(Arch.RTS_Instance_actuatorsMock_actuatorsMockThread.operational_api.saturationActuate_Id, Base_Types.Boolean_Payload(value))
  }

  // setter for incoming data port
  def put_tempPressureActuate(value: Base_Types.Boolean): Unit = {
    Art.insertInInfrastructurePort(Arch.RTS_Instance_actuatorsMock_actuatorsMockThread.operational_api.tempPressureActuate_Id, Base_Types.Boolean_Payload(value))
  }

  def fetchContainer(): rts.Actuators.ActuatorsMockThread_actuatorsMock_actuatorsMockThread_PostState_Container_PS = {
    if (runtimeMonitorStream.contains(Arch.RTS_Instance_actuatorsMock_actuatorsMockThread.id)) {
      val (_, postContainer_) = runtimeMonitorStream.get(Arch.RTS_Instance_actuatorsMock_actuatorsMockThread.id).get
      return postContainer_.asInstanceOf[rts.Actuators.ActuatorsMockThread_actuatorsMock_actuatorsMockThread_PostState_Container_PS]
    }
    else {
      assert(F, s"No post state recorded for ${Arch.RTS_Instance_actuatorsMock_actuatorsMockThread.name}")
      halt(s"No post state recorded for ${Arch.RTS_Instance_actuatorsMock_actuatorsMockThread.name}")
    }
  }

  def check_concrete_outputs(): Unit = {
    var failureReasons: ISZ[ST] = ISZ()


    assert(failureReasons.isEmpty, st"${(failureReasons, "\n")}".render)
  }


}