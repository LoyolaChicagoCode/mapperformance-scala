name := "mapperformance-scala"

version := "0.2"

scalaVersion := "2.12.16"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

libraryDependencies ++= Seq(
  "org.scalatest"  %% "scalatest"  % "3.2.14"  % Test,
  "org.scalacheck" %% "scalacheck" % "1.17.0" % Test
)
