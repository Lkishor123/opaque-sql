// Add Maven Central as a resolver
// resolvers += Resolver.mavenCentral

addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")

addSbtPlugin("com.github.alonsodomin" % "sbt-spark" % "0.6.0")
libraryDependencies += "xyz.kamyar" % "sbt-jni-macros_2.12" % "1.4.2"
addSbtPlugin("ch.jodersky" % "sbt-jni" % "1.4.2")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.6")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.6.1")
