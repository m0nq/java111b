import java.util.*;

class Stars 
{
	public static void main(String[] args) 
	{
		do 
		{
			int size = askUserForSize();
			
			printSquare(size);

		} while (shouldPlayAgain());
	}

	// complete
	public static void printRepeating(int count, String pattern)
	{
		for (int i = 0; i < count; i++) {
			System.out.print(pattern);
		}
	}

	public static int askUserForSize()
	{
		// instantiate Scanner object
		Scanner input = new Scanner(System.in);

		// prompt user for integer
		System.out.println("Enter a size: ");
		
		// read in an integer value
		// return the value
		return input.nextInt();
	}

	public static boolean shouldPlayAgain()
	{
		Scanner input = new Scanner(System.in);

		// prompt user
		System.out.print("Play again? (y/n) ");
		// read character
		char value = input.next().charAt(0);
		// return true if the char is 'y'
		
		return value == 'y' || value == 'Y';
	}

	public static void printSquare(int size)
	{
		for (int i = 0; i < size; i++) {
			printRepeating(size, "* ");
			System.out.println();
		}
	}
}