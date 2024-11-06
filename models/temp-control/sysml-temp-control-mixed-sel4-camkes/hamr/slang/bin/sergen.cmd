::/*#! 2> /dev/null                                   #
@ 2>/dev/null # 2>nul & echo off & goto BOF           #
if [ -z "${SIREUM_HOME}" ]; then                      #
  echo "Please set SIREUM_HOME env var"               #
  exit -1                                             #
fi                                                    #
exec "${SIREUM_HOME}/bin/sireum" slang run "$0" "$@"    #
:BOF
setlocal
if not defined SIREUM_HOME (
  echo Please set SIREUM_HOME env var
  exit /B -1
)
"%SIREUM_HOME%\bin\sireum.bat" slang run %0 %*
exit /B %errorlevel%
::!#*/
// #Sireum

import org.sireum._

val sireum = Os.path(Os.env("SIREUM_HOME").get) / "bin" / (if (Os.isWin) "sireum.bat" else "sireum")

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

// create serializers/deserializers for the Slang types used in the project

val files: ISZ[String] = ISZ("../src/main/data/tc/TempControlMixedSeL4CAmKES/Temperature.scala",
                             "../src/main/data/tc/TempControlMixedSeL4CAmKES/TempUnit.scala",
                             "../src/main/data/tc/TempControlMixedSeL4CAmKES/SetPoint.scala",
                             "../src/main/data/tc/TempControlMixedSeL4CAmKES/FanCmd.scala",
                             "../src/main/data/tc/TempControlMixedSeL4CAmKES/FanAck.scala",
                             "../src/main/data/tc/Base_Types.scala",
                             "../src/main/data/tc/TempControlMixedSeL4CAmKES/TempSensor_tsp_tst_Containers.scala",
                             "../src/main/data/tc/TempControlMixedSeL4CAmKES/TempControl_tcp_tct_Containers.scala",
                             "../src/main/data/tc/TempControlMixedSeL4CAmKES/Fan_fp_ft_Containers.scala",
                             "../src/main/data/tc/util/Container.scala",
                             "../src/main/art/art/DataContent.scala",
                             "../src/main/data/tc/Aux_Types.scala")

val toolargs: String = st"${(files, " ")}".render

(Os.slashDir.up / "src" / "main" / "util" / "tc").mkdirAll()

proc"$sireum tools sergen -p tc -m json,msgpack -o ${Os.slashDir.up}/src/main/util/tc $toolargs".at(Os.slashDir).console.runCheck()
