import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class NumberGuesserII extends JFrame {

	private JPanel panel;
	
	private JButton lowerButton;
	private JButton correctButton;
	private JButton higherButton;
	
	private JLabel inquiryDisplay;
	private JLabel numberDisplay;

	private int min = 1;
	private int max = 100;
	private int middle = 50;
	private char answer = 'a';
	private boolean playAgain;

	final private int TEXT_COLUMN = 4;

	final private int WINDOW_WIDTH = 280;
	final private int WINDOW_HEIGHT = 110;

	public NumberGuesserII() {

		do {
			buildFrame();

			setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
			setLocation(300, 300);
			setTitle("Number Guesser II");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			// setLayout(new FlowLayout());

			buildPanel();

			add(panel);
			setVisible(true);
		} while (playAgain);
	}

	private	void buildFrame() {

		panel = new JPanel();
		lowerButton = new JButton("Lower");
		correctButton = new JButton("Correct");
		higherButton = new JButton("Higher");
		inquiryDisplay = new JLabel("Guess a number between 1 and 100.");
		numberDisplay = new JLabel("is it... " + getMidpoint(1, 100) + "?");
	}

	private void buildPanel() {

		panel.add(inquiryDisplay);
		panel.add(lowerButton);
		panel.add(correctButton);
		panel.add(higherButton);
		panel.add(numberDisplay);
		lowerButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				max = middle;
				middle = getMidpoint(min, max);
				numberDisplay.setText("Is it... " + middle + "?");
		}});
		
		correctButton.addActionListener(new NumberGuesserListener());

		higherButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				min = middle;
				middle = getMidpoint(min, max);
				numberDisplay.setText("Is it... " + middle + "?");
		}});
	}

	public static int getMidpoint(int low, int high) {
		
		return (low + high) / 2;
	}

	private class NumberGuesserListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == correctButton) {
			
				inquiryDisplay.setText("Excellent!");	
				numberDisplay.setText("It was " + middle + "!");
				
				// numberDisplay.setText("Do you want to play again?");
				panel.remove(correctButton);
				// lowerButton.setText("Yes");
				// higherButton.setText("No");
				
				/*if (e.getSource() == lowerButton) {
					
					playAgain = true;
				}
				else if (e.getSource() == higherButton) {
					
					playAgain = false;
				}*/
			}
		}
	}
}