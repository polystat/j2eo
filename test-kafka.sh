#!/usr/bin/env bash

# Exit on error
set -e

echo "Building J2EO..."
./gradlew build -x test jar
cp build/libs/J2EO-0.6.0.jar .

if [ ! -e "./j2eo-data/kafka" ]; then
  echo "Downloading Kafka..."
  mkdir -p j2eo-data
  cd j2eo-data
  git clone https://github.com/apache/kafka
  cd kafka
  git checkout f36de0744b915335de6b636e6bd6b5f1276f34f6
  cd ../..
else
  echo "Kafka is already downloaded, skipping download..."
fi

echo "Starting J2EO on Kafka..."
# clean old output
rm -rf j2eo-data/kafka-eo

java -jar J2EO-0.6.0.jar -o j2eo-data/kafka-eo j2eo-data/kafka
