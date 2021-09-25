# if executed directly
if __name__ == '__main__':
	# number of students
	studNums = int(input())
	# dictionary for student's names and marks
	records = {}
	# getting student's names and marks
	for i in range(studNums):
		# name, marks as string
		name, *line = input().split()
		# marks list
		marks = list(map(float, line))
		# add them to records
		records[name] = marks
	# input name query
	query_name = input()
	# average of the marks
	avgMarks = sum(records[query_name]) / 3
	# printing average marks
	print("%.2f" % avgMarks)
