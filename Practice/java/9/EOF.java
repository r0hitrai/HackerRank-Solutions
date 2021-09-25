// importing Scanner class
import java.util.Scanner;
// main class
public class EOF {
	// main function
	public static void main(String args[]) {
		// creating Scanner class object
		Scanner sc = new Scanner(System.in);
		// number of lines
		int n = 0;
		// for every line until EOF
		while (sc.hasNext()) {
			// count line
			n++;
			// printing line and line content
			System.out.println(n + " " + sc.nextLine());
		}
	}
}
