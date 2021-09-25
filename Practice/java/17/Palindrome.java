// importing Scanner class
import java.util.Scanner;
// main class
public class Palindrome {
	// main function
	public static void main(String args[]) {
		// creating Scanner class object
		Scanner sc = new Scanner(System.in);
		// input string
		String string = sc.next();
		// front index
		int front = 0;
		// back index
		int back = string.length() - 1;
		// is palindrome or not
		boolean isPalindrome = false;
		// while characters are equal
		while (string.charAt(front) == string.charAt(back) && front <= back) {
			// if string is of even length
			if (string.length() % 2 == 0) {
				// if front and back are adjacent
				if (back - front == 1) {
					// string is a palindrome
					isPalindrome = true;
					// exit loop
					break;
				}
			}
			// if string is of add length
			else {
				// if front and back are equal
				if (front == back) {
					// strig is a palindrome
					isPalindrome = true;
					// exit loop
					break;
				}
				
			}
			// next character from front
			front++;
			// next character from back
			back--;
		}
		// if isPalindrome is true
		if (isPalindrome)
			// print "Yes"
			System.out.println("Yes");
		// if isPalindrome is false
		else
			// print "No"
			System.out.println("No");
	}
}
