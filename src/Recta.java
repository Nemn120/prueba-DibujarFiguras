
public class Recta {
	private Punto pinicio;
	private Punto pfinal;
	
	
	public Recta() {
		// TODO Auto-generated constructor stub
	}
	public Recta(Punto pinicio, Punto pfinal) {
		this.pinicio = pinicio;
		this.pfinal = pfinal;
	}
	
	public Punto getPfinal() {
		return pfinal;
	}
	public Punto getPinicio() {
		return pinicio;
	}
	public void setPfinal(Punto pfinal) {
		this.pfinal = pfinal;
	}
	public void setPinicio(Punto pinicio) {
		this.pinicio = pinicio;
	}

}
