libraryDependencies ++= Seq (
  "com.github.siasia" %% "xsbt-proguard-plugin" % "0.11.2-0.1.1"
)

resolvers += Resolver.url(
  "scalasbt",
  new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases")
)(Resolver.ivyStylePatterns)

addSbtPlugin("com.jsuereth" % "sbt-git-plugin" % "0.4")

addSbtPlugin("com.eed3si9n" % "sbt-man" % "0.1.0")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.6.0")

resolvers += Classpaths.typesafeResolver

addSbtPlugin("com.typesafe.startscript" % "xsbt-start-script-plugin" % "0.5.2")

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.1.2")
