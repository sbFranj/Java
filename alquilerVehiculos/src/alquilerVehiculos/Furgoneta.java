package alquilerVehiculos;

public class Furgoneta extends Vehiculo {
	
	private static final double PRECIO_POR_PMA = 0.5;
	private int pma;

	public Furgoneta(String matricula, Gama gama, int pma) throws Exception {
		super(matricula, gama);
		if(pma!=0) {
			this.pma=pma;
		}else {
			throw new Exception("FurgonetaException");
		}
	}

	@Override
	public double calcularPrecio() {
		return this.gama.getPrecio()+(this.pma*PRECIO_POR_PMA);
	}

}
