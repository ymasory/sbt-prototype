//BASIC PROJECT INFO
name := "myproj"

organization := "com.yuvimasory"

version := "1.0.0-SNAPSHOT"

//SCALA VERSIONS AND OPTIONS
scalaVersion := "2.9.2"

crossScalaVersions := Seq("2.9.1", "2.9.0")

scalacOptions ++= Seq("-deprecation", "-unchecked")

javacOptions ++= Seq("-Xlint:unchecked", "-Xlint:deprecation")

//ENTRY POINT
mainClass in (Compile, packageBin) := Some("com.yuvimasory.myproj.Main")

mainClass in (Compile, run) := Some("com.yuvimasory.myproj.Main")

//DEPENDENCIES
libraryDependencies ++= Seq (
  "org.scalacheck" %% "scalacheck" % "1.9" % "test"
  //"com.martiansoftware" % "jsap" % "2.1"
)

//only uncomment if you need dependencies from the snapshots repo
//resolvers += ScalaToolsSnapshots

//SBT BEHAVIOR
fork in Test := true

fork in Compile := true

logLevel := Level.Info //higher than Info suppresses your own printlns

traceLevel := 5

//disables dynamic updating, e.g., SNAPSHOTS
//offline := true

//PROGUARD
seq(ProguardPlugin.proguardSettings :_*)

proguardOptions ++= Seq (
    "-dontshrink -dontoptimize -dontobfuscate -dontpreverify -dontnote " +
    "-ignorewarnings",
    keepAllScala
)


//PUBLISHING

//this results in warnings if the listed file doesn't exist
// credentials += Credentials(Path.userHome / ".scala-tools")

publishTo <<= version {(v: String) =>
    val nexus = "http://nexus.scala-tools.org/content/repositories/"
    if (v.trim.endsWith("SNAPSHOT")) Some("snapshots" at nexus + "snapshots/") 
    else                             Some("releases"  at nexus + "releases/")
}

publishMavenStyle := true

publishArtifact in (Test, packageBin) := false

publishArtifact in (Compile, packageDoc):= false

publishArtifact in (Compile, packageSrc):= false


//UNPORTED FROM 0.7.x prototype
// extraResources = "README.rst" +++ "LICENSE"
// mainResources = super.mainResources +++ extraResources

// override def documentOptions =
//   LinkSource ::
//   documentTitle(name + " " + version + " API") ::
//   windowTitle(name + " " + version + " API") ::
//   Nil
