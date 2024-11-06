// #Sireum

package tc.TempControlMixedSeL4CAmKES

import org.sireum._
import tc._
import tc.util.Container

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// containers for the pre and post state values of ports and state variables

@sig trait TempSensor_tsp_tst_PreState_Container extends Container {
}

// container for incoming ports
@datatype class TempSensor_tsp_tst_PreState_Container_P (
  ) extends TempSensor_tsp_tst_PreState_Container

// container for incoming ports and state variables
@datatype class TempSensor_tsp_tst_PreState_Container_PS (
  ) extends TempSensor_tsp_tst_PreState_Container

@sig trait TempSensor_tsp_tst_PostState_Container extends Container {
  def api_tempChanged: Option[art.Empty]
  def api_currentTemp: TempControlMixedSeL4CAmKES.Temperature
}

// container for outgoing ports
@datatype class TempSensor_tsp_tst_PostState_Container_P (
  val api_tempChanged: Option[art.Empty],
  val api_currentTemp: TempControlMixedSeL4CAmKES.Temperature) extends TempSensor_tsp_tst_PostState_Container

// container for outgoing ports and state variables
@datatype class TempSensor_tsp_tst_PostState_Container_PS (
  val api_tempChanged: Option[art.Empty],
  val api_currentTemp: TempControlMixedSeL4CAmKES.Temperature) extends TempSensor_tsp_tst_PostState_Container
