import java.util.Scanner;

public class SchoolGrade{
	public static void main(String[] args){
		// Creates a scanner to tokenize the user inputs
		Scanner scan = new Scanner(System.in);
		int score,
		    minScore = 7;

		// Asks for a valid input
		System.out.println("Type a score beetween 0 and 10");
		System.out.print("Score: ");
		score = scan.nextInt();

		// Avoid mystaken scores
		while(score < 0 || score > 10){
			System.out.println("Invalid score, try again!");
			System.out.print("Score: ");
			score = scan.nextInt();
		}

		System.out.println("Congratulations! The score was updated sucessfully!");
	}
}
