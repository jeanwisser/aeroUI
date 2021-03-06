lazy val root = (project in file(".")).enablePlugins(PlayScala)

name := """aero-ui"""
maintainer := "Jean Wisser"
version := "0.6.8"
dockerRepository := Some("jeanwisser")
dockerUpdateLatest := true

scalaVersion := "2.13.0"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test
libraryDependencies += "com.aerospike" % "aerospike-client" % "4.4.7"

dockerExposedPorts in Docker := Seq(9000, 9443)