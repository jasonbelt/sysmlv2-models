// #Sireum

package tc.TempControlMixedSeL4CAmKES

import org.sireum._
import org.sireum.Random.Impl.Xoshiro256
import tc._

// This file will not be overwritten so is safe to edit
object Fan_fp_ft {

  val rand: Random.Gen64Impl = Random.Gen64Impl(Xoshiro256.create)

  // configure failure rate for fan,
  //  i.e., an Error will be simulated 35 out of every 100 times
  val errorRate: Z = 35

  def initialise(api: Fan_Initialization_Api): Unit = {
  }

  def handle_fanCmd(api: Fan_Operational_Api, value: TempControlMixedSeL4CAmKES.FanCmd.Type): Unit = {
    // log the received fan command
    api.logInfo(s"Received fanCmd $value")

    // compute acknowledgement value
    val ackVal: FanAck.Type =
      // if next random value indicates there should be no error
      if (rand.nextZBetween(0, 99) < 100 - errorRate)
        // set the acknowledgement value to OK
        FanAck.Ok
      else
        // set the acknowledgement value to Error
        FanAck.Error

    // put an event on fanAck out event data port to
    // notify subscribers (e.g., tempControl thermostat) that the
    // fan actuation has been achieved
    api.put_fanAck(ackVal)

    // log the actuation result
    //api.logInfo(s"Actuation result: ${ack}")
  }

  def finalise(api: Fan_Operational_Api): Unit = { }
}
