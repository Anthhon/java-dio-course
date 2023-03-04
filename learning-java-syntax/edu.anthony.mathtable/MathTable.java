import java.util.Scanner;

public class MathTable{
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int num = 0,
		    maxMultValue = 20;

		while(true){
			// Ask user for a number
			System.out.println("Take a number beetween 0 and " + maxMultValue);
			System.out.print("Number: ");
			num = scan.nextInt(); // Throws number into num
			if (num < 0 || num > maxMultValue)
				continue;

			System.out.println("Printing " + num  + " mult table");
			for (int multValue = 1; multValue <= maxMultValue; ++multValue){
				System.out.print(num + " x ");
				System.out.print(multValue + " =\n");
				// System.out.print(num * multValue + "\n"); // \n => Breakline
			}
		}
	}
}

