#!/bin/bash

isValid() {
  isValid=True

  if [[ $1 = *" "* ]]; then
    isValid=False
  else
    IFS='.' read -r -a adrArr <<< "$1"

    dotCount=0

    for ip in ${adrArr[@]}; do
      dotCount=$((dotCount+1))
      if [[ ${ip/0/} ]] && [[ ${ip::1} -eq 0 ]] || [[ $ip -lt 0 ]] || [[ $ip -gt 255 ]]; then
        isValid=False
        break
      fi
    done

    if [[ $dotCount -ne 4 ]]; then
      isValid=False
    fi
  fi


  echo $isValid
}
