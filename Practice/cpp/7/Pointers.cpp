// including input output stream
#include<iostream>
// making standard namespace available in whole program
using namespace std;
// updating a to their sum and b to their absolute difference
void update(int *num1, int *num2) {
	// if num1 is greater
	if (*num1 > *num2) {
		// num2 is their absolute difference
		*num2 = *num1 - *num2;
		// num1 is their sum
		*num1 += (*num1 - *num2);
	}
	// if num2 is greater or equal
	else {
		// num2 is their absolute difference
		*num2 -= *num1;
		// num1 is their sum
		*num1 += (*num1 + *num2);
	}
}
// main function
int main() {
	// input variables
	int a, b;
	// getting input values
	cin >> a >> b;
	// calling update function
	update(&a, &b);
	// printing updated a and b
	cout << a << endl << b << endl;
	// returning 0 from main
	return 0;
}
