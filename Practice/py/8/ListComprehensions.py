# if executed directly
if __name__ == '__main__':
    # getting x value
    x = int(input())
    # getting y value
    y = int(input())
    # getting z value
    z = int(input())
    # getting n value
    n = int(input())
    # array of elements whose sum is not 3
    arr = [[i,j,k] for i in range(x + 1) for j in range(y + 1) for k in range(z + 1) if i + j + k != n]
    # printing final result
    print(arr)
