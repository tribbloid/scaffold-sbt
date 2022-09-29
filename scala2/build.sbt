val scala2Version = "2.13.9"


lazy val common: SettingsDefinition =  Seq(

  version := "0.1.0-SNAPSHOT",
  scalaVersion := scala2Version,
  libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
)

lazy val FunTest = config("fun") extend(Test)

lazy val root = project
  .in(file("."))
  .settings(common)
  .settings(
    name := "scaffold-sbt-scala2",
  )
//  .configs(FunTest)
//  .settings(
//    inConfig(FunTest)(Defaults.testSettings),
//    inConfig(FunTest)(ScalafmtPlugin.scalafmtConfigSettings)
//  )

lazy val submodule = project
  .configs(FunTest)
  .settings(common)
  .settings(
    inConfig(FunTest)(Defaults.testSettings),
    inConfig (FunTest) (ScalafmtPlugin.scalafmtConfigSettings)
  )