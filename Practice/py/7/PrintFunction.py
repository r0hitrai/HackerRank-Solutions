# if executed directly
if __name__ == '__main__':
    # getting integer input
    n = int(input())
    # string vaiable
    string = ''
    # from 1 to n
    for i in range(1, n + 1):
        # concatinating number to string
        string += '%s' % i
# printing final result
print(string)
