name := "myproj"

version := "alpha"

crossScalaVersions := Seq("2.9.0")

mainClass in (Compile, packageBin) := Some("com.yuvimasory.myproj.Main")

mainClass in (Compile, run) := Some("com.yuvimasory.myproj.Main")

logLevel := Level.Warn

traceLevel := 5

libraryDependencies ++= Seq (
  "org.scalatest" % "scalatest_2.9.0" % "1.6.1"
  //"com.martiansoftware" % "jsap" % "2.1"
)

seq(ProguardPlugin.proguardSettings :_*)

proguardOptions ++= Seq (
    "-dontshrink -dontoptimize -dontobfuscate -dontpreverify -dontnote " +
    "-ignorewarnings",
    keepAllScala
)

// artifactID = "flashup"
// extraResources = "README.rst" +++ "LICENSE"
// mainResources = super.mainResources +++ extraResources

// override def compileOptions = super.compileOptions ++
//   compileOptions("-deprecation", "-unchecked")
// override def javaCompileOptions =
//   JavaCompileOption("-Xlint:unchecked") :: super.javaCompileOptions.toList

// val scalaToolsSnapshots = (
//   "Scala-Tools Maven2 Snapshots Repository" at
//   "http://scala-tools.org/repo-snapshots"
// )

// override def documentOptions =
//   LinkSource ::
//   documentTitle(name + " " + version + " API") ::
//   windowTitle(name + " " + version + " API") ::
//   Nil
