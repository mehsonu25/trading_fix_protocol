ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.6"

lazy val root = (project in file("."))
  .settings(
    name := "trading_fix_protocol"
  )

libraryDependencies += "org.quickfixj" % "quickfixj-messages-fix44" % "2.3.2"