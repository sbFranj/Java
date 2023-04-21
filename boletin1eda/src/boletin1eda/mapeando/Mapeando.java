package com.mapas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Mapeando {

	
	
	
	/**
	 * Recibe una colección de personas y las agrupa por género
	 * @param personas
	 * @return Mapa con la colección de personas clasificadas por género
	 */
	public static Map mapearPersonasPorGenero(Collection<Persona> personas) {
		Map<Genero, Set<Persona>> tmp = new HashMap<>();
		Iterator<Persona> it = personas.iterator();
		while(it.hasNext()) {
			Persona tmpP = it.next();
			if(tmp.containsKey(tmpP.getGenero())){
				tmp.get(tmpP.getGenero()).add(tmpP);
			}else {
				tmp.put(tmpP.getGenero(), new HashSet<>());
				tmp.get(tmpP.getGenero()).add(tmpP);
			}
		}
		
		return tmp;
	}
	
	
	/**
	 * Recibe una colección de números y cuenta cuantas ocurrencias hay de cada uno de ellos
	 * creando un mapa en el que aparece cada número junto a su frecuencia de aparición
	 * @param numeros
	 * @return Tabla de frecuencias de los números facilitados
	 */
	public Map<Integer, Integer> contarNumeros(Collection<Integer> numeros){
		Map<Integer, Integer> tmp = new HashMap<>();
		Iterator<Integer> it = numeros.iterator();
		while(it.hasNext()) {
			Integer tmpI = it.next();
			Integer contador=0;
			if(tmp.containsKey(tmpI)){
				tmp.replace(tmpI, tmp.get(tmpI)+1);
				
			}else {
				tmp.put(tmpI, contador);
				tmp.replace(tmpI, tmp.get(tmpI)+1);
				
			}
		}
		
		
		return tmp;
	}
	
	
	/**
	 * Genera una lista de números aleatorios entre 0 y 20 del tamaño indicado
	 * @param size tamaño de la lista
	 * @return lista de size números aleatorios
	 */
	public static Collection<Integer> generarNumerosAleatorios(int size){
		List<Integer> numeros = new ArrayList<>() {{
			for(int i=0; i<size; i++) {
				add(new Random().nextInt(0, 20));
			}
		}};
		
		return numeros;
	}
}
