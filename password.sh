#!/bin/bash/ -x
read -p "Enter password : " password
pass="([@#$%^&*]){1}"
if [[ $pass1 =~ $pass ]]
then
echo "invalid password"
else
passw=`echo $pass1`
echo $passw | egrep "[a-z]" | egrep "[A-Z]{2,}" | egrep "[@#$%^&*]{2,}"
echo $passw | egrep "[[:upper:]]{2,}[[:lower:]]{1,}+?[!@#$%^&*()_+-=]?{2,}$"
if [[ $? -eq 0 ]]; then
echo "Password validated"
else
echo "invalid password"
fi
fi
