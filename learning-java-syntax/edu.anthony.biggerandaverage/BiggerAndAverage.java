import java.util.Scanner;

public class BiggerAndAverage{
	public static void main(String[] args){
		// Create a scanner to tokenize user input
		Scanner scan = new Scanner(System.in);
		int average = 0,
		    bigger = 0,
		    temp;

		// Store five number by user input
		for(int counter = 0; counter < 5; ++counter){
			System.out.print("Number: ");
			temp = scan.nextInt();

			average += temp;
			if (temp > bigger || counter == 0)
				bigger = temp;
		}

		// Calculate the real average based in total number
		average = average / 5;

		// Print out bigger and average number
		System.out.println("This is your result:");
		System.out.println("Bigger: " + bigger);
		System.out.println("Average: " + average);
	}
}

