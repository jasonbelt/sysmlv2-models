// #Sireum

package tc.TempControlMixedSeL4CAmKES

import org.sireum._
import art._
import tc._

@sig trait Fan_Api {
  def id: Art.BridgeId
  def fanCmd_Id : Art.PortId
  def fanAck_Id : Art.PortId

  // Logika spec var representing port state for outgoing event data port
  @spec var fanAck: Option[TempControlMixedSeL4CAmKES.FanAck.Type] = $

  def put_fanAck(value : TempControlMixedSeL4CAmKES.FanAck.Type) : Unit = {
    Contract(
      Modifies(fanAck),
      Ensures(
        fanAck == Some(value)
      )
    )
    Spec {
      fanAck = Some(value)
    }

    Art.putValue(fanAck_Id, TempControlMixedSeL4CAmKES.FanAck_Payload(value))
  }

  def logInfo(msg: String): Unit = {
    Art.logInfo(id, msg)
  }

  def logDebug(msg: String): Unit = {
    Art.logDebug(id, msg)
  }

  def logError(msg: String): Unit = {
    Art.logError(id, msg)
  }
}

@datatype class Fan_Initialization_Api (
  val id: Art.BridgeId,
  val fanCmd_Id : Art.PortId,
  val fanAck_Id : Art.PortId) extends Fan_Api

@datatype class Fan_Operational_Api (
  val id: Art.BridgeId,
  val fanCmd_Id : Art.PortId,
  val fanAck_Id : Art.PortId) extends Fan_Api {

  // Logika spec var representing port state for incoming event data port
  @spec var fanCmd: Option[TempControlMixedSeL4CAmKES.FanCmd.Type] = $

  def get_fanCmd() : Option[TempControlMixedSeL4CAmKES.FanCmd.Type] = {
    Contract(
      Ensures(
        Res == fanCmd
      )
    )
    val value : Option[TempControlMixedSeL4CAmKES.FanCmd.Type] = Art.getValue(fanCmd_Id) match {
      case Some(TempControlMixedSeL4CAmKES.FanCmd_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port fanCmd.  Expecting 'TempControlMixedSeL4CAmKES.FanCmd_Payload' but received ${v}")
        None[TempControlMixedSeL4CAmKES.FanCmd.Type]()
      case _ => None[TempControlMixedSeL4CAmKES.FanCmd.Type]()
    }
    return value
  }
}
