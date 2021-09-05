import org.apache.tools.ant.taskdefs.condition.Os
import java.security.MessageDigest


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

// MD5 of the latest generated grammar file is stored here
val latestGrammarMD5FilePath = "out/latestGrammarMD5"


repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.withType(JavaCompile::class).configureEach {
    options.forkOptions.jvmArgs!!.addAll(arrayOf(
        "--add-opens",
        "jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED"
    ))
}

tasks.getByName("build") {
    createOutDirs()

    // Only run Bison build if grammar file changed
    if (readMD5FromFile(latestGrammarMD5FilePath) != grammarFileMD5()) {
        println("Grammar file changed since last build; Rebuilding parser with Bison...")
        runBison()
        writeMD5ToFile(grammarFileMD5(), latestGrammarMD5FilePath)
    } else {
        println("Grammar file didn't change; Skipping parser build.")
    }
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

/**
 * Creates directories for all Bison output files.
 */
fun createOutDirs() {
    // Create out directory if it doesn't exist, so report may be placed inside
    val outPath = reportFilePath.substring(0, reportFilePath.lastIndexOf("/"))
    file(outPath).mkdirs()

    // Create parser directory if it doesn't exist, so parser may be placed inside
    val parserPath = javaParserFilePath.substring(0, javaParserFilePath.lastIndexOf("/"))
    file(parserPath).mkdirs()
}

/**
 * Runs Bison using OS-specific shell command.
 */
fun runBison() =
    when {
        Os.isFamily(Os.FAMILY_WINDOWS) ->
            exec {
                workingDir = File(".")
                executable = "bin/win_bison.exe"
                args = mutableListOf(
                    "-r all",
                 //   "--debug", "--help", "--stacktrace",
                    "--report-file=${reportFilePath}",
                    "--output=${javaParserFilePath}",
                    javaGrammarFilePath
                )
            }
        Os.isFamily(Os.FAMILY_MAC) ->
            exec {
                workingDir = File(".")
                executable = "bin/bison_mac"
                args = mutableListOf(
                    "-r all",
                    "--report-file=${reportFilePath}",
                    "--output=${javaParserFilePath}",
                    javaGrammarFilePath
                )
            }
        Os.isFamily(Os.FAMILY_UNIX) ->
            exec {
                workingDir = File(".")
                executable = "bison"
                args = mutableListOf(
                    "-r all",
                    "--report-file=${reportFilePath}",
                    "--output=${javaParserFilePath}",
                    javaGrammarFilePath
                )
            }
        else ->
            throw kotlin.UnsupportedOperationException("Your OS is not yet supported. File a GitHub or issue or " +
                    "provide a Pull Request with support for Bison execution for your OS.")
    }


/**
 * Returns MD5 string for a given file.
 */
fun generateMD5(filepath: String): String {
    val digest: MessageDigest = MessageDigest.getInstance("MD5")

    File(filepath).inputStream().use { inputStream ->
        val buffer = ByteArray(8192)
        var read = 0
        do {
            digest.update(buffer, 0, read)
            read = inputStream.read(buffer)
        } while (read > 0)
    }

    val md5sum: ByteArray = digest.digest()
    val bigInt = BigInteger(1, md5sum)

    return bigInt.toString(16).padStart(32, '0')
}

fun grammarFileMD5(): String =
    generateMD5(javaGrammarFilePath)

fun readMD5FromFile(filepath: String): String =
    File(filepath).let { f ->
        if (f.exists())
            File(filepath).readText()
        else
            ""
    }

fun writeMD5ToFile(md5: String, filepath: String) =
    File(filepath).writeText(md5)
