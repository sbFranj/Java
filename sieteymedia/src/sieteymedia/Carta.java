package sieteymedia;

import java.util.Objects;

public class Carta {

	
	private int numero;
	private Palo palo;
	
	
	
	public Carta(int numero, Palo palo) {//constructor
		super();
		if (esNumeroValido(numero) && palo!=null) {
			this.numero=numero;
			this.palo=palo;
		}
	}
	
	public double getValor() {
		
		return esMedia(this.numero)? 0.5:this.numero;
	}
	
	
	public boolean esNumeroValido(int numero) {//valida numeros dentro de la baraja española que no tiene 8,9
	
		return (numero>0 && numero <8) || (numero>9 && numero<13);
	}
	
	public boolean esMedia(int numero) {//si es 10(sota), 11(caballo, 12(rey)
		
		return numero>9 && numero<13;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero, palo);
	}

	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales = this==obj;
		
		if(!sonIguales && obj!=null && obj instanceof Carta) {
			Carta casteado = (Carta) obj;
			sonIguales = this.hashCode()==casteado.hashCode();
		}
		return sonIguales;
	}
	
	public int getNumero() {
		
		return this.numero;
	}
	
	public Palo getPalo() {
		
		return this.palo;
	}

	@Override
	public String toString() {
		return this.numero+" "+this.palo;
	}
	
	
	
	
}
