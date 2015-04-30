import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickCountFrame extends JFrame {

	private int count;
	private int x, y = 50;
	private JLabel label;

	public ClickCountFrame() {
	
		super("Click Count Frame");
		setPreferredSize(new Dimension(250, 100));
		setLocation(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JComponent painter = new PaintingComponent();
		painter.setBackground(Color.WHITE);
		painter.setOpaque(true);
		painter.setPreferredSize(new Dimension(250, 100));
		
		painter.addMouseMotionListener(new MouseMotionAdapter() {

			public void mouseDragged(MouseEvent e) {

				x = e.getX();
				y = e.getY();
				repaint();
			}

			public void mouseMoved(MouseEvent e) {

				System.out.println("moved...");
		}});

		getContentPane().add(painter);

		pack();
		setVisible(true);
	}

	private class MyMouseListener implements MouseListener {
		
		public void mouseClicked(MouseEvent e) {

			System.out.println("Mouse clicked!");
			x = e.getX();
			y = e.getY();
			repaint();
		}

		public void mouseEntered(MouseEvent e) {

			System.out.println("Mouse entered the area!");
		}

		public void mouseExited(MouseEvent e) {

			System.out.println("Mouse left the area!");
		}

		public void mousePressed(MouseEvent e) {

			System.out.println("Mouse pressed!");
		}

		public void mouseReleased(MouseEvent e) {

			System.out.println("Mouse released!");
		}
	}

	private void updateLabelText() {

		String labelText = "Click count: " + count;
		label.setText(labelText);
	}

	private class PaintingComponent extends JComponent {
		
		public void paintComponent(Graphics g) {
			
			super.paintComponent(g);

			g.setColor(Color.RED);
			g.fillOval(x, y, 20, 20);

			g.setColor(Color.BLACK);
			g.drawOval(x, y, 20, 20);
		}
	}
}





