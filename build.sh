#!/bin/sh

# Fail on non-zero exit codes
set -e

echo "Building J2EO..."
# don't throw error if a dir doesn't exist
rm -rf build/libs
gradle fatJar -x test
cp build/libs/* ./
echo "Build completed"
