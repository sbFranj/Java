package boletin1eda.ej06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Diccionario {
	
	private Set<Palabra> diccionario;
	
	public Diccionario() {
		super();
		diccionario = new HashSet<>();
	}
	
	public void addPalabra(String palabra, String significado) {
		boolean existe=false;
		Iterator<Palabra> it = diccionario.iterator();
		while(it.hasNext()) {
			Palabra tmp=it.next();
			if(tmp.getPalabra().toLowerCase().equals(palabra.toLowerCase())) {
				tmp.addSignificado(significado);
				existe=true;
			}
		}if(!existe) {
			diccionario.add(new Palabra(palabra, significado));
		}
	}
	
	public String buscarPalabra(String palabra) {
		boolean existe=false;
		String temporal="";
		Iterator<Palabra> it = diccionario.iterator();
		while(it.hasNext()) {
			Palabra tmp=it.next();
			if(tmp.getPalabra().toLowerCase().equals(palabra.toLowerCase())) {
				existe=true;
				temporal=tmp.mostrarSignificado();
			}
		}
		return temporal;
	}
	
	public void borrarPalabra(String palabra) {
		Iterator<Palabra> it = diccionario.iterator();
		while(it.hasNext()) {
			Palabra tmp=it.next();
			if(tmp.getPalabra().toLowerCase().equals(palabra.toLowerCase())) {
				tmp.borrarSignificados();
				it.remove();
			}
		}
	}
	
	public Collection<Palabra> listarPalabrasQueEmpiecenPor(String cadena) {
		Iterator<Palabra> it = diccionario.iterator();
		List<Palabra> listaTemporal = new ArrayList<>();
		while(it.hasNext()) {
			Palabra tmp=it.next();
			if(tmp.getPalabra().toLowerCase().startsWith(cadena.toLowerCase())) {
				listaTemporal.add(tmp);
			}			
		}
		Iterator<Palabra> it2 = listaTemporal.iterator();
		Collections.sort(listaTemporal, new ComparaPalabra());
		
		return listaTemporal;
	}

}
