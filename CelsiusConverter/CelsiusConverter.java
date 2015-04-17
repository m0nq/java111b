import java.awt.event.*;
import javax.swing.*;

class CelsiusConverter implements ActionListener {
	
	private JButton convert;
	private JTextField textField;
	private int celsius = 0;
	private int farenheit = 0;

	public CelsiusConverter(JButton u, JTextField t) {

		textField = t;
		convert = u;
		// farenheit = f;
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == convert) {
			
			celsius = (farenheit - 32) * (5/9);
			textField.setText("" + celsius);			
		}
	}
}