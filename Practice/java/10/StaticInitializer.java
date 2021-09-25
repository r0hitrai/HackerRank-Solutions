import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitializer {
	// breadth, height
	static int B, H;
	// is area possible
	static boolean flag = false;
	static {
    	// creating Scanner class object
		Scanner sc = new Scanner(System.in);
		// getting breadth value
		B = sc.nextInt();
		// getting height value
		H = sc.nextInt();
		// if both breadth and height are greater than 0
		if (B > 0 && H > 0)
			// area possible
			flag = true;
		// if any of breadth or height is less than or equal to 0
		else
			// printing error
			System.out.println("java.lang.Exception: Breadth and height must be positive");
	}
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
