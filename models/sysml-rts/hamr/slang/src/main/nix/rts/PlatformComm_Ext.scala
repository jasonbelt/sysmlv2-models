package rts

import org.sireum._
import art._

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

object PlatformComm_Ext {
  def initialise(seed: Z, portOpt: Option[Art.PortId]): Unit = halt("stub")
  def receive(portOpt: Option[Art.PortId], out: MBox2[Art.PortId, DataContent]) = halt("stub")
  def send(app: Art.PortId, port: Art.PortId, data: DataContent): Unit = halt("stub")
  def sendAsync(app: Art.PortId, port: Art.PortId, data: DataContent): B = halt("stub")
  def receiveAsync(portOpt: Option[Art.PortId], out: MBox2[Art.PortId, Option[DataContent]]): Unit = halt("stub")
  def finalise(): Unit = halt("stub")
}
