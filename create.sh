#!/bin/sh
mkdir -p src/{main,test}/{java,resources,scala}
mkdir lib project target

# Create an initial build.sbt file
echo 'name := "Akka"

version := "0.1"

scalaVersion := "2.11.8"' > build.sbt
