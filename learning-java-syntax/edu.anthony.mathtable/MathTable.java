import java.util.Scanner;

public class MathTable{
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int num = 0,
		    maxMultValue = 10;

		do{
			// Ask user for a number
			System.out.println("Take a number beetween 0 and 10");
			System.out.print("Number: ");
			num = scan.nextInt(); // Throws number into num

			System.out.println("Printing " + num  + " mult table");
			for (int multValue = 1; multValue <= maxMultValue; ++multValue){
				System.out.print(num + " x ");
				System.out.print(multValue + " = ");
				System.out.print(num * multValue + "\n"); // \n => Breakline
			}
		} while(num >= 0 || num <= 10);
	}
}

