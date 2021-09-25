// importing Scanner class
import java.util.Scanner;
// importing NumberFormat abstract class
import java.text.NumberFormat;
// importing Locale class
import java.util.Locale;

// main class
public class Currency {
	// main function
	public static void main(String args[]) {
		// creating Scanner class object
		Scanner sc = new Scanner(System.in);
		// payment variable
		double payment = sc.nextDouble();
		// US payment format
		String paymentUS = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		// India payment format
		String paymentIN = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
		// China payment format
		String paymentCHINA = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		// France payment format
		String paymentFRANCE = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
		// printing paymentUS
		System.out.println("US: " + paymentUS);
		// printing paymentIN
		System.out.println("India: " + paymentIN);
		// printing paymentCHINA
		System.out.println("China: " + paymentCHINA);
		// printing paymentFRANCE
		System.out.println("France: " + paymentFRANCE);
	}
}
