package vehiculo;

import java.util.Objects;

public class Matricula {
	
	private String matricula;

	
	public Matricula(String letras, int numero) throws Exception {
		super();
		if(letras.length()<5 && String.valueOf(numero).length()<5) {
			this.matricula=letras.toUpperCase()+numero;
		}else {
			throw new Exception("Matricula erronea");
		}
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales = this==obj;
		
		if(!sonIguales && obj!=null && obj instanceof Matricula) {
			Matricula casteado = (Matricula) obj;
			sonIguales = this.matricula.equals(casteado.matricula);
		}
		return sonIguales;
	}
	@Override
	public String toString() {
		return matricula;
	}

}
