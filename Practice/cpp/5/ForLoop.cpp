// including input output stream
#include<iostream>
// making standard namespace available in whole program
using namespace std;
// main fucntion
int main() {
	// input variables
	int a, b;
	// getting input variables
	cin >> a >> b;
	// for all integers in the interval [a,b]
	for (int n = a; n <= b; n++) {
		// if n is greater than 9
		if (n > 9) {
			// if n is even
			if (n % 2 == 0)
				// printing "even"
				cout << "even" << endl;
			// if n is odd
			else
				// printing "odd"
				cout << "odd" << endl;
		}
		// if n is 9
		else if (n == 9)
			// printing "nine"
			cout << "nine" << endl;
		// if n is 8
		else if (n == 8)
			// printing "eight"
			cout << "eight" << endl;
		// if n is 7
		else if (n == 7)
			// printing "seven"
			cout << "seven" << endl;
		// if n is 6
		else if (n == 6)
			// printing "six"
			cout << "six" << endl;
		// if n is 5
		else if (n == 5)
			// printing "five"
			cout << "five" << endl;
		// if n is 4
		else if (n == 4)
			// printing "four"
			cout << "four" << endl;
		// if n is 3
		else if (n == 3)
			// printing "three"
			cout << "three" << endl;
		// if n is 2
		else if (n == 2)
			// printing "two"
			cout << "two" << endl;
		// if n is 1
		else if (n == 1)
			// printing "one"
			cout << "one" << endl;
	}
	// returning 0 from main
	return 0;
}
