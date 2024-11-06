//@ HAMR: --platform JVM --package-name tc --runtime-monitoring --slang-output-dir hamr/slang-rm
//@ HAMR: --platform Linux --package-name tc --run-transpiler --max-string-size 256
//@ HAMR: --platform seL4 --package-name tc --run-transpiler --max-string-size 256

package TempControlMixedSeL4CAmKES {

  private import AADL::*;
  private import AADL_Project::*;
  private import AADL_Project::Time_Units::*;
  
  part def TempControlSystem :> System {
    part tsp: TempSensorProcess;
    part tcp: TempControlProcess;
    part fp: FanProcess;

    part proc: TempControlProcessor;

    connection ctTStoTC : PortConnection connect tsp.currentTemp to tcp.currentTemp;
    connection tcTStoTC : PortConnection connect tsp.tempChanged to tcp.tempChanged;
    connection fcTCtoF : PortConnection connect tcp.fanCmd to fp.fanCmd;
    connection faFtoTC : PortConnection connect fp.fanAck to tcp.fanAck;

    allocation b0 : Deployment_Properties::Actual_Processor_Binding allocate tsp to proc;
    allocation b1 : Deployment_Properties::Actual_Processor_Binding allocate tcp to proc;
    allocation b2 : Deployment_Properties::Actual_Processor_Binding allocate fp to proc;
  }

  part def TempControlProcessor :> Processor {
    attribute Frame_Period: Timing_Properties::Frame_Period = 1000 [millisecond];
    attribute Clock_Period: Timing_Properties::Clock_Period = 1 [millisecond];
  }

  part def TempControlProcess :> Process {
    part tct : TempControl;

    in port currentTemp : DataPort { :> type : Temperature; }
    in port tempChanged : EventPort;
    in port fanAck : EventDataPort { :> type : FanAck; }
    out port fanCmd : EventDataPort { :> type : FanCmd; }

    connection ctTCPtoTC : PortConnection connect currentTemp to tct.currentTemp;
    connection tcTCPtoTC : PortConnection connect tempChanged to tct.tempChanged;
    connection faTCPtoTC : PortConnection connect fanAck to tct.fanAck;
    connection fcTCtoTCP : PortConnection connect tct.fanCmd to fanCmd;

    attribute Domain: CASE_Scheduling::Domain = 2;
  }

  part def TempSensorProcess :> Process {
    part tst : TempSensor;

    out port currentTemp : DataPort { :> type : Temperature; }
    out port tempChanged : EventPort;

    connection ctTStoTSP : PortConnection connect tst.currentTemp to currentTemp;
    connection tcTStoTSP : PortConnection connect tst.tempChanged to tempChanged;

    attribute Domain: CASE_Scheduling::Domain = 3;
  }

  part def FanProcess :> Process {
    part ft : Fan;

    in port fanCmd : EventDataPort { in :> type : FanCmd; }
    out port fanAck : EventDataPort { out :> type : FanAck; }

    connection fcFtoFP : PortConnection connect fanCmd to ft.fanCmd;
    connection faFPtoF : PortConnection connect ft.fanAck to fanAck;

    attribute Domain: CASE_Scheduling::Domain = 4;    
  }

  part def TempSensor :> Thread {
    out port currentTemp : DataPort { :> type : Temperature; }

    out port tempChanged : EventPort;
    
    attribute :>> Dispatch_Protocol = Supported_Dispatch_Protocols::Periodic;
    attribute :>> Period = 1000 [millisecond];

    language "GUMBO" /*{

      integration
        guarantee Sensor_Temperature_Range:
          currentTemp.degrees >= -40.0 [f32] & currentTemp.degrees <= 122.0 [f32];

      initialize
        guarantee initializes:
          currentTemp.degrees == 72 [f32];
    }*/
  }

  part def TempControl :> Thread {
    in port currentTemp : DataPort { :> type : Temperature; }
    in port tempChanged : EventPort;
    in port fanAck : EventDataPort { :> type : FanAck; }
    in port setPoint : EventDataPort { :> type : SetPoint; }
    out port fanCmd : EventDataPort { :> type : FanCmd; }

    attribute :>> Dispatch_Protocol = Supported_Dispatch_Protocols::Sporadic;
    attribute :>> Period = 1000 [millisecond];
    
    // Memory_Propties::Stack_Size is not yet part of aadl.libraries
    // attribute :>> Stack_Size = 102400 bytes;
    
    language "GUMBO" /*{
      state
        currentSetPoint: SetPoint;
        currentFanState: FanCmd;
        latestTemp: Temperature;
        fanError: Base_Types::Boolean;

      integration
        assume currentTempRange:
          (currentTemp.degrees >= -128.6 [f32]) & (currentTemp.degrees <= 134.0 [f32]);

      initialize
        modifies currentSetPoint, currentFanState, latestTemp;

        guarantee defaultSetPoint:
          (currentSetPoint.low.degrees == 70 [f32]) & (currentSetPoint.high.degrees == 90 [f32]);

        guarantee defaultFanStates:
          currentFanState == FanCmd.Off;

        guarantee defaultLatestTemp:
          latestTemp.degrees == 72.0[f32];

      compute
        modifies currentSetPoint, currentFanState, latestTemp, fanError;

        assume
          a1 "If the previously received currentTemp was less than the previously
             |received setPoint then the last fan command must have been Off":
            '->:'(not fanError & latestTemp.degrees < currentSetPoint.low.degrees,
                  currentFanState == FanCmd.Off);

        assume
          a2 "If the previously received currentTemp was more than the previously
             |received setPoint then the last fan command must have been On":
            '->:'(not fanError & latestTemp.degrees > currentSetPoint.high.degrees,
                  currentFanState == FanCmd.On);
        
        guarantee errorState "If the fan sent FanAck.Error then continue sending the
                              |last fan command until the fan sends FanAck.Ok":
          '->:'(fanError,
                In(currentFanState) == currentFanState and MustSend(fanCmd, currentFanState));

        //    ---------------------------
        //     Compute Entry Point General Clauses
        //       The following contracts state properties reflecting control laws that should always
        //       hold no matter what incoming event triggers dispatch.   Therefore, they are stated
        //       as independent (not associated with a handler) guarantee clauses.
        //    ---------------------------
        guarantee  TC_Req_01 "If the current temperature is less than the set point, then the fan state shall be Off.":
          '->:'(not fanError & latestTemp.degrees < currentSetPoint.low.degrees,
                currentFanState == FanCmd.Off);

        guarantee TC_Req_02 "If the current temperature is greater than the set point,
                             |then the fan state shall be On.":
          '->:' (not fanError & latestTemp.degrees > currentSetPoint.high.degrees,
                 currentFanState == FanCmd.On);

        guarantee TC_Req_03 "If the current temperature is greater than or equal to the
                            |current low set point and less than or equal to the current high set point,
                            |then the current fan state is maintained.":
          '->:'(not fanError & latestTemp.degrees >= currentSetPoint.low.degrees & latestTemp.degrees <= currentSetPoint.high.degrees,
                // if we are still in set point range, don't change the fan state
                currentFanState == In(currentFanState));

        guarantee mustSendFanCmd "If the local record of the fan state was updated,
                                 |then send a fan command event with this updated value.":
          '->:'(not fanError & In(currentFanState) != currentFanState,
                 MustSend(fanCmd, currentFanState)) and

          '->:' (not fanError & currentFanState == In(currentFanState),
                NoSend(fanCmd));

        //    ---------------------------
        //     Compute Entry Point Handler Contracts
        //       Handler contracts allow the compute entry point contracts to be extended with additional
        //       constraints that must hold for a particular handler.
        //
        //       At the Slang level, each handler's contract is formed by conjoining the compute entry point
        //       general clauses with the contract clauses given in the handlers.
        //       For the modifies clauses, CURRENTLY, the modifies clauses must be identical to the modifies
        //       clause in the compute entry point general clauses.  Note this means that the modifies may be
        //       an over-approximation -- some listed variables may actually not be modified in the handler.
        //       (I believe SPARK would give an error/warning if a listed variable is not written on at least
        //        one path, but Logika does not enforce that).
        //       Thus, in the current state of the tools, if a variable is not actually modified
        //       in the handler, an explicit frame condition must be given equating the pre- and post-state
        //       version of the variable.
        //       In the future, such frame conditions may be automatically generated.
        //    ---------------------------

        handle setPoint:
          modifies (currentSetPoint);

          guarantee setPointChanged:
            currentSetPoint == setPoint;

          guarantee latestTempNotModified:
            (latestTemp == In(latestTemp));


        handle tempChanged:
          modifies (latestTemp);

          guarantee tempChanged:
            latestTemp == currentTemp;

          guarantee setPointNotModified:
            currentSetPoint == In(currentSetPoint);


        handle fanAck:
          guarantee setPointNotModified:
            currentSetPoint == In(currentSetPoint);

          guarantee lastTempNotModified:
            latestTemp == In(latestTemp);

          guarantee manageErrorState : 
            '->:'(fanAck == FanAck.Ok,
                  not fanError) &            
            '->:'(fanAck == FanAck.Error,
                 fanError);
    }*/
  }

  part def Fan :> Thread {
    in port fanCmd : EventDataPort { in :> type : FanCmd; }
    out port fanAck : EventDataPort { out :> type : FanAck; }

    attribute :>> Dispatch_Protocol = Supported_Dispatch_Protocols::Sporadic;
  }

  part def Temperature :> Data {

    part degrees : Base_Types::Float_32;
    attribute unit : TempUnit;

    language "GUMBO" /*{
      invariants
        inv AbsZero:
          degrees > -459.67 [f32];
    }*/
  }
      
  enum def TempUnit {
    enum Fahrenheit;
    //enum Celsius;
    //enum Kelvin;
  }

  part def SetPoint :> Data {
    part low : Temperature;
    part high : Temperature;

    language "GUMBO" /*{
      invariants
        inv SetPoint_Data_Invariant:
          (low.degrees >= 50 [f32]) &
          (high.degrees <= 110 [f32]) &
          (low.degrees <= high.degrees);
    }*/
  }

  enum def FanCmd {
    enum On;
    enum Off;
  }
    
  enum def FanAck {
    Ok;
    Error;
  }
}