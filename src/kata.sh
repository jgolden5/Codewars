#!/bin/bash

paddedNumbers() {
  n="$1"
  padded=""
  lengthOfInput=${#n}

  if [[ $lengthOfInput -lt 5 ]]; then
    while [[ $((${#padded} + $lengthOfInput)) -lt 5 ]]; do
      padded+="0"
    done
  fi
  padded+="$n"

  echo "Value is ${padded}"
}