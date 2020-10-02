#!/bin/bash -x
read -p "input word : " input
matching="codeinclub"
if [[ $input =~ $matching ]];
then
echo "matched"
else
echo "no matched"
fi
