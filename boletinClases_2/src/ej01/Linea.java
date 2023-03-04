package ej01;

import java.util.Objects;

public class Linea {
	
	private Punto puntoA;
	private Punto puntoB;
	
	public Linea() {
		this.puntoA=new Punto(0,0);
		this.puntoB=new Punto(0,0);
			
	}
	
	public Linea(Punto otropuntoA, Punto otropuntoB) {
		this.puntoA=new Punto(otropuntoA.getEjeX(), otropuntoA.getEjeY());
		this.puntoB=new Punto(otropuntoB.getEjeX(), otropuntoB.getEjeY());
	}
	
	

	@Override
	public String toString() {
		return "["+"(" + puntoA.getEjeX()+","+puntoA.getEjeY() + ")"+","+"(" + puntoB.getEjeX()+","+puntoB.getEjeY() + ")"+"]";
	}
	
	public void moverDerecha(double posicion) {
		this.puntoA.moverEnXDerecha(posicion);
		this.puntoB.moverEnXDerecha(posicion);
		
	}
	
	public void moverIzquierda(double posicion) {
		this.puntoA.moverEnXIzquierda(posicion);
		this.puntoB.moverEnXIzquierda(posicion);
	}
	
	public void moverArriba(double posicion) {
		this.puntoA.moverEnYArriba(posicion);
		this.puntoB.moverEnYArriba(posicion);
	}
	public void moverAbajo(double posicion) {
		this.puntoA.moverEnYAbajo(posicion);
		this.puntoB.moverEnYAbajo(posicion);
	}



	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = this == obj;
		
		if(!sonIguales && obj != null && obj instanceof Linea) {
			
			Linea otraLinea = (Linea) obj;
			
			sonIguales=(this.puntoA.equals(otraLinea.puntoA) && this.puntoB.equals(otraLinea.puntoB))
					||(this.puntoA.equals(otraLinea.puntoB) && this.puntoB.equals(otraLinea.puntoA));
		}
		
		return sonIguales;
	}

		
		
		


	
	
	

}

