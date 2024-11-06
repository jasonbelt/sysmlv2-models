// #Sireum

package tc.TempControlMixedSeL4CAmKES

import org.sireum._
import tc._
import tc.util.Container

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// containers for the pre and post state values of ports and state variables

@sig trait Fan_fp_ft_PreState_Container extends Container {
  def api_fanCmd: Option[TempControlMixedSeL4CAmKES.FanCmd.Type]
}

// container for incoming ports
@datatype class Fan_fp_ft_PreState_Container_P (
  val api_fanCmd: Option[TempControlMixedSeL4CAmKES.FanCmd.Type]) extends Fan_fp_ft_PreState_Container

// container for incoming ports and state variables
@datatype class Fan_fp_ft_PreState_Container_PS (
  val api_fanCmd: Option[TempControlMixedSeL4CAmKES.FanCmd.Type]) extends Fan_fp_ft_PreState_Container

@sig trait Fan_fp_ft_PostState_Container extends Container {
  def api_fanAck: Option[TempControlMixedSeL4CAmKES.FanAck.Type]
}

// container for outgoing ports
@datatype class Fan_fp_ft_PostState_Container_P (
  val api_fanAck: Option[TempControlMixedSeL4CAmKES.FanAck.Type]) extends Fan_fp_ft_PostState_Container

// container for outgoing ports and state variables
@datatype class Fan_fp_ft_PostState_Container_PS (
  val api_fanAck: Option[TempControlMixedSeL4CAmKES.FanAck.Type]) extends Fan_fp_ft_PostState_Container