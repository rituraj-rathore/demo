#!/bin/bash -x
declare -A dictionary
dictionary=( [1]=0 [2]=0 [3]=0 [4]=0 [5]=0 [6]=0 )
for((i=0;i<10;i++))
do
roll_dice=$((RANDOM%6+1))
value=$(( ${dictionary[$roll_dice]} ))
dictionary[$roll_dice]=$(( $value + 1 ))
done
echo "dictionary value is ${dictionary[@]} "
