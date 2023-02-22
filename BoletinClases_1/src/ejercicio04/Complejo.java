package ejercicio04;

import java.util.Objects;

public class Complejo {
	
	private double  parteReal;
	private double parteImaginaria;
	
	
	public Complejo(double parteReal, double parteImaginaria) {
		
		this.parteReal=parteReal;
		this.parteImaginaria=parteImaginaria;
	}
	
	public Complejo suma(Complejo otro) {
		
		Complejo resultado=new Complejo(this.parteReal+otro.getParteReal(), this.parteImaginaria+otro.getParteImaginaria());
		
		return resultado;
	}
public Complejo resta(Complejo otro) {
		
		Complejo resultado=new Complejo(this.parteReal-otro.getParteReal(), this.parteImaginaria-otro.getParteImaginaria());
		
		return resultado;
	}

	public double getParteReal() {
		return parteReal;
	}
	
	public double getParteImaginaria() {
		return parteImaginaria;
	}

	public void setParteReal(double parteReal) {
		this.parteReal = parteReal;
	}


	public void setParteImaginaria(double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}

	@Override
	public String toString() {
		return parteReal + "+" + parteImaginaria+"i";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		return parteImaginaria == other.parteImaginaria
				&& parteReal == other.parteReal;
	}
	
	
	

}
