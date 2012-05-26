//basic project info
name := "prototype-project"

organization := "com.example"

version := "1.0.0-SNAPSHOT"

//scala versions and options
scalaVersion := "2.9.2"

crossScalaVersions := Seq("2.9.1")

scalacOptions ++= Seq("-deprecation", "-unchecked")

javacOptions ++= Seq("-Xlint:unchecked", "-Xlint:deprecation")

//entry point
mainClass in (Compile, packageBin) := Some("com.example.Main")

mainClass in (Compile, run) := Some("com.example.Main")

//dependencies
libraryDependencies ++= Seq (
  "org.scalaz" %% "scalaz-core" % "6.0.4",
  "org.scalacheck" %% "scalacheck" % "1.9" % "test"
)

//only uncomment if you need dependencies from the snapshots repo
//resolvers += ScalaToolsSnapshots

//sbt behavior
logLevel := Level.Warn //higher than Info suppresses your own printlns

traceLevel := 5

//proguard-plugin
seq(ProguardPlugin.proguardSettings :_*)

proguardOptions ++= Seq (
    "-dontshrink -dontoptimize -dontobfuscate -dontpreverify -dontnote " +
    "-ignorewarnings",
    keepAllScala
)

//dependecy-graph-plugin
net.virtualvoid.sbt.graph.Plugin.graphSettings

//start-script-plugin
seq(
  com.typesafe.startscript.StartScriptPlugin.startScriptForClassesSettings: _*
)

//buildinfo-plugin
buildInfoSettings

sourceGenerators in Compile <+= buildInfo

buildInfoKeys := Seq[Scoped](name, version, scalaVersion, sbtVersion)

buildInfoPackage := "com.example"
