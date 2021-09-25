// importing Scanner class
import java.util.Scanner;
// main class
public class Strings {
	// main function
	public static void main(String args[]) {
		// creating Scanner class object
		Scanner sc = new Scanner(System.in);
		// first string
		String A = sc.next();
		// second string
		String B = sc.next();
		// sum of length of string A and B
		int sumLength = A.length() + B.length();
		// A is greater than B
		String isBig = "No";
		// for every character in string A
		for (int i = 0; i < A.length(); i++) {
			// if no more characters in B
			if (i == B.length())
				// exit loop
				break;
			// if A's character is greater
			if (A.charAt(i) > B.charAt(i)) {
				// A is greater
				isBig = "Yes";
				// exit loop
				break;
			}
			// if A's character is smaller
			else if (A.charAt(i) < B.charAt(i))
				// exit loop
				break;
		}
		// capitalize A
		String capA = "" + A.toUpperCase().charAt(0);
		// for every character in A except fist
		for (int i = 1; i < A.length(); i++) {
			// add it in capA
			capA += A.charAt(i);
		}
		// capitalize B
		String capB = "" + B.toUpperCase().charAt(0);
		// for every character in B except fist
		for (int i = 1; i < B.length(); i++) {
			// add it in capB
			capB += B.charAt(i);
		}
		// printing sumLength
		System.out.println(sumLength);
		// printing isBig
		System.out.println(isBig);
		// printing capA and CapB
		System.out.println(capA + " " + capB);
	}
}
