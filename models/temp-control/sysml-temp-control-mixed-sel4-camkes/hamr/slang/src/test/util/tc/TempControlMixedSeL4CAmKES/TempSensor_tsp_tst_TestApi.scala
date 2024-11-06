// #Sireum

package tc.TempControlMixedSeL4CAmKES

import org.sireum._
import art.Art
import tc._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun
@msig trait TempSensor_tsp_tst_TestApi {

  def BeforeEntrypoint(): Unit = {
    Art.initTest(Arch.TempControlSystem_Instance_tsp_tst)
  }

  def AfterEntrypoint(): Unit = {
    Art.finalizeTest(Arch.TempControlSystem_Instance_tsp_tst)
  }

  def testCompute(): Unit = {
    Art.manuallyClearOutput()
    Art.testCompute(Arch.TempControlSystem_Instance_tsp_tst)
  }

  def testInitialise(): Unit = {
    Art.manuallyClearOutput()
    Art.testInitialise(Arch.TempControlSystem_Instance_tsp_tst)
  }

  /** helper function to check TempSensor_tsp_tst's
   * output ports.  Use named arguments to check subsets of the output ports.
   * @param currentTemp method that will be called with the value of the outgoing data
   *        port 'currentTemp'.
   * @param tempChanged method that will be called with the number of events to be sent
   *        on the outgoing event port 'tempChanged'.
   */
  def check_concrete_output(currentTemp: TempControlMixedSeL4CAmKES.Temperature => B,
                            tempChanged: Z => B): Unit = {
    var testFailures: ISZ[ST] = ISZ()

    val currentTempValue: TempControlMixedSeL4CAmKES.Temperature = get_currentTemp().get
    if(!currentTemp(currentTempValue)) {
      testFailures = testFailures :+ st"'currentTemp' did not match expected: value of the outgoing data port is ${currentTempValue}"
    }
    // TODO: event port getter should return the number of events in
    //       the output queue when queue sizes > 1 support is added to ART
    val tempChangedValue: Z = if(get_tempChanged().nonEmpty) z"1" else z"0"
    if(!tempChanged(tempChangedValue)) {
      testFailures = testFailures :+ st"'tempChanged' did not match expected: ${tempChangedValue} events were in the outgoing event queue"
    }

    assert(testFailures.isEmpty, st"${(testFailures, "\n")}".render)
  }


  // getter for out DataPort
  def get_currentTemp(): Option[TempControlMixedSeL4CAmKES.Temperature] = {
    val value: Option[TempControlMixedSeL4CAmKES.Temperature] = get_currentTemp_payload() match {
      case Some(TempControlMixedSeL4CAmKES.Temperature_Payload(v)) => Some(v)
      case Some(v) => halt(s"Unexpected payload on port currentTemp.  Expecting 'TempControlMixedSeL4CAmKES.Temperature_Payload' but received ${v}")
      case _ => None[TempControlMixedSeL4CAmKES.Temperature]()
    }
    return value
  }

  // payload getter for out DataPort
  def get_currentTemp_payload(): Option[TempControlMixedSeL4CAmKES.Temperature_Payload] = {
    return Art.observeOutInfrastructurePort(Arch.TempControlSystem_Instance_tsp_tst.initialization_api.currentTemp_Id).asInstanceOf[Option[TempControlMixedSeL4CAmKES.Temperature_Payload]]
  }

  // getter for out EventPort
  def get_tempChanged(): Option[art.Empty] = {
    val value: Option[art.Empty] = get_tempChanged_payload() match {
      case Some(art.Empty()) => Some(art.Empty())
      case Some(v) => halt(s"Unexpected payload on port tempChanged.  Expecting 'art.Empty' but received ${v}")
      case _ => None[art.Empty]()
    }
    return value
  }

  // payload getter for out EventPort
  def get_tempChanged_payload(): Option[art.Empty] = {
    return Art.observeOutInfrastructurePort(Arch.TempControlSystem_Instance_tsp_tst.initialization_api.tempChanged_Id).asInstanceOf[Option[art.Empty]]
  }

}
