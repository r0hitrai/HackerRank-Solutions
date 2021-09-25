# calculating leap year
def is_leap(year):
    # if year is evenly divisible by 4
    if year % 4 == 0:
        # if year is evenly divisible by 100
        if year % 100 == 0:
            # if year is evenly divisible by 400
            if year % 400 == 0:
                # leap year
                return True
            # else
            else:
                # not a leap year
                return False
        # else
        else:
            # leap year
            return True
    # else
    else:
        # not a leap year
        return False
# if executed directly
if __name__ == '__main__':
    # getting year
    year = int(input())
    # printing final result
    print(is_leap(year))
