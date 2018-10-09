/* Prompt the user to enter two numbers.
 * After the user enters the numbers, add them together and output the sum back to the console.
 */

package exercises;

import java.util.Scanner;

public class Four {
	public static void main(String[] args) {
		// Declare variables.
		Scanner scanner = new Scanner(System.in);
		double one, two, total;

		// Get first number.
		System.out.println("Enter a number: ");
		scanner.hasNextDouble();
		one = scanner.nextDouble();

		// Get second number.
		System.out.println("Enter another number: ");
		scanner.hasNextDouble();
		two = scanner.nextDouble();

		// Add numbers together.
		total = one + two;

		// Print results.
		System.out.println("The sum is " + total);

		// Close scanner.
		scanner.close();
	}
}