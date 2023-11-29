#!/bin/bash
accum () {
  str=$1
  result=""
  for (( i = 0; i < ${#str}; i++ )); do
    j=0
    while [[ $j -le $i ]]; do
      charToAdd=${str:$i:1}
      if [[ $j -eq 0 ]]; then
        charToAdd=$(echo "${charToAdd^}")
      else
        charToAdd=$(echo "${charToAdd,}")
      fi
      result+=$charToAdd
      j=$((j + 1))
    done
    if [[ $j -ne $((${#str})) ]]; then
      result+="-"
    fi
  done
  echo $result
}