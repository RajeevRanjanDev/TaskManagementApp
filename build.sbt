name := """TaskManagementSystem"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean)

scalaVersion := "2.11.11"

libraryDependencies += jdbc
libraryDependencies += javaJdbc
libraryDependencies += cache
libraryDependencies += javaWs


libraryDependencies += "org.postgresql" % "postgresql" % "42.2.4"

libraryDependencies += "org.modelmapper" % "modelmapper" % "1.0.0"
