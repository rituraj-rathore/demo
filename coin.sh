#!/bin/bash -x
declare -A dictionary
head=0
tail=0
for ((i=0;i<10;i++))
do

coin=$((RANDOM%2+1))

if [ $coin -eq 1 ];
then
dictionary[$i]="head"
head=$((head+1))
else
dictionary[$i]="tail"
tail=$((tail+1))
fi
done

echo " dictionary keys ${!dictionary[@]}"
echo " dictionay value ${dictionary[@]}"
echo "head count $head"
echo "tail count $tail"
echo "probability of head $((head*10))%"
echo "probabiliry of tail $((tail*10))%"
