#!/bin/sh

# Fail on non-zero exit codes
set -e

# Tag should be exported from outside

echo "Building and publishing J2EO"
./gradlew build fatJar publish -Dcandidates=false --info -PmvnPublicationVersion=${tag}
echo "Publish completed"
