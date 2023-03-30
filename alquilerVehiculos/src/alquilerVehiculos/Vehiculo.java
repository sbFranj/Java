package alquilerVehiculos;

public abstract class Vehiculo {

	
	protected String matricula;
	protected Gama gama;
	
	public Vehiculo(String matricula, Gama gama) throws Exception {
		if(matricula!=null && !matricula.isEmpty() && gama!=null) {
			this.matricula=matricula;
			this.gama=gama;
		}else {
			throw new Exception("MatriculaException");
		}
	}
	
	public abstract double calcularPrecio();
	
	public String getMatricula() {
		return this.matricula;
	}
}
