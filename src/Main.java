import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {

		JFrame marco = new JFrame("Dibujar Figuras");

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Dibujo panelDibujo = new Dibujo();
		// marco.add(panelDibujo);

		Cuadrados cuadro = new Cuadrados();
		marco.add(cuadro);

		marco.setVisible(true);
		marco.setSize(400, 400);

	}

}
