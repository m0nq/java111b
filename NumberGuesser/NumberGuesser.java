import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class NumberGuesser extends JFrame {

	private int min;
	private int max;
	private int middle;
	private char answer;
	// private boolean playAgain;

	public NumberGuesser(int upperLimit, int lowerLimit) {

		min = 1;
		max = 100;
		middle = getMidpoint(min, max);
		answer = 'a';
		NumberGuesserController ngc = new NumberGuesserController();
	}

	public int getMidpoint(int low, int high) {
		
		return (low + high) / 2;
	}

	public boolean playAgain(boolean bool) {

		return bool;
	}

	public void higher() {

	}

	public void lower() {

	}

	public int getCurrentGuess() {
		
	}
}