import org.apache.tools.ant.taskdefs.condition.Os

plugins {
    java
}

group = "org.eolang"
version = "0.1"

// The Java grammar source file for Bison
val javaGrammarFilePath = "src/main/resources/Java_16_Grammar.y"

// Where to put Bison compilation report
val reportFilePath = "out/Java_16_Grammar.report"

// Where to put generated parser
val javaParserFilePath = "src/main/java/parser/JavaParser.java"


repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName("build") {
    // Create out directory if it doesn't exist, so report may be placed inside
    val outPath = reportFilePath.substring(0, reportFilePath.lastIndexOf("/"))
    file(outPath).mkdirs()

    // Create parser directory if it doesn't exist, so parser may be placed inside
    val parserPath = javaParserFilePath.substring(0, javaParserFilePath.lastIndexOf("/"))
    file(parserPath).mkdirs()

    // Run Bison
    when {
        Os.isFamily(Os.FAMILY_WINDOWS) -> {
            exec {
                workingDir = File(".")
                executable = "bin/win_bison.exe"
                args = mutableListOf(
                    "-r",
                    "all",
                    "--report-file=${reportFilePath}",
                    "--output=${javaParserFilePath}",
                    javaGrammarFilePath
                )
            }
        }
        Os.isFamily(Os.FAMILY_MAC) -> {
            exec {
                workingDir = File(".")
                executable = "bin/bison_mac"
                args = mutableListOf(
                    "-r",
                    "all",
                    "--report-file=${reportFilePath}",
                    "--output=${javaParserFilePath}",
                    javaGrammarFilePath
                )
            }
        }
        // TODO: add Linux support
        else -> {
            throw kotlin.UnsupportedOperationException("Your OS is not yet supported. File a GitHub or issue or " +
                    "provide a Pull Request with support for Bison execution for your OS.")
        }
    }
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}