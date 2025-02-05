//Versión 1 sin modificar
lazy val root = (project in file("."))
  .enablePlugins(PlayJava)
  //.enablePlugins(PlayNettyServer).disablePlugins(PlayPekkoHttpServer) // uncomment to use the Netty backend
  .settings(
    name := """backend-malla-vial""",
    version := "1.0-SNAPSHOT",
    crossScalaVersions := Seq("2.13.14", "3.3.3"),
    scalaVersion := crossScalaVersions.value.head,
    libraryDependencies ++= Seq(
      guice,
      javaJpa,
      "org.postgresql" % "postgresql" % "42.7.3",
      "org.hibernate" % "hibernate-core" % "6.6.0.Final",
      javaWs % "test",
      "org.awaitility" % "awaitility" % "4.2.2" % "test",
      "org.assertj" % "assertj-core" % "3.26.3" % "test",
      "org.mockito" % "mockito-core" % "5.13.0" % "test"
    ),
    Test / testOptions += Tests.Argument(TestFrameworks.JUnit, "-a", "-v"),
    scalacOptions ++= List("-feature", "-Werror"),
    javacOptions ++= List("-Xlint:unchecked", "-Xlint:deprecation", "-Werror"),
    PlayKeys.externalizeResourcesExcludes += baseDirectory.value / "conf" / "META-INF" / "persistence.xml"
  )
