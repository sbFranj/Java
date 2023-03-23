package parking;

import java.util.Comparator;

import vehiculo.Vehiculo;

public class ComparaTipoCombustible implements Comparator<Vehiculo>{

	@Override
	public int compare(Vehiculo v1, Vehiculo v2) {
		int resultado=0;
		if(v1==null) {
			resultado =-1;
		}else if(v2==null) {
			resultado = 1;
		}else if(v1==null && v2==null) {
			resultado=0;
		}else {
			resultado=v1.getTipo().compareTo(v2.getTipo())==0? 
					v1.getCombustible().compareTo(v2.getCombustible()):v1.getTipo().compareTo(v2.getTipo());
		}
		return resultado;
	}

}
