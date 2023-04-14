package boletin1eda.ej06;

import java.util.Comparator;

public class ComparaPalabra implements Comparator<Palabra>{

	@Override
	public int compare(Palabra p1, Palabra p2) {
		int resultado;
		if(p1==null) {
			resultado=-1;
		}else if(p2==null) {
			resultado=1;
		}else if(p1==null && p2==null){
			resultado=0;
		}else {
			resultado = p1.getPalabra().compareTo(p2.getPalabra());
		}
		return resultado;
	}

}
