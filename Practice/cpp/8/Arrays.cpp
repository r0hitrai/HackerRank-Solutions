// including input output stream
#include<iostream>
// making standard namespace available in whole program
using namespace std;
// main fucntion
int main() {
	// array size variable
	int size;
	// getting array size
	cin >> size;
	// integer array
	int arr[size];
	// getting array values
	for (int i = 0; i < size; i++) 
		cin >> arr[i];
	// form last item to frist item in array
	for (int i = size - 1; i >= 0; i--)
		// printing array item
		cout << arr[i] << " ";
	// next line
	cout << endl;
	// returning 0 from main
	return 0;
}
