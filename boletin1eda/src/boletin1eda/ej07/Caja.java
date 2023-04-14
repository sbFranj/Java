package boletin1eda.ej07;

import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Caja {
	
	protected List<Cliente> clientes;
	private int numeroCaja;
	private static int siguiente;
	
	public Caja() {
		this.clientes = new ArrayList<>();
	}
	
	protected void setNumeroCaja(int numeroCaja) {
		this.numeroCaja=numeroCaja;
	}
	
	public int getNumeroCaja() {
		return this.numeroCaja;
	}
	
	public void addCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void removeCliente(Cliente cliente) {
		this.clientes.remove(cliente);
	}
	
	public Cliente encontrarCliente(int numeroCliente) {
		Cliente tmp=null;
		Iterator<Cliente> it = clientes.iterator();
		while(it.hasNext()) {
			Cliente Ctmp = it.next();
			if(Ctmp.getNumeroCliente()==numeroCliente) {
				tmp=Ctmp;
			}
		}
		
		return tmp;
	}
	
	public int numeroClientes() {
		return this.clientes.size();
	}
}
