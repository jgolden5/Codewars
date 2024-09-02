#!/bin/bash
isLeapYear() {

	year="$1"

	isDivisibleBy4=("[[ $(($year % 4)) == 0 ]] && 1 || 0")
	echo "is divisible by 4 = $isDivisibleBy4"

	isDivisibleBy400="[[ $(($year % 400)) == 0 ]]"
	echo "is divisible by 400 = $isDivisibleBy400"

	isNotDivisibleBy100="[[ $(($year % 100)) != 0 ]]"
	echo "is not divisible by 100 = $isNotDivisibleBy100"

	if [[ $isDivisibleBy4 ]] && [[ $isDivisibleBy400 ]] && [[ $isNotDivisibleBy100 ]]; then
		echo 1
	else
		echo 0
	fi

}