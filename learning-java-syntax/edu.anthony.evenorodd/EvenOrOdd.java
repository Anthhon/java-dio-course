import java.util.Scanner;

public class EvenOrOdd{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int numsCounter = 0,
		    oddCounter = 0,
		    evenCounter = 0,
		    maxNums = 10,
		    temp;

		// Asks for 10 numbers
		while (numsCounter < maxNums){
			System.out.print("Number: ");
			temp = scan.nextInt();
			
			// Check if number is even or odd
			if (temp % 2 == 0)
				++evenCounter;
			else ++oddCounter;

			++numsCounter;
		}

		// Output info
		System.out.println("In the " + numsCounter + " numbers you typed...");
		System.out.println(oddCounter + " are odd.");
		System.out.println(evenCounter + " are even.");
	}
}

