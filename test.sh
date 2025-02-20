#!/bin/bash
sqInRect() {
  l=$1
  w=$2
  squares=()
  if (( l == w )); then
    echo nil
  else
    total=$(( l * w ))
    first_iteration=t
    while (( total > 0 )); do
      if [[ $first_iteration == "t" ]]; then
        if (( l > w )); then
          squares+=("$w")
          total=$(( total - w * w ))
        else
          squares+=("$l")
          total=$(( total - l * l ))
        fi
      else
        echo "${squares[@]}"
        break
      fi
    done
  fi
  echo ${squares[@]}
}
sqInRect $1 $2
