/* array[1, 2, 3, 4, 5, 6]
 * output: 6, 5, 4, 3, 2, 1*/

import java.util.Scanner;

public class InvertOrderyArray{
	public static void main(String[] args){
		// Makes a scanner to tokenize int inputs
		Scanner scan = new Scanner(System.in);
		int numsInArray = 6;
		int array[] = new int[numsInArray];

		// Put input number into array in order
		for (int index = 0; index < numsInArray; ++index){
			System.out.print("Number: ");
			array[index] = scan.nextInt();
		}

		// Output array in inverse order
		System.out.print("Inverted array: "); 
		for (int index = 5; index >= 0; --index){
			System.out.print(array[index]);
			if (index != 0) System.out.print(", ");
			else System.out.print("\n");
		}
	}
}
