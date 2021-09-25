# if executed directly
if __name__ == '__main__':
	# input line
	line = input().split()
	# size of door mat
	N, M = int(line[0]), int(line[1])
	# number of before middle row
	rowsUp = N // 2
	# number of dashes for 1st row
	dashNos = (M - 3) // 2
	# pattern
	pattern = ".|."
	# number of patterns for 1st row
	patternNos = 1
	# for each rowsUp
	for i in range(rowsUp):
		# print all dashes
		for j in range(dashNos):
			# printing dash
			print("-", end = "")
		# print all patterns
		for j in range(patternNos):
			# printing pattern
			print(pattern, end = "")
		# print all dashes
		for j in range(dashNos):
			# printing dash
			print("-", end = "")
		# printing new line
		print()
		# reduce dashNos by 3
		dashNos -= 3
		# increase patternNos by 2
		patternNos += 2
	# number of dahses in middle row
	dashNos = (M - 7) // 2
	# print all dahses
	for i in range(dashNos):
		# printng dash
		print("-", end = "")
	# printing "WELCOME"
	print("WELCOME", end = "")
	# print all dahses
	for i in range(dashNos):
		# printng dash
		print("-", end = "")
	# printing new line
	print()
	# number of below middle row
	rowsUp = N // 2
	# number of dashes for 1st row
	dashNos = 3
	# pattern
	pattern = ".|."
	# number of patterns for 1st row
	patternNos = (M - 6) // 3
	# for each rowsUp
	for i in range(rowsUp):
		# print all dashes
		for j in range(dashNos):
			# printing dash
			print("-", end = "")
		# print all patterns
		for j in range(patternNos):
			# printing pattern
			print(pattern, end = "")
		# print all dashes
		for j in range(dashNos):
			# printing dash
			print("-", end = "")
		# printing new line
		print()
		# reduce dashNos by 3
		dashNos += 3
		# increase patternNos by 2
		patternNos -= 2
