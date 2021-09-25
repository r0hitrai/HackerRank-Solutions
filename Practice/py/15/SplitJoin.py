# spliting string by " " and joining it by "-"
def split_and_join(line):
	# spliting line by " " and storing a list
	List = line.split()
	# joining line by "-" and storing it in line
	line = "-".join(List)
	# returning final string
	return line

if __name__ == '__main__':
	line = input()
	result = split_and_join(line)
	print(result)
