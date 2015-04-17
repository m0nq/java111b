import java.awt.event.*;
import javax.swing.*;

class CelsiusConverter extends JFrame {
	
	private JPanel panel;
	
	private JButton convertButton;
	
	private JTextField textField;
	
	private JLabel farenheitLabel;
	private JLabel farenheitDisplay;
	
	private int celsius;
	private int farenheit;

	final private int WINDOW_WIDTH = 310;
	final private int WINDOW_HEIGHT = 100;

	public CelsiusConverter(int f, int c) {

		farenheit = f;
		celsius = c;

		objectBuilder(farenheit);

		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setTitle("Celsius Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();

		add(panel);
		setVisible(true);
	}

	private	void objectBuilder(int degree) {

		panel = new JPanel();
		convertButton = new JButton();
		textField = new JTextField();
		farenheitLabel = new JLabel("Farenheit: ");
		farenheitDisplay = new JLabel("" + degree + " degrees");
	}

	private void buildPanel() {

		panel.add(textField);
		panel.add(convertButton);
		panel.add(farenheitLabel);
		panel.add(farenheitDisplay);
	}

	public int celsiusToFarenheit() {

		return 0;
	}

	private class CelsiusControl implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == convertButton) {
			
			farenheit = (celsius - 32) * (5/9);
			textField.setText("" + celsius);			
		}
	}
}
}