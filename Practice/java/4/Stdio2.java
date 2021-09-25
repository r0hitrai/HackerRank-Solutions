// importing Scanner class
import java.util.Scanner;
// main class
public class Stdio2 {
	// main function
	public static void main(String[] args) {
		// creating Scanner object
		Scanner sc = new Scanner(System.in);
		// getting an integer
		int a = sc.nextInt();
		// getting a double
		double b = sc.nextDouble();
		// skipping the new line character after decimal
		sc.nextLine();
		// getting a string
		String c = sc.nextLine();
		// printing string
		System.out.println("String: " + c);
		// printing double
		System.out.println("Double: " + b);
		// printing integer
		System.out.println("Int: " + a);
	}
}
