package boletin1eda.ej06conmapa;

import java.util.Comparator;

public class ComparaPalabra implements Comparator<String>{

	@Override
	public int compare(String p1, String p2) {
		int resultado;
		if(p1==null) {
			resultado=-1;
		}else if(p2==null) {
			resultado=1;
		}else if(p1==null && p2==null){
			resultado=0;
		}else {
			resultado = p1.compareTo(p2);
		}
		return resultado;
	}

}
