import java.util.*;

class NumberGuesser {
	public static void main(String[] args) {
		
		do {
			playOneGame();
		} while (shouldPlayAgain());

	}

	public static void playOneGame() {
		
		int min = 1;
		int max = 100;
		int middle = getMidpoint(min, max);
		char answer = 'a';

		System.out.println("Guess a number between 1 and 100.");

		do {
			answer = getUserResponseToGuess(middle);

			if (answer == 'h') {
				min = middle;
				middle = getMidpoint(min, max);
			} 
			else if (answer == 'l') {
				max = middle;
				middle = getMidpoint(min, max);
			}
		
		} while (answer != 'c');
	}

	public static boolean shouldPlayAgain() {
		Scanner input = createScanner();
		System.out.print("Great! Do you want to play again? (y/n): ");
		char decision = input.next().charAt(0);

		if (decision != 'y') {
			return false	;
		}

		return true;
	}

	public static char getUserResponseToGuess(int guess) {
		Scanner input = createScanner();
		
		System.out.print("Is it " + guess + "? (h/l/c): ");
		char playersChoice = input.next().charAt(0);

		if (playersChoice == 'h') {
			return 'h';
		} else if (playersChoice == 'l') {
			return 'l';
		} else if (playersChoice == 'c') {
			return 'c';
		} else {
			System.out.println("Try again...");
			return playersChoice;
		}
	}

	public static int getMidpoint(int low, int high) {
		return (low + high) / 2;
		
	}

	public static Scanner createScanner() {
		Scanner scanner = new Scanner(System.in);
		return scanner;
	}
}