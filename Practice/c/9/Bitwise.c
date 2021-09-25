// including standard input output
#include<stdio.h>
// calculating maximum among bitwise operators
void calculate_the_maximum(int n, int k) {
	// maximum value for AND, OR, and XOR operators
	int maxAND = 0, maxOR = 0, maxXOR = 0;
	// for every integer from 1 to n - 1
	for (int i = 1; i < n; i++) {
		// for every integer from i + 1 to n
		for (int j = i + 1; j <= n; j++) {
			// current bitwise AND
			int AND = i & j;
			// if current AND is more than maxAND and less than k
			if (AND > maxAND && AND < k)
				// store current AND in maxAND
				maxAND = AND;
			// current bitwise OR
			int OR = i | j;
			// if current OR is more than maxOR and less than k
			if (OR > maxOR && OR < k)
				// store current OR in maxOR
				maxOR = OR;
			// current bitwise XOR
			int XOR = i ^ j;
			// if current XOR is more than maxXOR and less than k
			if (XOR > maxXOR && XOR < k)
				// store current XOR in maxXOR
				maxXOR = XOR;
		}
	}
	
	// printing max values in each line
	printf("%d\n%d\n%d\n", maxAND, maxOR, maxXOR);
}
// main function
int main() {
	// maximum number, result should be less than this
	int n, k;
	// getting input values
	scanf("%d%d", &n, &k);
	// calling calculate_the_maximum function
	calculate_the_maximum(n, k);
	// returning 0 from main
	return 0;
}
