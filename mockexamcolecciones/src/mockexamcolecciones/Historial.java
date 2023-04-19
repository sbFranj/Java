package mockexamcolecciones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Historial {
	
	private Map<LocalDate, Combinacion> sorteos;
	
	public Historial(){
		sorteos= new HashMap<>();
	}
	
	public void addSorteo(LocalDate fecha, Combinacion combinacion) throws CombinacionException {
		if(fecha!=null && combinacion!=null) {
			sorteos.put(fecha, combinacion);	
		}else {
			throw new CombinacionException();
		}
	}
	
	public void addSorteo(int dia, int mes, int year, Combinacion combinacion) throws CombinacionException {
		if(combinacion!=null && LocalDate.of(year, mes, dia)!=null) {
			sorteos.put(LocalDate.of(year, mes, dia), combinacion);
		}else {
			throw new CombinacionException();
		}
	}
	
	public void actualizarSorteo(LocalDate fecha, Combinacion combinacion) throws CombinacionException {
		if(sorteos.containsKey(fecha)) {
			sorteos.replace(fecha, combinacion);
		}else {
			throw new CombinacionException();
		}
	}
	
	public void actualizarSorteo(int dia, int mes, int year, Combinacion combinacion) throws CombinacionException {
		if(sorteos.containsKey(LocalDate.of(year, mes, dia))) {
			sorteos.replace(LocalDate.of(year, mes, dia), combinacion);
		}else {
			throw new CombinacionException();
		}
	}
	
	public void borrarSorteo(LocalDate fecha) throws CombinacionException {
		if(sorteos.containsKey(fecha)) {
			sorteos.remove(fecha);
		}else {
			throw new CombinacionException();
		}
	}
	
	public String listarSorteosDesdeFecha(LocalDate fecha) {
		StringBuilder sb = new StringBuilder();
		if(sorteos.containsKey(fecha)) {
			for(LocalDate k : sorteos.keySet()) {
				if(k.isAfter(fecha)) {
					sb.append(k.toString()+": "+sorteos.get(k).toString());
				}
			}
		}
		
		return sb.toString();
	}
	
	public List<String> mostrarHistorico(){
		List<String> tmp = new ArrayList<>();
		for(LocalDate k : sorteos.keySet()) {
			tmp.add(k.toString()+sorteos.get(k));
		}
		
		return tmp;
	}
	public Map<String, Integer> comprobarAciertos(LocalDate fecha, Combinacion combinacion) throws HistorialException{
		Map<String, Integer> tmp = new HashMap<>();

		if(sorteos.containsKey(fecha)) {
			
			tmp.put("Para la fecha: "+fecha.toString()+" el numero premiado es: "+sorteos.get(fecha)+", numero a comprobar: "+combinacion, sorteos.get(fecha).comprobarCombinacion(combinacion));
		}else {
			throw new HistorialException();
		}
		
		return tmp;
	}

}
