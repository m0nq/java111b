import java.util.*;

class Factors {
	public static void main(String[] args) {
		int number = askForInteger();

		calculateValue(number);
		
	}
	
	public static int askForInteger() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value: ");
		return input.nextInt();
	}

	public static void calculateValue(int value) {
		for (int i = 0; i < value; i++) {
			if (askForInteger() % i == 0) {
				System.out.println(value);
			}
		}
	}
}