// #Sireum

package rts.Actuation

import org.sireum._
import rts.util.Profile
import rts.util.EmptyContainer
import rts.RandomLib

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// Profile for initialise entrypoint
@msig trait OrLogic_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_Profile_Trait extends Profile

@record class OrLogic_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_Profile (
  val name: String,
) extends OrLogic_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_Profile_Trait {

  override def next: EmptyContainer = {
    return EmptyContainer()
  }
}

// Profile with generators for incoming ports
@msig trait OrLogic_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_Profile_P_Trait extends Profile {
  def api_channel1: RandomLib // random lib for generating Base_Types.Boolean
  def api_channel2: RandomLib // random lib for generating Base_Types.Boolean
}

@record class OrLogic_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_Profile_P(
  val name: String,
  var api_channel1: RandomLib, // random lib for generating Base_Types.Boolean
  var api_channel2: RandomLib // random lib for generating Base_Types.Boolean
  ) extends OrLogic_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_Profile_P_Trait {

  override def next: OrLogic_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P = {
    return (OrLogic_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_P (
      api_channel1 = api_channel1.nextB(),
      api_channel2 = api_channel2.nextB()))
  }
}

// Profile with generators for state variables and incoming ports
@msig trait OrLogic_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_Profile_PS_Trait extends OrLogic_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_Profile_P_Trait {
  def api_channel1: RandomLib // random lib for generating Base_Types.Boolean
  def api_channel2: RandomLib // random lib for generating Base_Types.Boolean
}

@record class OrLogic_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_Profile_PS(
  val name: String,
  var api_channel1: RandomLib, // random lib for generating Base_Types.Boolean
  var api_channel2: RandomLib // random lib for generating Base_Types.Boolean
  ) extends OrLogic_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_Profile_PS_Trait {

  override def next: OrLogic_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS = {
    return (OrLogic_actuationSubsystem_saturationActuatorUnit_actuateSaturationActuator_orLogic_PreState_Container_PS (
      api_channel1 = api_channel1.nextB(),
      api_channel2 = api_channel2.nextB()))
  }
}
