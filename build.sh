#!/bin/sh

# Fail on non-zero exit codes
set -e

echo "Building J2EO..."
rm -r build/libs
./gradlew fatJar -x test
cp build/libs/* ./
echo "Build completed"
