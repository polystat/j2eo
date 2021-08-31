plugins {
    java
}

group = "org.eolang"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName("build") {
    exec {
        workingDir = File(".")
        executable = "bin\\win_bison.exe"
        args = mutableListOf(
                "-r",
                "all",
                "--report-file=\"../out/Java 16 Grammar.out\"",
                "\"../src/main/resources/Java 16 Grammar.y\""
        )
    }
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}