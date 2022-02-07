#!/bin/sh

./gradlew build fatJar test -Dcandidates=false --info
cp build/libs/* j2eo.jar
