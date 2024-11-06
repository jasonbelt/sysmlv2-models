// #Sireum

import org.sireum._

val homeBin = Os.slashDir

val sireum: Os.Path = Sireum.sireumJar.up / (if(Os.isWin) "sireum.bat" else "sireum")

proc"${homeBin / "sergen.cmd"}".console.runCheck()

// slangcheck has to tipe check the project which might not be possible due to the old
// slangcheck resources being invalid due to additions/removals to the containers.
// So, just delete the slangcheck resources first
for (r <- Os.Path.walk(homeBin.up / "src" / "main" / "util", T, T, p => ops.StringOps(p.name).startsWith("SlangCheck"))) {
  r.removeAll()
}

val projectCmd = homeBin / "project.cmd"
projectCmd.writeOver(ops.StringOps(projectCmd.read).replaceAllLiterally("for (m <- ISZ(\"bridge\", \"system\", \"util\")) yield (Os.path(\"test\") / m).string", "ISZ()"))
projectCmd.chmod("775")
proc"${homeBin / "slangcheck.cmd"}".console.runCheck()
proc"git checkout ${projectCmd.value}".at(homeBin.up).runCheck()

val genLoc = homeBin / "hamr-system-testing-artifact-generator"
val containerLoc = homeBin.up / "src" / "main" / "data" / "tc" / "Aux_Types.scala"
assert (containerLoc.exists)

if (!genLoc.exists) {
  println("Fetching and building the system testing artifact generator ...")
  proc"git clone https://github.com/santoslab/hamr-system-testing-artifact-generator.git".at(homeBin).runCheck()
  proc"sireum proyek assemble --uber -m org.sireum.hamr.systest.generator.SystemTestArtifactGen ${genLoc}".at(homeBin).runCheck()
}

val jarLoc = genLoc / "out" / "hamr-system-testing-artifact-generator" / "assemble" / "hamr-system-testing-artifact-generator.jar.bat"
if (jarLoc.exists) {
  println("Running system testing artifact generator ...")
  proc"$jarLoc ${homeBin.up} $containerLoc".console.runCheck()
} else {
  println("Please assemble the sys test generator via the instructions in its readme")
}
