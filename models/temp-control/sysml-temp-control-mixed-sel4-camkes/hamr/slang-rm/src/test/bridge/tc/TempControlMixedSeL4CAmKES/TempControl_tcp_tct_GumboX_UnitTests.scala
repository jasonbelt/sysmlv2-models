package tc.TempControlMixedSeL4CAmKES

import org.sireum._
import tc.GumboXUtil.GumboXResult
import tc.util.{Container, UnitTestConfigurationBatch}
import tc.TempControlMixedSeL4CAmKES.TempControl_tcp_tct_UnitTestConfiguration_Util._

// This file will not be overwritten so is safe to edit

class TempControl_tcp_tct_GumboX_UnitTests extends TempControl_tcp_tct_GumboX_TestHarness_ScalaTest {

  // set verbose to T to see pre/post state values and generated unit tests
  // that can be copied/pasted to replay a test
  val verbose: B = F

  // set failOnUnsatPreconditions to T if the unit tests should fail when either
  // SlangCheck is never able to satisfy a datatype's filter or the generated
  // test vectors are never able to satisfy an entry point's assume pre-condition
  val failOnUnsatPreconditions: B = T

  def configs: MSZ[UnitTestConfigurationBatch] = {
    val custConfigWithoutStateVars = defaultComputeConfig(verbose = verbose, failOnUnsatPreconditions = failOnUnsatPreconditions)

    // get an F32 generator that will only generate temperatures b/w 50.0F and 110.0F
    val reasonableTemps = custConfigWithoutStateVars.profile.api_setPoint.get_Config_F32(low = Some(f32"50.0"), high = Some(f32"110.0"))

    custConfigWithoutStateVars.profile.api_setPoint.set_Config_F32(reasonableTemps)

    val custConfigWithStateVars = defaultComputewLConfig(verbose = verbose, failOnUnsatPreconditions = failOnUnsatPreconditions)
    custConfigWithStateVars.profile.api_setPoint.set_Config_F32(reasonableTemps)
    custConfigWithStateVars.profile.In_currentSetPoint.set_Config_F32(reasonableTemps)
    custConfigWithStateVars.profile.In_latestTemp.set_Config_F32(reasonableTemps)
    custConfigWithStateVars.profile.api_currentTemp.set_Config_F32(reasonableTemps)

    return MSZ(
      defaultInitializeConfig(verbose = verbose, failOnUnsatPreconditions = failOnUnsatPreconditions),
      //defaultComputeConfig(verbose = verbose, failOnUnsatPreconditions = failOnUnsatPreconditions),
      //defaultComputewLConfig(verbose = verbose, failOnUnsatPreconditions = failOnUnsatPreconditions),
      custConfigWithoutStateVars,
      custConfigWithStateVars
    )
  }


  for (c <- configs) {
    def next: Option[Container] = {
      try {
        c.profile.next match {
          case (cp: TempControl_tcp_tct_PreState_Container) =>
            // only allow one incoming event
            if (ops.ISZOps(ISZ(cp.api_tempChanged.nonEmpty, cp.api_fanAck.nonEmpty, cp.api_setPoint.nonEmpty)).filter(p => p).size == 1)
              return Some(cp)
            else return None()
          case c =>
            return Some(c)
        }
      } catch {
        case e: AssertionError => // SlangCheck was unable to satisfy a datatype's filter
          return None()
      }
    }

    for (i <- 0 until c.numTests) {
      val testName = s"${c.name}_$i"

      this.registerTest(testName) {
        var retry: B = T

        var j: Z = 0
        while (j < c.numTestVectorGenRetries && retry) {
          next match {
            case Some(o) =>

              if (verbose && j > 1) {
                println(s"Retry $j:")
              }

              val results = c.test(o)

              if (verbose) {
                c.genReplay(o, testName, results) match {
                  case Some(s) => println(s)
                  case _ =>
                }
              }

              results match {
                case GumboXResult.Pre_Condition_Unsat =>
                case GumboXResult.Post_Condition_Fail =>
                  fail("Post condition did not hold")
                  retry = F
                case GumboXResult.Post_Condition_Pass =>
                  if (verbose) {
                    println("Success!")
                  }
                  retry = F
              }
            case _ =>

          }
          j = j + 1
        }

        if (retry) {
          if (c.failOnUnsatPreconditions) {
            fail("Unable to satisfy precondition")
          } else if (verbose) {
            cprintln(T, "Unable to satisfy precondition")
          }
        }
      }
    }
  }

  def configsToJson: String = {
    return st"[ ${(for (c <- configs) yield s"\"${c.name}|${c.description}\"", ", ")} ]".render
  }
}
