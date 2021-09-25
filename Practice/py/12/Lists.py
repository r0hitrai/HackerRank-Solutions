# if executed directly
if __name__ == '__main__':
	# number of commands
	N = int(input())
	# list of numbers
	List = []
	# for every command
	for i in range(N):
		# input line
		line = input().split()
		# if command is insert
		if line[0] == "insert":
			# inserting input in the List
			List.insert(int(line[1]), int(line[2]))
		# if command is print
		elif line[0] == "print":
			# printing the List
			print(List)
		# if command is remove
		elif line[0] == "remove":
			# delete input value from the List
			List.remove(int(line[1]))
		# if command is append
		elif line[0] == "append":
			# insert input value at the end of the List
			List.append(int(line[1]))
		# if command is sort
		elif line[0] == "sort":
			# sort the List
			List.sort()
		# if command is pop
		elif line[0] == "pop":
			# pop the last element from the List
			List.pop()
		# if command is reverse
		elif line[0] == "reverse":
			# reverse the List
			List.reverse()
