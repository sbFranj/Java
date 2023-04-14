package boletin1eda.ej07;

import java.util.Comparator;

public class ComparaNumClienteANDnumCaja implements Comparator<Caja>{

	@Override
	public int compare(Caja c1, Caja c2) {
		int resultado;
		if(c1==null) {
			resultado=1;
		}else if(c2==null) {
			resultado=-1;
		}else if(c1==null) {
			resultado=0;
		}else {
			resultado= c1.numeroClientes()-c2.numeroClientes()==0? 
						c1.getNumeroCaja()-c2.getNumeroCaja():
						c1.numeroClientes()-c2.numeroClientes();
		}
		
		return resultado;
	}

}
