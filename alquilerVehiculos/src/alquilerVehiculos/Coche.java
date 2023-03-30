package alquilerVehiculos;

public class Coche extends Vehiculo {
	
	protected Combustible combustible;

	public Coche(String matricula, Gama gama, Combustible combustible) throws Exception {
		super(matricula, gama);
		if(combustible!=null) {
			this.combustible=combustible;
		}else {
			throw new Exception("CocheException");
		}
	}

	@Override
	public double calcularPrecio() {
		return this.gama.getPrecio()+this.combustible.getPrecio();
	}

}
