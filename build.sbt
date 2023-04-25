ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .aggregate(firstModule, secondModule)
  .settings(
    name := "final-session-six-assignment"
  )

lazy val firstModule = (project in file("first-module"))
  .settings(
    name := "first-module",
    libraryDependencies ++= Seq(
      "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
      "ch.qos.logback" % "logback-classic" % "1.4.6"
    ),
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test
  )

lazy val secondModule = (project in file("second-module"))
  .settings(
    name := "second-module", libraryDependencies ++= Seq(
      "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
      "ch.qos.logback" % "logback-classic" % "1.4.6"
    ),
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test
  )

