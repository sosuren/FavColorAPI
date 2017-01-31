lazy val projectSettings = Seq(
  organization := "com.example",
  version := "1.0-SNAPSHOT",
  scalaVersion := "2.11.8",
  name := "fav-color-api"
)

lazy val root = (project in file("."))
                  .settings(projectSettings: _*)

val akkaVersion = "2.4.2"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster-tools" % akkaVersion
)
