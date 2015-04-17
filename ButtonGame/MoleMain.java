import javax.swing.*;
import java.awt.*;
import java.util.*;

class MoleMain {
	public static void main(String[] args) {
		
		final int ROW = 3;
		final int COUNT = ROW * ROW;
		final int BUTTON_WIDTH = 250;
		final int BUTTON_HEIGHT = 100;
		final int PADDING = 10;
		final int FRAME_WIDTH = ROW * BUTTON_WIDTH + (ROW + 1) * PADDING;
		final int FRAME_HEIGHT = ROW * BUTTON_HEIGHT + (ROW + 1) * PADDING;

		JFrame frame;
		JButton[] buttons = new JButton[COUNT];
		Random rand = new Random();
		int r = rand.nextInt(COUNT);

		frame = new JFrame("Button Colors Game");

		for (int i = 0; i < COUNT; i++) {
			
			buttons[i] = new JButton("" + (i + 1));
			buttons[i].setOpaque(true);
			buttons[i].setBackground(new Color(200, 100, 50));
			buttons[i].setBorderPainted(false);
			frame.getContentPane().add(buttons[i]);
			buttons[i].setPreferredSize(new Dimension(BUTTON_WIDTH, BUTTON_HEIGHT));
			buttons[i].setMargin(new Insets(PADDING, PADDING, PADDING, PADDING));

			Mole b = new Mole(buttons, ROW, r);
			buttons[i].addActionListener(b);
		}



		frame.setLayout(new FlowLayout());
		// frame.getContentPane().setBorder(new EmptyBorder(PADDING, PADDING, PADDING, PADDING));
		frame.getContentPane().setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
		frame.pack();
		frame.setVisible(true);
	}
}