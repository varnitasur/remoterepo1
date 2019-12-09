echo "enter a file name."
read fname
if [ -f $fname ]
then
	echo "file exist"
elif [ ! -f $fname ]
then 
	touch $fname
	echo "file created."
else
	echo "sorry!"
fi
