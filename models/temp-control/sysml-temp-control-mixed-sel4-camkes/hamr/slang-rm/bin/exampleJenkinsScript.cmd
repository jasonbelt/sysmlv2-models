// #Sireum

import org.sireum._

val homeBin: Os.Path = Os.slashDir
val home: Os.Path = homeBin.up

val sireumHome = Os.path(Os.env("SIREUM_HOME").get)
val sireumBin = sireumHome / "bin"
val sireum: Os.Path = sireumBin / (if (Os.isWin) "sireum.bat" else "sireum")

// Do not edit this file as it will be overwritten if SystemTestArtifactGen is rerun

val firewall: B = F // set to T in order to tunnel, need to also turn on VPN if off-campus
val rebuild: B = F

val testServer="e2206hm02.cs.ksu.edu"

val DSC_PREFIX="dsc_sys" // name of the root artifacts directory on testServer

val FQ_DSC_NAME = "tc.Example_TempControl_Outputs_Container_DSC_Test_Harness"

val DSC_PROJECT_NAME = ops.ISZOps(ops.StringOps(FQ_DSC_NAME).split(c => c == '.')).first

val DSC_SIMPLE_NAME = ops.ISZOps(ops.StringOps(FQ_DSC_NAME).split(c => c == '.')).last

val DSC_SERVER_ROOT_DIR = Os.path("/opt") / "santos" / "jenkins" / DSC_PREFIX

//////////////////////////////////////////////////////////////////////////////////////
// BOILER PLATE
//////////////////////////////////////////////////////////////////////////////////////

val proxyJump = if (firewall) "-J santos_jenkins@linux.cs.ksu.edu" else ""

if (rebuild) {
  proc"$sireum proyek tipe ${Os.slashDir.up}".echo.console.runCheck()
  proc"$sireum proyek assemble -m $FQ_DSC_NAME --include-sources --include-tests ${Os.slashDir.up}".echo.console.runCheck()
}

val jarFile = Os.slashDir.up / "out" / "slang" / "assemble" / "slang.jar"
assert (jarFile.exists, s"Need to build ${jarFile}")

val jarFileDir = s"${DSC_PREFIX}/${DSC_PROJECT_NAME}/${DSC_SIMPLE_NAME}"
val jarFileDest = s"$jarFileDir/${jarFile.name}"

// upload the jar to the department's file server so that's it's accessible to
// all the linux servers
proc"ssh santos_jenkins@linux.cs.ksu.edu mkdir -p $jarFileDir".echo.runCheck()
proc"scp ${jarFile} santos_jenkins@linux.cs.ksu.edu:${jarFileDest}".echo.runCheck()

// upload the jar to test server -- it's expected we'll use a non-cs hosted machine
// like the mac mini's during the testing phase as they are much faster than the old
// linux servers. Non-hosted means they're not connected to the department file system
proc"ssh $proxyJump santos_jenkins@${testServer} mkdir -p $jarFileDir".echo.runCheck()
proc"scp $proxyJump ${jarFile} santos_jenkins@${testServer}:${jarFileDest}".echo.runCheck()

var curlPrefix = st"curl https://jenkins.cs.ksu.edu/job/0DSC_system_testing_start/buildWithParameters --user $${jenkinsUserId}:$${jenkinsToken}"

// get the test info by calling the App associated
// with the DSC test harness (i.e. the app should be the jar's main method)
val results = proc"java -jar ${jarFile}".echo.console.run()
assert(results.ok)

val lines = ops.StringOps(results.out ).split(c => c == '\n')

var runners: ISZ[ST] = ISZ()
var commands: ISZ[ST] = ISZ()
var i = 0
while(i < lines.size) {
  val jenkinsArgs = lines(i)
  val json = ops.StringOps(lines(i + 1))
  val jsonPrefix: String = "{\"testFamilyName\" : \""
  assert(json.startsWith(jsonPrefix))

  val testFamilyName = json.substring(jsonPrefix.size, json.indexOfFrom('"', jsonPrefix.size + 1))

  val dsc_runner_dir = DSC_SERVER_ROOT_DIR / "dsc_runner" / DSC_PROJECT_NAME / DSC_SIMPLE_NAME / testFamilyName / "$DSC_TIMEOUT"
  val dsc_tester_dir = DSC_SERVER_ROOT_DIR / "dsc_tester" / DSC_PROJECT_NAME / DSC_SIMPLE_NAME / testFamilyName / "$DSC_TIMEOUT"

  if (i == 0) {
    // put the jar file into the DSC_PROJECT_NAME directory on the test server so that it can be used to merge
    // reports. This implies that making changes to the behavior code or the gumbo contract of a component means
    // the report from one DSC_PROJECT_NAME/DSC_SIMPLE_NAME may no longer be mergeable as it's line numbers no
    // longer match what's in the freshly built jar -- ie. probably need to rerun everything for DSC_PROJECT_NAME
    val serverJarLoc = dsc_tester_dir.up.up.up / jarFile.name
    proc"ssh $proxyJump santos_jenkins@${testServer} mkdir -p ${serverJarLoc.up}".echo.runCheck()
    proc"scp $proxyJump ${jarFile} santos_jenkins@${testServer}:${serverJarLoc}".echo.runCheck()
  }

  val temp = Os.temp()
  temp.writeOver(json.s)

  runners = runners :+ st"val run_${testFamilyName}: B = T"

  commands = commands :+
    st"""if(run_${testFamilyName}) {
        |  // ${testFamilyName}
        |  DSC_RUNNER_DIR = s"${dsc_runner_dir.string}"
        |  DSC_TESTER_DIR = s"${dsc_tester_dir.string}"
        |  // create the result directories for ${testFamilyName} on the test server and upload the json file
        |  proc"ssh ${proxyJump} santos_jenkins@${testServer} mkdir -p $${DSC_RUNNER_DIR}".echo.console.runCheck()
        |  proc"ssh ${proxyJump} santos_jenkins@${testServer} mkdir -p $${DSC_TESTER_DIR}".echo.console.runCheck()
        |  proc"scp $proxyJump ${temp} santos_jenkins@${testServer}:${dsc_runner_dir.up}/testRow.json".echo.runCheck()
        |  proc"scp $proxyJump ${temp} santos_jenkins@${testServer}:${dsc_tester_dir.up}/testRow.json".echo.runCheck()
        |  // trigger ${testFamilyName} tests on jenkins
        |  proc"$$CURL_PREFIX ${jenkinsArgs} --data DSC_RUNNER_DIR=$${DSC_RUNNER_DIR} --data DSC_TESTER_DIR=$${DSC_TESTER_DIR} --data DSC_JAR_LOC=$jarFileDest --data DSC_TEST_SERVER=${testServer} --data DSC_PREFIX=${DSC_PREFIX}".echo.console.runCheck()
        |}
        |"""

  i = i + 2
}

val batch =
  st"""// #Sireum
      |
      |import org.sireum._
      |
      |val DSC_TIMEOUT = Os.env("DSC_TIMEOUT").get
      |val jenkinsUserId = Os.env("JENKINS_USER_ID").get
      |val jenkinsToken = Os.env("JENKINS_TOKEN").get
      |
      |val CURL_PREFIX=s"$curlPrefix"
      |var DSC_RUNNER_DIR=""
      |var DSC_TESTER_DIR=""
      |
      |${(runners, "\n")}
      |
      |${(commands, "\n")}
      |"""

(Os.slashDir / "batch.cmd").writeOver(batch.render)
(Os.slashDir / "batch.cmd").chmod("700")
