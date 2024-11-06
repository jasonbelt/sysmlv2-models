// #Sireum

package tc.TempControlMixedSeL4CAmKES

import org.sireum._
import tc._

// This file will not be overwritten so is safe to edit
object TempControl_tcp_tc {

  // BEGIN STATE VARS
  var currentSetPoint: TempControlMixedSeL4CAmKES.SetPoint = TempControlMixedSeL4CAmKES.SetPoint.example()

  var currentFanState: TempControlMixedSeL4CAmKES.FanCmd.Type = TempControlMixedSeL4CAmKES.FanCmd.byOrdinal(0).get

  var latestTemp: TempControlMixedSeL4CAmKES.Temperature = TempControlMixedSeL4CAmKES.Temperature.example()

  var fanError: Base_Types.Boolean = Base_Types.Boolean_example()
  // END STATE VARS

  def initialise(api: TempControl_Initialization_Api): Unit = {
    Contract(
      Requires(
        // BEGIN INITIALIZES REQUIRES
        // assume AADL_Requirement
        //   All outgoing event ports must be empty
        api.fanCmd.isEmpty
        // END INITIALIZES REQUIRES
      ),
      Modifies(
        // BEGIN INITIALIZES MODIFIES
        currentSetPoint,
        currentFanState,
        latestTemp
        // END INITIALIZES MODIFIES
      ),
      Ensures(
        // BEGIN INITIALIZES ENSURES
        // guarantee defaultSetPoint
        currentSetPoint.low.degrees == 70.0f &
          currentSetPoint.high.degrees == 90.0f,
        // guarantee defaultFanStates
        currentFanState == FanCmd.Off,
        // guarantee defaultLatestTemp
        latestTemp.degrees == 72.0f
        // END INITIALIZES ENSURES
      )
    )
    // example api usage

    api.logInfo("Example info logging")
    api.logDebug("Example debug logging")
    api.logError("Example error logging")

    api.put_fanCmd(TempControlMixedSeL4CAmKES.FanCmd.byOrdinal(0).get)
  }

  def handle_tempChanged(api: TempControl_Operational_Api): Unit = {
    Contract(
      Requires(
        // BEGIN COMPUTE REQUIRES tempChanged
        // assume HAMR-Guarantee built-in
        //   The spec var corresponding to the handled event must be non-empty
        api.tempChanged.nonEmpty,
        // assume AADL_Requirement
        //   All outgoing event ports must be empty
        api.fanCmd.isEmpty,
        // assume a1
        //   "If the previously received currentTemp was less than the previously
        //   received setPoint then the last fan command must have been Off"
        !(In(fanError)) &
          (In(latestTemp)).degrees < (In(currentSetPoint)).low.degrees __>:
          In(currentFanState) == FanCmd.Off,
        // assume a2
        //   "If the previously received currentTemp was more than the previously
        //   received setPoint then the last fan command must have been On"
        !(In(fanError)) &
          (In(latestTemp)).degrees > (In(currentSetPoint)).high.degrees __>:
          In(currentFanState) == FanCmd.On
        // END COMPUTE REQUIRES tempChanged
      ),
      Modifies(
        // BEGIN COMPUTE MODIFIES tempChanged
        currentSetPoint,
        currentFanState,
        latestTemp,
        fanError
        // END COMPUTE MODIFIES tempChanged
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES tempChanged
        // guarantee errorState
        //   "If the fan sent FanAck.Error then continue sending the
        //   last fan command until the fan sends FanAck.Ok"
        fanError __>:
          In(currentFanState) == currentFanState &&
            (api.fanCmd.nonEmpty &&
              api.fanCmd.get == currentFanState),
        // guarantee TC_Req_01
        //   "If the current temperature is less than the set point, then the fan state shall be Off."
        !fanError &
          latestTemp.degrees < currentSetPoint.low.degrees __>:
          currentFanState == FanCmd.Off,
        // guarantee TC_Req_02
        //   "If the current temperature is greater than the set point,
        //   then the fan state shall be On."
        !fanError &
          latestTemp.degrees > currentSetPoint.high.degrees __>:
          currentFanState == FanCmd.On,
        // guarantee TC_Req_03
        //   "If the current temperature is greater than or equal to the
        //   current low set point and less than or equal to the current high set point,
        //   then the current fan state is maintained."
        !fanError &
          (latestTemp.degrees >= currentSetPoint.low.degrees &
            latestTemp.degrees <= currentSetPoint.high.degrees) __>:
          currentFanState == In(currentFanState),
        // guarantee mustSendFanCmd
        //   "If the local record of the fan state was updated,
        //   then send a fan command event with this updated value."
        (!fanError &
           In(currentFanState) != currentFanState __>:
           api.fanCmd.nonEmpty &&
             api.fanCmd.get == currentFanState) &&
          (!fanError &
            currentFanState == In(currentFanState) __>:
            api.fanCmd.isEmpty),
        // guarantees tempChanged
        latestTemp == api.currentTemp,
        // guarantees setPointNotModified
        currentSetPoint == In(currentSetPoint)
        // END COMPUTE ENSURES tempChanged
      )
    )
    api.logInfo("example handle_tempChanged implementation")
    api.logInfo("  received event")
    // example api usage

    val apiUsage_currentTemp: Option[TempControlMixedSeL4CAmKES.Temperature] = api.get_currentTemp()
    api.logInfo(s"Received on data port currentTemp: ${apiUsage_currentTemp}")
    val apiUsage_tempChanged: Option[art.Empty] = api.get_tempChanged()
    api.logInfo(s"Received on event port tempChanged: ${apiUsage_tempChanged}")
    val apiUsage_fanAck: Option[TempControlMixedSeL4CAmKES.FanAck.Type] = api.get_fanAck()
    api.logInfo(s"Received on event data port fanAck: ${apiUsage_fanAck}")
    val apiUsage_setPoint: Option[TempControlMixedSeL4CAmKES.SetPoint] = api.get_setPoint()
    api.logInfo(s"Received on event data port setPoint: ${apiUsage_setPoint}")
  }

  def handle_fanAck(api: TempControl_Operational_Api, value: TempControlMixedSeL4CAmKES.FanAck.Type): Unit = {
    Contract(
      Requires(
        // BEGIN COMPUTE REQUIRES fanAck
        // assume HAMR-Guarantee built-in
        //   The spec var corresponding to the handled event must be non-empty and
        //   the passed in payload must be the same as the spec var's value
        api.fanAck.nonEmpty &&
        api.fanAck.get == value,
        // assume AADL_Requirement
        //   All outgoing event ports must be empty
        api.fanCmd.isEmpty,
        // assume a1
        //   "If the previously received currentTemp was less than the previously
        //   received setPoint then the last fan command must have been Off"
        !(In(fanError)) &
          (In(latestTemp)).degrees < (In(currentSetPoint)).low.degrees __>:
          In(currentFanState) == FanCmd.Off,
        // assume a2
        //   "If the previously received currentTemp was more than the previously
        //   received setPoint then the last fan command must have been On"
        !(In(fanError)) &
          (In(latestTemp)).degrees > (In(currentSetPoint)).high.degrees __>:
          In(currentFanState) == FanCmd.On
        // END COMPUTE REQUIRES fanAck
      ),
      Modifies(
        // BEGIN COMPUTE MODIFIES fanAck
        currentSetPoint,
        currentFanState,
        latestTemp,
        fanError
        // END COMPUTE MODIFIES fanAck
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES fanAck
        // guarantee errorState
        //   "If the fan sent FanAck.Error then continue sending the
        //   last fan command until the fan sends FanAck.Ok"
        fanError __>:
          In(currentFanState) == currentFanState &&
            (api.fanCmd.nonEmpty &&
              api.fanCmd.get == currentFanState),
        // guarantee TC_Req_01
        //   "If the current temperature is less than the set point, then the fan state shall be Off."
        !fanError &
          latestTemp.degrees < currentSetPoint.low.degrees __>:
          currentFanState == FanCmd.Off,
        // guarantee TC_Req_02
        //   "If the current temperature is greater than the set point,
        //   then the fan state shall be On."
        !fanError &
          latestTemp.degrees > currentSetPoint.high.degrees __>:
          currentFanState == FanCmd.On,
        // guarantee TC_Req_03
        //   "If the current temperature is greater than or equal to the
        //   current low set point and less than or equal to the current high set point,
        //   then the current fan state is maintained."
        !fanError &
          (latestTemp.degrees >= currentSetPoint.low.degrees &
            latestTemp.degrees <= currentSetPoint.high.degrees) __>:
          currentFanState == In(currentFanState),
        // guarantee mustSendFanCmd
        //   "If the local record of the fan state was updated,
        //   then send a fan command event with this updated value."
        (!fanError &
           In(currentFanState) != currentFanState __>:
           api.fanCmd.nonEmpty &&
             api.fanCmd.get == currentFanState) &&
          (!fanError &
            currentFanState == In(currentFanState) __>:
            api.fanCmd.isEmpty),
        // guarantees setPointNotModified
        currentSetPoint == In(currentSetPoint),
        // guarantees lastTempNotModified
        latestTemp == In(latestTemp),
        // guarantees manageErrorState
        (api.fanAck.get == FanAck.Ok __>:
           !fanError) &
          (api.fanAck.get == FanAck.Error __>:
            fanError)
        // END COMPUTE ENSURES fanAck
      )
    )
    api.logInfo("example handle_fanAck implementation")
    api.logInfo(s"  received $value")
  }

  def handle_setPoint(api: TempControl_Operational_Api, value: TempControlMixedSeL4CAmKES.SetPoint): Unit = {
    Contract(
      Requires(
        // BEGIN COMPUTE REQUIRES setPoint
        // assume HAMR-Guarantee built-in
        //   The spec var corresponding to the handled event must be non-empty and
        //   the passed in payload must be the same as the spec var's value
        api.setPoint.nonEmpty &&
        api.setPoint.get == value,
        // assume AADL_Requirement
        //   All outgoing event ports must be empty
        api.fanCmd.isEmpty,
        // assume a1
        //   "If the previously received currentTemp was less than the previously
        //   received setPoint then the last fan command must have been Off"
        !(In(fanError)) &
          (In(latestTemp)).degrees < (In(currentSetPoint)).low.degrees __>:
          In(currentFanState) == FanCmd.Off,
        // assume a2
        //   "If the previously received currentTemp was more than the previously
        //   received setPoint then the last fan command must have been On"
        !(In(fanError)) &
          (In(latestTemp)).degrees > (In(currentSetPoint)).high.degrees __>:
          In(currentFanState) == FanCmd.On
        // END COMPUTE REQUIRES setPoint
      ),
      Modifies(
        // BEGIN COMPUTE MODIFIES setPoint
        currentSetPoint,
        currentFanState,
        latestTemp,
        fanError
        // END COMPUTE MODIFIES setPoint
      ),
      Ensures(
        // BEGIN COMPUTE ENSURES setPoint
        // guarantee errorState
        //   "If the fan sent FanAck.Error then continue sending the
        //   last fan command until the fan sends FanAck.Ok"
        fanError __>:
          In(currentFanState) == currentFanState &&
            (api.fanCmd.nonEmpty &&
              api.fanCmd.get == currentFanState),
        // guarantee TC_Req_01
        //   "If the current temperature is less than the set point, then the fan state shall be Off."
        !fanError &
          latestTemp.degrees < currentSetPoint.low.degrees __>:
          currentFanState == FanCmd.Off,
        // guarantee TC_Req_02
        //   "If the current temperature is greater than the set point,
        //   then the fan state shall be On."
        !fanError &
          latestTemp.degrees > currentSetPoint.high.degrees __>:
          currentFanState == FanCmd.On,
        // guarantee TC_Req_03
        //   "If the current temperature is greater than or equal to the
        //   current low set point and less than or equal to the current high set point,
        //   then the current fan state is maintained."
        !fanError &
          (latestTemp.degrees >= currentSetPoint.low.degrees &
            latestTemp.degrees <= currentSetPoint.high.degrees) __>:
          currentFanState == In(currentFanState),
        // guarantee mustSendFanCmd
        //   "If the local record of the fan state was updated,
        //   then send a fan command event with this updated value."
        (!fanError &
           In(currentFanState) != currentFanState __>:
           api.fanCmd.nonEmpty &&
             api.fanCmd.get == currentFanState) &&
          (!fanError &
            currentFanState == In(currentFanState) __>:
            api.fanCmd.isEmpty),
        // guarantees setPointChanged
        currentSetPoint == api.setPoint.get,
        // guarantees latestTempNotModified
        latestTemp == In(latestTemp)
        // END COMPUTE ENSURES setPoint
      )
    )
    api.logInfo("example handle_setPoint implementation")
    api.logInfo(s"  received $value")
  }

  def finalise(api: TempControl_Operational_Api): Unit = { }
}
