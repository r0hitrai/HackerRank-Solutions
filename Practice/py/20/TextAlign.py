# if executed directly
if __name__ == '__main__':
	# thickness of logo, must be an odd number
	thickness = int(input())
	# logo character
	c = 'H'
	# top cone
	for i in range(thickness):
		# printing c
		print((c * i).rjust(thickness - 1) + c + (c * i ).ljust(thickness - 1))
	# top pillars
	for i in range(thickness + 1):
		# printing c
	    print((c * thickness).center(thickness * 2) + (c * thickness).center(thickness * 6))
	# middle belt
	for i in range((thickness + 1) // 2):
		# printing c
		print((c * thickness * 5).center(thickness * 6))
	# bottom pillars
	for i in range(thickness+1):
		# printing c
		print((c * thickness).center(thickness * 2) + (c * thickness).center(thickness * 6))
	# bottom cone
	for i in range(thickness):
		# printing c
		print(((c * (thickness - i - 1)).rjust(thickness) + c + (c * (thickness - i - 1)).ljust(thickness)).rjust(thickness * 6))
