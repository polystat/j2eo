import org.apache.tools.ant.taskdefs.condition.Os
import org.gradle.jvm.tasks.Jar
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.security.MessageDigest

plugins {
    java
    antlr
    jacoco
    pmd
    checkstyle
    `maven-publish`
    signing
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    // id("org.jlleitschuh.gradle.ktlint") version "10.2.1"
    // id("org.cqfn.diktat.diktat-gradle-plugin") version "1.0.2"
    kotlin("jvm") version "1.6.0"
	id("com.github.dawnwords.jacoco.badge") version "0.2.4"
}

val mvnUsername: String? by project
val mvnPassword: String? by project
val mvnPublicationVersion: String? by project
val candidates: String? by project

println("Provided Maven username of length ${mvnUsername?.length}")
println("Provided Maven password of length ${mvnPassword?.length}")

group = "org.polystat"
version = mvnPublicationVersion ?: "0.4.0"

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "15"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "15"
}

// The Java grammar source file for Bison
val javaGrammarFilePath = "grammar/JavaParser.g4"

// Where to put Bison compilation report
val reportFilePath = "out/Java_16_Grammar.report"

// Where to put generated parser
val javaParserFilePath = "src/main/java/parser/JavaParser.java"

// MD5 of the latest generated grammar file is stored here
val latestGrammarMD5FilePath = "out/latestGrammarMD5"

repositories {
    mavenCentral()
}

dependencyManagement {
    imports {
        mavenBom("com.jcabi:parent:0.57.0")
    }
}

dependencies {
    // Library for command-line arguments support
    implementation("commons-cli:commons-cli:1.5.0")
    // Functional stuff
    implementation("io.arrow-kt:arrow-core:1.0.1")
    // Kotlin logger
    implementation("org.slf4j:slf4j-simple:1.7.33")
    implementation("io.github.microutils:kotlin-logging-jvm:2.1.21")

    implementation("org.junit.platform:junit-platform-commons:1.8.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    implementation(kotlin("stdlib-jdk8"))

    // Use ANTLR for parser generation
    antlr("org.antlr:antlr4:4.9.3")

    implementation("org.polystat:j2ast:0.1.0")
}

java {
    sourceCompatibility = JavaVersion.VERSION_15
    targetCompatibility = JavaVersion.VERSION_15

    withJavadocJar()
    withSourcesJar()
}

tasks.javadoc {
    if (JavaVersion.current().isJava9Compatible) {
        (options as StandardJavadocDocletOptions).addBooleanOption("html5", true)
    }
}

val fatJar = task("fatJar", type = Jar::class) {
    // baseName = "${project.name}-fat"
    // manifest Main-Class attribute is optional.
    // (Used only to provide default main class for executable jar)
    manifest {
        attributes["Main-Class"] = "main.Main2" // fully qualified class name of default main class
    }
    // Include dependencies
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    with(tasks["jar"] as CopySpec)
    duplicatesStrategy = DuplicatesStrategy.INCLUDE
}

tasks {
//    classes {
//        dependsOn(diktatFix)
//    }
//     ktlintFormat {
//         finalizedBy(ktlintCheck)
//     }
//  diktatFix {
//      dependsOn(ktlintFormat)
//      finalizedBy(diktatCheck)
//  }
    pmdMain {
        dependsOn(classes)
    }
    checkstyleMain {
        dependsOn(classes)
    }
    pmdTest {
        dependsOn(testClasses)
    }
    checkstyleTest {
        dependsOn(testClasses)
    }
    jacocoTestReport {
        dependsOn(test)
		finalizedBy(generateJacocoBadge)
    }
    test {
        dependsOn(pmdTest, checkstyleTest)
        finalizedBy(jacocoTestReport)
    }
    build {
        dependsOn(fatJar)
    }
}

tasks.withType(JavaCompile::class).configureEach {
    options.forkOptions.jvmArgs!!.addAll(
        arrayOf(
            "--add-opens", "jdk.compiler/com.sun.tools.javac.code=ALL-UNNAMED"
        )
    )
}

tasks.javadoc {
    exclude("parser/**")
}

tasks.test {
    useJUnitPlatform()
    systemProperty("candidates", candidates ?: "false")
}

pmd {
    isIgnoreFailures = true
    isConsoleOutput = false
    toolVersion = "6.40.0"
    rulesMinimumPriority.set(5)
    ruleSets = listOf("category/java/codestyle.xml")
}

// ktlint {
//     verbose.set(true)
//     outputToConsole.set(true)
//     coloredOutput.set(true)
//     ignoreFailures.set(false)
//     reporters {
//         reporter(ReporterType.CHECKSTYLE)
//         reporter(ReporterType.JSON)
//         reporter(ReporterType.HTML)
//     }
//     filter {
//         exclude("**/style-violations.kt")
//     }
// }

//diktat {
//    reporterType = "sarif"
//    ignoreFailures = true
//}

tasks.getByName("build") {
    // Only run Bison build if grammar file changed
    if (readMD5FromFile(latestGrammarMD5FilePath) != grammarFileMD5()) {
        println("Grammar file changed since last build; Rebuilding parser with ANTLR...")
        runAntlr()
        writeMD5ToFile(grammarFileMD5(), latestGrammarMD5FilePath)
    } else {
        println("Grammar file didn't change; Skipping parser build.")
    }
}

checkstyle {
    toolVersion = "9.1"
    isShowViolations = false
    isIgnoreFailures = false
}

tasks.withType<Checkstyle>().configureEach {
    reports {
        xml.required.set(false)
        html.required.set(true)
        html.stylesheet = resources.text.fromFile("config/xsl/checkstyle-simple.xsl")
    }
}
tasks.withType<JacocoCoverageVerification> {
    /*violationRules {
        rule {
            limit {
                minimum = BigDecimal(0.62)
            }
        }
    }*/

    afterEvaluate {
        classDirectories.setFrom(
            files(
                classDirectories.files.map {
                    fileTree(it).apply {
                        exclude("parser/**")
                    }
                }
            )
        )
    }
}
tasks.withType<JacocoReport> {
    afterEvaluate {
        classDirectories.setFrom(
            files(
                classDirectories.files.map {
                    fileTree(it).apply {
                        exclude("parser/**")
                    }
                }
            )
        )
    }
    reports.csv.required.set(true)
}

tasks.jacocoTestReport {
    reports {
        xml.required.set(true)
    }
}
jacocoBadgeGenSetting {
    jacocoReportPath = "$buildDir/reports/jacoco/test/jacocoTestReport.xml"
    readmePath = "$projectDir/README.md"
    // since v0.2.0, percentage limitation (0-100) for different type of coverage
    // limit = ['instruction': 0, 'branch': 0, 'line': 0, 'method': 0, 'class': 0]
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            groupId = "org.polystat"
            artifactId = "j2eo"
            version = project.version as String
            from(components["java"])
            pom {
                name.set("j2eo")
                description.set("Java to EO transpiler.")
                url.set("https://github.com/polystat/j2eo")
                // properties.set(mapOf(
                //     "myProp" to "value",
                //     "prop.with.dots" to "anotherValue"
                // ))
                licenses {
                    license {
                        name.set("MIT")
                        url.set("https://github.com/polystat/polystat/blob/master/LICENSE.txt")
                    }
                }
                developers {
                    developer {
                        id.set("zouev")
                        name.set("Eugene Zouev")
                        email.set("e.zuev@innopolis.ru")
                    }
                    developer {
                        id.set("IamMaxim58")
                        name.set("Maxim Stepanov")
                        email.set("m.stepanov@innopolis.university")
                    }
                    developer {
                        id.set("Ilia_Mil")
                        name.set("Ilya Milyoshin")
                        email.set("i.mileshin@innopolis.university")
                    }
                    developer {
                        id.set("egorklementev")
                        name.set("Egor Klementev")
                        email.set("e.klementev@innopolis.ru")
                    }
                }
                scm {
                    connection.set("scm:git:git@github.com:polystat/polystat.git")
                    developerConnection.set("scm:git:git@github.com:polystat/polystat.git")
                    url.set("https://github.com/polystat/polystat")
                }
            }
            repositories {
                maven {
                    credentials {
                        println("Applying Maven credentials")

                        username = mvnUsername
                        password = mvnPassword
                    }
                    url = uri("https://s01.oss.sonatype.org/content/repositories/releases/")
                }
            }
        }
    }
}

signing {
    setRequired({
        gradle.taskGraph.hasTask("publish")
    })

    sign(publishing.publications["mavenJava"])
}

tasks.getByName("signMavenJavaPublication") {
    dependsOn(fatJar)
}



/**
 * Runs Bison using OS-specific shell command.
 */
fun runAntlr() =
    try {
        when {
//            Os.isFamily(Os.FAMILY_WINDOWS) ->
//                exec {
//                    workingDir = File(".")
//                    executable = "bin/win_bison.exe"
//                    args = mutableListOf(
//                        "--report=states,lookaheads",
//                        // "-r", "all",
//                        // "--debug", "--help", "--stacktrace",
//                        "--report-file=${reportFilePath}",
//                        "--output=${javaParserFilePath}",
//                        javaGrammarFilePath
//                    )
//                }
            Os.isFamily(Os.FAMILY_MAC) ->
                exec {
                    workingDir = File("grammar")
                    executable = "antlr"
                    args = mutableListOf(
                        javaGrammarFilePath.replace("grammar/", ""),
                        "-visitor",
                        "-o",
                        "../src/main/java/parser"
                    )
                }
//            Os.isFamily(Os.FAMILY_UNIX) ->
//                exec {
//                    workingDir = File(".")
//                    executable = "bison"
//                    args = mutableListOf(
//                        "--report=states,lookaheads",
//                        "--report-file=${reportFilePath}",
//                        "--output=${javaParserFilePath}",
//                        javaGrammarFilePath
//                    )
//                }
            else ->
                throw UnsupportedOperationException(
                    "Your OS is not yet supported. File a GitHub or issue or " +
                            "provide a Pull Request with support for Bison execution for your OS."
                )
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }


/**
 * Returns MD5 string for a given file.
 */
fun generateMD5(filepath: String): String {
    val digest: MessageDigest = MessageDigest.getInstance("MD5")

    println("Working Directory = " + System.getProperty("user.dir"))

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
