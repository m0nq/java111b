import java.util.*;

class BlackjackGame 
{
	public static void main(String[] args) 
	{
		final int MAX = 11;

		// declare initial playing cards
		int playerCard1;
		int playerCard2;

		// updated hand
		int cardAgain;

		// accumulation variable
		int playerTotal;

		// dealers cards
		int dealerCard1;
		int dealerCard2;

		// dealer accumlation variable
		int dealerTotal;

		// variable for hit or stay choice
		char anotherCard = 'y';
		char playAgain = 'n';

		// instantiate Scanner object
		Scanner input = new Scanner(System.in);

		// instantiate random number generator <= 11
		Random rand = new Random();
			
		do
		{
			// (re)set cardAgain
			cardAgain = 0;

			// (re)set anotherCard to "no"
			anotherCard = 'n';

			// call a random card for card 1
			playerCard1 = rand.nextInt(MAX - 1) + 1;

			// call a random card for card 2
			playerCard2 = rand.nextInt(MAX - 1) + 1;

			// tally inital hand together
			playerTotal = playerCard1 + playerCard2;

			// draw dealers cards
			dealerCard1 = rand.nextInt(MAX - 1) + 1;
			dealerCard2 = rand.nextInt(MAX - 1) + 1;

			// add dealers cards together
			dealerTotal = dealerCard1 + dealerCard2;

			System.out.println("The dealer's showing a(n) " + dealerCard1);
		
			// display first pair of cards
			System.out.println("Your first cards are " + playerCard1 + " & " + playerCard2);

			if (playerTotal > 21) 
			{
				System.out.println("Your total is " + playerTotal);
				System.out.println("Sorry, pal. You busted.");
				break;
			} 
			else if (playerTotal == 21) 
			{
				System.out.println("Your total is " + playerTotal);
				System.out.println("BlackJack!!");
				break;
			}
			else
			{
				System.out.println("...so your total is " + playerTotal);
				System.out.print("Hit? (y/n): ");
				anotherCard = input.next().charAt(0);
			}
			
			while (anotherCard == 'y')
			{
				// draw another random card
				cardAgain = rand.nextInt(MAX - 1) + 1;

				// display next card
				System.out.println("Next card is " + cardAgain);

				// add the random card to the playerTotal
				playerTotal = playerTotal + cardAgain;

				if (playerTotal > 21) 
				{
					System.out.println("Your total is " + playerTotal);
					System.out.println("Sorry, pal. You busted.");
					break;
				} 
				else
				{
					System.out.println("Your total is " + playerTotal);
					System.out.print("Another? (y/n): ");
					anotherCard = input.next().charAt(0);
				}		
			}

			// dealers play
			while (dealerTotal < 17)
			{
				cardAgain = rand.nextInt(MAX - 1) + 1;
				dealerTotal = dealerTotal + cardAgain;
				System.out.println("Dealer pulls a(n) " + cardAgain);
				System.out.println("Dealers total is " + dealerTotal);
			}

			// winning conditions
			if ((dealerTotal < playerTotal) && (playerTotal <= 21))
			{
				System.out.println("You win! Your total was " + playerTotal);
				System.out.println("Dealers total was " + dealerTotal);
			} 
			else if ((dealerTotal <= 21) && (playerTotal <= 21) && (dealerTotal == playerTotal))
			{
				System.out.println("Push. Your total was " + playerTotal);
				System.out.println("Dealer total was " + dealerTotal);
			} 
			else if ((dealerTotal <= 21) && (playerTotal <= 21) && (dealerTotal > playerTotal))
			{
				System.out.println("Dealer wins! Your total was " + playerTotal);
				System.out.println("Dealers total was " + dealerTotal);
			}
			else if ((dealerTotal > 21) && (playerTotal <= 21))
			{
				System.out.println("Dealer busted. You win! Your total was " + playerTotal);
				System.out.println("Dealers total was " + dealerTotal);
			}
			else if ((dealerTotal <= 21) && (playerTotal > 21)) 
			{
				System.out.println("Your bust means the dealer wins! Your total was " + playerTotal);
				System.out.println("Dealers total was " + dealerTotal);
			}
			else
			{
				System.out.println("Looks like a push. Both players busted.");
			}

			System.out.print("Play again? (y/n): ");
			playAgain = input.next().charAt(0);
			
		} while (playAgain == 'y');
	}
}