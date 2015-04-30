import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class NumberGuesserController {
	
	private JPanel panel;
	
	private JButton lowerButton;
	private JButton correctButton;
	private JButton higherButton;
	
	private JLabel inquiryDisplay;
	private JLabel numberDisplay;

	final private int TEXT_COLUMN = 4;

	final private int WINDOW_WIDTH = 280;
	final private int WINDOW_HEIGHT = 110;

	public NumberGuesserController() {

		buildFrame();

		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setLocation(300, 300);
		setTitle("Number Guesser");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// setLayout(new FlowLayout());

		buildPanel();

		add(panel);

		setVisible(true);
	}

	private	void buildFrame() {

		panel = new JPanel();
		lowerButton = new JButton("Lower");
		correctButton = new JButton("Correct");
		higherButton = new JButton("Higher");
		inquiryDisplay = new JLabel("Guess a number between 1 and 100.");
		numberDisplay = new JLabel("is it... " + /*getMidpoint(1, 100)*/ + "?");
	}

	private void buildPanel() {
		
		// add buttons and labels to panel
		panel.add(inquiryDisplay);
		panel.add(lowerButton);
		panel.add(correctButton);
		panel.add(higherButton);
		panel.add(numberDisplay);

		// add action listeners
		lowerButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				max = middle;
				middle = getMidpoint(min, max);
				numberDisplay.setText("Is it... " + middle + "?");
		}});
		
		correctButton.addActionListener(new NumberGuesserListener() {

			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Nice. your number was " + middle + ".");
		}});

		higherButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				min = middle;
				middle = getMidpoint(min, max);
				numberDisplay.setText("Is it... " + middle + "?");
		}});
	}
}