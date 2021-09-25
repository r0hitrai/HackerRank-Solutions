// importing Scanner class
import java.util.Scanner;
// main class
public class Loop1 {
	// main function
	public static void main(String args[]) {
		// creating Scanner object
		Scanner sc = new Scanner(System.in);
		// getting input value
		int n = sc.nextInt();
		// first 10 multiples of n
		for (int i = 1; i <= 10; i++) {
			// printing required outpur
			System.out.println(n + " x " + i + " = " + (n * i));
		}
	}
}
