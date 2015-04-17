import java.util.*;

class Guesser {
	public static void main(String[] args) {
		
		playOneGame();

	}

	public static void playOneGame() {

		NumberGuesser guesser = new NumberGuesser(1, 100);
		char answer;

		do {

			System.out.println("Guess a number between 1 and 100.");

			do {
				answer = getUserResponseToGuess(guesser.getCurrentGuess());

				if (answer == 'h') {
					guesser.higher();
				} 
				else if (answer == 'l') {
					guesser.lower();
				}
			
			} while (answer != 'c');

		} while (shouldPlayAgain(guesser));
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

	public static Scanner createScanner() {
		
		Scanner scanner = new Scanner(System.in);
		return scanner;

	}

	public static boolean shouldPlayAgain(NumberGuesser guesser) {
		
		Scanner input = createScanner();
		
		System.out.print("Great! Do you want to play again? (y/n): ");
		
		char decision = input.next().charAt(0);

		if (decision == 'n') {
			return false	;
		}

		guesser.reset();
		
		return true;

	}
}