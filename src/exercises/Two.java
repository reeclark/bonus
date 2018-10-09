/* Prompt the user to enter a number.
 * After the user enters a number, add 1 to the number and output it back to the console.
 */

package exercises;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		// Declare variables.
		Scanner scanner = new Scanner(System.in);
		int number, newnumber = 1;

		// Get user input.
		System.out.println("Enter a number: ");
		scanner.hasNextInt();
		number = scanner.nextInt();

		// Increase number.
		newnumber += number;

		// Print results.
		System.out.println(newnumber);
		
		// Close scanner.
		scanner.close();
	}
}