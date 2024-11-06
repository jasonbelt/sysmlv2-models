// #Sireum

package tc.TempControlMixedSeL4CAmKES

import org.sireum._
import art._
import tc._

object TempControl_Api {
  // assume currentTempRange
  @strictpure def currentTempRange(currentTemp: TempControlMixedSeL4CAmKES.Temperature): B =
    currentTemp.degrees >= -128.6f &
      currentTemp.degrees <= 134.0f
}

import TempControl_Api._

@sig trait TempControl_Api {
  def id: Art.BridgeId
  def currentTemp_Id : Art.PortId
  def tempChanged_Id : Art.PortId
  def fanAck_Id : Art.PortId
  def setPoint_Id : Art.PortId
  def fanCmd_Id : Art.PortId

  // Logika spec var representing port state for outgoing event data port
  @spec var fanCmd: Option[TempControlMixedSeL4CAmKES.FanCmd.Type] = $

  def put_fanCmd(value : TempControlMixedSeL4CAmKES.FanCmd.Type) : Unit = {
    Contract(
      Modifies(fanCmd),
      Ensures(
        fanCmd == Some(value)
      )
    )
    Spec {
      fanCmd = Some(value)
    }

    Art.putValue(fanCmd_Id, TempControlMixedSeL4CAmKES.FanCmd_Payload(value))
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

@datatype class TempControl_Initialization_Api (
  val id: Art.BridgeId,
  val currentTemp_Id : Art.PortId,
  val tempChanged_Id : Art.PortId,
  val fanAck_Id : Art.PortId,
  val setPoint_Id : Art.PortId,
  val fanCmd_Id : Art.PortId) extends TempControl_Api

@datatype class TempControl_Operational_Api (
  val id: Art.BridgeId,
  val currentTemp_Id : Art.PortId,
  val tempChanged_Id : Art.PortId,
  val fanAck_Id : Art.PortId,
  val setPoint_Id : Art.PortId,
  val fanCmd_Id : Art.PortId) extends TempControl_Api {

  // Logika spec var representing port state for incoming data port
  @spec var currentTemp: TempControlMixedSeL4CAmKES.Temperature = $
  @spec def currentTemp_Inv = Invariant(
    currentTempRange(currentTemp)
  )

  def get_currentTemp() : Option[TempControlMixedSeL4CAmKES.Temperature] = {
    Contract(
      Ensures(
        currentTempRange(currentTemp),
        Res == Some(currentTemp)
      )
    )
    val value : Option[TempControlMixedSeL4CAmKES.Temperature] = Art.getValue(currentTemp_Id) match {
      case Some(TempControlMixedSeL4CAmKES.Temperature_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port currentTemp.  Expecting 'TempControlMixedSeL4CAmKES.Temperature_Payload' but received ${v}")
        None[TempControlMixedSeL4CAmKES.Temperature]()
      case _ => None[TempControlMixedSeL4CAmKES.Temperature]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event port
  @spec var tempChanged: Option[art.Empty] = $

  def get_tempChanged() : Option[art.Empty] = {
    Contract(
      Ensures(
        Res == tempChanged
      )
    )
    val value : Option[art.Empty] = Art.getValue(tempChanged_Id) match {
      case Some(Empty()) => Some(Empty())
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port tempChanged.  Expecting 'Empty' but received ${v}")
        None[art.Empty]()
      case _ => None[art.Empty]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event data port
  @spec var fanAck: Option[TempControlMixedSeL4CAmKES.FanAck.Type] = $

  def get_fanAck() : Option[TempControlMixedSeL4CAmKES.FanAck.Type] = {
    Contract(
      Ensures(
        Res == fanAck
      )
    )
    val value : Option[TempControlMixedSeL4CAmKES.FanAck.Type] = Art.getValue(fanAck_Id) match {
      case Some(TempControlMixedSeL4CAmKES.FanAck_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port fanAck.  Expecting 'TempControlMixedSeL4CAmKES.FanAck_Payload' but received ${v}")
        None[TempControlMixedSeL4CAmKES.FanAck.Type]()
      case _ => None[TempControlMixedSeL4CAmKES.FanAck.Type]()
    }
    return value
  }

  // Logika spec var representing port state for incoming event data port
  @spec var setPoint: Option[TempControlMixedSeL4CAmKES.SetPoint] = $

  def get_setPoint() : Option[TempControlMixedSeL4CAmKES.SetPoint] = {
    Contract(
      Ensures(
        Res == setPoint
      )
    )
    val value : Option[TempControlMixedSeL4CAmKES.SetPoint] = Art.getValue(setPoint_Id) match {
      case Some(TempControlMixedSeL4CAmKES.SetPoint_Payload(v)) => Some(v)
      case Some(v) =>
        Art.logError(id, s"Unexpected payload on port setPoint.  Expecting 'TempControlMixedSeL4CAmKES.SetPoint_Payload' but received ${v}")
        None[TempControlMixedSeL4CAmKES.SetPoint]()
      case _ => None[TempControlMixedSeL4CAmKES.SetPoint]()
    }
    return value
  }
}
