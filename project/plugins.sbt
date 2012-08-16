resolvers ++= Seq(
  "jgit-repo" at "http://download.eclipse.org/jgit/maven",
  Resolver.url(
    "scalasbt",
    new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases")
  )(Resolver.ivyStylePatterns)
)

libraryDependencies ++= Seq ( //note old scala and sbt versions
  "com.github.siasia" % "xsbt-proguard-plugin_2.9.1" % "0.11.2-0.1.2"
)

addSbtPlugin("com.jsuereth" % "sbt-git-plugin" % "0.4")

addSbtPlugin("com.eed3si9n" % "sbt-man" % "0.1.0")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.6.0")

addSbtPlugin("com.typesafe.startscript" % "xsbt-start-script-plugin" % "0.5.2")

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.1.2")

addSbtPlugin("com.jsuereth" % "xsbt-gpg-plugin" % "0.6")
