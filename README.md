# J2EO: Java to EO Translator

<img src="https://www.yegor256.com/images/books/elegant-objects/cactus.svg" height="100px"  alt="eolang icon"/>

[![Gradle Build](https://github.com/polystat/j2eo/actions/workflows/gradle-build.yml/badge.svg)](https://github.com/polystat/j2eo/actions/workflows/gradle-build.yml)
![LINE](https://img.shields.io/badge/line--coverage-41,67%25-orange.svg)
![BRANCH](https://img.shields.io/badge/branch--coverage-33,81%25-red.svg)
![COMPLEXITY](https://img.shields.io/badge/complexity-5,17-brightgreen.svg)

[![Hits-of-Code](https://hitsofcode.com/github/polystat/j2eo)](https://hitsofcode.com/view/github/polystat/j2eo)
![Lines of code](https://img.shields.io/tokei/lines/github/polystat/j2eo)

This is a translator of **Java** programming language to [EOLANG](https://www.eolang.org) programming language.

## Usage

1. Make sure you have installed:
    - **Java 16+** (make sure command `java -version` shows 16+ version of Java in terminal if you have multiple Java
      version installed)
    - **Maven 3.8+** to run tests (be aware of [possible conflicts](https://bugs.debian.org/cgi-bin/bugreport.cgi?bug=980467) of the
      latest versions of Maven and Java on some OSs)
    - **ANTLR4 4.9.3** (if you want to build the parser on your own. If you don't have ANTLR, you still can build project using bundled version of parser.)
2. Clone the repo into your folder:

   HTTPS:
    ```shell
    git clone https://github.com/polystat/j2eo.git
    cd ./j2eo
    ```
   or SSH:
    ```shell
    git clone git@github.com:polystat/j2eo.git
    cd ./j2eo
    ```
3. Build the project:
    ```shell
    ./build.sh
    ```
    - See the [troubleshooting section](./README.md#troubleshooting) in case of problems
4. After build process, **j2eo.jar** file will appear in the project root folder (`./j2eo`). With this file, is it
   possible to translate **.java** files or packages to **.eo** packages. Run:

    ```shell
    java -jar j2eo.jar <source .java file or directory with Java files> -o <output directory>
    ```

   to get the translation.

   For example,
    ```shell
    java -jar j2eo.jar src/test/resources/SimpleTest.java -o output_eo
    ```
   or
    ```shell
    java -jar j2eo.jar src/test/resources/polystat_tests/test1 -o output_eo
    ```

### Running translator on Hadoop

Hadoop is a large Java project (contains ~1.8M lines of code as of time of writing this). We included it as a benchmark of the translator.

Repository contains a script to build J2EO, download Hadoop repo and run J2EO on it.

Usage:

```shell
./test-hadoop.sh
```

It will download zipped `hadoop` and unpack it (in a separate folder) into `../j2eo-data` relative to the project's root. Next, it will put the If you no more need that folder, run 
```sh
rm -rf ../j2eo-data
```

---

## Motivation

This project is a part of Polystat project, the goal of which is to statically analyze different languages using EOLANG,
the implementation of phi-calculus. In order to do that, the first step is to convert source language into EO. This
particular repository contains translator from Java to EO.

---

## Decisions

**Q**: Why do we implement yet another Java parser?

**A**: Publicly available parsers only support older versions of Java, while we aim to support the latest version (
currently 16). Thus, we had to create our own parser.

Also in recent versions, external Java grammar implemented in ANTLR was added as an alternative. It claims to support Java 17, and it does, as for our testing on big projects.

<br>

**Q**: Why do we implement EO AST?

**A**: Working with AST instead of raw strings allows utilization of Java compiler's type checking to minimize amount of
bugs in our code. It is also much easier to work with abstraction layer than with strings.

<br>

---

## How does it work?

- First, the Java source code files are parsed recursively.
- Then, for each file, translator converts Java AST to EO AST.
- Then, EO AST is printed out as a source code to output directory in the same directory structure.

---

## Troubleshooting

### Java
Make sure you have these in sync (*mentioning* (not pointing to) the same `jdk` directory)
- `which java`
- `which javac`
  - configure alternatives in case of mismatch ([link](https://stackoverflow.com/a/47432365))
- `echo $JAVA_HOME`
  - See how to set `$JAVA_HOME` ([link](https://stackoverflow.com/a/18972665))
  - If it still points to a wrong directory, see where you might have set it ([link](https://unix.stackexchange.com/a/154957)) and edit that place

---

## Awesome Bugs translation
[Awesome bugs repo](https://github.com/polystat/awesome-bugs)

.java files:
- [directStateAccess](src/test/resources/awesome_bugs/java/directStateAccess)
- [divByZero](src/test/resources/awesome_bugs/java/divByZero)
- [inheritance](src/test/resources/awesome_bugs/java/inheritance)
- [unjustifiedAssumption](src/test/resources/awesome_bugs/java/unjustifiedAssumption)

Translations:
- [directStateAccess](src/test/resources/awesome_bugs/eo/directStateAccess)
- [divByZero](src/test/resources/awesome_bugs/eo/divByZero)
- [inheritance](src/test/resources/awesome_bugs/eo/inheritance)
- [unjustifiedAssumption](src/test/resources/awesome_bugs/eo/unjustifiedAssumption)


## Examples of Java to EOLang translation

We use Java language specification document as a foundation for Java feature hierarchy.  
Java 16 language specification: [see .pdf file](https://docs.oracle.com/javase/specs/jls/se16/jls16.pdf)

Ch. 4 - Types, Values, and Variables
Ch. 5 - Conversions and Contexts
Ch. 6 - Names
Ch. 7 - Packages and Modules [WIP]
Ch. 8 - Classes
Ch. 9 - Interfaces
Ch. 10 - Arrays
Ch. 11 - Exceptions [WIP]
Ch. 14 - Block Statements, and Patterns
Ch. 15 - Expressions
Ch. 16 - Definite Assignments [WIP]
Ch. 17 - Threads and Locks [EO support?]
Ch. 18 - Type inference [WIP]
