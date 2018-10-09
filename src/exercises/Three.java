/* Prompt the user to enter a number.
 * After the user enters a number, add .5 to the number and output it back to the console.
 */

package exercises;

import java.util.Scanner;

public class Three {
	public static void main(String[] args) {
		// Declare variables.
		Scanner scanner = new Scanner(System.in);
		double number, newnumber = .5;

		// Get user input.
		System.out.println("Enter a number: ");
		scanner.hasNextDouble();
		number = scanner.nextDouble();

		// Increase number.
		newnumber += number;

		// Print results.
		System.out.println(newnumber);
		
		// Close scanner.
		scanner.close();
	}
}