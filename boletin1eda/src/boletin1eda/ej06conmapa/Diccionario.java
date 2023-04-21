package boletin1eda.ej06conmapa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Diccionario {
	
	private Map<String, Set<String>> palabras;
	
	public Diccionario() {
		super();
		palabras = new HashMap<>();
	}
	
	public void addPalabra(String palabra, String significado) {
		if(palabras.containsKey(palabra)) {
			palabras.get(palabra).add(significado);
		}else {
			palabras.put(palabra, new HashSet<>());
			palabras.get(palabra).add(significado);			
		}
	}
	
	public String buscarPalabra(String palabra) {
		StringBuilder temporal=new StringBuilder();
		if(palabras.containsKey(palabra)){
			Iterator<String> it = palabras.get(palabra).iterator();
			while(it.hasNext()) {
				temporal.append(it.next()+"\n");
			}
		}else {
			temporal.append("Palabra no encontrada");
		}
		
		return temporal.toString();
	}
	
	public void borrarPalabra(String palabra) throws Exception {
		if(palabras.containsKey(palabra)){
			palabras.remove(palabra);
		}else {
			throw new Exception("Palabra no encontrada");
		}
	}
	
	public String listarPalabrasQueEmpiecenPor(String cadena) {
		StringBuilder tmp = new StringBuilder();
		List<String> listaTemporal = new ArrayList<>();
		for(String k: palabras.keySet()) {
			listaTemporal.add(k);
		}
		Collections.sort(listaTemporal, new ComparaPalabra());
		Iterator<String> it = listaTemporal.iterator();
		while(it.hasNext()) {
			String tmpString = it.next();
			if(tmpString.toLowerCase().startsWith(cadena.toLowerCase())) {
				tmp.append(tmpString+" "+palabras.get(tmpString)+"\n");
			}
		}
		
		return tmp.toString();
	}

}
