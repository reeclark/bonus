/* Prompt the user to enter a string.
 * After the user enters a string, output the same string back to the console.
 */

package exercises;

import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		oneTest();
	}

	private static void oneTest() {
		// TODO Auto-generated method stub
		
	}

	public static void exOne() {
		//Declare variables.
		Scanner scanner = new Scanner(System.in);
		String text = "";
		
		//Get user input.
		System.out.println("Enter some text: ");
		text = scanner.nextLine();
		
		//Print results.
		System.out.println(text);
		
		//Close scanner.
		scanner.close();
	}
}