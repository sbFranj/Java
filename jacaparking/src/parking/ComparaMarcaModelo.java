package parking;

import java.time.temporal.ChronoUnit;
import java.util.Comparator;

import vehiculo.Vehiculo;

public class ComparaMarcaModelo implements Comparator <Vehiculo>{

	@Override
	public int compare(Vehiculo v1, Vehiculo v2) {
		//compara por marca y modelo
		//si la marca es igual pasa a comparar a modelo.
		int resultado=0;
		if(v1==null) {
			resultado =-1;
		}else if(v2==null) {
			resultado = 1;
		}else if(v1==null && v2==null) {
			resultado=0;
		}else {
			resultado=v1.getMarca().compareTo(v2.getMarca())==0? 
					v1.getModelo().compareTo(v2.getModelo()):v1.getMarca().compareTo(v2.getMarca());
		}
		
		return resultado;
	}
	

	



}
