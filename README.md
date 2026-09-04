# J2EO: Java to EO Translator

[![gradle](https://github.com/polystat/j2eo/actions/workflows/gradle.yml/badge.svg)](https://github.com/polystat/j2eo/actions/workflows/gradle.yml)
[![codecov](https://codecov.io/gh/polystat/j2eo/branch/master/graph/badge.svg?token=M84CXKO5XB)](https://codecov.io/gh/polystat/j2eo)
[![Hits-of-Code](https://hitsofcode.com/github/polystat/j2eo)](https://hitsofcode.com/view/github/polystat/j2eo)
![Lines of code](https://img.shields.io/tokei/lines/github/polystat/j2eo)

This is a translator of **Java** programming language
  to [EOLANG](https://www.eolang.org) programming language.

## Install

The easiest way is to use the
  [yegor256/j2eo](https://hub.docker.com/r/yegor256/j2eo) image
  for [Docker](https://docs.docker.com/get-docker/):

```shell
docker run -v $(pwd):/eo yegor256/j2eo hello.java --target output
```

Alternatively, download `j2eo.jar` from the
  [releases](https://github.com/polystat/j2eo/releases) page
  and run it with **Java 11+**:

```shell
java -jar j2eo.jar <input> -o <output directory>
```

Here, `<input>` is either a single `.java` file or a directory
  with Java sources.

## How to Contribute

You will need **Java 11+**, **Gradle 7.4+**, **Maven 3.8+**,
  and **ANTLR4 4.13.2**.
See [ACCEPTANCE.md](ACCEPTANCE.md) for instructions on installing them.

Fork the repository, make your changes, and then build and test everything:

```shell
git clone git@github.com:polystat/j2eo.git
cd j2eo
./build.sh
gradle test
```

Make sure the build is clean and then submit a pull request.

If the build fails, make sure `which java`, `which javac`,
  and `echo $JAVA_HOME` all mention the same `jdk` directory.
Use [alternatives](https://stackoverflow.com/a/47432365)
  to fix a mismatch, and see how
  to [set `$JAVA_HOME`](https://stackoverflow.com/a/18972665)
  in case it points to a wrong place.
