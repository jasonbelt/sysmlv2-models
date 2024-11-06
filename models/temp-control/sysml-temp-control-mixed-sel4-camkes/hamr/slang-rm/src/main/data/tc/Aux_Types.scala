// #Sireum

package tc

import org.sireum._
import tc.TempControlMixedSeL4CAmKES.{FanAck, FanCmd, SetPoint, Temperature}

// This file will not be overwritten so is safe to edit

// Any datatype definitions placed in this file will be processed by sergen and SlangCheck

@datatype class TempControl_Inputs_Container(val currentTemp: Temperature, // data port
                                             val tempChanged: Option[art.Empty], // event port

                                             //val currentSetPoint: SetPoint, // state variable
                                             //val latestFanCmd: FanCmd.Type, // state variable

                                             val fanError: B
                                            )

@datatype class TempControl_Outputs_Container(val fanCmd: Option[FanCmd.Type],
                                              val fanAck: Option[FanAck.Type],

                                              val fanIsOn: B,
                                              val currentFanState: FanCmd.Type,

                                              val currentSetPoint: SetPoint
                                             )