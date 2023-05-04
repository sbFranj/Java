package mockexamcolecciones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
	
	public Map<Integer, Integer> agruparPorRepeticionNumeros() {
		List<Integer> numeros = new ArrayList<>();
		for(LocalDate k : sorteos.keySet()) {
			numeros.addAll(sorteos.get(k).getNumeros());
		}
		Map<Integer, Integer> tmp =new HashMap<>();
		Iterator<Integer> it = numeros.iterator();
		while(it.hasNext()) {
			Integer tmpNInteger = it.next();
			if(!tmp.containsKey(tmpNInteger)) {
				tmp.put(tmpNInteger, 1);
			}tmp.put(tmpNInteger, tmp.get(tmpNInteger)+1);
		}
		
		return tmp;
	}
	
	public Integer mayorRepeticion() {
		Integer numero=-1;
		Map<Integer, Integer> tmp = agruparPorRepeticionNumeros();
		for(Integer n : tmp.keySet()) {
			if(tmp.get(n)>numero) {
				numero=tmp.get(n);
			}
		}
		
		return numero;
	}
	
	public String numerosMasRepetidos() {
		StringBuilder mensaje = new StringBuilder();;
		Map<Integer, Integer> tmp = agruparPorRepeticionNumeros();
		Integer mayor = mayorRepeticion();
		for(Integer n : tmp.keySet()) {
			if(tmp.get(n).equals(mayor)) {
				mensaje.append(n+"   ");
			}
		}
		return "Los numeros con mayor repeticion son: \n"+mensaje.toString()+"\ncon un total de: "+mayor+" repeticiones";
	}
	
	public Integer menorRepeticion() {
		Integer numero=mayorRepeticion();
		Map<Integer, Integer> tmp = agruparPorRepeticionNumeros();
		for(Integer n : tmp.keySet()) {
			if(tmp.get(n)<numero) {
				numero=tmp.get(n);
			}
		}
		
		return numero;
	}
	
	public String numerosMenosRepetidos() {
		StringBuilder mensaje = new StringBuilder();;
		Map<Integer, Integer> tmp = agruparPorRepeticionNumeros();
		Integer menor = menorRepeticion();
		for(Integer n : tmp.keySet()) {
			if(tmp.get(n).equals(menor)) {
				mensaje.append(n+"   ");
			}
		}
		return "Los numeros con menor repeticion son: \n"+mensaje.toString()+"\ncon un total de: "+menor+" repeticiones";
	}
	
	public Map<Integer, Integer> agruparPorRepeticionEstrellas() {
		List<Integer> numeros = new ArrayList<>();
		for(LocalDate k : sorteos.keySet()) {
			numeros.addAll(sorteos.get(k).getEstrellas());
		}
		Map<Integer, Integer> tmp =new HashMap<>();
		Iterator<Integer> it = numeros.iterator();
		while(it.hasNext()) {
			Integer tmpNInteger = it.next();
			if(!tmp.containsKey(tmpNInteger)) {
				tmp.put(tmpNInteger, 1);
			}tmp.put(tmpNInteger, tmp.get(tmpNInteger)+1);
		}
		
		return tmp;
	}
	
	public Integer mayorRepeticionEstrellas() {
		Integer numero=-1;
		Map<Integer, Integer> tmp = agruparPorRepeticionEstrellas();
		for(Integer n : tmp.keySet()) {
			if(tmp.get(n)>numero) {
				numero=tmp.get(n);
			}
		}
		
		return numero;
	}
	public String estrellasMasRepetidas() {
		StringBuilder mensaje = new StringBuilder();;
		Map<Integer, Integer> tmp = agruparPorRepeticionEstrellas();
		Integer mayor = mayorRepeticionEstrellas();
		for(Integer n : tmp.keySet()) {
			if(tmp.get(n).equals(mayor)) {
				mensaje.append(n+"   ");
			}
		}
		return "Las estrellas con mayor repeticion son: \n"+mensaje.toString()+"\ncon un total de: "+mayor+" repeticiones";
	}
	
	public Integer menorRepeticionEstrellas() {
		Integer numero=mayorRepeticionEstrellas();
		Map<Integer, Integer> tmp = agruparPorRepeticionEstrellas();
		for(Integer n : tmp.keySet()) {
			if(tmp.get(n)<numero) {
				numero=tmp.get(n);
			}
		}
		
		return numero;
	}
	
	public String estrellasMenosRepetidas() {
		StringBuilder mensaje = new StringBuilder();;
		Map<Integer, Integer> tmp = agruparPorRepeticionEstrellas();
		Integer mayor = menorRepeticionEstrellas();
		for(Integer n : tmp.keySet()) {
			if(tmp.get(n).equals(mayor)) {
				mensaje.append(n+"   ");
			}
		}
		return "Las estrellas con menor repeticion son: \n"+mensaje.toString()+"\ncon un total de: "+mayor+" repeticiones";
	}
	
	public int maximoAciertosPosibles(Combinacion otra) {
		int aciertos =-1;
		List<Combinacion> tmp =new ArrayList<>();
		for(LocalDate k : sorteos.keySet()) {
			tmp.add(sorteos.get(k));
		}
		Iterator<Combinacion> it = tmp.iterator();
		while(it.hasNext()) {
			Combinacion tmpC = it.next();
			if(tmpC.comprobarCombinacion(otra)>aciertos) {
				aciertos=tmpC.comprobarCombinacion(otra);
			}
		}
		
		return aciertos;
	}
	
	public String mayorSecuenciaDeNumerosConsecutivos(){
		int mayorRepeticion = 0;
		String mensaje = null;
		for(LocalDate k : sorteos.keySet()) {
			if(sorteos.get(k).numeroDeNumerosConsecutivos()>mayorRepeticion) {
				mayorRepeticion=sorteos.get(k).numeroDeNumerosConsecutivos();
				mensaje=sorteos.get(k).getNumeros()+" => "+mayorRepeticion;
			}
			
				
		}
		return mensaje.substring(1,19)+mensaje.substring(20);
		
	}

}
