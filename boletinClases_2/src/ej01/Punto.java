package ej01;

import java.util.Objects;

public class Punto {
	private double ejeX;
	private double ejeY;
	
	public Punto(double ejeX, double ejeY) {
		this.ejeX=ejeX;
		this.ejeY=ejeY;
	}

	public double getEjeX() {
		return ejeX;
	}

	public void setEjeX(double ejeX) {
		this.ejeX = ejeX;
	}

	public double getEjeY() {
		return ejeY;
	}

	public void setEjeY(double ejeY) {
		this.ejeY = ejeY;
	}

	@Override
	public String toString() {
		return "(" + ejeX + "," + ejeY + ")";
	}
	
	public void moverEnXDerecha(double cantidad) {
		this.ejeX+=cantidad;
	}
	public void moverEnXIzquierda(double cantidad) {
		this.ejeX-=cantidad;
	}
	public void moverEnYArriba(double cantidad) {
		this.ejeY+=cantidad;
	}
	public void moverEnYAbajo(double cantidad) {
		this.ejeY-=cantidad;
	}

	
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = this ==obj;
		
		if(!sonIguales && obj != null && obj instanceof Punto) {
			Punto otroPunto = (Punto) obj;
			sonIguales =this.ejeX==otroPunto.ejeX &&  this.ejeY==otroPunto.ejeY;
		}
		
		return sonIguales;
	}
	
	
}
