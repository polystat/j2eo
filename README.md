# J2EO: Java to EO Translator

<img src="https://www.yegor256.com/images/books/elegant-objects/cactus.svg" height="100px"  alt="eolang icon"/>

<br>
<br>

[![Gradle Build](https://github.com/polystat/j2eo/actions/workflows/gradle-build.yml/badge.svg)](https://github.com/polystat/j2eo/actions/workflows/gradle-build.yml)
![Coverage](.github/badges/jacoco.svg)
![Branches](.github/badges/branches.svg)

This is a translator of **Java** programming language to [EOLANG](https://www.eolang.org) programming language.

---

## Usage

### With Docker

To use J2EO wrapped into Docker image:

1. Build image
```shell
docker build -t polystat/j2eo:latest -f docker/Dockerfile .  
```
2. Use image
```shell
cat <.java filepath> | docker run --rm -i polystat/j2eo java -jar j2eo.jar -
```

---

### Without docker
  
1. Make sure you have installed:
    - **Java 16+** (make sure command `java -version` shows 16+ version of Java in terminal if you have multiple Java version installed)
    - **Maven 3.8+** (be aware of [possible conflicts](https://bugs.debian.org/cgi-bin/bugreport.cgi?bug=980467) of the latest versions of Maven and Java on some OSs)
    - **Bison 3.7+** [3.7.5 recommended] (make sure the path to Bison executable is added to the `PATH` environmental variable)
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
3. Build the project (it takes some time and CPU power):
    ```shell
    ./build.sh
    ```
    The testing report is generated in the `./j2eo/build/reports/tests/test/index.html` file.
4. After build process, **j2eo.jar** file will appear in the project root folder (`./j2eo`).
    With this file, is it possible to translate **.java** files to **.eo** files. Run:

    ```shell
    java -jar j2eo.jar <source .java file> -o <output .eo file>
    ```

    to get the translation.  

    For example,
    ```shell
    java -jar j2eo.jar src/test/resources/SimpleTest.java -o output.eo

    # Output may be displayed with 
    cat output.eo
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

## NOT covered Java features list

- Type Erasure  - Zouev
- Subtyping     - discuss with Yegor
- Conversions   - remove
- Casting       - remove
- Modules      
- Exceptions     - remove
- Asserts        - remove
- Throws         - remove
- ``synchronized`` blocks
- ``try``/``catch`` blocks  - remove
- ``yeild`` feature
- Threads and Locks 
- Generics (all kinds of them) - remove
- Native methods 
- break and continue statements - remove
- RTTI (instanceof operator) ??????  - remove

In general, we cover **91 feature of 112** described in the Java language specification.