echo "Enter a word:/c"
read var1
echo "Enter second word:/c"
read var2
if [ "$var1" = "$var2" ]
then
 	echo "same string"
else
	echo "both a different."
fi
