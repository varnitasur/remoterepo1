echo "enter first number"
read num1
echo "enter second number"
read num2
result=0
i="y"
while [ $i="y" ]
do
echo "1.addition \n2.substraction \n3.multiplication \n4.division"
echo "enter choice"
read ch
 case $ch in
	1)result=`expr $num1 + $num2`
	echo "Sum= $result"
	;;
 	2)result=`expr $num1 - $num2`
	echo "Sub= $result"
	;;
	3)result=`expr $num1 \* $num2`
	echo "Mul= $result"
	;;
	4)result=`expr $num1 / $num2`
	echo "Div= $result"
	if [ $num1 -eq 0 -a $num2 -eq 0 ]
	then 
		echo "Result is undefined."
	elif [ $num2 -eq 0 ]
	then
		echo "arithmetic error."
	else
		echo "sorry better luck next time."
	fi
	;;
	*)
	echo "invalid input"
	;;
esac

echo "Do you want to continue?"
read i
if [ $i != "y" ]
then 
	exit
fi 
done
