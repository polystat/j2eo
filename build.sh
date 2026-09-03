#!/bin/sh

# SPDX-FileCopyrightText: Copyright (c) 2016-2022 Objectionary.com
# SPDX-License-Identifier: MIT

# Fail on non-zero exit codes
set -e

echo "Building J2EO..."
# don't throw error if a dir doesn't exist
rm -rf build/libs
gradle fatJar -x test
cp build/libs/* ./
echo "Build completed"
