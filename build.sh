#/bin/sh

./gradlew fatJar test -Dcandidates=false
cp build/libs/* j2eo.jar
