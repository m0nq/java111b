import java.awt.event.*;
import javax.swing.*;

class CelsiusConverter extends JFrame {
	
	private JPanel panel;
	
	private JButton convertButton;
	
	private JTextField textField;
	
	private JLabel farenheitLabel;
	
	private int celsius;
	private int farenheit;

	final private int TEXT_COLUMN = 4;

	final private int WINDOW_WIDTH = 180;
	final private int WINDOW_HEIGHT = 100;

	public CelsiusConverter() {

		buildFrame(farenheit);

		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setTitle("Celsius Converter");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		buildPanel();

		add(panel);
		setVisible(true);
	}

	private	void buildFrame(int degree) {

		panel = new JPanel();
		convertButton = new JButton("Convert");
		textField = new JTextField(TEXT_COLUMN);
		farenheitLabel = new JLabel("Farenheit: " + farenheit + " degrees");
	}

	private void buildPanel() {

		panel.add(textField);
		panel.add(convertButton);
		panel.add(farenheitLabel);
		convertButton.addActionListener(new CelsiusButtonListener	());
	}

	public int celsiusToFarenheit() {

		return 0;
	}

	private class CelsiusButtonListener implements ActionListener {
	
		public void actionPerformed(ActionEvent e) {

			celsius = Integer.parseInt(textField.getText());
			
			farenheit = (celsius - 32) * (5/9);
			farenheitLabel.setText("Farenheit: " + farenheit + " degrees");
		}
	}
}