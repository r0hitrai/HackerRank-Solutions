// including standard input output header
#include<stdio.h>
// sets value of to sum and b to absolute difference
void update(int *num1, int *num2) {
	// if num1 is greater
	if (*num1 > *num2) {
		// num2 is equal to their difference
		*num2 = *num1 - *num2;
		*num1 += (*num1 - *num2);
	}
	// else
	else {
		// num2 is equal to their difference
		*num2 -= *num1;
		// num1 is equal to their sum
		*num1 += (*num1 + *num2);
	}
}
// main function
int main() {
	// input varibles
	int a, b;
	// getting input values
	scanf("%d%d", &a, &b);
	// calling update function
	update(&a, &b);
	// printing final result
	printf("%d\n%d", a, b);
	// returning 0 from main
	return 0;
}
