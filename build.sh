#!/bin/sh

# Tag should be exported from outside

./gradlew build publish -Dcandidates=false --info -PmvnPublicationVersion=${tag}
