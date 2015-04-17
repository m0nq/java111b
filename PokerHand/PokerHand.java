/**
	This program compiles, though is incomplete due it's creators lack of algorithmic understanding.
*/

import java.util.*;

class PokerHand {
	public static void main(String[] args) {
		// array to hold the values of the players cards
		int[] cards = new int[5];

		// array to hold matched cards
		// int[] counter = new int[4];		

		// integer to hold a conditional check
		int validator;

		// loop tracker variable
		// int tracker = 0;
		// boolean confirm = false;

		// Scanner object to get input
		Scanner input = new Scanner(System.in);

		// 1. read 5 cards form user.
		System.out.println("Enter five numeric cards, no face cards. Use 2 - 9.");

		// 1a. collect 5 integer values between 2 & 9
		for (int i = 0; i < cards.length; i++) {
			
			System.out.print("Card " + (i+1) + ": ");
			validator = input.nextInt();

			// check to see if input is within bounds
			while (validator < 2 || validator > 9) {
				System.out.println("That number's out of range.");
				System.out.print("Card " + (i+1) + ": ");
				validator = input.nextInt();
			}

			cards[i] = validator;
		}
		
		Arrays.sort(cards);

		if (containsPair(cards)) {
			System.out.println("A Pair!");
		} else if (containsTwoPair(cards)) {
			System.out.println("Two Pair!");
		} else if (containsThreeOfaKind(cards)) {
			System.out.println("Three of a kind!");
		} else if (containsStraight(cards)) {
			System.out.println("Straight!");
		} else if (containsFullHouse(cards)) {
			System.out.println("Full House!");
		} else if (containsFourOfaKind(cards)) {
			System.out.println("Four of a kind!");
		} else {
			System.out.println("High Card!");
		}
		
		/*for (int i = 0; (i < cards.length - 1); i++) {

			if (cards[i] == cards[i + 1]) {
				confirm = true;
				tracker++;

				// confirm = doubleCheck(cards);
			} 
			// else if (cards[i] == (cards[i + 1]) - 1) {
			// 	tracker++;
			// }

			// tracker++;
			// confirm++;
		}

		for (int j = 0; j < cards.length - 1; j++) {
			if (tracker >= 1 && cards[j] == cards[j + 1]) {
				counter[0] = cards[j];
			}
				
		}

		if (confirm == false && tracker == 0) {
			System.out.println("High Card!");
		} else if (confirm == false && tracker == 1) {
			System.out.println("Pair!");
		} else if (confirm == false && tracker == 2) {
			System.out.println("Two Pair!");
		} else if (confirm == false && tracker == 3) {
			System.out.println("Three of a Kind!");
		} else if (confirm == false && tracker == 4) {
			System.out.println("Straight!");
		} else if (confirm == false && tracker == 3) {
			System.out.println("Full House!");
		} else if (confirm == true && tracker == 3) {		
			System.out.println("Four of a Kind!");
		}*/

		// System.out.println("confirm is " + confirm + ". Tracker is " + tracker + ". Counter has " + counter[0] + ", " + counter[1] + ", " + counter[2] + ", " + counter[3] + ", ");
	
		// 3. print out category of hand they represent
	}

	/*public static boolean doubleCheck(int[] hand) {
			
		for (int j = 0; j < hand.length - 1; j++) {
			
			if (j >= 2) {
				break;
			} else if ((hand[j] == hand[j + 1]) && (hand[j] == hand[j + 2]) && (hand[j] == hand[j + 3])) {
				return true;
			}
		}

		return false;
	}
*/
	public static boolean containsPair(int[] hand) {
		int counter = 0;

		for (int i = 0; i < hand.length - 1; i++) {
			
			if (hand[i] == hand[i + 1])
				counter++;

		}
		
		if (counter == 1)  {
			// System.out.println("Counter is " + counter);
			return true;
		}

		return false;
	}

	public static boolean containsTwoPair(int[] hand) {
		int counter = 0;

		for (int i = 0; i < hand.length - 1; i++) {
			
			if (i == 4) {
				break;
			} else if (hand[i] == hand[i + 1] && hand[i] != hand[i + 2]) {
				counter++;
			}

		}
		
		if (counter == 2) {
			// System.out.println("Counter is " + counter);
			return true;	
		}
		return false;
	}

	public static boolean	containsThreeOfaKind(int[] hand) {
		int counter = 0;

		for (int i = 0; i < hand.length - 1; i++) {
			
			if ((hand[i] == hand[i + 1]) && (hand[i] == hand[i + 2])) {
				System.out.println("Counter is " + counter);
				return true;
			}
		}

		return false;
	}

	public static boolean containsStraight(int[] hand) {

		for (int i = 0; (i < hand.length - 1); i++) {

			if (hand[i] == hand[i + 1]) {
				return true;
				// tracker++;
			} 
		return false;
	}

	public static boolean containsFullHouse(int[] hand) {
		return false;
	}

	public static boolean containsFourOfaKind(int[] hand) {
		return false;
	}
}