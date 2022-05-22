#!/usr/bin/env bash

# Exit on error
set -e

echo "Building J2EO..."
./gradlew build -x test jar
cp build/libs/J2EO-0.4.0.jar .

if [ ! -e "./j2eo-data/hadoop-3.2.3-src" ]; then
  echo "Downloading Hadoop..."
  # get hadoop from https://www.apache.org/dyn/closer.cgi/hadoop/common/hadoop-3.2.3/hadoop-3.2.3-src.tar.gz
  mkdir -p j2eo-data
  wget -O j2eo-data/hadoop.tar.gz https://dlcdn.apache.org/hadoop/common/hadoop-3.2.3/hadoop-3.2.3-src.tar.gz
  # unpack
  tar -xf j2eo-data/hadoop.tar.gz -C j2eo-data
else
  echo "Hadoop is already downloaded, skipping download..."
fi

echo "Starting J2EO on Hadoop..."
# clean old output
rm -rf j2eo-data/hadoop-eo

java -jar J2EO-0.4.0.jar -o j2eo-data/hadoop-eo j2eo-data/hadoop-3.2.3-src
