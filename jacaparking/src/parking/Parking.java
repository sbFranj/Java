package parking;

import java.util.Arrays;

import vehiculo.Vehiculo;

public class Parking {
	
	private Vehiculo[] vehiculos;
	
	public Parking() {
		this.vehiculos = new Vehiculo[50];
	}
	
	public Parking(int capacidad) {
		this.vehiculos = new Vehiculo[capacidad];
	}
	
	public boolean addVehiculo(Vehiculo v) throws Exception {
		boolean hayHueco=false;
		for(int i=0; i<vehiculos.length; i++) {
			if(vehiculos[i]==null && !hayHueco) {
				vehiculos[i]=v;
				hayHueco=true;
			}
		}if(!hayHueco) {
			throw new Exception("No hay hueco");
		}
		return hayHueco;
	}
	
	public boolean removeVehiculo(String matricula) throws Exception {
		boolean haSalido=false;
		for(int i=0; i<vehiculos.length; i++) {
			if(vehiculos[i]!=null &&vehiculos[i].getMatricula().equals(matricula)&& !haSalido) {
				vehiculos[i]=null;
				haSalido=true;
			}
		}if(!haSalido) {
			throw new Exception("No hay relacion de matricula con el parking");
		}
		
		return haSalido;
	}
	
	public String ordenarPorMarcayModelo() {
		
		StringBuilder mensaje = new StringBuilder();
		
		ComparaMarcaModelo mm = new ComparaMarcaModelo();
		
		Arrays.sort(vehiculos, mm);
		
		for(Vehiculo v: vehiculos) {
			if(v!=null) {
				mensaje.append(v+"\n");
			}
		}
		
		return mensaje.toString();
	}
	
public String ordenarPorMatricula() {
		
		StringBuilder mensaje = new StringBuilder();
		
		ComparaMatricula m = new ComparaMatricula();
		
		Arrays.sort(vehiculos, m);
		
		for(Vehiculo v: vehiculos) {
			if(v!=null) {
				mensaje.append(v+"\n");
			}
		}
		
		return mensaje.toString();
	}

public String ordenarPorTipoyCombustible() {
	
	StringBuilder mensaje = new StringBuilder();
	
	ComparaTipoCombustible tc = new ComparaTipoCombustible();
	
	Arrays.sort(vehiculos, tc);
	
	for(Vehiculo v: vehiculos) {
		if(v!=null) {
			mensaje.append(v+"\n");
		}
	}
	
	return mensaje.toString();
}



@Override
public String toString() {
StringBuilder mensaje = new StringBuilder();
	
	for(Vehiculo v: vehiculos) {
		if(v!=null) {
			mensaje.append(v+"\n");
		}
	}
	
	return mensaje.toString();
}


	
}
