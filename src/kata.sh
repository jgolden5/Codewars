#!/bin/bash

printerError() {
  colorsArray=$( echo $1 | grep -o . )
  numberOfBadColors=0
  for color in ${colorsArray[@]}; do
    if [[ "nopqrstuvwxyz" == *"$color" ]]; then
      numberOfBadColors=$(($numberOfBadColors + 1))
    fi
  done
  errorString="$numberOfBadColors/${#colorsArray[@]}"
  echo $errorString
	echo "Echo is working"
}
