#!/bin/bash

# Default values
REFACTOR_TYPE="ChangeSignature"
START_I=1
END_I=16
BRANCH_PREFIX=""
REPO_PATH="."

# Parse arguments (positional: type start end repo)
if [ $# -ge 1 ]; then REFACTOR_TYPE="$1"; fi
if [ $# -ge 2 ]; then START_I="$2"; fi
if [ $# -ge 3 ]; then END_I="$3"; fi
if [ $# -ge 4 ]; then BRANCH_PREFIX="$4/"; fi
if [ $# -ge 5 ]; then REPO_PATH="$5"; fi

# Validate numbers
if ! [[ "$START_I" =~ ^[0-9]+$ ]] || ! [[ "$END_I" =~ ^[0-9]+$ ]]; then
  echo "Error: start ($START_I) and end ($END_I) must be numbers" >&2
  exit 1
fi
if [ $START_I -gt $END_I ]; then
  echo "Error: start ($START_I) must be <= end ($END_I)" >&2
  exit 1
fi

echo "Running for $REFACTOR_TYPE branches $START_I to $END_I in $REPO_PATH"

# Ensure jsonsintelliJ dir exists
mkdir -p "jsonsintelliJ/${BRANCH_PREFIX}$REFACTOR_TYPE"

for i in $(seq $START_I $END_I); do
  BRANCH="${BRANCH_PREFIX}$REFACTOR_TYPE/$REFACTOR_TYPE#$i"

  if ! git rev-parse "$BRANCH" >/dev/null 2>&1; then
    echo "Warning: Branch $BRANCH not found, skipping"
    continue
  fi

  COMMIT_SHA=$(git rev-parse "$BRANCH")
  JSON_FILE="jsonsintelliJ/${BRANCH_PREFIX}$REFACTOR_TYPE/$REFACTOR_TYPE#$i.json"

  echo "[$i/$((END_I-START_I+1))] $BRANCH ($COMMIT_SHA) → $JSON_FILE"

  # Run RefactoringMiner
  docker run -v "$(pwd)":"$(pwd)" -p 6789:6789 tsantalis/refactoringminer -c "$(pwd)/$REPO_PATH" "$COMMIT_SHA" -json "$(pwd)/$JSON_FILE"

  if [ $? -eq 0 ]; then
    echo "✓ Success for $i"
  else
    echo "✗ Failed for $i" >&2
  fi
done

echo "Done!"

