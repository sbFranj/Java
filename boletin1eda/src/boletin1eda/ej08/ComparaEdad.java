package boletin1eda.ej08;

import java.util.Comparator;

public class ComparaEdad implements Comparator<Alumno>{

	@Override
	public int compare(Alumno a1, Alumno a2) {
		int resultado;
		if(a1==null) {
			resultado=-1;
		}else if(a2==null) {
			resultado=1;
		}else if(a1==null) {
			resultado=0;
		}else {
			resultado=a1.getEdad()-a2.getEdad();
		}
		
		return resultado;
	}

}
