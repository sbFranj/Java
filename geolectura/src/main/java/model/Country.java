package main.java.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Country {
	
	private int id;
	private String country;
	private List<City> cities;
	
	public Country(int id, String country) {
		this.id=id;
		this.country=country;
		cities=new ArrayList<>();
	}
	
	public void addCity(City city) {
		cities.add(city);
	}
	
	public int getId() {
		return this.id;
	}
	
	public int numeroDeDirecciones() {
		int numero=0;
		for(City c:cities) {
			numero+=c.numeroDeDirecciones();
		}
		return numero;
	}
	
	public String mostrarCiudadesOrdenadas() {
		StringBuilder sb = new StringBuilder();
		Collections.sort(cities, new ComparaNdireccionesNombre());
			for(City c : cities) {
				sb.append(c+"\n");
			}
		
		
		return sb.toString();
	}

	@Override
	public String toString() {
		return id + " " + country + "\n" + cities.size()+" paises y "+numeroDeDirecciones()+" direcciones \n"+mostrarCiudadesOrdenadas();
	}
	
	

}
