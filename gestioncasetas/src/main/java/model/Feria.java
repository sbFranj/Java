package main.java.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Feria {
	
	private Set<Caseta> casetas; 
	
	public Feria() {
		this.casetas= new HashSet<>();
	}
	
	public void addCaseta(Caseta caseta) {
		casetas.add(caseta);
	}
	
	public String mostrarCasetasDeUnaCalle(String calle){
		StringBuilder sb = new StringBuilder();
		Iterator<Caseta> it = casetas.iterator();
		while(it.hasNext()) {
			Caseta tmp = it.next();
			if(tmp.getCalle().toUpperCase().equals(calle.toUpperCase())) {
				sb.append(tmp+"\n");
			}
		}
		return sb.toString();
	}
	
	public String mostrarCasetasFamiliares(){
		StringBuilder sb = new StringBuilder();
		Iterator<Caseta> it = casetas.iterator();
		while(it.hasNext()) {
			Caseta tmp = it.next();
			if(tmp.getClase().equals(Clase.FAMILIAR)) {
				sb.append(tmp+"\n");
			}
		}
		return sb.toString();
	}
	
	public String mostrarCasetasTipoDistrito(){
		StringBuilder sb = new StringBuilder();
		Iterator<Caseta> it = casetas.iterator();
		while(it.hasNext()) {
			Caseta tmp = it.next();
			if(tmp.getClase().equals(Clase.DISTRITO)) {
				sb.append(tmp+"\n");
			}
		}
		return sb.toString();
	}
	
	public String mostrarCasetasQueNoSonDistritoNiFamiliar(){
		StringBuilder sb = new StringBuilder();
		Iterator<Caseta> it = casetas.iterator();
		while(it.hasNext()) {
			Caseta tmp = it.next();
			if(!tmp.getClase().equals(Clase.DISTRITO) && !tmp.getClase().equals(Clase.FAMILIAR)) {
				sb.append(tmp+"\n");
			}
		}
		return sb.toString();
	}
	
	public String mostrarNumeroCasetasFamiliaresPorCalle() {
		StringBuilder sb = new StringBuilder();
		Map<String, Integer> tmp = new HashMap<>();
		Iterator<Caseta> it = casetas.iterator();
		while(it.hasNext()) {
			Caseta casetaTmp = it.next();
			if(casetaTmp.getClase().equals(Clase.FAMILIAR)) {
				if(!tmp.containsKey(casetaTmp.getCalle())) {
					tmp.put(casetaTmp.getCalle(), 0);
				}tmp.put(casetaTmp.getCalle(), tmp.get(casetaTmp.getCalle())+1);
			}
		}
		for(String c : tmp.keySet()) {
			sb.append("Calle "+c+" "+tmp.get(c)+" caseta/as familiares\n"); 
		}
		return sb.toString();
	}
	
	public String mostrarNumeroCasetasTipoDistritoPorCalle() {
		StringBuilder sb = new StringBuilder();
		Map<String, Integer> tmp = new HashMap<>();
		Iterator<Caseta> it = casetas.iterator();
		while(it.hasNext()) {
			Caseta casetaTmp = it.next();
			if(casetaTmp.getClase().equals(Clase.DISTRITO)) {
				if(!tmp.containsKey(casetaTmp.getCalle())) {
					tmp.put(casetaTmp.getCalle(), 0);
				}tmp.put(casetaTmp.getCalle(), tmp.get(casetaTmp.getCalle())+1);
			}
		}
		for(String c : tmp.keySet()) {
			sb.append("Calle "+c+" "+tmp.get(c)+" caseta/as tipo distrito\n"); 
		}
		return sb.toString();
	}
	
	public void borrarCaseta(String calle, int numero) {
		boolean existe =false;
		Iterator<Caseta> it = casetas.iterator();
		while(it.hasNext() && !existe) {
			Caseta tmp = it.next();
			if(tmp.getCalle().toUpperCase().equals(calle.toUpperCase()) && tmp.getNumero()==numero) {
				existe=true;
				casetas.remove(tmp);
			}
		}
		if(existe) {
			for(Caseta c : casetas) {
				if(c.getNumero()>numero) {
					int nuevo = c.getNumero()-c.getModulos();
					c.setNumero(nuevo);	
				}
			}
		}
		
	}
	
	

}
