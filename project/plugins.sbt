resolvers ++= Seq(
  "jgit-repo" at "http://download.eclipse.org/jgit/maven"
)

addSbtPlugin("com.jsuereth" % "sbt-git-plugin" % "0.4")

addSbtPlugin("com.eed3si9n" % "sbt-man" % "0.1.0")

//waiting for sbt 0.12.0 update
// addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.6.0")

addSbtPlugin("com.typesafe.startscript" % "xsbt-start-script-plugin" % "0.5.3")

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.1.2")

addSbtPlugin("com.jsuereth" % "xsbt-gpg-plugin" % "0.6")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.8.3")
