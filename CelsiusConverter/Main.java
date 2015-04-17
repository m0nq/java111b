import javax.swing.*;
import java.awt.*;

class Main {
	
	public static void main(String[] args) {
		
		JFrame frame;
		JTextField textField;
		JButton convertButton;
		JLabel display;

		// Construct the swing objects
		frame = new JFrame("Celsius Converter");
		textField = new JTextField("0");
		convertButton = new JButton("Convert");
		display = new JLabel("Farenheit: ");

		// Add the components to the frame
		frame.getContentPane().add(textField);
		frame.getContentPane().add(convertButton);
		frame.getContentPane().add(display);

		// layout...
		frame.getContentPane().setPreferredSize(new Dimension(200, 100));
		frame.setLocation(300, 300);
		frame.setLayout(new FlowLayout());
		textField.setPreferredSize(new Dimension(200, 50));
		textField.setHorizontalAlignment(JLabel.CENTER);

		// listeners
		CelsiusConverter c = new CelsiusConverter(convertButton, textField);
		convertButton.addActionListener(c);

		// Set visible
		frame.pack();
	}
}