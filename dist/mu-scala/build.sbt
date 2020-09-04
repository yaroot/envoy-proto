import higherkindness.mu.rpc.srcgen.Model._

inThisBuild(Seq(
  organization := "com.example",
  scalaVersion := "2.13.3",
  scalacOptions += "-language:higherKinds"
))

def on[A](major: Int, minor: Int)(a: A): Def.Initialize[Seq[A]] =
  Def.setting {
    CrossVersion.partialVersion(scalaVersion.value) match {
      case Some(v) if v == (major, minor) => Seq(a)
      case _                              => Nil
    }
  }

lazy val macroSettings: Seq[Setting[_]] = Seq(
  libraryDependencies ++= Seq(
    scalaOrganization.value % "scala-compiler" % scalaVersion.value % Provided
  ),
  libraryDependencies ++= on(2, 12)(
    compilerPlugin("org.scalamacros" %% "paradise" % "2.1.1" cross CrossVersion.full)
  ).value,
  scalacOptions ++= on(2, 13)("-Ymacro-annotations").value
)

val protocol = project
  .settings(
    name := "mu-scala-protocol",

    libraryDependencies ++= Seq(
      // Needed for the generated code to compile
      "io.higherkindness" %% "mu-rpc-service" % "0.23.0"
    ),

    // Needed to expand the @service macro annotation
    macroSettings,

    // Generate sources from .proto files
    muSrcGenIdlType := IdlType.Proto,
    // Make it easy for 3rd-party clients to communicate with us via gRPC
    muSrcGenIdiomaticEndpoints := true
  )
  // The sbt-mu-srcgen plugin isn't on by default after version v0.23.x
  // so we need to manually enable the plugin to generate mu-scala code
  .enablePlugins(SrcGenPlugin)

val server = project
  .settings(
    name := "mu-scala-rpc-server",

    libraryDependencies ++= Seq(
      // Needed to build a gRPC server
      "io.higherkindness" %% "mu-rpc-server" % "0.23.0",

      // Silence all logs in the demo
      "org.slf4j" % "slf4j-nop" % "1.7.30",

      "org.scalatest" %% "scalatest" % "3.1.2" % Test,

      // Needed to build an in-memory server in the test
      "io.higherkindness" %% "mu-rpc-testing" % "0.23.0" % Test
    ),

    // Start the server in a separate process so it shuts down cleanly when you hit Ctrl-C
    fork := true
  )
  .dependsOn(protocol)

val client = project
  .settings(
    name := "mu-scala-rpc-client",

    libraryDependencies ++= Seq(
      // Needed to build a gRPC client (although you could use mu-rpc-okhttp instead)
      "io.higherkindness" %% "mu-rpc-client-netty" % "0.23.0",

      // For console I/O in the demo client
      "dev.profunktor" %% "console4cats" % "0.8.1",

      // Silence all logs in the demo
      "org.slf4j" % "slf4j-nop" % "1.7.30"
    )
  )
  .dependsOn(protocol)

val root = (project in file("."))
  .settings(
    name := "mu-scala"
  )
  .aggregate(protocol, server, client)
