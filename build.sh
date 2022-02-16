#!/bin/sh

# Fail on non-zero exit codes
set -e

# Tag should be exported from outside

echo "Building and publishing J2EO"

pwd
ls -lha

./gradlew assemble fatJar publish -Dcandidates=false --info -PmvnPublicationVersion=${tag} -Dsigning.secretKeyRingFile=/root/secring.gpg
echo "Publish completed"
