!#/bin/bash -x
flag=0
rolls=0
count=0
totalsum=0
while [[ count -ne 2 ]]
do
dice1=$((RANDOM%6+1))
dice2=$((RANDOM%6+1))
sum=$((dice1+dice2))
totalsum=$((totalsum+sum))
rolls=$((rolls+1))
if [[ sum -eq 6 ]];
then
count=$((count+1))
fi
done
echo "total sum $totalsum"
echo "total rolls ocurs $rolls"
