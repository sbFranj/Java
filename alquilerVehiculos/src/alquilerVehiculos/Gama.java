package alquilerVehiculos;

public enum Gama {

	ALTA(50),
	MEDIA(40),
	BAJA(30);
	
	private int precio;
	
	private Gama(int gama) {
		this.precio=gama;
	}
	
	public int getPrecio() {
		return this.precio;
	}
}
