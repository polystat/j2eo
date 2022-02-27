#!/bin/sh

# Fail on non-zero exit codes
set -e

echo "Building J2EO..."
./gradlew fatJar -x test
cp build/libs/J2EO-0.2.0.jar j2eo.jar
echo "Build completed"
