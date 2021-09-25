# if executed directly
if __name__ == '__main__':
	# number of students
	studNums = int(input())
	# nested list of student's name and grades
	studList = []
	# getting student's name and grades
	for i in range(studNums):
		# student's name
		name = input()
		# student's grade
		grade = float(input())
		# adding student's name and grades in studList
		studList.append([name, grade])
	# list of grades
	gradeList = [x[1] for x in studList]
	# minimum grade
	minGrade = min(gradeList)
	# remove all minimum grades
	while min(gradeList) == minGrade:
		# remove minimum grade
		gradeList.remove(minGrade)
	# second lowest grade
	secondLowGrade = min(gradeList)
	# list of student's names having second lowest grade, in alphabetic order
	nameList = sorted([x[0] for x in studList if x[1] == secondLowGrade])
	# printing all student's name having second lowest grade
	for name in nameList:
		# printing name
		print(name)
