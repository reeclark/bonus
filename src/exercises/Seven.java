/* Use a do-while loop to run exercise 1 in a loop.
 * Each time you run the code ask the user whether they would like to continue.
 */

package exercises;

import java.util.Scanner;

public class Seven {
	public static void main(String[] args) {
		// Declare variables.
		Scanner scanner = new Scanner(System.in);
		String cont = "";

		// Use do-while to loop message.
		do {
			One.exOne();
			
			System.out.println("Would you like to continue? (y/n)? ");
			scanner.hasNextLine();
			cont = scanner.nextLine();

		} while (cont.equalsIgnoreCase("y"));
		System.out.println("Goodbye!");
		scanner.close();
	}
}