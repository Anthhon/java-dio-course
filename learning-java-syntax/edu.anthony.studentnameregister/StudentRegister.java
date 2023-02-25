/* Scanner Documentation:
 * https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html */
import java.util.Scanner;

public class StudentRegister{
	public static void main(String[] args){
		// Creates a scanner object using the Scanner module imported
		Scanner scan = new Scanner(System.in);

		// Declare variables to store student info
		String name;
		int age;

		System.out.println("To end this program put '0' into the name field!");

		// Asks for student info and store into variables
		while(true){
			System.out.print("Name: ");
			name = scan.next();
			
			// Checks if 
			if (name.equals("0")) break;

			System.out.print("Age: ");
			age = scan.nextInt();

			// Output message 
			System.out.println("Student info added/updated correctly!");
		}

		System.out.println("Program ended!");
		
	}
}
