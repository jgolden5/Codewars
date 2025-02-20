#!/bin/bash
partlist() {
  arr="$1"
	res=()
  for (( i=1; i<${#arr}; i++ )); do
    first="${arr[@]:0:$i}"
    last="${arr[@]:$i:$(( ${#arr} - $i ))}"
		res+="($first, $last)"
  done
	echo "${res[@]}"
}
partlist "$1"
