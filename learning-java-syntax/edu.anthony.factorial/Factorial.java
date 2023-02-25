/* Number: 5
 * 5! = 5x4x3x2x1 = 120 */

import java.util.Scanner;

public class Factorial{

	public static long factorial(long number){
		long factorial = number - 1;

		if (factorial == 1) return number;
		return number * factorial(number - 1); 
	}

	public static void main(String[] args){
		// Create a scan to tokenize user input
		Scanner scan = new Scanner(System.in);
		long num = 0L, 
		     result = 0;

		// Ask user for an input
		System.out.println("___FACTORIAL NUMBER CALCULATOR___");
		while(true){
			System.out.print("Number: ");
			num = scan.nextLong();

			// User a recursive function to calculate factorial
			result = factorial(num); 	
			System.out.println("Result: " + result);
		}
	}
}

