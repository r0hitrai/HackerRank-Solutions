// importing Scanner class
import java.util.*;
// main class
public class SubString {
	// main function
	public static void main(String args[]) {
		// creating Scanner class object
		Scanner sc = new Scanner(System.in);
		// input string
		String string = sc.next();
		// start index
		int start = sc.nextInt();
		// end index
		int end = sc.nextInt();
		// sub string
		String subString = string.substring(start, end);
		// printing sub string
		System.out.println(subString);
	}
}
