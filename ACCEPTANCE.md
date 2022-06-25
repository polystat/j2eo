# Acceptance guide

- [Acceptance guide](#acceptance-guide)
  - [Introduction](#introduction)
  - [Prerequisites](#prerequisites)
    - [Building](#building)
      - [macOS](#macos)
      - [Ubuntu 22.04 (latest LTS)](#ubuntu-2204-latest-lts)
    - [Running](#running)
  - [Downloading J2EO](#downloading-j2eo)
  - [Installing J2EO](#installing-j2eo)
  - [Testing and assessing J2EO](#testing-and-assessing-j2eo)
    - [Performing the assessment](#performing-the-assessment)
      - [Benchmarks](#benchmarks)
      - [Unit tests](#unit-tests)
  - [Working with J2EO](#working-with-j2eo)
  
---

## Introduction

The Guide describes the common procedure for installing J2EO software package and describes all steps, from downloading to testing and using software.

---

## Prerequisites

The J2EO source code is available on [GitHub](https://github.com/polystat/j2eo).

### Building

J2EO project is implemented in Java/Kotlin and uses Gradle as a build system. You need to install JDK 11 to be able to build the project.

Gradle wrapper is included in the project, so you don't need to install Gradle on your system.

J2EO uses ANTLR to build its Java parser, so if you want to rebuild grammar file (which is not necessary to successfully build the project), you need to install it as well.

#### macOS

To install JDK and ANTLR on macOS, install [Homebrew](https://brew.sh) (a package manager) and run:

```shell
brew install openjdk@11
brew install antlr
```

#### Ubuntu 22.04 (latest LTS)

Older versions of Ubuntu were not tested, but may be supported as well.

To install JDK and ANTLR on Ubuntu, run:

```shell
sudo apt update
sudo apt install -y openjdk-11-jdk-headless antlr4
```


### Running

To run a prebuilt version of J2EO, you only need JRE (or JDK, which comes with JRE as well). You may refer to above instructions for installation of JDK.

---

## Downloading J2EO

J2EO prebuilt binaries are published on [Maven](https://search.maven.org/artifact/org.polystat/j2eo/0.5.3/jar). You can download .jar file there and use it directly. It packs all dependencies inside.

If you want to build project on your own or work on the project, you can clone the GitHub repository:

```shell
git clone https://github.com/polystat/j2eo.git
```

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