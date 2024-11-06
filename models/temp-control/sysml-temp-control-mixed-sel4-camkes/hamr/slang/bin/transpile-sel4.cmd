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

// Do not edit this file as it will be overwritten if HAMR codegen is rerun

val SCRIPT_HOME: Os.Path = Os.slashDir
val PATH_SEP: String = Os.pathSep

val TempSensor_tsp_tst: ISZ[String] = ISZ(
  "--sourcepath", s"${SCRIPT_HOME}/../src/main/bridge${PATH_SEP}${SCRIPT_HOME}/../src/main/component${PATH_SEP}${SCRIPT_HOME}/../src/main/seL4Nix/tc/TempControlMixedSeL4CAmKES${PATH_SEP}${SCRIPT_HOME}/../src/main/art${PATH_SEP}${SCRIPT_HOME}/../src/main/data${PATH_SEP}${SCRIPT_HOME}/../src/main/seL4Nix/tc/TempSensor_tsp_tst",
  "--output-dir", s"${SCRIPT_HOME}/../../camkes/slang_libraries/TempSensor_tsp_tst",
  "--name", "TempSensor_tsp_tst",
  "--apps", "tc.TempSensor_tsp_tst.tst_seL4App",
  "--fingerprint", "3",
  "--bits", "64",
  "--string-size", "256",
  "--sequence-size", "100",
  "--sequence", s"MS[Z,Option[art.Bridge]]=1;IS[Z,art.UPort]=2;IS[Z,art.Art.PortId]=2",
  "--constants", s"art.Art.numComponents=1;art.Art.numPorts=2;art.Art.numConnections=1",
  "--cmake-includes", s"+${SCRIPT_HOME}/settings_TempSensor_tsp_tst.cmake",
  "--forward", "art.ArtNative=tc.TempSensor_tsp_tst.tst_seL4App",
  "--stack-size", "16777216",
  "--stable-type-id",
  "--exts", s"${SCRIPT_HOME}/../../c/ext-c/ext.c${PATH_SEP}${SCRIPT_HOME}/../../c/ext-c/ext.h${PATH_SEP}${SCRIPT_HOME}/../../c/etc_seL4/adapters/TempSensor_tsp_tst/TempSensor_tsp_tst_adapter.h${PATH_SEP}${SCRIPT_HOME}/../../c/etc_seL4/adapters/TempSensor_tsp_tst/TempSensor_tsp_tst_adapter.c",
  "--lib-only")

val TempControl_tcp_tct: ISZ[String] = ISZ(
  "--sourcepath", s"${SCRIPT_HOME}/../src/main/bridge${PATH_SEP}${SCRIPT_HOME}/../src/main/component${PATH_SEP}${SCRIPT_HOME}/../src/main/seL4Nix/tc/TempControlMixedSeL4CAmKES${PATH_SEP}${SCRIPT_HOME}/../src/main/art${PATH_SEP}${SCRIPT_HOME}/../src/main/data${PATH_SEP}${SCRIPT_HOME}/../src/main/seL4Nix/tc/TempControl_tcp_tct",
  "--output-dir", s"${SCRIPT_HOME}/../../camkes/slang_libraries/TempControl_tcp_tct",
  "--name", "TempControl_tcp_tct",
  "--apps", "tc.TempControl_tcp_tct.tct_seL4App",
  "--fingerprint", "3",
  "--bits", "64",
  "--string-size", "256",
  "--sequence-size", "100",
  "--sequence", s"MS[Z,Option[art.Bridge]]=1;IS[Z,art.UPort]=4;IS[Z,art.Art.PortId]=4",
  "--constants", s"art.Art.numComponents=1;art.Art.numPorts=5;art.Art.numConnections=1",
  "--cmake-includes", s"+${SCRIPT_HOME}/settings_TempControl_tcp_tct.cmake",
  "--forward", "art.ArtNative=tc.TempControl_tcp_tct.tct_seL4App",
  "--stack-size", "16777216",
  "--stable-type-id",
  "--exts", s"${SCRIPT_HOME}/../../c/ext-c/ext.c${PATH_SEP}${SCRIPT_HOME}/../../c/ext-c/ext.h${PATH_SEP}${SCRIPT_HOME}/../../c/etc_seL4/adapters/TempControl_tcp_tct/TempControl_tcp_tct_adapter.h${PATH_SEP}${SCRIPT_HOME}/../../c/etc_seL4/adapters/TempControl_tcp_tct/TempControl_tcp_tct_adapter.c",
  "--lib-only")

val Fan_fp_ft: ISZ[String] = ISZ(
  "--sourcepath", s"${SCRIPT_HOME}/../src/main/bridge${PATH_SEP}${SCRIPT_HOME}/../src/main/component${PATH_SEP}${SCRIPT_HOME}/../src/main/seL4Nix/tc/TempControlMixedSeL4CAmKES${PATH_SEP}${SCRIPT_HOME}/../src/main/art${PATH_SEP}${SCRIPT_HOME}/../src/main/data${PATH_SEP}${SCRIPT_HOME}/../src/main/seL4Nix/tc/Fan_fp_ft",
  "--output-dir", s"${SCRIPT_HOME}/../../camkes/slang_libraries/Fan_fp_ft",
  "--name", "Fan_fp_ft",
  "--apps", "tc.Fan_fp_ft.ft_seL4App",
  "--fingerprint", "3",
  "--bits", "64",
  "--string-size", "256",
  "--sequence-size", "100",
  "--sequence", s"MS[Z,Option[art.Bridge]]=1;IS[Z,art.UPort]=1;IS[Z,art.Art.PortId]=1",
  "--constants", s"art.Art.numComponents=1;art.Art.numPorts=2;art.Art.numConnections=1",
  "--cmake-includes", s"+${SCRIPT_HOME}/settings_Fan_fp_ft.cmake",
  "--forward", "art.ArtNative=tc.Fan_fp_ft.ft_seL4App",
  "--stack-size", "16777216",
  "--stable-type-id",
  "--exts", s"${SCRIPT_HOME}/../../c/ext-c/ext.c${PATH_SEP}${SCRIPT_HOME}/../../c/ext-c/ext.h${PATH_SEP}${SCRIPT_HOME}/../../c/etc_seL4/adapters/Fan_fp_ft/Fan_fp_ft_adapter.h${PATH_SEP}${SCRIPT_HOME}/../../c/etc_seL4/adapters/Fan_fp_ft/Fan_fp_ft_adapter.c",
  "--lib-only")

val SlangTypeLibrary: ISZ[String] = ISZ(
  "--sourcepath", s"${SCRIPT_HOME}/../src/main/bridge${PATH_SEP}${SCRIPT_HOME}/../src/main/component${PATH_SEP}${SCRIPT_HOME}/../src/main/art${PATH_SEP}${SCRIPT_HOME}/../src/main/data${PATH_SEP}${SCRIPT_HOME}/../src/main/seL4Nix/tc/SlangTypeLibrary",
  "--output-dir", s"${SCRIPT_HOME}/../../camkes/slang_libraries/SlangTypeLibrary",
  "--name", "SlangTypeLibrary",
  "--apps", "tc.SlangTypeLibrary.SlangTypeLibrary",
  "--fingerprint", "3",
  "--bits", "64",
  "--string-size", "256",
  "--sequence-size", "1",
  "--cmake-includes", s"+${SCRIPT_HOME}/settings_SlangTypeLibrary.cmake",
  "--forward", "art.ArtNative=tc.SlangTypeLibrary.SlangTypeLibrary",
  "--stack-size", "16777216",
  "--stable-type-id",
  "--lib-only")

val projects: ISZ[ISZ[String]] = ISZ(
  TempSensor_tsp_tst,
  TempControl_tcp_tct,
  Fan_fp_ft,
  SlangTypeLibrary
)

println("Initializing runtime library ...")
Sireum.initRuntimeLibrary()

var result = 0
for(p <- projects if result == 0) {
  result = Sireum.run(ISZ[String]("slang", "transpilers", "c") ++ p)
}

//ops.ISZOps(projects).parMap(p =>
//  Sireum.run(ISZ[String]("slang", "transpilers", "c") ++ p)
//)

Os.exit(result)
