import org.apache.tools.ant.taskdefs.condition.Os
import org.gradle.jvm.tasks.Jar
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

plugins {
    java
    antlr
    jacoco
    pmd
    checkstyle
    `maven-publish`
    signing
    id("io.spring.dependency-management") version "1.1.0"
    id("org.jlleitschuh.gradle.ktlint") version "11.1.0"
    // id("org.cqfn.diktat.diktat-gradle-plugin") version "1.0.2"
    kotlin("jvm") version "1.8.10"
    id("com.github.dawnwords.jacoco.badge") version "0.2.4"
}

val mvnUsername: String? by project
val mvnPassword: String? by project
val mvnPublicationVersion: String? by project
val candidates: String? by project
val amount: String? by project

group = "org.polystat"
version = mvnPublicationVersion ?: "0.6.0"

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "11"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "11"
}

// The Java grammar source file for ANTLR
val javaParserG4FilePath = "grammar/JavaParser.g4"
val javaLexerG4FilePath = "grammar/JavaLexer.g4"

// Where to put generated parser
val javaParserSavePath = "src/main/java/org/polystat/j2eo/antlrParser"

val antlrJar = "antlr-4.9.2-complete.jar"

repositories {
    mavenCentral()
}

dependencyManagement {
    imports {
        mavenBom("com.jcabi:parent:0.67.0")
    }
}

dependencies {
    // Library for command-line arguments support
    implementation("commons-cli:commons-cli:1.5.0")
    // Functional stuff
    implementation("io.arrow-kt:arrow-core:1.1.5")
    // Kotlin logger
    implementation("org.slf4j:slf4j-simple:2.0.7")
    implementation("io.github.microutils:kotlin-logging-jvm:3.0.5")

    implementation("org.junit.platform:junit-platform-commons:1.9.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
    implementation(kotlin("stdlib-jdk8"))

    // Use ANTLR for parser generation
    antlr("org.antlr:antlr4:4.12.0")

    implementation("org.polystat:j2ast:0.2.0")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11

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
        attributes["Main-Class"] = "org.polystat.j2eo.main.Main2" // fully qualified class name of default main class
    }
    // Include dependencies
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    with(tasks["jar"] as CopySpec)
    duplicatesStrategy = DuplicatesStrategy.INCLUDE
}

tasks {
    compileKotlin {
        dependsOn(generateGrammarSource)
    }
    compileTestKotlin {
        dependsOn(generateTestGrammarSource)
    }
    runKtlintFormatOverMainSourceSet {
        dependsOn(generateGrammarSource)
    }
    runKtlintFormatOverTestSourceSet {
        dependsOn(generateTestGrammarSource)
    }
    classes {
        dependsOn(ktlintFormat)
    }
    ktlintFormat {
        finalizedBy(ktlintCheck)
    }
    //  diktatFix {
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
    ignoreFailures = true
    useJUnitPlatform()
    systemProperty("candidates", candidates ?: "false")
    systemProperty("amount", amount ?: "15")
}

pmd {
    isIgnoreFailures = true
    isConsoleOutput = false
    toolVersion = "6.55.0"
    rulesMinimumPriority.set(5)
    ruleSets = listOf("category/java/codestyle.xml")
}

ktlint {
    verbose.set(true)
    outputToConsole.set(true)
    coloredOutput.set(true)
    ignoreFailures.set(false)
    reporters {
        reporter(ReporterType.CHECKSTYLE)
        reporter(ReporterType.JSON)
        reporter(ReporterType.HTML)
    }
    filter {
        exclude("**/style-violations.kt")
    }
}

// diktat {
//    reporterType = "sarif"
//    ignoreFailures = true
// }

tasks.getByName("build") {
    println("Building parser with ANTLR...")
    runAntlr()
}

checkstyle {
    toolVersion = "9.3"
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
 * Runs ANTLR using OS-specific shell command.
 */
fun runAntlr() {
    val antlrArgs = mutableListOf(
        "-jar",
        "../$antlrJar",
        javaParserG4FilePath.replace("grammar/", ""),
        javaLexerG4FilePath.replace("grammar/", ""),
        "-visitor",
        "-o",
        "../$javaParserSavePath"
    )

    try {
        when {
            Os.isFamily(Os.FAMILY_WINDOWS) ->
                exec {
                    workingDir = File("grammar")
                    executable = "java"
                    args = antlrArgs
                }
            Os.isFamily(Os.FAMILY_MAC) ->
                exec {
                    workingDir = File("grammar")
                    executable = "java"
                    args = antlrArgs
                }
            Os.isFamily(Os.FAMILY_UNIX) ->
                exec {
                    workingDir = File("grammar")
                    executable = "java"
                    args = antlrArgs
                }
            else ->
                throw UnsupportedOperationException(
                    "Your OS is not yet supported. File a GitHub or issue or " +
                        "provide a Pull Request with support for ANTLR execution for your OS."
                )
        }
    } catch (e: Exception) {
        println("Couldn't run ANTLR; $e")
    }
}
