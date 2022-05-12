# J2EO: Java to EO Translator

<img src="https://www.yegor256.com/images/books/elegant-objects/cactus.svg" height="100px"  alt="eolang icon"/>

<br>

[![Gradle Build](https://github.com/polystat/j2eo/actions/workflows/gradle-build.yml/badge.svg)](https://github.com/polystat/j2eo/actions/workflows/gradle-build.yml)
![LINE](https://img.shields.io/badge/line--coverage-41,67%25-orange.svg)
![BRANCH](https://img.shields.io/badge/branch--coverage-33,81%25-red.svg)
![COMPLEXITY](https://img.shields.io/badge/complexity-5,17-brightgreen.svg)

This is a translator of **Java** programming language to [EOLANG](https://www.eolang.org) programming language.

---

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

## Principles of Java to EOLang translation
### Implemented:
- [Class declarations](#class-declarations)
- [Method declarations](#method-declarations)
- [Method invocations](#method-invocations)
- [Local variable declarations](#local-variable-declarations)
- [Field access (via dot-notation)](#field-access)
- [Expressions](#expressions)
- [Instance creation](#instance-creation)

<br />

#### Class declarations
```java
public class Main { }
```
translates to
```java
+alias stdlib.lang.class__Object

[] > class__Main
  class__Object > super
  super > @
  [] > new
    [] > this
      class__Object.new > super
      super > @
    seq > @
      this
```
<br />

#### Method declarations
```java
public class Main {
   public static void main(String[] args) { }
}
```
translates to  
```java
...
# main :: String -> void
[this args] > main 
  seq > @
    0
...
```
<br />

#### Method invocations
```java
public class Main {
   public static void main(String[] args) {
      method(1.0f, new Object());
   }
   int method (float a, Object b) {
      return a;
   }
}
```
translates to
```java
+alias stdlib.primitives.prim__float
+alias prim__int
+alias stdlib.lang.class__Object

[] > class__Main
  class__Object > super
  super > @
  [] > new
    [] > this
      class__Object.new > super
      super > @
      # main :: String -> void
      [this args] > main
        seq > @
          s206835546
        [] > s206835546
          method > @
            l758013696
            inst1473611564
        [] > l758013696
          prim__float.constructor_2 > @
            prim__float.new
            1.0
        [] > inst1473611564
          Object.constructor > @
            Object.new
      # method :: float -> Object -> int
      [this a b] > method
        seq > @
          s558187323
        [] > s558187323
          s_r680576081 > @
        [] > s_r680576081
          a > @
    seq > @
      this
```
<br />

#### Local variable declarations
```java
public class Main { 
   public static void main(String[] args) {
      int local = 5;
    }
}
```
translates to
```java
...
# main :: String -> void
[this args] > main
  seq > @
    d912011468
  prim__int.constructor_1 > local
    prim__int.new
  [] > d912011468
    local.write > @
      i_s1048027629
  [] > i_s1048027629
    l599491651 > @
  [] > l599491651
    prim__int.constructor_2 > @
      prim__int.new
      5
...
```
<br />

#### Field access
```java
public class Main { 
   public static void main(String[] args) {
      new SomeClass().localVar.otherVar;
   }
}
```
translates to
```java
...
# main :: String -> void
[this args] > main
  seq > @
    s756185697
  [] > s756185697
    f_a1308109015.otherVar > @
  [] > f_a1308109015
    inst300031246.localVar > @
  [] > inst300031246
    SomeClass.constructor > @
      SomeClass.new
...
```
<br />

#### Expressions
```java
public class Main { 
   public static void main(String[] args) {
      int a = 1;
      int expr = 1 + 2.0f * 3 - (--a) / 3.0;
   }
}
```
translates to
```java
...
# main :: String -> void
[this args] > main
  seq > @
    d148912029
    d604125138
  prim__int.constructor_1 > a
    prim__int.new
  [] > d148912029
    a.write > @
      i_s521960438
  [] > i_s521960438
    l726950788 > @
  [] > l726950788
    prim__int.constructor_2 > @
      prim__int.new
      1
  prim__int.constructor_1 > expr
    prim__int.new
  [] > d604125138
    expr.write > @
      i_s631659383
  [] > i_s631659383
    b720167805 > @
  [] > b720167805
    b1466073198.sub > @
      b398690014
  [] > b1466073198
    l1526298704.add > @
      b1593180232
  [] > l1526298704
    prim__int.constructor_2 > @
      prim__int.new
      1
  [] > b1593180232
    l492079624.mul > @
      l380242442
  [] > l492079624
    prim__float.constructor_2 > @
      prim__float.new
      2.0
  [] > l380242442
    prim__int.constructor_2 > @
      prim__int.new
      3
  [] > b398690014
    p1077199500.div > @
      l240166646
  [] > p1077199500
    s_r351028485 > @
  [] > s_r351028485
    a > @
  [] > l240166646
    prim__float.constructor_2 > @
      prim__float.new
      3.0
...
```
<br />

#### Instance creation
```java
public class Main { 
   public static void main(String[] args) {
      new SomeClass(param1, "string", new Object());
   }
}
```
translates to
```java
...
# main :: String -> void
[this args] > main
  seq > @
    s599491651
  [] > s599491651
    class__SomeClass.constructor > @
      class__SomeClass.new
      s_r1161667116
      l1898220577
      inst1143371233
  [] > s_r1161667116
    param1 > @
  [] > l1898220577
    class__String.constructor_2 > @
      class__String.new
      "string"
  [] > inst1143371233
    class__Object.constructor > @
      class__Object.new
...
```
<br />


