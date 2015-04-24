import java.awt.event.*;
import javax.swing.*;

class CelsiusConverter extends JFrame {
	
	private JPanel panel;
	
	private JButton convertButton;
	
	private JTextField textField;
	
	private JLabel farenheitLabel;

	final private int TEXT_COLUMN = 4;

	final private int WINDOW_WIDTH = 180;
	final private int WINDOW_HEIGHT = 100;

	public CelsiusConverter() {

		buildFrame();

		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setTitle("Celsius Converter");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		buildPanel();

		add(panel);
		setVisible(true);
	}

	private	void buildFrame() {

		panel = new JPanel();
		convertButton = new JButton("Convert");
		textField = new JTextField(TEXT_COLUMN);
		farenheitLabel = new JLabel("Farenheit: degrees");
	}

	private void buildPanel() {

		panel.add(textField);
		panel.add(convertButton);
		panel.add(farenheitLabel);
		convertButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				celsiusToFarenheit(Integer.parseInt(textField.getText()));
			}
		});
	}

	private void celsiusToFarenheit(int c) {
			
			farenheitLabel.setText("Farenheit: " + ((c * (9/5)) + 32) + " degrees");
	}

	public static void main(String[] args) {

		// create a new celsius object
		new CelsiusConverter();
	}
}