# swapping UPPER and lower case of string
def swap_case(s):
	# returning final string
	return s.swapcase()

if __name__ == '__main__':
	s = input()
	result = swap_case(s)
	print(result)
