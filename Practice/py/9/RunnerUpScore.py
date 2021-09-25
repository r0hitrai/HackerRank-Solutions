# if executed directly
if __name__ == '__main__':
	# getting size of array
	size = int(input())
	# array of scores
	scores = [int(x) for x in input().split()]
	# maximum score
	maxScore = max(scores)
	# while maxScore is in scores
	while maxScore in scores:
		# remove maxScore from scores
		scores.remove(maxScore)
	# printing runner up score
	print(max(scores))
