# replacing character at a particular index
def mutate_string(s, i, c):
	# replacing character in s at i with c
	s_new = s[:i] + c + s[i + 1:]
	# returning final string
	return s_new

if __name__ == '__main__':
	s = input()
	i, c = input().split()
	s_new = mutate_string(s, int(i), c)
	print(s_new)
