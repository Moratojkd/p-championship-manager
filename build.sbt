name := "p-championship-manager"

organization := "com.moratojkd"

version := "0.1"

scalaVersion := "2.13.3"

libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter-web" % "2.3.1.RELEASE",
  "org.scalatest" %% "scalatest" % "3.2.0" % "test, it",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.11.1"
)
