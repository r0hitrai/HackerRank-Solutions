// importing Scanner class
import java.util.Scanner;

// main class
public class SubStringCompare {
	// finding smallest and largest sub string in string
	static String getSmallestAndLargest(String string, int length) {
		// number of sub strings
		int subStringNos = string.length() - length + 1;
		// array of sub strings
		String[] subStrings = new String[subStringNos];
		// for every sub string in string
		for (int i = 0; i < subStringNos; i++) {
			// add sub string in subStrings
			subStrings[i] = string.substring(i, i + length);
		}
		// temporary string
		String temp = null;
		// for all sub strings
		for (int i = 1; i < subStringNos; i++) {
			// for every character in sub string
			for (int j = 0; j < length; j++) {
				// if current sub string's character is greater than previus sub string's character
				if (subStrings[i].charAt(j) > subStrings[i - 1].charAt(j)) {
					// store current sub string in tmep
					temp = subStrings[i];
					// store previous sub string in current
					subStrings[i] = subStrings[i - 1];
					// store temp in previous sub string
					subStrings[i - 1] = temp;
					// exit loop
					break;
				}
				// if current sub string's character is smaller than previus sub string's character
				else if (subStrings[i].charAt(j) < subStrings[i - 1].charAt(j))
				// exit loop
				break;
			}
		}
		// final resultant string
		String result = subStrings[subStringNos - 1];
		// for all sub strings
		for (int i = 1; i < subStringNos; i++) {
			// for every character in sub string
			for (int j = 0; j < length; j++) {
				// if current sub string's character is smaller than previus sub string's character
				if (subStrings[i].charAt(j) < subStrings[i - 1].charAt(j)) {
					// store current sub string in tmep
					temp = subStrings[i];
					// store previous sub string in current
					subStrings[i] = subStrings[i - 1];
					// store temp in previous sub string
					subStrings[i - 1] = temp;
					// exit loop
					break;
				}
				// if current sub string's character is greater than previus sub string's character
				else if (subStrings[i].charAt(j) > subStrings[i - 1].charAt(j))
				// exit loop
				break;
			}
		}
		// adding largest sub string to result
		result += '\n' + subStrings[subStringNos - 1];
		// returning final resultant string
		return result;
	}
	// main function
	public static void main(String args[]) {
		// creating Scanner class object
		Scanner sc = new Scanner(System.in);
		// input string
		String string = sc.next();
		// length of sub string
		int length = sc.nextInt();
		// calling getSmallestAndLargest function
		String result = getSmallestAndLargest(string, length);
		// printing final result
		System.out.println(result);
	}
}
