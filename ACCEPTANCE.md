# Acceptance guide

- [Acceptance guide](#acceptance-guide)
  - [Introduction](#introduction)
  - [Prerequisites](#prerequisites)
    - [Building](#building)
      - [macOS](#macos)
      - [Ubuntu 22.04 (latest LTS)](#ubuntu-2204-latest-lts)
      - [Windows](#windows)
    - [Running](#running)
  - [Downloading J2EO](#downloading-j2eo)
  - [Installing J2EO](#installing-j2eo)
  - [Testing and assessing J2EO](#testing-and-assessing-j2eo)
    - [Performing the assessment](#performing-the-assessment)
      - [Benchmarks](#benchmarks)
      - [Unit tests](#unit-tests)
      - [Bundled test suite](#bundled-test-suite)
      - [OpenJDK test suite](#openjdk-test-suite)
  - [Working with J2EO](#working-with-j2eo)
  
---

## Introduction

The Guide describes the common procedure for installing J2EO software package and describes all steps, from downloading to testing and using software.

---

## Prerequisites

The J2EO source code is available on [GitHub](https://github.com/polystat/j2eo).

### Building

J2EO project is implemented in Java/Kotlin and uses Gradle as a build system. You need to install JDK 11 and Gradle to be able to build the project.

J2EO uses ANTLR to build its Java parser, so if you want to rebuild grammar file (which is not necessary to successfully build the project), you need to install it as well.

#### macOS

To install JDK and Gradle on macOS, install [Homebrew](https://brew.sh) (a package manager) and run:

```shell
brew install openjdk@11 gradle
```

To download ANTLR, use the following command from the repository root:

```shell
wget https://www.antlr.org/download/antlr-4.10.1-complete.jar
```

#### Ubuntu 22.04 (latest LTS)

Older versions of Ubuntu were not tested, but may be supported as well.

To install JDK on Ubuntu, run:

```shell
sudo apt update
sudo apt install -y openjdk-11-jdk-headless
```

To install Gradle on Ubuntu, proceed with the [official instructions](https://gradle.org/install/).

To download ANTLR, use the following command from the repository root:

```shell
wget https://www.antlr.org/download/antlr-4.10.1-complete.jar
```

#### Windows

Windows does not have package manager.

- To install Java on Windows, install Development Kit from the [Oracle webiste](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html).
- To install Gradle on Windows, proceed with the [official instructions](https://gradle.org/install/).
- To install ANTLR, download file from [this link](https://www.antlr.org/download/antlr-4.10.1-complete.jar) using your browser and put it in the project root.




### Running

To run a prebuilt version of J2EO, you only need JRE (or JDK, which comes with JRE as well). You may refer to above instructions for installation of JDK.

---

## Downloading J2EO

J2EO prebuilt binaries are published on [Maven](https://search.maven.org/artifact/org.polystat/j2eo/0.5.3/jar). You can download .jar file there and use it directly. It packs all dependencies inside.

If you want to build project on your own or work on the project, you can clone the GitHub repository:

```shell
git clone https://github.com/polystat/j2eo.git
```

To build the project on UNIX systems, use the following command from the project root:

```shell
./build.sh
```

To build project on Windows, use command

```shell
gradle build
```

The built J2EO jar will be located at `build/libs`.

---

## Installing J2EO

J2EO produces a standalone JAR file, it does not have to be installed. You can use it from any location using commands provided in the "Working with J2EO" section below.

---

## Testing and assessing J2EO

J2EO has two major acceptance criteria:
- crash-less operation on large Java projects (even if translation results are not completely accurate, i.e. some semantic parts are missing)
- Coverage of features requested by Polystat

To assess the project maturity, we included bash scripts that download some popular open-source Java projects and runs J2EO on them:

| Project | Script             |
| ------- | ------------------ |
| Hadoop  | `./test-hadoop.sh` |
| Kafka   | `./test-kafka.sh`  |

Keep in mind, as the development of J2EO progresses and 1.0 release is not out, performance problems may persist, and translation of large files may take longer than satisfactory.

### Performing the assessment

Prepare the environment:

```shell
git clone https://github.com/polystat/j2eo.git
cd j2eo
```

#### Benchmarks

Now you can execute either of the benchmarks provided in the above table. For example:

```shell
./test-hadoop.sh
```

The script will build J2EO from the current checked out source code, download target repo if it is missing, and start J2EO with arguments targeting the downloaded project.

All data is stored in the `j2eo-data` directory, including original source code and translation results.


#### Unit tests

Built-in unit tests may be executed using:

```shell
./gradlew test
```

#### Bundled test suite

J2EO comes with 1000+ bundled tests. These tests are used with parallel execution:
- original Java source code of the text is compiled with Java compiler and executed. Stdout output is saved.
- Java source code is translated to EO using J2EO project, then compiled with EO compiler and executed. Stdout output is stored.
- Stdout outputs are compared. If they match — test is passed. If not — test is failed.

Test suite follows the Java Language Specification structure, covering applicable chapters and sections of the Java specifications.

Bundled tests may be executed using `./test_candidates.sh` script.

#### OpenJDK test suite

J2EO contains tools for executing OpenJDK test suite. You can execute these tests using the following command:

```shell
./gradlew test --tests "open_jdk.TestJ2EOonOpenJDK" -Pamount=<number of tests from openjdk to process>
```

These tests follow the same execution flow as the bundled test suite. Since J2EO does not cover the language completely, some of these tests fail.

---

## Working with J2EO

J2EO is indended to be used on Java projects, not individual Java source code files.

You can use J2EO by executing the .jar file:

```shell
java -jar <path to J2EO .jar> -o <output directory> <source directory of a Java projects>
```

For example, if you have built J2EO 0.4.0 from source code using

```shell
./gradlew build -x test jar
cp build/libs/J2EO-0.4.0.jar .
```

You can run it on Hadoop project stored at `./j2eo-data/hadoop` using

```shell
java -jar J2EO-0.4.0.jar -o j2eo-data/hadoop-eo j2eo-data/hadoop
```

This will produce EO source code at `./j2eo-data/hadoop-eo`.