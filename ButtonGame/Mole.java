import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Mole implements ActionListener {

	int selected;
	int rows;
	JButton[] buttons = new JButton[9];
	Random rand = new Random();

	public Mole(JButton[] b, int r, int s) {

		selected = s;

		rows = r;

		for (int i = 0; i < 9; i++) {
			
			buttons[i] = b[i];
		}
	}

	public void actionPerformed(ActionEvent e) {

		if (selected == indexOfButton((JButton)e.getSource())) {
			
			selected = rand.nextInt(9);
			updateButtonColors();
		}
	}

	public void updateButtonColors() {

		for (int i = 0; i < buttons.length; i++) {
			
			if (i == selected) {
				
				buttons[selected].setOpaque(true);
				buttons[selected].setBackground(Color.blue);
				buttons[selected].setBorderPainted(false);
			} else {
				
				buttons[selected].setOpaque(true);
				buttons[selected].setBackground(Color.red);
				buttons[selected].setBorderPainted(false);
			}
		}

		// System.out.println(buttons[selected]);
	}

	private int indexOfButton(JButton b) {

		for (int i = 0; i < buttons.length; i++) {
			
			if (buttons[i] == b) {
				
				return i;
			}
		}
		
		return -1;
	}
}