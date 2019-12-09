count=1
while [ $count -le 10 ]
do
	if [ $count -gt 5 ]
	then
		break
	fi
	echo $count
	count=`expr $count + 1`
done

echo "we are out of loop."
