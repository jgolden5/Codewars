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

n=$1

b="$(intToBin $n)"




echo $b

