#!/bin/sh

./gradlew fatJar test -Dcandidates=false --info
cp build/libs/* j2eo.jar
