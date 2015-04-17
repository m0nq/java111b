import java.util.*;

class NumberGuesser {

	private int min;
	private int max;
	private int middle;
	private final int INITIALMIN = 1;
	private final int INITIALMAX = 100;
	// public char answer = 'a';
	
	public NumberGuesser(int lowerBound, int upperBound) {
	
		min = lowerBound;
		max = upperBound;
		middle = getMidpoint(lowerBound, upperBound);
		// char answer = 'a';
	}

	public void higher() {
		
		min = middle;
		middle = getMidpoint(min, max);

	}

	public void lower() {

		max = middle;
		middle = getMidpoint(min, max);

	}

	public int getCurrentGuess() {
		
		return getMidpoint(min, max);

	}

	public void reset() {
		min = INITIALMIN;
		max = INITIALMAX;
	}

	public int getMidpoint(int low, int high) {
		
		return middle = (low + high) / 2;
		
	}

}