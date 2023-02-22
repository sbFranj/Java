package ejercicio01;

public class Rectangulo {
	
	private double longitud;
	private double ancho;
	
	
	public Rectangulo() {
		super();
		this.longitud=1;
		this.ancho=1;
	}
	public Rectangulo(double longitud, double ancho) {
		this();
		setLongitud(longitud);
		setAncho(ancho);
	}
	
	public double calcularPerimetro() {
		return (this.longitud*2)+(this.ancho*2);
	}
	public double calcularArea() {
		return this.longitud*this.ancho;
	}
	
	public double getLongitud() {
		return longitud;
	}
	public double getAncho() {
		return ancho;
	}
	public void setLongitud(double longitud) {
		if(longitud>0 && longitud<20) {
			this.longitud = longitud;			
		}
	
	}
	public void setAncho(double ancho) {
		if(ancho>0 && ancho<20) {
			this.ancho = ancho;			
		}
	}
	
	
	
	
}
