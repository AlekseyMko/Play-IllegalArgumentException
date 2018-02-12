name := """play-IllegalArgumentException"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.4"

libraryDependencies += javaJdbc
libraryDependencies += guice
libraryDependencies += evolutions

// Test Database
libraryDependencies += "com.h2database" % "h2" % "1.4.196"
libraryDependencies += "org.simpleflatmapper" % "sfm-jdbc" % "3.15.6"
libraryDependencies += "com.h2database" % "h2" % "1.4.192"
libraryDependencies += "com.google.code.gson" % "gson" % "2.8.2"
libraryDependencies += "org.jooq" % "jooq" % "3.10.4"
libraryDependencies += "org.jooq" % "jooq-codegen-maven" % "3.10.4"
libraryDependencies += "org.jooq" % "jooq-meta" % "3.10.4"
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.45"

// Testing libraries for dealing with CompletionStage...
libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % Test
libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % Test

// Make verbose tests
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))


//### Starts: JOOQ classes generation block
val generateJOOQ = taskKey[Seq[File]]("Generate JooQ classes")

val generateJOOQTask = (sourceManaged, fullClasspath in Compile, runner in Compile, streams) map { (src, cp, r, s) =>
    r.run("org.jooq.util.GenerationTool", cp.files, Array("conf/mentions.xml"), s.log) foreach sys.error
    ((src / "app/generated") ** "*.java").get
}

generateJOOQ := generateJOOQTask.value
//### Ends