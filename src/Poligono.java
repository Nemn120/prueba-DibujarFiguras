
import java.awt.Polygon;
import java.awt.geom.*;

public class Poligono {
	
	private int npuntos;
	private int[] xpuntos;
	private int[] ypuntos;
	
	
	public Poligono() {
		// TODO Auto-generated constructor stub
	}
	public Poligono(int npuntos, int[] xpuntos, int[] ypuntos ) {
		this.npuntos= npuntos;
		this.xpuntos = xpuntos;
		this.ypuntos = ypuntos;
	}
	// metodo para crear un objeto tipo poligono necesario para graficar
	// 
	public Polygon PrepararPoligono() {
		return new Polygon(this.getXpuntos(), this.getYpuntos() , this.getNpuntos());
	}
	
	public int getNpuntos() {
		return npuntos;
	}
	public int[] getXpuntos() {
		return xpuntos;
	}
	public int[] getYpuntos() {
		return ypuntos;
	}
	public void setNpuntos(int npuntos) {
		this.npuntos = npuntos;
	}
	public void setXpuntos(int[] xpuntos) {
		this.xpuntos = xpuntos;
	}
	public void setYpuntos(int[] ypuntos) {
		this.ypuntos = ypuntos;
	}

	
}
