import java.util.*;

class ScannerTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt user for an int value
		System.out.print("Enter a value: ");
		int value = input.nextInt();

		for (int i = 0; i < value; i++) {
			for (int j = 0; j < value; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= value; i++) {
			for (int j = 10; j < i; j++) {
				
					
				if (j == 5) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
}