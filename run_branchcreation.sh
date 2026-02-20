#!/bin/bash

# Default values
REFACTOR_TYPE="Nothing"
START_I=1
END_I=16
BRANCH_PREFIX=""

# Parse arguments (positional: type start end repo)
if [ $# -ge 1 ]; then REFACTOR_TYPE="$1"; fi
if [ $# -ge 2 ]; then START_I="$2"; fi
if [ $# -ge 3 ]; then END_I="$3"; fi
if [ $# -ge 4 ]; then BRANCH_PREFIX="$4/"; fi

# Validate numbers
if ! [[ "$START_I" =~ ^[0-9]+$ ]] || ! [[ "$END_I" =~ ^[0-9]+$ ]]; then
  echo "Error: start ($START_I) and end ($END_I) must be numbers" >&2
  exit 1
fi
if [ $START_I -gt $END_I ]; then
  echo "Error: start ($START_I) must be <= end ($END_I)" >&2
  exit 1
fi

for i in $(seq $START_I $END_I); do
    git branch "${BRANCH_PREFIX}$REFACTOR_TYPE/$REFACTOR_TYPE#$i";
done

echo "Done!"
