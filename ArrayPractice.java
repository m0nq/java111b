import java.util.*;

class ArrayPractice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// System.out.print("How many values?: ");
		// char[] values = toCharArray("helloooo");

		// char c = values[2];

		// System.out.println(c);

		int[] a = {23, 6, 11, 18};

		// System.out.print("What are you looking for? ");
		// int value = input.nextInt();
		
		// for (int i = 0; i < values.length; i++) {
			
		// 	System.out.println(values[i]);

		// }

		Arrays.sort(a);
		
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + ", ");

		if (containsEqualNeighbors(a)) {
			System.out.println("it's true!");
		} else {
			System.out.println("It's false.");
		}

	}

	public static boolean containsEqualNeighbors(int[] arr) {

		for (int i = 0; i < (arr.length - 1); i++) {
			
			if (arr[i] == arr[i+1]) {
				return true;
			}
		}
		return false;
	}
}