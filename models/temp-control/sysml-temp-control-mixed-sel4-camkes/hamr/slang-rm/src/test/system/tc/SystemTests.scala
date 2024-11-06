package tc

import org.sireum._
import art.Art
import art.scheduling.static._
import tc.TempControlMixedSeL4CAmKES.{Defs, FanAck, FanCmd, Fan_fp_ft, StaticSchedulerCust, TempControl_tcp_tct, TempUnit, Temperature, Fan_fp_ft_SystemTestAPI => Fan, TempControl_tcp_tct_SystemTestAPI => TempControl}

// This file will not be overwritten so is safe to edit

class SystemTests extends SystemTestSuite {

  // note: this is overriding SystemTestSuite's 'def scheduler: Scheduler'
  //       abstract method
  var scheduler: StaticScheduler = Schedulers.getStaticScheduler(
    StaticSchedulerCust.staticSchedule,
    StaticSchedulerCust.domainToBridgeIdMap,
    StaticSchedulerCust.threadNickNames,
    ISZCommandProvider(ISZ()))

  def compute(isz: ISZ[Command]): Unit = {
    scheduler = scheduler(commandProvider = ISZCommandProvider(isz :+ Stop()))

    Art.computePhase(scheduler)
  }

  override def beforeEach(): Unit = {
    // uncomment the following to disable the various guis
    System.setProperty("java.awt.headless", "true")

    // uncomment the following to suppress (or potentially redirect) ART's log stream
    //art.ArtNative_Ext.logStream = new java.io.PrintStream(new java.io.OutputStream {
    //  override def write(b: Int): Unit = {}
    //})

    // uncomment the following to suppress (or potentially redirect) the static scheduler's log stream
    //art.scheduling.static.StaticSchedulerIO_Ext.logStream = new java.io.PrintStream(new java.io.OutputStream {
    //  override def write(b: Int): Unit = {}
    //})

    super.beforeEach()
  }

  // Suggestion: add the following import renamings of the components' SystemTestAPIs,
  //             replacing nickname with shortened versions that are easier to reference
  // import tc.TempControlMixedSeL4CAmKES.{TempSensor_tsp_tst_SystemTestAPI => nickname}
  // import tc.TempControlMixedSeL4CAmKES.{TempControl_tcp_tct_SystemTestAPI => nickname}
  // import tc.TempControlMixedSeL4CAmKES.{Fan_fp_ft_SystemTestAPI => nickname}

  test("Example system test") {
    // run the initialization phase
    Art.initializePhase(scheduler)

    // run components' compute entrypoints through one hyper-period
    compute(ISZ(Hstep(1)))

    // use the component SystemTestAPIs' put methods to change the prestate values for components
    // TODO

    // run another hyper-period
    compute(ISZ(Hstep(1)))

    // use the component SystemTestAPIs' check or get methods to check the poststate values for components
    // TODO
  }


  // NOTE that GUMBO will catch bugs seeded in the temp control, but there are no
  // contracts for the fan so system testing would help uncover bugs in its
  // behavior code

  test("Fan On") {
    // run the initialization phase
    Art.initializePhase(scheduler)

    // run components' compute entrypoints through one hyper-period
    compute(ISZ(Hstep(1)))

    compute(ISZ(RunToThread("TempControl")))

    val temp = Defs.defaultSetPoint.high.degrees + f32"1"
    TempControl.put_tempChanged(Some(art.Empty()))
    TempControl.put_currentTemp(Temperature(temp, TempUnit.Fahrenheit))

    val preCurrentFanState = TempControl.get_currentFanState()
    val fanIsOnPre = Fan_fp_ft.isOn

    // run another hyper-period
    compute(ISZ(Hstep(1)))

    // if the fan was in an error state then the last fan command should be resent
    assert(!TempControl.get_fanError() ||
      TempControl.get_api_fanCmd().get == preCurrentFanState)

    // if the fan wasn't in an error state and was already on
    // then it should remain turned on since no fan command should have been sent
    assert((TempControl.get_fanError() || preCurrentFanState != FanCmd.On) || (
      TempControl.get_currentFanState() == preCurrentFanState &&
        TempControl.get_api_fanCmd().isEmpty &&
        Fan_fp_ft.isOn == fanIsOnPre))

    // if the fan wasn't in an error state and was off
    // then a fan on command should have been sent and the fan should be on if it
    // was able to perform the actuation
    assert((TempControl.get_fanError() || preCurrentFanState != FanCmd.Off) || (
      TempControl.get_currentFanState() == FanCmd.On &&
        TempControl.get_api_fanCmd().get == FanCmd.On &&
        (Fan.get_api_fanAck().get != FanAck.Ok || Fan_fp_ft.isOn) &&
        (Fan.get_api_fanAck().get != FanAck.Error || Fan_fp_ft.isOn == fanIsOnPre)
      ))
  }

  test("Fan Off") {
    // run the initialization phase
    Art.initializePhase(scheduler)

    // run components' compute entrypoints through one hyper-period
    compute(ISZ(Hstep(1)))

    compute(ISZ(RunToThread("TempControl")))

    val temp = Defs.defaultSetPoint.low.degrees - f32"1"
    TempControl.put_tempChanged(Some(art.Empty()))
    TempControl.put_currentTemp(Temperature(temp, TempUnit.Fahrenheit))

    val preCurrentFanState = TempControl.get_currentFanState()
    val fanIsOnPre = Fan_fp_ft.isOn

    // run another hyper-period
    compute(ISZ(Hstep(1)))

    // if the fan was in an error state then the last fan command should be resent
    assert(!TempControl.get_fanError() ||
      TempControl.get_api_fanCmd().get == preCurrentFanState)

    // if the fan wasn't in an error state and was already off
    // then it should remain turned off since no fan command should have been sent
    assert((TempControl.get_fanError() || preCurrentFanState != FanCmd.Off) || (
      TempControl.get_currentFanState() == preCurrentFanState &&
        TempControl.get_api_fanCmd().isEmpty &&
        Fan_fp_ft.isOn == fanIsOnPre))

    // if the fan wasn't in an error state and was on
    // then a fan off command should have been sent and the fan should be off if it
    // was able to perform the actuation
    assert((TempControl.get_fanError() || preCurrentFanState != FanCmd.On) || (
      TempControl.get_currentFanState() == FanCmd.Off &&
        TempControl.get_api_fanCmd().get == FanCmd.Off &&
        (Fan.get_api_fanAck().get != FanAck.Ok || !Fan_fp_ft.isOn) &&
        (Fan.get_api_fanAck().get != FanAck.Error || Fan_fp_ft.isOn == fanIsOnPre)
      ))
  }
}
