// importing Scanner class
import java.util.Scanner;
// main class
public class Loop2 {
	// main function
	public static void main(String args[]) {
		// creting Scanner object
		Scanner sc = new Scanner(System.in);
		// getting number of queries
		int q = sc.nextInt();
		// for each query
		for (int i = 0; i < q; i++) {
			// item of squence
			int item = 0;
			// getting a, b, and n values of query
			int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();
			// for n times
			for (int j = 0; j < n; j++) {
				// power of 2
				int power2 = 1;
				// item is equal to a
				item = a;
				// for upto j
				for (int k = 0; k <= j; k++) {
					// item is equal to sum of product of power2 and b
					item += (power2 * b);
					// 2 power k
					power2 *= 2;
				}
				// printing required output
				System.out.print(item + " ");
			}
			// printing new line
			System.out.println();
		}
	}
}
