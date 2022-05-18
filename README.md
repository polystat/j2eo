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

## Examples of Java to EOLang translation

We use Java language specification document as a foundation for Java feature hierarchy.  
Java 16 language specification: [see .pdf file](https://docs.oracle.com/javase/specs/jls/se16/jls16.pdf)

<details>
<summary>
<b>--- Ch. 4 - Types, Values, and Variables</b>
</summary>

Table of content:
- [Primitive Types and Values 4.2](#primitive-types-and-values-42) - wip
- [Reference Types and Values 4.3] - wip
- [Type Variables 4.4] - wip
- [Parametrized types 4.5] - wip
- [Type erasure 4.6] - wip
- [Reifiable types 4.7] - wip
- [Raw Types 4.8] - wip
- [Intersection Types 4.9] - wip
- [Subtyping 4.10] - wip

### Primitive Types and Values 4.2
```java
public class IncrementOperator {
   public static void main(String[] args) {
      int a = 5;
      System.out.println(a++);
      System.out.println(++a);
      System.out.println("passed");
   }
}
```
maps to
```java
# main :: String -> void
[this args] > main
  seq > @
    d902830499
    s2040467681
    s341796579
    s825936265
  prim__int.constructor_1 > a
    prim__int.new
  [] > d902830499
    a.write > @
      i_s1754662105
  [] > i_s1754662105
    l403147759 > @
  [] > l403147759
    prim__int.constructor_2 > @
      prim__int.new
      5
  [] > s2040467681
    class__System.out.println > @
      s_r1278677872
  [] > s_r1278677872
    a > @
  [] > s341796579
    class__System.out.println > @
      s_r807657332
  [] > s_r807657332
    a > @
  [] > s825936265
    class__System.out.println > @
      l1164107853
  [] > l1164107853
    class__String.constructor_2 > @
      class__String.new
      "passed"
```
</details>

<details>
<summary>
<b>--- Ch. 5 - Conversions and Contexts</b>
</summary>

Table of content:
- [Assignment Contexts 5.2] - wip
- [Invocation Contexts 5.3] - wip
- [String Contexts 5.4] - wip
- [Casting Contexts 5.5] - wip
- [Numeric Contexts 5.6] - wip
</details>

<details>
<summary>
<b>--- Ch. 6 - Names</b>
</summary>

Table of content:
- [Declarations 6.1] - wip
- [Names and Identifiers 6.2] - wip
- [Scope of a Declaration 6.3] - wip
- [Shadowing and Obscuring 6.4] - wip
</details>

<details>
<summary>
<b>--- Ch. 7 - Packages and Modules [WIP]</b>
</summary>

Table of content:
- [Package Members 7.1] - wip
- [Compilation Units 7.3] - wip
- [Package Declarations 7.4] - wip
- [Import Declarations 7.5] - wip
- [Top Level Class and Interface Declarations 7.6] - wip
- [Module Declarations 7.7] - wip
</details>

<details>
<summary>
<b>--- Ch. 8 - Classes</b>
</summary>

Table of contents:  
- [Class declarations 8.1](#class-declarations-81)
- [Class members 8.2] - wip
- [Field declarations 8.3] - wip
- [Method declarations 8.4](#method-declarations-84)
- [Member class and interface declaration 8.5] - wip
- [Instance initializers 8.6] - wip
- [Static initializers 8.7] - wip
- [Constructor declarations 8.8] - wip
- [Enum classes 8.9] - wip
- [Record classes 8.10] - wip

### Class declarations 8.1
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

### Class members 8.2
### Field declarations 8.3

### Method declarations 8.4
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

### Member class and interface declarations 8.5
### Instance initializers 8.6
### Static initializers 8.7
### Constructor declarations 8.8
### Enum classes 8.9
### Record classes 8.10

</details>

<details>
<summary>
<b>--- Ch. 9 - Interfaces</b>
</summary>

Table of content:
- [Interface Declarations 9.1] - wip
- [Interface Members 9.2] - wip
- [Field (Constant) Declarations 9.3] - wip
- [Method Declarations 9.4] - wip
- [Member Class and Interface Declarations 9.5] - wip
- [Annotation Interfaces 9.6] - wip
- [Annotations 9.7] - wip
- [Functional Interfaces 9.8] - wip
- [Function Types 9.9] - wip
</details>

<details>
<summary>
<b>--- Ch. 10 - Arrays</b>
</summary>

Table of content:
- [Array Types 10.1] - wip
- [Array Variables 10.2] - wip
- [Array Creation 10.3] - wip
- [Array Access 10.4] - wip
- [Array Initializers 10.6] - wip
- [Array Members 10.7] - wip
- [Class Objects for Arrays 10.8] - wip
</details>

<details>
<summary>
<b>--- Ch. 11 - Exceptions [WIP]</b>
</summary>
</details>

<details>
<summary>
<b>--- Ch. 14 - Block Statements, and Patterns</b>
</summary>

Table of content:
- [Blocks 14.2] - wip
- [Local Class and Interface Declarations 14.3] - wip
- [Local Variable Declaration 14.4](#local-variable-declaration-144)
- [Statements 14.5] - wip
- [The Empty Statement 14.6] - wip
- [Labeled Statements 14.7] - wip
- [Expression Statements 14.8] - wip
- [The IF Statement 14.9] - wip
- [The assert Statement 14.10] - wip
- [The switch Statement 14.11] - wip
- [The while Statement 14.12] - wip
- [The do Statement 14.13] - wip
- [The for Statement 14.14] - wip
- [The break Statement 14.15] - wip
- [The continue Statement 14.16] - wip
- [The return Statement 14.17] - wip

### Local Variable Declaration 14.4
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

</details>

<details>
<summary>
<b>--- Ch. 15 - Expressions</b>
</summary>

Table of content:
- [Evaluation order 15.7](#evaluation-order-157)
- [Primary Expressions 15.8](#primary-expressions-158)
- [Instance Creation 15.9](#instance-creation-159)
- [Arrays 15.10](#arrays-1510)
- [Field Access 15.11](#field-access-1511)
- [Method invocations 15.12](#method-invocations-1512)

### Evaluation Order 15.7
```java
public class SimpleLeftHandOperandIsEvaluatedFirst {
    public static void main(String[] args) {
        int i = 2;
        int j = (i=3) * i;
        System.out.println(j);
        System.out.println("passed");
    }
}
```
maps to
```java
...
# main :: String -> void
[this args] > main
  seq > @
    d823723302
    d1051876890
    s25536233
    s164974746
  prim__int.constructor_1 > i
    prim__int.new
  [] > d823723302
    i.write > @
      i_s1714078840
  [] > i_s1714078840
    l1732502545 > @
  [] > l1732502545
    prim__int.constructor_2 > @
      prim__int.new
      2
  prim__int.constructor_1 > j
    prim__int.new
  [] > d1051876890
    j.write > @
      i_s1199262943
  [] > i_s1199262943
    b2009221452 > @
  [] > b2009221452
    p257513673.mul > @
      s_r590845366
  [] > p257513673
    b1052195003 > @
  [] > b1052195003
    s_r1541049864.write > @
      l511707818
  [] > s_r1541049864
    i > @
  [] > l511707818
    prim__int.constructor_2 > @
      prim__int.new
      3
  [] > s_r590845366
    i > @
  [] > s25536233
    class__System.out.println > @
      s_r116405378
  [] > s_r116405378
    j > @
  [] > s164974746
    class__System.out.println > @
      l396283472
  [] > l396283472
    class__String.constructor_2 > @
      class__String.new
      "passed"
...
```

### Primary Expressions 15.8
```java
public class BooleanLiteral {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		System.out.println("passed");
	}
}
```
maps to
```java
...
# main :: String -> void
[this args] > main
  seq > @
    d1819063424
    d690686166
    s1165303897
  prim__boolean.constructor_1 > a
    prim__boolean.new
  [] > d1819063424
    a.write > @
      i_s1011279482
  [] > i_s1011279482
    l208866101 > @
  [] > l208866101
    prim__boolean.constructor_2 > @
      prim__boolean.new
      TRUE
  prim__boolean.constructor_1 > b
    prim__boolean.new
  [] > d690686166
    b.write > @
      i_s576020159
  [] > i_s576020159
    l921420643 > @
  [] > l921420643
    prim__boolean.constructor_2 > @
      prim__boolean.new
      FALSE
  [] > s1165303897
    class__System.out.println > @
      l887750041
  [] > l887750041
    class__String.constructor_2 > @
      class__String.new
      "passed"
...
```
<br />

```java
public class ComplexParenthExpression {
	public static void main(String[] args) {
		int a = (10 + ((((5 * (2 + (2)))))));
		System.out.println(a);
		System.out.println("passed");
	}
}
```
maps to
```java
...
# main :: String -> void
[this args] > main
  seq > @
    d1365008457
    s678433396
    s928294079
  prim__int.constructor_1 > a
    prim__int.new
  [] > d1365008457
    a.write > @
      i_s1671179293
  [] > i_s1671179293
    p1609124502 > @
  [] > p1609124502
    b1144068272 > @
  [] > b1144068272
    l1985836631.add > @
      p1948471365
  [] > l1985836631
    prim__int.constructor_2 > @
      prim__int.new
      10
  [] > p1948471365
    p1636506029 > @
  [] > p1636506029
    p758348212 > @
  [] > p758348212
    p817978763 > @
  [] > p817978763
    b1578009262 > @
  [] > b1578009262
    l1735507635.mul > @
      p1362728240
  [] > l1735507635
    prim__int.constructor_2 > @
      prim__int.new
      5
  [] > p1362728240
    b1798219673 > @
  [] > b1798219673
    l1092572064.add > @
      p728885526
  [] > l1092572064
    prim__int.constructor_2 > @
      prim__int.new
      2
  [] > p728885526
    l922511709 > @
  [] > l922511709
    prim__int.constructor_2 > @
      prim__int.new
      2
  [] > s678433396
    class__System.out.println > @
      s_r331994761
  [] > s_r331994761
    a > @
  [] > s928294079
    class__System.out.println > @
      l1647809929
  [] > l1647809929
    class__String.constructor_2 > @
      class__String.new
      "passed"
...
```

### Instance Creation 15.9
```java
public class Main {
   public static void main(String[] args) {
      new SomeClass(param1, "string", new Object());
   }
}
class SomeClass { ... }
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

### Arrays 15.10
```java
public class SimpleIntegerArray {
	public static void main(String[] args) {
		int[] array = new int[5];
		System.out.println("passed");
	}
}
```
maps to
```java
...
# main :: String -> void
[this args] > main
  seq > @
    d775081157
    s693958407
  prim__int.constructor_1 > array
    prim__int.new
  [] > d775081157
    array.write > @
      i_s1955021259
  [] > i_s1955021259
    arr1044705957 > @
  array > temp_placeholder
  [] > s693958407
    class__System.out.println > @
      l288379405
  [] > l288379405
    class__String.constructor_2 > @
      class__String.new
      "passed"
...
```
<br />

### Field Access 15.11
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

### Method invocations 15.12
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

</details>

<details>
<summary>
<b>--- Ch. 16 - Definite Assignments [WIP]</b>
</summary>
</details>

<details>
<summary>
<b>--- Ch. 17 - Threads and Locks [EO support?]</b>
</summary>
</details>

<details>
<summary>
<b>--- Ch. 18 - Type inference [WIP]</b>
</summary>
</details>
