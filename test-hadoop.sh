#!/usr/bin/env bash

# Exit on error
set -e

echo "Building J2EO..."
./gradlew build -x test jar
cp build/libs/J2EO-0.4.0.jar .

echo "Cloning Hadoop..."
git clone https://github.com/apache/hadoop || true
cd hadoop || exit
echo "Checking out tested revision..."
git checkout ec0ff1dc04b2ced199d71543a8260e9225d9e014
cd ..

echo "Starting J2EO on Hadoop..."
java -jar J2EO-0.4.0.jar -o output_hadoop hadoop
