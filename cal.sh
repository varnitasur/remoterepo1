echo "Enter first number"
read num1
echo "enter second number"
read num2
if [ $num1 -lt $num2 ]
then
	echo "odd numbers are"
	for i in $( seq $num1 $num2)
	do
	if [ `expr $i % 2` -ne 0 ]
	then
	echo $i
fi
done
else

	echo "range is invalid"
fi
