import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

// dibuja varios cuadrados
public class Cuadrados extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.BLUE);
		for (int i = 0; i < 10; i++) {

			g.drawRect(50 + i * 10, 50 + i * 10, 40 + i * 10, 40 + i * 10);

		}

		
	}

}
