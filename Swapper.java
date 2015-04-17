import java.util.*;

class Swapper {
	public static void main(String[] args) {
		
		int[] array = new int[5];

		Scanner input = new Scanner(System.in);

		// 1. read 5 cards form user.
		System.out.println("Enter five numbers.");

		// 1a. collect 5 integer values between 2 & 9
		for (int i = 0; i < array.length; i++) {
			
			System.out.print("Number " + (i+1) + ": ");
			int validator = input.nextInt();

			array[i] = validator;
		}
		
		classSort(array);

		System.out.println("Your array has been sorted!");
		
		for (int k = 0; k < array.length; k++) {
			
			System.out.print(array[k] + ", ");
		}

		System.out.println();
	}

	public static void classSort(int[] a) {
		boolean didSwap;

		for (int j = 0; j < a.length - 1; j++) {
		didSwap = false;

			for (int i = 0; i < a.length - 1; i++) {
				
				if (a[i] > a[i + 1]) {
					
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;

					didSwap = true;
				}
			}
		}
		/* ArrayList swap algorthim
			String temp = s;
			s.set(0, s.get(1));
			s.set(1, temp);*/

		/*for (int i = 0; i < a.length - 1; i++) {
		
		int indexOfSmallest = i;

			for (int j = i + 1; j < a.length; j++) {
				
				if (a[j] < a[indexOfSmallest]) {
					indexOfSmallest = j;

				}
				
		}*/
	}
}