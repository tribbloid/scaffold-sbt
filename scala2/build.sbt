val scala2Version = "2.13.9"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scaffold-sbt-scala2",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala2Version,
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )
