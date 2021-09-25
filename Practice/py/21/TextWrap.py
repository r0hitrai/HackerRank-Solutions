import textwrap
# wrapping text
def wrap(string, max_width):
	# resultant string
	result = ''
	# list of wrapped text
	textList = textwrap.wrap(string, max_width)
	# for every wrapped text
	for text in textList:
		# concate text and new line in result
		result += text + '\n'
	# returning result
	return result


if __name__ == '__main__':
    string, max_width = input(), int(input())
    result = wrap(string, max_width)
    print(result)
