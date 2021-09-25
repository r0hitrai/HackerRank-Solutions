# printing first and last name in required string
def print_full_name(first_name, last_name):
	# printing required output
	print("Hello", first_name, last_name + "! You just delved into python.")

if __name__ == '__main__':
	first_name = input()
	last_name = input()
	print_full_name(first_name, last_name)
