// Set the project name to the string 'My Project'
name := "Scala NIO"

scalaVersion := "2.9.0"

// The := method used in Name and Version is one of two fundamental methods.
// The other method is <<=
// All other initialization methods are implemented in terms of these.
version := "0.1"

autoCompilerPlugins := true

addCompilerPlugin("org.scala-lang.plugins" % "continuations" % "2.9.0")

scalacOptions += "-P:continuations:enable"