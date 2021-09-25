// importing Scanner class
import java.util.Scanner;
// main class
public class IfElse {
	// main fucntion
	public static void main(String args[]) {
		// creating object of Scanner class for taking user input
		Scanner sc = new Scanner(System.in);
		// integer variable
		int n = 0;
		// scanning integer input
		n = sc.nextInt();
		// string variable
		String result = null;
		// if n is odd
		if (n % 2 == 1)
			// result is Weird
		    result = "Weird";
		// if n is even
		else if (n % 2 == 0)
			// if n is in between 2 and 5 inclusive
			if (2 <= n && n <= 5)
				// result is Not Weird
				result = "Not Weird";
			// if n is in between 6 and 20 inclusive
			else if (6 <= n && n <= 20)
				// resutl is Weird
				result = "Weird";
			// if n is greater than 20
			else if (n > 20)
				// result is Not Weird
				result = "Not Weird";
		// printing final result
		System.out.println(result);
	}
}
