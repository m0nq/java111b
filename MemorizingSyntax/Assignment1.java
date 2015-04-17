import java.util.Scanner;

class Assignment1 {
	public static void main(String[] args) {
		int count;
		char decision;

		// instantiate a scanner object
		Scanner keyboard = new Scanner(System.in);

		do {
			// reset decision
			decision = 'n';

			// 1. ask user for discrete number of asteriks to print out
			System.out.print("How many asteriks would you like? ");
			
			// 2. place number in variable
			count = keyboard.nextInt();

			// 3. print out as many asteriks as their are in the given variable
			for (int i = 0; i < count; i++) {
				System.out.print("*");
			}
			System.out.println("\n");

			// 4. repeat as needed (conditional)
			System.out.println("Need more? (Type 'yes' or 'no')");
			decision = keyboard.next().charAt(0);

		} while	(decision == 'y');
	}
}