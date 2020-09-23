#!/bin/bash -x
flag=0
number=0
count=0

while [[ flag -eq 0 ]]
do
number=$((RANDOM%10000))
i=2
count=$((count+1))
#flag variable
f=0

#running a loop from 2 to number/2
#while test $i -le `expr $number / 2`
while [ $((i*i)) -le $number ]
do

#checking if i is factor of number
if [ $((number%i)) -eq 0 ];
then
f=1
fi

if [ $f -eq 1 ];
then
break;
fi

#increment the loop variable
((i++))
done
if [ $f -ne 1 ];
then
echo "total number count is $count"
flag=1
fi

done
