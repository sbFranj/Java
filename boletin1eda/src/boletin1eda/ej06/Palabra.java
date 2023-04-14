package boletin1eda.ej06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Palabra {

	private String palabra;
	private Set<String> significados;
	
	public Palabra(String palabra, String sifniciado) {
		super();
		this.palabra=palabra;
		this.significados = new HashSet<>();
		this.significados.add(sifniciado);
	}
	
	public String getPalabra() {
		return this.palabra;
	}
	
	public void addSignificado(String significado) {
		this.significados.add(significado);
	}
	
	public String mostrarSignificado() {
		StringBuilder temporal = new StringBuilder();
		Iterator<String> it = significados.iterator();
		while(it.hasNext()) {
			temporal.append("- "+it.next()+".\n");
		}
		
		return temporal.toString();
	}
	
	public void borrarSignificados() {
		significados.clear();
	}

	@Override
	public String toString() {
		return "\n"+this.palabra+"\nSignificado/s:\n"+mostrarSignificado();
	}
	
	
}
