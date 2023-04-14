package boletin1eda.ej07;

public class Cliente {
	
	private int numeroCliente;
	private static int siguiente;
	
	
	public Cliente() {
		super();
		this.numeroCliente=++siguiente;
	}

	
	public int getNumeroCliente() {
		return this.numeroCliente;
	}
}
