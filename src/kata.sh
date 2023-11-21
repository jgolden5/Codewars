#!/bin/bash

#int to binary
intToBin() {
  remaining=$1
  if [[ $remaining -le 0 ]]; then
    echo 0
  else
    exp=0
    while [[ $((2**$exp)) -le $1 ]]; do
      exp=$((exp+1))
    done

    exp=$((exp-1))

    bin=""

    while [[ $exp -ge 0 ]]; do
      currentOneValue=$((2**$exp))
      if [[ $remaining -ge $currentOneValue ]]; then
        remaining=$(($remaining - $currentOneValue))
        bin+=1
      else
        bin+=0
      fi
      exp=$((exp - 1))
    done

    echo $bin

  fi
}

nextHighestBinaryWithSameNumberOfOnes() {
  b=$1

  length=${#b}

  reversed=()

  for((i = length - 1; i >= 0; i--)); do
    echo $i
    reversed+=("${b[$i]}")
    echo $reversed
  done

  echo "Original array: ${b[@]}"
  echo "Reversed array: ${reversed[@]}"
}

#what technically gets run

n=$1

b="$(intToBin $n)"

echo "binary = $b"

nextHighestBinaryWithSameNumberOfOnes $b
