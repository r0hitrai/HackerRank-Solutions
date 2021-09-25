# if executed directly
if __name__ == '__main__':
	# number of integers
	numNos = int(input())
	# input values
	numList = list(map(int, input().split()))
	# tuple of input integers
	Tuple = tuple(numList)
	# print hash() of Tuple
	print(hash(Tuple))
