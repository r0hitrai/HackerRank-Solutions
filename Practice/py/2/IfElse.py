# taking input and storing it in n as an integer
n = int(input())
# if n is odd
if n % 2 == 1:
    # print Weird
    print("Weird")
# if n is even
else:
    # if n is from 2 to 5
    if n in range(2, 6):
        # print Not Weird
        print("Not Weird")
    # if n is from 6 to 20
    elif n in range(6, 21):
        # print Weird
        print("Weird")
    # if n is more than 20
    elif n > 20:
        # print Not Weird
        print("Not Weird")
