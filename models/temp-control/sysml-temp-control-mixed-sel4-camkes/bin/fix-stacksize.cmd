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

val home = Os.slashDir.up

val sireum = Os.path(Os.env("SIREUM_HOME").get) / "bin" / (if (Os.isWin) "sireum.bat" else "sireum")

val camkes = home / "hamr" / "camkes" / "TempControlSystem_Instance.camkes"

var contents = ops.StringOps(camkes.read)
if (!contents.contains("tcp_tct._stack_size")) {
    val c = contents.replaceAllLiterally("  configuration {", st"""  configuration {
                                                                 |    tcp_tct._stack_size = 102400;""".render)
    camkes.writeOver(c)
    println("Added stack size entry for temp control")
}
