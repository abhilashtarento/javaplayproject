name := """play-java-hello-world-tutorial"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.10"

//libraryDependencies +=guice
libraryDependencies ++=Seq(
  guice,
  "com.h2database" % "h2" % "2.1.214",
  evolutions,
  jdbc,
  javaJpa,
  "org.hibernate" % "hibernate-core" % "5.5.6"
)

PlayKeys.externalizeResourcesExcludes += baseDirectory.value / "conf" /"META-INF"/"persistence.xml"