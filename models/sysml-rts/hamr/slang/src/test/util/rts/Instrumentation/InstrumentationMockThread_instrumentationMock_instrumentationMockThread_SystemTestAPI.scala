// #Sireum

package rts.Instrumentation

import org.sireum._
import art._
import rts.SystemTestSuiteSlang.runtimeMonitorStream
import rts._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object InstrumentationMockThread_instrumentationMock_instrumentationMockThread_SystemTestAPI {
  /** helper method to set the values of all incoming ports
    */
  def put_concrete_inputs(): Unit = {
  }



  def fetchContainer(): rts.Instrumentation.InstrumentationMockThread_instrumentationMock_instrumentationMockThread_PostState_Container_PS = {
    if (runtimeMonitorStream.contains(Arch.RTS_Instance_instrumentationMock_instrumentationMockThread.id)) {
      val (_, postContainer_) = runtimeMonitorStream.get(Arch.RTS_Instance_instrumentationMock_instrumentationMockThread.id).get
      return postContainer_.asInstanceOf[rts.Instrumentation.InstrumentationMockThread_instrumentationMock_instrumentationMockThread_PostState_Container_PS]
    }
    else {
      assert(F, s"No post state recorded for ${Arch.RTS_Instance_instrumentationMock_instrumentationMockThread.name}")
      halt(s"No post state recorded for ${Arch.RTS_Instance_instrumentationMock_instrumentationMockThread.name}")
    }
  }

  def check_concrete_outputs(api_unit1_pressureLogic_channel1: Base_Types.Boolean,
                             api_unit1_pressureLogic_channel2: Base_Types.Boolean,
                             api_unit1_pressureLogic_channel3: Base_Types.Boolean,
                             api_unit1_pressureLogic_channel4: Base_Types.Boolean,
                             api_unit1_saturationLogic_channel1: Base_Types.Boolean,
                             api_unit1_saturationLogic_channel2: Base_Types.Boolean,
                             api_unit1_saturationLogic_channel3: Base_Types.Boolean,
                             api_unit1_saturationLogic_channel4: Base_Types.Boolean,
                             api_unit1_temperatureLogic_channel1: Base_Types.Boolean,
                             api_unit1_temperatureLogic_channel2: Base_Types.Boolean,
                             api_unit1_temperatureLogic_channel3: Base_Types.Boolean,
                             api_unit1_temperatureLogic_channel4: Base_Types.Boolean,
                             api_unit2_pressureLogic_channel1: Base_Types.Boolean,
                             api_unit2_pressureLogic_channel2: Base_Types.Boolean,
                             api_unit2_pressureLogic_channel3: Base_Types.Boolean,
                             api_unit2_pressureLogic_channel4: Base_Types.Boolean,
                             api_unit2_saturationLogic_channel1: Base_Types.Boolean,
                             api_unit2_saturationLogic_channel2: Base_Types.Boolean,
                             api_unit2_saturationLogic_channel3: Base_Types.Boolean,
                             api_unit2_saturationLogic_channel4: Base_Types.Boolean,
                             api_unit2_temperatureLogic_channel1: Base_Types.Boolean,
                             api_unit2_temperatureLogic_channel2: Base_Types.Boolean,
                             api_unit2_temperatureLogic_channel3: Base_Types.Boolean,
                             api_unit2_temperatureLogic_channel4: Base_Types.Boolean): Unit = {
    var failureReasons: ISZ[ST] = ISZ()

    val actual_unit1_pressureLogic_channel1 = get_api_unit1_pressureLogic_channel1()
    if (api_unit1_pressureLogic_channel1 != actual_unit1_pressureLogic_channel1) {
      failureReasons = failureReasons :+ st"'unit1_pressureLogic_channel1' did not match expected.  Expected: $api_unit1_pressureLogic_channel1, Actual: $actual_unit1_pressureLogic_channel1"
    }
    val actual_unit1_pressureLogic_channel2 = get_api_unit1_pressureLogic_channel2()
    if (api_unit1_pressureLogic_channel2 != actual_unit1_pressureLogic_channel2) {
      failureReasons = failureReasons :+ st"'unit1_pressureLogic_channel2' did not match expected.  Expected: $api_unit1_pressureLogic_channel2, Actual: $actual_unit1_pressureLogic_channel2"
    }
    val actual_unit1_pressureLogic_channel3 = get_api_unit1_pressureLogic_channel3()
    if (api_unit1_pressureLogic_channel3 != actual_unit1_pressureLogic_channel3) {
      failureReasons = failureReasons :+ st"'unit1_pressureLogic_channel3' did not match expected.  Expected: $api_unit1_pressureLogic_channel3, Actual: $actual_unit1_pressureLogic_channel3"
    }
    val actual_unit1_pressureLogic_channel4 = get_api_unit1_pressureLogic_channel4()
    if (api_unit1_pressureLogic_channel4 != actual_unit1_pressureLogic_channel4) {
      failureReasons = failureReasons :+ st"'unit1_pressureLogic_channel4' did not match expected.  Expected: $api_unit1_pressureLogic_channel4, Actual: $actual_unit1_pressureLogic_channel4"
    }
    val actual_unit1_saturationLogic_channel1 = get_api_unit1_saturationLogic_channel1()
    if (api_unit1_saturationLogic_channel1 != actual_unit1_saturationLogic_channel1) {
      failureReasons = failureReasons :+ st"'unit1_saturationLogic_channel1' did not match expected.  Expected: $api_unit1_saturationLogic_channel1, Actual: $actual_unit1_saturationLogic_channel1"
    }
    val actual_unit1_saturationLogic_channel2 = get_api_unit1_saturationLogic_channel2()
    if (api_unit1_saturationLogic_channel2 != actual_unit1_saturationLogic_channel2) {
      failureReasons = failureReasons :+ st"'unit1_saturationLogic_channel2' did not match expected.  Expected: $api_unit1_saturationLogic_channel2, Actual: $actual_unit1_saturationLogic_channel2"
    }
    val actual_unit1_saturationLogic_channel3 = get_api_unit1_saturationLogic_channel3()
    if (api_unit1_saturationLogic_channel3 != actual_unit1_saturationLogic_channel3) {
      failureReasons = failureReasons :+ st"'unit1_saturationLogic_channel3' did not match expected.  Expected: $api_unit1_saturationLogic_channel3, Actual: $actual_unit1_saturationLogic_channel3"
    }
    val actual_unit1_saturationLogic_channel4 = get_api_unit1_saturationLogic_channel4()
    if (api_unit1_saturationLogic_channel4 != actual_unit1_saturationLogic_channel4) {
      failureReasons = failureReasons :+ st"'unit1_saturationLogic_channel4' did not match expected.  Expected: $api_unit1_saturationLogic_channel4, Actual: $actual_unit1_saturationLogic_channel4"
    }
    val actual_unit1_temperatureLogic_channel1 = get_api_unit1_temperatureLogic_channel1()
    if (api_unit1_temperatureLogic_channel1 != actual_unit1_temperatureLogic_channel1) {
      failureReasons = failureReasons :+ st"'unit1_temperatureLogic_channel1' did not match expected.  Expected: $api_unit1_temperatureLogic_channel1, Actual: $actual_unit1_temperatureLogic_channel1"
    }
    val actual_unit1_temperatureLogic_channel2 = get_api_unit1_temperatureLogic_channel2()
    if (api_unit1_temperatureLogic_channel2 != actual_unit1_temperatureLogic_channel2) {
      failureReasons = failureReasons :+ st"'unit1_temperatureLogic_channel2' did not match expected.  Expected: $api_unit1_temperatureLogic_channel2, Actual: $actual_unit1_temperatureLogic_channel2"
    }
    val actual_unit1_temperatureLogic_channel3 = get_api_unit1_temperatureLogic_channel3()
    if (api_unit1_temperatureLogic_channel3 != actual_unit1_temperatureLogic_channel3) {
      failureReasons = failureReasons :+ st"'unit1_temperatureLogic_channel3' did not match expected.  Expected: $api_unit1_temperatureLogic_channel3, Actual: $actual_unit1_temperatureLogic_channel3"
    }
    val actual_unit1_temperatureLogic_channel4 = get_api_unit1_temperatureLogic_channel4()
    if (api_unit1_temperatureLogic_channel4 != actual_unit1_temperatureLogic_channel4) {
      failureReasons = failureReasons :+ st"'unit1_temperatureLogic_channel4' did not match expected.  Expected: $api_unit1_temperatureLogic_channel4, Actual: $actual_unit1_temperatureLogic_channel4"
    }
    val actual_unit2_pressureLogic_channel1 = get_api_unit2_pressureLogic_channel1()
    if (api_unit2_pressureLogic_channel1 != actual_unit2_pressureLogic_channel1) {
      failureReasons = failureReasons :+ st"'unit2_pressureLogic_channel1' did not match expected.  Expected: $api_unit2_pressureLogic_channel1, Actual: $actual_unit2_pressureLogic_channel1"
    }
    val actual_unit2_pressureLogic_channel2 = get_api_unit2_pressureLogic_channel2()
    if (api_unit2_pressureLogic_channel2 != actual_unit2_pressureLogic_channel2) {
      failureReasons = failureReasons :+ st"'unit2_pressureLogic_channel2' did not match expected.  Expected: $api_unit2_pressureLogic_channel2, Actual: $actual_unit2_pressureLogic_channel2"
    }
    val actual_unit2_pressureLogic_channel3 = get_api_unit2_pressureLogic_channel3()
    if (api_unit2_pressureLogic_channel3 != actual_unit2_pressureLogic_channel3) {
      failureReasons = failureReasons :+ st"'unit2_pressureLogic_channel3' did not match expected.  Expected: $api_unit2_pressureLogic_channel3, Actual: $actual_unit2_pressureLogic_channel3"
    }
    val actual_unit2_pressureLogic_channel4 = get_api_unit2_pressureLogic_channel4()
    if (api_unit2_pressureLogic_channel4 != actual_unit2_pressureLogic_channel4) {
      failureReasons = failureReasons :+ st"'unit2_pressureLogic_channel4' did not match expected.  Expected: $api_unit2_pressureLogic_channel4, Actual: $actual_unit2_pressureLogic_channel4"
    }
    val actual_unit2_saturationLogic_channel1 = get_api_unit2_saturationLogic_channel1()
    if (api_unit2_saturationLogic_channel1 != actual_unit2_saturationLogic_channel1) {
      failureReasons = failureReasons :+ st"'unit2_saturationLogic_channel1' did not match expected.  Expected: $api_unit2_saturationLogic_channel1, Actual: $actual_unit2_saturationLogic_channel1"
    }
    val actual_unit2_saturationLogic_channel2 = get_api_unit2_saturationLogic_channel2()
    if (api_unit2_saturationLogic_channel2 != actual_unit2_saturationLogic_channel2) {
      failureReasons = failureReasons :+ st"'unit2_saturationLogic_channel2' did not match expected.  Expected: $api_unit2_saturationLogic_channel2, Actual: $actual_unit2_saturationLogic_channel2"
    }
    val actual_unit2_saturationLogic_channel3 = get_api_unit2_saturationLogic_channel3()
    if (api_unit2_saturationLogic_channel3 != actual_unit2_saturationLogic_channel3) {
      failureReasons = failureReasons :+ st"'unit2_saturationLogic_channel3' did not match expected.  Expected: $api_unit2_saturationLogic_channel3, Actual: $actual_unit2_saturationLogic_channel3"
    }
    val actual_unit2_saturationLogic_channel4 = get_api_unit2_saturationLogic_channel4()
    if (api_unit2_saturationLogic_channel4 != actual_unit2_saturationLogic_channel4) {
      failureReasons = failureReasons :+ st"'unit2_saturationLogic_channel4' did not match expected.  Expected: $api_unit2_saturationLogic_channel4, Actual: $actual_unit2_saturationLogic_channel4"
    }
    val actual_unit2_temperatureLogic_channel1 = get_api_unit2_temperatureLogic_channel1()
    if (api_unit2_temperatureLogic_channel1 != actual_unit2_temperatureLogic_channel1) {
      failureReasons = failureReasons :+ st"'unit2_temperatureLogic_channel1' did not match expected.  Expected: $api_unit2_temperatureLogic_channel1, Actual: $actual_unit2_temperatureLogic_channel1"
    }
    val actual_unit2_temperatureLogic_channel2 = get_api_unit2_temperatureLogic_channel2()
    if (api_unit2_temperatureLogic_channel2 != actual_unit2_temperatureLogic_channel2) {
      failureReasons = failureReasons :+ st"'unit2_temperatureLogic_channel2' did not match expected.  Expected: $api_unit2_temperatureLogic_channel2, Actual: $actual_unit2_temperatureLogic_channel2"
    }
    val actual_unit2_temperatureLogic_channel3 = get_api_unit2_temperatureLogic_channel3()
    if (api_unit2_temperatureLogic_channel3 != actual_unit2_temperatureLogic_channel3) {
      failureReasons = failureReasons :+ st"'unit2_temperatureLogic_channel3' did not match expected.  Expected: $api_unit2_temperatureLogic_channel3, Actual: $actual_unit2_temperatureLogic_channel3"
    }
    val actual_unit2_temperatureLogic_channel4 = get_api_unit2_temperatureLogic_channel4()
    if (api_unit2_temperatureLogic_channel4 != actual_unit2_temperatureLogic_channel4) {
      failureReasons = failureReasons :+ st"'unit2_temperatureLogic_channel4' did not match expected.  Expected: $api_unit2_temperatureLogic_channel4, Actual: $actual_unit2_temperatureLogic_channel4"
    }

    assert(failureReasons.isEmpty, st"${(failureReasons, "\n")}".render)
  }

  def get_api_unit1_pressureLogic_channel1(): Base_Types.Boolean = {
    return fetchContainer().api_unit1_pressureLogic_channel1
  }

  def get_api_unit1_pressureLogic_channel2(): Base_Types.Boolean = {
    return fetchContainer().api_unit1_pressureLogic_channel2
  }

  def get_api_unit1_pressureLogic_channel3(): Base_Types.Boolean = {
    return fetchContainer().api_unit1_pressureLogic_channel3
  }

  def get_api_unit1_pressureLogic_channel4(): Base_Types.Boolean = {
    return fetchContainer().api_unit1_pressureLogic_channel4
  }

  def get_api_unit1_saturationLogic_channel1(): Base_Types.Boolean = {
    return fetchContainer().api_unit1_saturationLogic_channel1
  }

  def get_api_unit1_saturationLogic_channel2(): Base_Types.Boolean = {
    return fetchContainer().api_unit1_saturationLogic_channel2
  }

  def get_api_unit1_saturationLogic_channel3(): Base_Types.Boolean = {
    return fetchContainer().api_unit1_saturationLogic_channel3
  }

  def get_api_unit1_saturationLogic_channel4(): Base_Types.Boolean = {
    return fetchContainer().api_unit1_saturationLogic_channel4
  }

  def get_api_unit1_temperatureLogic_channel1(): Base_Types.Boolean = {
    return fetchContainer().api_unit1_temperatureLogic_channel1
  }

  def get_api_unit1_temperatureLogic_channel2(): Base_Types.Boolean = {
    return fetchContainer().api_unit1_temperatureLogic_channel2
  }

  def get_api_unit1_temperatureLogic_channel3(): Base_Types.Boolean = {
    return fetchContainer().api_unit1_temperatureLogic_channel3
  }

  def get_api_unit1_temperatureLogic_channel4(): Base_Types.Boolean = {
    return fetchContainer().api_unit1_temperatureLogic_channel4
  }

  def get_api_unit2_pressureLogic_channel1(): Base_Types.Boolean = {
    return fetchContainer().api_unit2_pressureLogic_channel1
  }

  def get_api_unit2_pressureLogic_channel2(): Base_Types.Boolean = {
    return fetchContainer().api_unit2_pressureLogic_channel2
  }

  def get_api_unit2_pressureLogic_channel3(): Base_Types.Boolean = {
    return fetchContainer().api_unit2_pressureLogic_channel3
  }

  def get_api_unit2_pressureLogic_channel4(): Base_Types.Boolean = {
    return fetchContainer().api_unit2_pressureLogic_channel4
  }

  def get_api_unit2_saturationLogic_channel1(): Base_Types.Boolean = {
    return fetchContainer().api_unit2_saturationLogic_channel1
  }

  def get_api_unit2_saturationLogic_channel2(): Base_Types.Boolean = {
    return fetchContainer().api_unit2_saturationLogic_channel2
  }

  def get_api_unit2_saturationLogic_channel3(): Base_Types.Boolean = {
    return fetchContainer().api_unit2_saturationLogic_channel3
  }

  def get_api_unit2_saturationLogic_channel4(): Base_Types.Boolean = {
    return fetchContainer().api_unit2_saturationLogic_channel4
  }

  def get_api_unit2_temperatureLogic_channel1(): Base_Types.Boolean = {
    return fetchContainer().api_unit2_temperatureLogic_channel1
  }

  def get_api_unit2_temperatureLogic_channel2(): Base_Types.Boolean = {
    return fetchContainer().api_unit2_temperatureLogic_channel2
  }

  def get_api_unit2_temperatureLogic_channel3(): Base_Types.Boolean = {
    return fetchContainer().api_unit2_temperatureLogic_channel3
  }

  def get_api_unit2_temperatureLogic_channel4(): Base_Types.Boolean = {
    return fetchContainer().api_unit2_temperatureLogic_channel4
  }
}