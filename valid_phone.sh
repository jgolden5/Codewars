#!/bin/bash
valid_phone() {
	phone=$1
	i=0
	while [[ $i -lt ${#phone} ]]; do
		echo ${phone:$i:1}
		$i =$(( $i + 1 ))
	done
}
