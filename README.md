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

---

## Examples of Java to EOLang translation

We use Java language specification document as a foundation for Java feature hierarchy.  
Java 16 language specification: [see .pdf file](https://docs.oracle.com/javase/specs/jls/se16/jls16.pdf)

###[Ch. 4 - Types, Values, and Variables](src/test/resources/test_ready/ch_4_types_values_variables)  
- Increment operator:
	[Java](src/test/resources/test_ready/ch_4_types_values_variables/sec_4_2_primitive_types_and_values/sec_4_2_2_integer_operations/IncrementOperator.java)
	to
	[EO](src/test/resources/translated_tests/ch_4_types_values_variables/sec_4_2_primitive_types_and_values/sec_4_2_2_integer_operations/IncrementOperator.eo)

###[Ch. 5 - Conversions and Contexts](src/test/resources/test_ready/ch_5_conversions_and_contexts)

###[Ch. 6 - Names](src/test/resources/test_ready/ch_6_names)
- A simple declaration:
	[Java](src/test/resources/test_ready/ch_6_names/sec_6_1_declarations/SimpleDeclaration.java)
	to
	[EO](src/test/resources/translated_tests/ch_6_names/sec_6_1_declarations/SimpleDeclaration.eo)

###[Ch. 7 - Packages and Modules WIP](src/test/resources/test_ready/ch_7_packages_and_modules)

###[Ch. 8 - Classes](src/test/resources/test_ready/ch_8_classes)
- Method class member:
	[Java](src/test/resources/test_ready/ch_8_classes/sec_8_2_class_members/MethodClassMember.java)
	to
	[EO](src/test/resources/translated_tests/ch_8_classes/sec_8_2_class_members/MethodClassMember.eo)
- Field initialization:
	[Java](src/test/resources/test_ready/ch_8_classes/sec_8_3_field_declarations/sec_8_3_2_field_initialization/SimpleFieldInit.java)
	to
	[EO](src/test/resources/translated_tests/ch_8_classes/sec_8_3_field_declarations/sec_8_3_2_field_initialization/SimpleFieldInit.eo)
- Method declaration:
	[Java](src/test/resources/test_ready/ch_8_classes/sec_8_4_method_declarations/sec_8_4_1_formal_parametes/SimpleMethod.java)
	to
	[EO](src/test/resources/translated_tests/ch_8_classes/sec_8_4_method_declarations/sec_8_4_1_formal_parametes/SimpleMethod.eo)
- Inner class:
	[Java](src/test/resources/test_ready/ch_8_classes/sec_8_5_member_class_and_interface_declarations/SimpleInnerClass.java)
	to
	[EO](src/test/resources/translated_tests/ch_8_classes/sec_8_5_member_class_and_interface_declarations/SimpleInnerClass.eo)

###[Ch. 9 - Interfaces](src/test/resources/test_ready/ch_9_interfaces)

###[Ch. 10 - Arrays](src/test/resources/test_ready/ch_10_arrays)
- Primitive array declaration:
    [Java](src/test/resources/test_ready/ch_10_arrays/sec_10_2_array_variables/PrimitiveArrayDecl.java)
    to
    [EO](src/test/resources/translated_tests/ch_10_arrays/sec_10_2_array_variables/PrimitiveArrayDecl.eo)

###[Ch. 11 - Exceptions WIP](src/test/resources/test_ready/ch_11_exceptions)

###[Ch. 14 - Block Statements, and Patterns](src/test/resources/test_ready/ch_14_blocks_statements_and_patterns)

###[Ch. 15 - Expressions](src/test/resources/test_ready/ch_15_expressions)
- Left-hand operands are evaluated first: 
    [Java](src/test/resources/test_ready/ch_15_expressions/sec_15_7_evaluation_order/sec_15_7_1_evaluate_left_hand_operand_first/SimpleLeftHandOperandIsEvaluatedFirst.java)
    to
    [EO](src/test/resources/translated_tests/ch_15_expressions/sec_15_7_evaluation_order/sec_15_7_1_evaluate_left_hand_operand_first/SimpleLeftHandOperandIsEvaluatedFirst.eo)
- Integer literal:
    [Java](src/test/resources/test_ready/ch_15_expressions/sec_15_8_primary_expressions/sec_15_8_1_lexical_literals/IntegerLiteral.java)
    to
    [EO](src/test/resources/translated_tests/ch_15_expressions/sec_15_8_primary_expressions/sec_15_8_1_lexical_literals/IntegerLiteral.eo)
- Complex parenthesized expression:
    [Java](src/test/resources/test_ready/ch_15_expressions/sec_15_8_primary_expressions/sec_15_8_5_parenthesized_expressions/ComplexParenthExpression.java)
    to
    [EO](src/test/resources/translated_tests/ch_15_expressions/sec_15_8_primary_expressions/sec_15_8_5_parenthesized_expressions/ComplexParenthExpression.eo)
- Creation of a simple integer array:
    [Java](src/test/resources/test_ready/ch_15_expressions/sec_15_10_array_creation_and_access_expressions/sec_15_10_1_array_creation_expressions/SimpleIntegerArray.java)
    to
    [EO](src/test/resources/translated_tests/ch_15_expressions/sec_15_10_array_creation_and_access_expressions/sec_15_10_1_array_creation_expressions/SimpleIntegerArray.eo)
- Postfix increment:
    [Java](src/test/resources/test_ready/ch_15_expressions/sec_15_14_postfix_expressions/sec_15_14_2_postfix_increment_operator/SimplePostfixIncrement.java)
    to
    [EO](src/test/resources/translated_tests/ch_15_expressions/sec_15_14_postfix_expressions/sec_15_14_2_postfix_increment_operator/SimplePostfixIncrement.eo)
- Unary plus operator:
    [Java](src/test/resources/test_ready/ch_15_expressions/sec_15_15_unary_operators/sec_15_15_3_unary_plus_operator/SimpleUnaryPlus.java)
    to
    [EO](src/test/resources/translated_tests/ch_15_expressions/sec_15_15_unary_operators/sec_15_15_3_unary_plus_operator/SimpleUnaryPlus.eo)
- Multiplication operator:
    [Java](src/test/resources/test_ready/ch_15_expressions/sec_15_17_multiplicative_operators/sec_15_17_1_multiplication_operator/SimpleMultiplication.java)
    to
    [EO](src/test/resources/translated_tests/ch_15_expressions/sec_15_17_multiplicative_operators/sec_15_17_1_multiplication_operator/SimpleMultiplication.eo)
- Variable right shift:
    [Java](src/test/resources/test_ready/ch_15_expressions/sec_15_19_shift_operators/VariableRightShift.java)
    to
    [EO](src/test/resources/translated_tests/ch_15_expressions/sec_15_19_shift_operators/VariableRightShift.eo)
- Greater operator:
    [Java](src/test/resources/test_ready/ch_15_expressions/sec_15_20_relational_operators/sec_15_20_1_numerical_comparison_operators/SimpleGreaterComparison.java)
    to
    [EO](src/test/resources/translated_tests/ch_15_expressions/sec_15_20_relational_operators/sec_15_20_1_numerical_comparison_operators/SimpleGreaterComparison.eo)
- Assignment operator:
    [Java](src/test/resources/test_ready/ch_15_expressions/sec_15_26_assignment_operators/sec_15_26_1_simple_assignment_operator/SimpleAssignmentOperator.java)
    to
    [EO](src/test/resources/translated_tests/ch_15_expressions/sec_15_26_assignment_operators/sec_15_26_1_simple_assignment_operator/SimpleAssignmentOperator.eo)

###[Ch. 16 - Definite Assignments WIP](src/test/resources/test_ready/ch_16_definite_assignment)

###[Ch. 18 - Type inference WIP](src/test/resources/test_ready/ch_18_type_inference)

---

## Examples of translation projections

Bellow there are all designed mappings at the current moment. If you didn't find a construction in the list bellow it is probably unsupported.

### 4 Types, Values, and Variables

----

#### 4.2 Primitive Types and Values

Any primitives types are supported. For handling them we use a [primitives](src/main/resources/stdlib/primitives) package. It provides `memory` wrappers for any primitive types. 

Wrappers are more convenient way to simulate primitives types. For, example `memory.write` returns `bool` object instead itself, so for handling `=` operator we should do something like this:
```
[a b] > write
  seq > @
    a.write b
    a
```
It is more complex than just `a.write b`, where `a` and `b` are wrappers. Moreover, pure `memory` does not support in-place operations and conversions. 
Therefore, we decided to generate more beautiful EO code and use wrappers instead generation of unreadable code with pure 'memory'.

#### 4.2.2 Integer Operations
The Java programming language provides a number of operators that act on integral
values. Supported ones:
* The comparison operators, which result in a value of type boolean:
  - The numerical comparison operators <, <=, >, and >=
  - The numerical equality operators == and !=
* The unary plus and minus operators + and - 
* The multiplicative operators *, /, and %
* The additive operators + and - 
* The increment operator ++, both prefix and postfix
* The decrement operator --, both prefix and postfix
* The signed and unsigned shift operators <<, >>, and >>>
* The cast operator, which can convert from an integral value to a value
of any specified numeric type

Common translation scheme:
```Java
expr_1 op expr_2 
```
-->
```
[] > binary
  expr_1.translated_op > @
    expr_2
```

Unary case:
```Java
expr op
// OR
op expr
```
-->
```
[] > unary
  expr.translated_op > @
```

Cast case:
```Java
(primitive_type) expr
```
-->
```
[] > cast
  translated_primitive_type.from expr
```

#### 4.2.3 Floating-Point Types, Formats, and Values

Currently, there is only runtime support for `double`. Nevertheless, translator can handle `float` well, but output EO code would not be equivalent to initial one during runtime.

#### 4.2.4 Floating-Point Operations
The Java programming language provides a number of operators that act on
floating-point values. Supported operators:
* The comparison operators, which result in a value of type boolean:
    - The numerical comparison operators <, <=, >, and >=
    - The numerical equality operators == and !=
* The numerical operators, which result in a value of type float or double:
    - The unary plus and minus operators + and -
    - The multiplicative operators *, /, and %
* The additive operators + and -
* The increment operator ++, both prefix and postfix
* The decrement operator --, both prefix and postfix
* The cast operator, which can convert from a floating-point value to a
  value of any specified numeric type

Scheme of translation is the same as in [4.2.2](#4.2.2-integer-operations)

#### 4.3 Reference Types and Values

Currently, only classes as reference types are supported. Identifier of class is prepended with `class__` during translation.

#### 4.4 Type Variables

Type variables are omitted due to lack of types in EO.

#### 4.5 Parameterized Types

The same situation as [4.4](#4.4-type-variables) 

#### 4.6 Type Erasure 

The same situation as [4.4](#4.4-type-variables)

#### 4.9 Intersection Types

The same situation as [4.4](#4.4-type-variables)

#### 4.12.1 Variables of Primitive Type

Any primitive type variable is being stored on special handwritten objects (`primitives`). For example, `int` value will be stored in `prim__int` object, `long` in `prim__long` and so on.

Example:
```Java
float a;
```
-->
```
prim__float.constructor_1 > a
  prim__float.new
```

#### 4.12.2 Variables of Reference Type

Any reference type variable is being stored on `cage`. 

Example:
```Java
Ref a;
```
-->
```
cage > a
```

### 5 Conversions and Contexts

---

#### 5.1.1 Identity Conversion

This conversion is omitted by the translator. E.g., `(ClassA) class_a_instance` is `class_a_instance` in the translator perspective.

#### 5.1.2 Widening Primitive Conversion

19 specific conversions on primitive types are called the widening primitive
conversions:
* `byte` to `short`, `int`, `long`, `float` or `double`
* `short` to `int`, `long`, `float` or `double`
* `char` to `int`, `long`, `float` or `double`
* `int` to `long`, `float` or `double`
* `long` to `float` or `double`
* `float` to `double` (runtime support is not precise)

All of them has runtime support.

Example:
```Java
(primitive_type) expr
```
-->
```
[] > cast
  translated_type.from > @
    expr
```

`translated_type` is obtained according to [4.12.1](#4.12.1-Variables of Primitive Type)

#### 5.1.3 Narrowing Primitive Conversion
22 specific conversions on primitive types are called the narrowing primitive
conversions:
* `short` to `byte` or `char`
* `char` to `byte` or `short`
* `int` to `byte`, `short` or `char`
* `long` to `byte`, `short`, `char` or `int`
* `float` to `byte`, `short`, `char`, `int` or `long`
* `double` to `byte`, `short`, `char`, `int`, `long` or `float` (runtime support is not precise)

All of them has runtime support.

Translation scheme is the same as [5.1.2](#5.1.2-widening-primitive-conversion)

#### 5.1.5 Widening Reference Conversion / 5.1.6 Narrowing Reference Conversion

The same situation as [4.4](#4.4-type-variables)

#### 5.1.11 String Conversion

Currently, there is no support for this type of conversion. User should manually resolve them. For example:
```Java
"1" + 1
```
it should be manually rewritten to:
```Java
"1" + String.valueOf(1)
```
In this case the translator would convert it to:
```
[] > binary_1
  literal_1.add > @
    methodInvocation_1
[] > literal_1
  class__String.constructor_2
    class__String.new
    "1"
[] > methodInvocation_1
  class__String.valueOf > @
    literal_2
[] > literal_2
  prim__int.constructor_2
    prim__int.new
    1 
```

### 6 Names

---
#### 6.1 Declarations
A declaration introduces an entity into a program and includes an identifier. Supported declared entity is one of the following:

* An imported class or interface, declared in a single-type-import declaration or a
type-import-on-demand declaration
* An imported static member, declared in a single-static-import declaration or a
static-import-on-demand declaration
* A class, declared by a normal class declaration
* A member of a reference type, one of the following:
  - A member class
  - A field, one of the following:
    - A field declared in a class
    - The field length, which is implicitly a member of every array type
  - A method, one of the following:
    - A method (abstract or otherwise) declared in a class
* A formal parameter, one of the following:
  - A formal parameter of a method of a class
  - A formal parameter of a constructor of a class
* A local variable, one of the following:
  - A local variable declared by a local variable declaration statement in a block
* A local class, one of the following:
  - A local class declared by a normal class declaration

Any declaration is translated into EO object or EO copy of specific object. Example:

```Java
class A { body }
```
->
```
[] > class__A
  ...
  body
  ...
```
Or,
```Java
int a;
```
-->
```
prim__int.constructor_1 > a
  prim__int.new
```

#### 6.2 Names and Identifiers
A name is used to refer to an entity declared in a program.

A *simple name* is a single identifier. Each simple identifier preserves name except classes. Their names are prepended with `class__`. There is no name mangling for variables.

A *qualified name* consists of a name, a "." token, and an identifier. Qualified names are separated to several objects during translation. Example: 
```Java
a.b.c;
```
-->
```
[] > fieldAcces_1
  fieldAcess_2.c > @
[] > fieldAcces_2
  simpleRefence_1.b > @
[] > simpleRefence_1
  a
```

Of course, it can be optimized to just one EO object, but at this moment translator does not perform such optimization for keeping translation of dot-separated entities more general.

#### 6.4 Shadowing and Obscuring

For now there is now handling of shadowing and obscuring.

#### 6.6 Access Control

EO does not support access modifiers. All objects in an EO is public by default. Therefore, during translation such information is being lost.

### 8 Classes

---

#### 8.1.1 Class Modifiers

Any modifiers except `static` are being omitted during translation. `static` is needed to distinguish a inner class from nested one. 

#### 8.3 Field Declarations

Currently, only non-`static` fields are supported. 

### 14 Blocks, Statements, and Patterns

---

#### 14.2 Blocks

By Java grammar, blocks are sequence of declarations and statements separated by curly braces. Translator creates new EO object for each block. Example: 

```Java
{
    declaration;
    statement;
}
``` 
-->
```
[] > block_1
  seq > @
    declaration_1
    statement_1
```
Number after object name is needed just for avoiding name collisions. `declaration_1` and `statement_1` are EO objects. They describe internal structure of itself. Inside a `seq` object they are just dataizing. 

Now let's look to real Java code:
```Java
void foo() {
    int a = 1;
    println(a);
}
```
->
```
1  [this] > foo
2    seq > @
3      variableDeclaration_1
4      statementExpression_1
5    prim__int.constructor_1 > a
6      prim__int.new
7    [] > variableDeclaration_1
8      a.write > @
9        initializerSimple_1
10   [] > initializerSimple_1
11     literal_1 > @
12   [] > literal_1
13     prim__int.constructor_2 > @
14       prim__int.new
15       1
16   [] > statementExpression_1
17     this.println > @
18       this
19       simpleReference_1
20   [] > simpleReference_1
21     a > @
```

Any variables in blocks are declared separately from the `seq` object. In this case `int a` was declared at lines 5-6. Also it has an initializer `1`. So translator assign `a` to initializer value at lines 7-9. This initializer is simple one. It is a just literal. Translator mentioned it on lines 10-11. Literals are translated to EO objects itself (lines 12-15). 

Any statement in blocks are statement expression by default. Their behaviour as a declarations are described separately. In this case statement `println(a)` is declared on lines 16-19. By default, any method is considered as class method. So access to it is performed via `this` (line 17). Moreover, it is necessary to pass `this` as argument during method invocation (line 18). `println(a)` is call with single argument `a`. It is a simple reference that was mentioned at line 19. Simple reference is itself a distinct object which translator declared on lines 20-21.   

### 15 Expressions

---

#### 15.8.1 Lexical Literals

Now supported only integer, floating point and string literals:

`1` -> 
```
[] > literal_1
  prim__int.constructor_2 > @
    prim__int.new
    1
```

`1.0` ->
```
[] > literal_1
  prim__float.constructor_2 > @
    prim__float.new
    1.0
```

`"string"` ->
```
[] > literal_1
  class__String.constructor_2 > @
    class__String.new
    "string"
```

#### 15.8.3 this

It's remaining unchanged.

#### 15.8.5 Parenthesized Expressions

`(expresion)` -> 
```
[] > parenthesized_1
  expresion > @
```

#### 15.9 Class Instance Creation Expression

`new A(arg)` ->
```
[] > statementExpression_1
  class__A.constructor > @
    class__A.new
    simpleReference_1
[] > simpleReference_1
  arg > @
```

#### 15.10.1 Array Creation Expressions

`int[] array = {1}` ->
```
[] > variableDeclaration_1
  array.write > @
    initializerArray_1
[] > initializerArray_1
  * > @
    initializerSimple_1
[] > initializerSimple_1
  literal_1 > @
[] > literal_1
  prim__int.constructor_2 > @
    prim__int.new
    1
```

#### 15.10.3 Array Access Expressions

`array[idx]` ->
```
[] > statementExpression_1
  simpleReference_1.get > @
    simpleReference_2.v
[] > simpleReference_1
  array > @
[] > simpleReference_2
  idx > @
```

#### 15.11 Field Access Expressions

`a.b` ->
```
[] > statementExpression_1
  simpleReference_1.b > @
[] > simpleReference_1
  a > @
```

#### 15.11.2 Accessing Superclass Members using `super`

`a.super.b` ->
```
[] > statementExpression_1
  simpleReference_1.super.b > @
[] > simpleReference_1
  a > @
```

#### 15.12 Method Invocation Expressions

`a.b(arg)` ->
```
[] > statementExpression_1
  a.b > @
    a
    simpleReference_2
[] > simpleReference_2
  arg > @
```

#### 15.14.2 Postfix Increment Operator `++`

`expr++` ->
```
[] > statementExpression_1
  simpleReference_1.inc_post > @
[] > simpleReference_1
  expr > @
```

#### 15.14.3 Postfix Decrement Operator `--`

`expr--` ->
```
[] > statementExpression_1
  simpleReference_1.dec_post > @
[] > simpleReference_1
  expr > @
```

#### 15.15.1 Prefix Increment Operator `++`

`++expr` ->
```
[] > statementExpression_1
  simpleReference_1.inc_pre > @
[] > simpleReference_1
  expr > @
```

#### 15.15.2 Prefix Decrement Operator `--`

`--expr` ->
```
[] > statementExpression_1
  simpleReference_1.dec_pre > @
[] > simpleReference_1
  expr > @
```

#### 15.15.3 Unary Plus Operator `+`

`+expr` -> 
```
[] > statementExpression_1
  simpleReference_1 > @
[] > simpleReference_1
  expr > @
```

#### 15.15.4 Unary Minus Operator `-`

`-expr` ->
```
[] > statementExpression_1
  simpleReference_1.neg > @
[] > simpleReference_1
  expr > @
```

#### 15.16 Cast Expressions

Only cast to integer is supported

`(int) 1.0` ->
```
[] > statementExpression_1
  prim__int.from > @
    literal_1
[] > literal_1
  prim__float.constructor_2 > @
    prim__float.new
    1.0
```

#### 15.17-26 Binary Operators

`left operand right` ->
```
[] > statementExpression_1
  simpleReference_1.t_operand > @
    simpleReference_2
[] > simpleReference_1
  left > @
[] > simpleReference_2
  right > @
```

`t_opernad` is translated `operand`
