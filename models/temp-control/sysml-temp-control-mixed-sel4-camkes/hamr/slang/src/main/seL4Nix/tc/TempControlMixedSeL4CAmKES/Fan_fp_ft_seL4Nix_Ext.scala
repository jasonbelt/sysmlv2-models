package tc.TempControlMixedSeL4CAmKES

import org.sireum._
import art._

object Fan_fp_ft_seL4Nix_Ext {
  def fanCmd_IsEmpty(): B = halt("stub")

  def fanCmd_Receive(): Option[DataContent] = halt("stub")

  def fanAck_Send(d: DataContent): Unit = halt("stub")
}
