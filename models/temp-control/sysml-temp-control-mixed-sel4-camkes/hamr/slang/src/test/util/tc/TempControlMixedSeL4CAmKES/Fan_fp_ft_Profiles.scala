// #Sireum

package tc.TempControlMixedSeL4CAmKES

import org.sireum._
import tc.util.Profile
import tc.util.EmptyContainer
import tc.RandomLib

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// Profile for initialise entrypoint
@msig trait Fan_fp_ft_Profile_Trait extends Profile

@record class Fan_fp_ft_Profile (
  val name: String,
) extends Fan_fp_ft_Profile_Trait {

  override def next: EmptyContainer = {
    return EmptyContainer()
  }
}

// Profile with generators for incoming ports
@msig trait Fan_fp_ft_Profile_P_Trait extends Profile {
  def api_fanCmd: RandomLib // random lib for generating TempControlMixedSeL4CAmKES.FanCmd
}

@record class Fan_fp_ft_Profile_P(
  val name: String,
  var api_fanCmd: RandomLib // random lib for generating TempControlMixedSeL4CAmKES.FanCmd
  ) extends Fan_fp_ft_Profile_P_Trait {

  override def next: Fan_fp_ft_PreState_Container_P = {
    return (Fan_fp_ft_PreState_Container_P (
      api_fanCmd = api_fanCmd.nextOptionTempControlMixedSeL4CAmKESFanCmdType()))
  }
}

// Profile with generators for state variables and incoming ports
@msig trait Fan_fp_ft_Profile_PS_Trait extends Fan_fp_ft_Profile_P_Trait {
  def api_fanCmd: RandomLib // random lib for generating TempControlMixedSeL4CAmKES.FanCmd
}

@record class Fan_fp_ft_Profile_PS(
  val name: String,
  var api_fanCmd: RandomLib // random lib for generating TempControlMixedSeL4CAmKES.FanCmd
  ) extends Fan_fp_ft_Profile_PS_Trait {

  override def next: Fan_fp_ft_PreState_Container_PS = {
    return (Fan_fp_ft_PreState_Container_PS (
      api_fanCmd = api_fanCmd.nextOptionTempControlMixedSeL4CAmKESFanCmdType()))
  }
}
