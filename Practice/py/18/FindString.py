# calculating number of occuremces of a sub string in string
def count_substring(string, sub_string):
	# counting of occurences
	count = 0
	# for every character in string except less than len of sub string
	for i in range(len(string) - len(sub_string) + 1):
		# sub_string index
		subIndex = 0
		# if c is equal to first character of sub_string
		if string[i] == sub_string[subIndex]:
			# string index
			strIndex = i + 1
			# next subIndex
			subIndex += 1
			# number of equal characters
			equalNos = 1
			# while characters in string equal to sub string
			while string[strIndex] == sub_string[subIndex]:
				# increment equalNos
				equalNos += 1
				# next strIndex
				strIndex += 1
				# if no more characters
				if strIndex == len(string):
					# exit loop
					break
				# next subIndex
				subIndex += 1
				# if no more characters
				if subIndex == len(sub_string):
					# exit loop
					break
			# if equalNos is equal to length of sub_string
			if equalNos == len(sub_string):
				# increment count
				count += 1
	# returning count
	return count
			

if __name__ == '__main__':
	string = input().strip()
	sub_string = input().strip()
	count = count_substring(string, sub_string)
	print(count)
