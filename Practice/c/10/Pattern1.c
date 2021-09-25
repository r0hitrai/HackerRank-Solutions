// including standard input output
#include<stdio.h>
// main fucntion
int main() {
	// number
	int n;
	// getting input value
	scanf("%d", &n);
	// modifying factor, number of line
	int m = 0, lienNo = 0;
	// upper half square
	for (int i = 0; i < n; i++) {
		// number to print
		int k = n;
		// right triangle
		for (int j = 0; j <= i; j++)
			// printing number
			printf("%d ", k--);
		// repeated number
		k++;
		// middle pyramid
		for (int j = n - 1; j > i; j--)
			// printing repeated number
			printf("%d %d ", k, k);
		// left traingle
		for (int j = 0; j < i; j++)
			// printing number
			printf("%d ", ++k);
		// printing new line
		printf("\n");
	}
	// lower half square
	for (int i = n - 1; i > 0; i--) {
		// number to print
		int k = n;
		// right triangle
		for (int j = 0; j < i; j++)
			// printing number
			printf("%d ", k--);
		// repeated number
		k++;
		// middle pyramid
		for (int j = n; j > i; j--)
			// printing repeated number
			printf("%d %d ", k, k);
		// left triangle
		for (int j = 1; j < i; j++)
			// printing number
			printf("%d ", ++k);
		// printing new line
		printf("\n");
	}
	// returning 0 from main
	return 0;
}
