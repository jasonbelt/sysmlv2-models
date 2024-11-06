// #Sireum

package tc.TempControlMixedSeL4CAmKES

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

import org.sireum._
import tc.GumboXUtil.GumboXResult
import tc.util.{Container, Profile, UnitTestConfigurationBatch}
import tc.RandomLib
import org.sireum.Random.Impl.Xoshiro256

object TempControl_tcp_tct_UnitTestConfiguration_Util {

  def freshRandomLib: RandomLib = {
    return RandomLib(Random.Gen64Impl(Xoshiro256.create))
  }

  val tq: String = "\"\"\""

  type DefaultInitializeProfile = TempControl_tcp_tct_Profile

  def defaultInitializeConfig: TempControl_tcp_tct_Initialize_UnitTestConfiguration = {
    return (TempControl_tcp_tct_Initialize_UnitTestConfiguration (
      verbose = F,
      name = "Default_Initialize_Config",
      description = "Default Initialize Configuration",
      numTests = 100,
      numTestVectorGenRetries = 100,
      failOnUnsatPreconditions = F,
      profile = TempControl_tcp_tct_Profile (
        name = "Initialize_Default_Profile",
      ),
      genReplay = (c: Container, testName: String, r: GumboXResult.Type) => None())
    )
  }

  type DefaultComputeProfile = TempControl_tcp_tct_Profile_P

  def defaultComputeConfig: TempControl_tcp_tct_Compute_UnitTestConfiguration = {
    return (TempControl_tcp_tct_Compute_UnitTestConfiguration (
      verbose = F,
      name = "Default_Compute_Config",
      description = "Default Compute Configuration",
      numTests = 100,
      numTestVectorGenRetries = 100,
      failOnUnsatPreconditions = F,
      profile = TempControl_tcp_tct_Profile_P (
        name = "Compute_Default_Profile",
        api_tempChanged = freshRandomLib,
        api_fanAck = freshRandomLib,
        api_setPoint = freshRandomLib,
        api_currentTemp = freshRandomLib
      ),
      genReplay = (c: Container, testName: String, r: GumboXResult.Type) => Some(
       st"""Replay Unit Test:
            |  test("Replay: $testName") {
            |    val results = tc.GumboXUtil.GumboXResult.$r
            |    val json = st${tq}${tc.JSON.fromutilContainer(c, T)}${tq}.render
            |    val testVector = tc.JSON.toTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_P(json).left
            |    assert (testComputeCBV(testVector) == results)
            |  }""".render))
    )
  }

  type DefaultComputewLProfile = TempControl_tcp_tct_Profile_PS

  def defaultComputewLConfig: TempControl_tcp_tct_ComputewL_UnitTestConfiguration = {
    return (TempControl_tcp_tct_ComputewL_UnitTestConfiguration (
      verbose = F,
      name = "Default_ComputewL_Config",
      description = "Default ComputewL Configuration",
      numTests = 100,
      numTestVectorGenRetries = 100,
      failOnUnsatPreconditions = F,
      profile = TempControl_tcp_tct_Profile_PS (
        name = "ComputewL_Default_Profile",
        In_currentFanState = freshRandomLib,
        In_currentSetPoint = freshRandomLib,
        In_fanError = freshRandomLib,
        In_latestTemp = freshRandomLib,
        api_tempChanged = freshRandomLib,
        api_fanAck = freshRandomLib,
        api_setPoint = freshRandomLib,
        api_currentTemp = freshRandomLib
      ),
      genReplay = (c: Container, testName: String, r: GumboXResult.Type) => Some(
       st"""Replay Unit Test:
            |  test("Replay: $testName") {
            |    val results = tc.GumboXUtil.GumboXResult.$r
            |    val json = st${tq}${tc.JSON.fromutilContainer(c, T)}${tq}.render
            |    val testVector = tc.JSON.toTempControlMixedSeL4CAmKESTempControl_tcp_tct_PreState_Container_PS(json).left
            |    assert (testComputeCBwLV(testVector) == results)
            |  }""".render))
    )
  }
}

@record class TempControl_tcp_tct_Initialize_UnitTestConfiguration (
  var verbose: B,
  var name: String,
  var description: String,
  var numTests: Z,
  var numTestVectorGenRetries: Z,
  var failOnUnsatPreconditions: B,
  var profile: TempControl_tcp_tct_Profile_Trait,
  var genReplay: (Container, String, GumboXResult.Type) => Option[String])
  extends UnitTestConfigurationBatch with TempControl_tcp_tct_GumboX_TestHarness {

  override def test(c: Container): GumboXResult.Type = {
    return testInitialiseCB()
  }
}

@record class TempControl_tcp_tct_Compute_UnitTestConfiguration (
  var verbose: B,
  var name: String,
  var description: String,
  var numTests: Z,
  var numTestVectorGenRetries: Z,
  var failOnUnsatPreconditions: B,
  var profile: TempControl_tcp_tct_Profile_P_Trait,
  var genReplay: (Container, String, GumboXResult.Type) => Option[String])
  extends UnitTestConfigurationBatch with TempControl_tcp_tct_GumboX_TestHarness {

  override def test(c: Container): GumboXResult.Type = {
    return testComputeCBV(c.asInstanceOf[TempControl_tcp_tct_PreState_Container])
  }
}

@record class TempControl_tcp_tct_ComputewL_UnitTestConfiguration (
  var verbose: B,
  var name: String,
  var description: String,
  var numTests: Z,
  var numTestVectorGenRetries: Z,
  var failOnUnsatPreconditions: B,
  var profile: TempControl_tcp_tct_Profile_PS_Trait,
  var genReplay: (Container, String, GumboXResult.Type) => Option[String])
  extends UnitTestConfigurationBatch with TempControl_tcp_tct_GumboX_TestHarness {

  override def test(c: Container): GumboXResult.Type = {
    return testComputeCBwLV(c.asInstanceOf[TempControl_tcp_tct_PreState_Container_PS])
  }
}
