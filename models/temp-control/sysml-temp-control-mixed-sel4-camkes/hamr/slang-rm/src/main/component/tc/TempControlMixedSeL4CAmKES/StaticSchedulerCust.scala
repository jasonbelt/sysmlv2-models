// #Sireum
package tc.TempControlMixedSeL4CAmKES

import org.sireum._
import art.Art
import art.scheduling.static.Schedule
import art.scheduling.static.Schedule.{DSchedule, DScheduleSpec}
import tc.Arch
import tc.Schedulers.maxExecutionTime

object StaticSchedulerCust {

  // defaultStaticSchedule represents the component dispatch order
  val staticSchedule: DScheduleSpec = DScheduleSpec(0, 0, DSchedule(ISZ(
    Schedule.Slot(0, maxExecutionTime),
    Schedule.Slot(1, maxExecutionTime),
    Schedule.Slot(2, maxExecutionTime)
  )))

  val domainToBridgeIdMap: ISZ[Art.BridgeId] = ISZ(
    /* domain 0 */ Arch.TempControlSystem_Instance_tsp_tst.id,
    /* domain 1 */ Arch.TempControlSystem_Instance_tcp_tct.id,
    /* domain 2 */ Arch.TempControlSystem_Instance_fp_ft.id
  )

  val threadNickNames: Map[String, Art.BridgeId] = Map(
    ISZ(
      "TempSensor"~> Arch.TempControlSystem_Instance_tsp_tst.id,
      "TempControl" ~> Arch.TempControlSystem_Instance_tcp_tct.id,
      "Fan" ~> Arch.TempControlSystem_Instance_fp_ft.id)
  )

}
