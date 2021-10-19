#/bin/sh

./gradlew fatJar
cp build/libs/* j2eo.jar
