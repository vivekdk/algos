name := "algos"

organization := "com.vivek.algos"

version := "1.0-SNAPSHOT"

// project description
description := "Implementation of some standard algos"

// Enables publishing to maven repo
publishMavenStyle := true

// Do not append Scala versions to the generated artifacts
crossPaths := false

// This forbids including Scala related libraries into the dependency
autoScalaLibrary := false

// library dependencies. (orginization name) % (project name) % (version)
libraryDependencies ++= Seq(
  "junit" % "junit" % "4.10" % "test"
)