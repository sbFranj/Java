package comun;

import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class ComparaTextoANDfechahora implements Comparator<Nota>{

	@Override
	public int compare(Nota n1, Nota n2) {
		int resultado=0;
		
		if(n1==null) {
			resultado=-1;
		}else if(n2==null) {
			resultado=1;
		}else if(n1==null && n2==null) {
			resultado=0;
		}else {
			resultado=n1.getTexto().compareTo(n2.getTexto())==0?
					(int)ChronoUnit.MICROS.between(n1.getFechaCreacion(), n2.getFechaCreacion()):
						n1.getTexto().compareTo(n2.getTexto());
		}
		
		return resultado;
	}

}
