import java.awt.event.*;
import javax.swing.*;

class ClickCountController implements ActionListener {
	
	private JButton up;
	private JButton down;
	private JTextField textField;
	private int count = 0;

	public ClickCountController(JButton u, JButton d, JTextField t) {

		textField = t;
		up = u;
		down = d;
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == up) {
			
			textField.setText("Count: " + ++count);			
		} 
		else if (e.getSource() == down) {
			
			textField.setText("Count: " + --count);
		}
	}
}