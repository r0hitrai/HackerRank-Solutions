// importing Scanner class
import java.util.Scanner;
// main class
public class Formatting {
    // main function
    public static void main(String args[]) {
        // creating Scanner class object
        Scanner sc = new Scanner(System.in);
        // printing top boundary
        System.out.println("================================");
        // for all input lines
        for (int i = 0; i < 3; i++) {
            // getting input string
            String str = sc.next();
            // getting input integer
            int num = sc.nextInt();            
            // printing required output
            System.out.printf("%-15s%03d%n", str, num);
        }
        // printing bottom boundary
        System.out.println("================================");
    }
}
