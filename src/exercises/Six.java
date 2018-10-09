/* Use a do-while loop to output "Hello, World!" in a loop.
 * Each time you output "Hello, World!" ask the user whether they would like to continue.
 */

package exercises;

import java.util.Scanner;

public class Six {
	public static void main(String[] args) {
		// Declare variables.
		Scanner scanner = new Scanner(System.in);
		String cont = "";

		// Use do-while to loop message.
		do {
			// Print message.
			System.out.println("Hello World!");

			// Ask to continue.
			System.out.println("Would you like to continue? (y/n)? ");
			scanner.hasNextLine();
			cont = scanner.nextLine();

		} while (cont.equalsIgnoreCase("y"));
		System.out.println("Goodbye!");
		scanner.close();
	}
}