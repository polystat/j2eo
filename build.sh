#!/bin/sh

# Fail on non-zero exit codes
set -e

echo "Building J2EO..."
./gradlew fatJar -x test
cp build/libs/* ./
echo "Build completed"
