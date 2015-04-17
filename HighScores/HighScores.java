import java.util.*;

class HighScores {
	public static void main(String[] args) {
		// record data scores
		ArrayList<Integer> scores = new ArrayList<Integer>();
		ArrayList<String> names = new ArrayList<String>();

		// 1. ask for 5 names and 5 scores (integers)
			// 1a. toggle between names and scores
		initialize(names, scores);

		// 3. Sort scores array. The index of the order should be associated with inputed names
		// Collections.sort(names);
		sort(names, scores);

		// 4. print out names with scores in descending order
		System.out.println("\nTop Scorers:");

		display(names, scores);
	}

	public static void initialize(ArrayList<String> names, ArrayList<Integer> scores) {

		// 2. place names and scores in cooresponding ArrayList
		for (int i = 0; i < 5; i++) {
			
			names.add(i, getName(i + 1));
			scores.add(i, getScore(i + 1));

		}
	}

	public static String getName(int value) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the name for score #" + value + ": ");

		return input.nextLine();
	}

	public static int getScore(int value) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the score for score #" + value + ": ");

		return input.nextInt();
	}

	public static void display(ArrayList<String> names, ArrayList<Integer> scores) {
		
		for (int j = 0; j < scores.size(); j++) {
			
			System.out.print(names.get(j) + ": ");
			System.out.println(scores.get(j));

		}

		System.out.println();
	}

	public static void sort(ArrayList<String> names, ArrayList<Integer> scores) {
		int temp;
		int highestValue;
		int index;
		
		String coorespondant;
		String tempValue;

		boolean flag = true;

		while (flag) {

			flag = false;

			for (int j = 0; j < scores.size() - 1; j++) {

				if (scores.get(j) < scores.get(j + 1)) {
					highestValue = scores.get(j + 1);
					coorespondant = names.get(j + 1);
					index = j + 1;

					temp = scores.get(j);
					scores.set(j, highestValue);
					scores.set(index, temp);

					tempValue = names.get(j);
					names.set(j, coorespondant);
					names.set(index, tempValue);

					flag = true;
				}
			}
		}
	}
}