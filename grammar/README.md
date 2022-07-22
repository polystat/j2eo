# J2EO Java Parser Grammar

This directory contains the modified version of [ANTLR community Java parser](https://github.com/antlr/grammars-v4/tree/master/java/java).

It supports Java 17.

## What was changed

- @header blocks were added in accordance with J2EO source code structure.
- Scopes were named where needed for the project.

## What is needed to migrate J2EO to the new Java version?

The answer depends on the features introduced in newer versions. Generally, updating lexer and parser is required. Also, `TreeMappings.kt` should be updated to include introduced parser changes. If newer features should be translated to EO, translator should be updated as well (no certain information here).

This surely requires a code modification by a person familliar with ANTLR and Kotlin, as well as understanding of Java and EO.
