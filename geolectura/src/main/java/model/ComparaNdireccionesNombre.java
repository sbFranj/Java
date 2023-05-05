package main.java.model;

import java.util.Comparator;

public class ComparaNdireccionesNombre implements Comparator<City>{

	@Override
	public int compare(City c1, City c2) {
		int resultado;
		if(c1==null) {
			resultado=1;
		}else if(c2==null) {
			resultado=-1;
		}else if(c1==null && c2==null) {
			resultado=0;
		}else{
			resultado=c1.numeroDeDirecciones()-c2.numeroDeDirecciones()==0? 
						c1.getCity().compareTo(c2.getCity()):
						c1.numeroDeDirecciones()-c2.numeroDeDirecciones();
		}
	
		return resultado;
	}

}
