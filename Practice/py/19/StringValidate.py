# if executed directly
if __name__ == '__main__':
	# input string
	string = input()
	# aplhanumeric status
	isAlnum = False
	# alphabetical status
	isAlpha = False
	# digits status
	isDigit = False
	# lowercase status
	isLower = False
	# uppercase status
	isUpper = False
	# for every character in string
	for c in string:
		# if c is alphanumeric
		if c.isalnum():
			# set isAlNum as True
			isAlnum = True
		# if c is alphabetical
		if c.isalpha():
			# set isAlpha as True
			isAlpha = True
		# if c is digits
		if c.isdigit():
			# set isDigit as True
			isDigit = True
		# if c is lowercase
		if c.islower():
			# set isLower as True
			isLower = True
		# if c is upper
		if c.isupper():
			# set isUpper as True
			isUpper = True
	# printng required output
	print(isAlnum, isAlpha, isDigit, isLower, isUpper, sep = "\n")
	
		
