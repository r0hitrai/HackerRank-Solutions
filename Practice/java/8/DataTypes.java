// importing Scanner class
import java.util.Scanner;
// main class
public class DataTypes {
	// main class
	public static void main(String args[]) {
		// creating Scanner object
		Scanner sc = new Scanner(System.in);
		// getting number of test cases
		int t = sc.nextInt();
		// for each test case
		for (int i = 0; i < t; i++) {
			// if exception occures, throws it
			try {
				// getting integer input
				long n = sc.nextLong();
				// printing required output
				System.out.println(n + " can be fitted in:");
				// if num is byte
				if (n >= -128 && n <= 127)
					// printing required output
					System.out.println("* byte");
				// if num is short
				if (n >= -32768 && n <= 32767)
					// printing required output
					System.out.println("* short");
				// if num is int
				if (n >= -2147483648 && n <= 2147483647)
					// printing required output
					System.out.println("* int");
				// printing required output
				System.out.println("* long");
			}
			// catches the exception and executes the block
			catch (Exception e) {
				// printing required output
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}
		}
	}
}
