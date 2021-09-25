// including standard input output
#include<stdio.h>
// returning maximum among four integers
int max_of_four(int a, int b, int c, int d) {
	// if a is greater than every one
	if (a > b && a > c && a > d)
		// a is max, return it
		return a;
	// if b is greater than every one
	else if (b > a && b > c && b > d)
		// b is max, return it
		return b;
	// if c is greater than every one
	else if (c > a && c > b && c > d)
		// c is max, return it
		return c;
	// d is max
	else
		// return d
		return d;
}
// main function
int main() {
	// four integer variables
	int a, b, c, d;
	// getting four integer values
	scanf("%d%d%d%d", &a, &b, &c, &d);
	// calculating maximum among these four integers
	int max = max_of_four(a, b, c, d);
	// printing max integer
	printf("%d\n", max);
	// returning 0 from main
	return 0;
}
