package alquilerVehiculos;

public enum Combustible {

	DIESEL(3.5),
	GASOLINA(2);
	
	private double precio;
	
	private Combustible(double combustible) {
		this.precio=combustible;
	}
	
	public double getPrecio() {
		return this.precio;
	}
}
