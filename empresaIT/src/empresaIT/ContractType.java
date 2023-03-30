package empresaIT;

public enum ContractType {

	FULLTIME(1),
	PARTIAL(0.77);
	
	private double precio;
	
	private ContractType(double tipo) {
		this.precio=tipo;
	}
	
	public double getPrecio() {
		return this.precio;
	}
}
