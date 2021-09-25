// including input output stream
#include<iostream>
// including for setprecision()
#include<iomanip>
// making std namespace available in whole program
using namespace std;
// main function
int main() {
	// integer variable
	int var1;
	// long integer variable
	long var2;
	// character variable
	char var3;
	// floating number variable
	float var4;
	// double number variable
	double var5;
	// scanning variables in same order
	cin >> var1 >> var2 >> var3 >> var4 >> var5;
	// printing integer, long integer, char each in new line
	cout << var1 << endl << var2 << endl << var3 << endl;
	// printing float upto 3 decimal points
	cout << setprecision(3) << var4 << endl;
	// printing double upto 9 decimal points
	cout << setprecision(9) << var5 << endl;
	// returning 0 from main function
	return 0;
}
