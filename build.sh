#/bin/sh

./gradlew fatJar test
cp build/libs/* j2eo.jar
