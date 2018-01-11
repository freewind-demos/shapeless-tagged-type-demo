name := "Shapeless Tagged Type Demo"

version := "0.1"

organization := "org.my"

scalaVersion := "2.12.4"

sbtVersion := "1.0.4"

libraryDependencies ++= Seq(
  "com.chuusai" %% "shapeless" % "2.3.3",
  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)