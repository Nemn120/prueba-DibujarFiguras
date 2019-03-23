import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

// llamada a graphics
public class Dibujo extends JPanel{

	public void paintComponent(Graphics g) {
		
	// llamada a los componentes de pintura
	super.paintComponent(g);
	
	Poligono p1 = new Poligono();
	p1.setNpuntos(4);
	int[] cordenadasx = {150,220,220,150};
	int[] cordenadasy = {300,300,200,200};
	p1.setXpuntos(cordenadasx);
	p1.setYpuntos(cordenadasy);
	
	g.setColor(Color.ORANGE);
	// con sin relleno
	//g.drawPolygon(p1.PrepararPoligono());
	// con relleno
	g.fillPolygon(p1.PrepararPoligono());
	
	Poligono p2 = new Poligono();
	
	// dibujar el tejado
	int[] cordenadasx2 = {130,240,185};
	int[] cordenadasy2 = {200,200,150};
	
	p2.setNpuntos(3);
	p2.setXpuntos(cordenadasx2);
	p2.setYpuntos(cordenadasy2);
	g.setColor(Color.cyan);
	g.fillPolygon(p2.PrepararPoligono());
	
	// dibujando el sol
	
	Ovalo o1= new Ovalo();
	o1.setX(300);
	o1.setY(50);
	o1.setAlto(50);
	o1.setAncho(50);
	
	g.setColor(Color.YELLOW);
	g.fillOval(o1.getX(), o1.getY(), o1.getAncho(), o1.getAlto());
	
	
	
	
	//dibujando la recta
	Punto punt1 = new Punto(0,300);
	Punto punt2= new Punto(400,300);
	Recta rec1 = new Recta(punt1,punt2);
	
	
	rec1.setPinicio(punt1);
	rec1.setPfinal(punt2);
	g.setColor(Color.green);
	
	g.drawLine(rec1.getPinicio().getPx(), rec1.getPinicio().getPy(), rec1.getPfinal().getPx(), rec1.getPfinal().getPy());
	
	
	
	
	}
	

}
