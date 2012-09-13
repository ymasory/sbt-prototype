/* basic project info */
name := "prototype-project"

organization := "com.example"

version := "1.0.0-SNAPSHOT"

// description := "an awesome program"
// homepage := Some( url("http://example.com"))
// licenses := Seq("GPLv3" -> url("http://www.gnu.org/licenses/gpl-3.0.html"))
// organizationName := "My Company"

/* scala versions and options */
scalaVersion := "2.9.2"

crossScalaVersions := Seq("2.9.1")

scalacOptions ++= Seq("-deprecation", "-unchecked")

javacOptions ++= Seq("-Xlint:unchecked", "-Xlint:deprecation")

/* entry point */
mainClass in (Compile, packageBin) := Some("com.example.Main")

mainClass in (Compile, run) := Some("com.example.Main")

/* dependencies */
libraryDependencies ++= Seq (
  "org.scalaz" %% "scalaz-core" % "7.0.0-M2",
  "org.scalaz" %% "scalaz-effect" % "7.0.0-M2",
  "org.scalacheck" %% "scalacheck" % "1.9" % "test"
)

/* improve REPL */
initialCommands in console :=
  """|import scalaz._
     |import Scalaz._
     |import com.example._
     |println("scalaz 7 loaded!")
     |""".stripMargin

/* you may need these repos */
resolvers ++= Seq(
  // "sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
  // "sonatype releases" at "https://oss.sonatype.org/content/repositories/releases",
  // Classpaths.typesafeResolver,
  // Classpaths.typesafeSnapshots,
  // JavaNet1Repository,
  // JavaNet2Repository,
)

/* sbt behavior */
logLevel in compile := Level.Warn

traceLevel := 5

/* assembly plugin */
mainClass in AssemblyKeys.assembly := Some("com.example.Main")

assemblySettings

test in AssemblyKeys.assembly := {}

/* dependecy graph plugin */
net.virtualvoid.sbt.graph.Plugin.graphSettings

/* start script plugin */
seq(
  com.typesafe.startscript.StartScriptPlugin.startScriptForClassesSettings: _*
)

/* buildinfo plugin */
buildInfoSettings

sourceGenerators in Compile <+= buildInfo

buildInfoKeys := Seq[Scoped](name, version, scalaVersion, sbtVersion)

buildInfoPackage := "com.example"

/* publishing */
publishMavenStyle := true

publishTo <<= version { (v: String) =>
  val nexus = "https://oss.sonatype.org/"
  if (v.trim.endsWith("SNAPSHOT")) Some(
    "snapshots" at nexus + "content/repositories/snapshots"
  )
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <url>https://github.com/ACCOUNT/MYPROJ</url>
  <licenses>
    <license>
      <name>LICENSE NAME</name>
      <url>https://github.com/ACCOUNT/MYPROJ/blob/master/LICENSE</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:ACCOUNT/MYPROJ.git</url>
    <connection>scm:git:git@github.com:ACCOUNT/MYPROJ.git</connection>
  </scm>
  <developers>
    <developer>
      <id>HANDLE</id>
      <name>MY FULL NAME</name>
      <email>EMAIL</email>
      <url>HOMEPAGE</url>
    </developer>
  </developers>
)

// pgpPassphrase := Some("PASSWORD".toCharArray)

// pgpSigningKey := Some(0L)

// pgpSecretRing := file("/path/to/file")

// pgpPublicRing := file("/path/to/file")

// credentials += Credentials(
//   "Sonatype Nexus Repository Manager",
//   "oss.sonatype.org",
//   "ACCOUNT",
//   IO read file("/path/to/file")
// )
