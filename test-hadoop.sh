#!/usr/bin/env bash

# Exit on error
set -e

echo "Building J2EO..."
./gradlew build -x test jar
cp build/libs/J2EO-0.4.0.jar .

echo "Downloading Hadoop..."
# get hadoop from https://www.apache.org/dyn/closer.cgi/hadoop/common/hadoop-3.2.3/hadoop-3.2.3-src.tar.gz
wget -O ../hadoop.tar.gz https://dlcdn.apache.org/hadoop/common/hadoop-3.2.3/hadoop-3.2.3-src.tar.gz
# unpack
tar -xf ../hadoop.tar.gz -C ../

echo "Starting J2EO on Hadoop..."
# clean old output
rm -rf ../output_hadoop

# as it's not a part of the project
# we may want to output to the parent directory
java -jar J2EO-0.4.0.jar -o ../output_hadoop ../hadoop-3.2.3-src
