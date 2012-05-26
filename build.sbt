//BASIC PROJECT INFO
name := "myproj"

organization := "com.yuvimasory"

version := "1.0.0-SNAPSHOT"

//SCALA VERSIONS AND OPTIONS
scalaVersion := "2.9.2"

crossScalaVersions := Seq("2.9.1")

scalacOptions ++= Seq("-deprecation", "-unchecked")

javacOptions ++= Seq("-Xlint:unchecked", "-Xlint:deprecation")

//ENTRY POINT
mainClass in (Compile, packageBin) := Some("Main")

mainClass in (Compile, run) := Some("Main")

//DEPENDENCIES
libraryDependencies ++= Seq (
  "org.scalaz" %% "scalaz-core" % "6.0.4",
  "org.scalacheck" %% "scalacheck" % "1.9" % "test"
)

//only uncomment if you need dependencies from the snapshots repo
//resolvers += ScalaToolsSnapshots

//SBT BEHAVIOR
logLevel := Level.Warn //higher than Info suppresses your own printlns

traceLevel := 5

//PROGUARD-PLUGIN
seq(ProguardPlugin.proguardSettings :_*)

proguardOptions ++= Seq (
    "-dontshrink -dontoptimize -dontobfuscate -dontpreverify -dontnote " +
    "-ignorewarnings",
    keepAllScala
)

//DEPENDECY-GRAPH-PLUGIN
net.virtualvoid.sbt.graph.Plugin.graphSettings

//START-SCRIPT-PLUGIN
seq(
  com.typesafe.startscript.StartScriptPlugin.startScriptForClassesSettings: _*
)
