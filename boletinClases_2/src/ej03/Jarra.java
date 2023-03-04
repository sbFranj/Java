package ej03;

public class Jarra {
	
	private double capacidad;
	private double cantidadAgua;
	public static double totalAgua;
	
	public Jarra() {
		
	}
	
	public Jarra(double capacidad) {
		this();
		this.cantidadAgua=0.0;
		this.capacidad=capacidad;
	}
	
	public void llenarJarraPorCompleto() {
		this.cantidadAgua=getCapacidad();
		this.totalAgua+=this.capacidad;
	}
	
	public void vaciaJarraPorCompleto() {
		this.cantidadAgua=0;
	}
	
	public void volcaContenido(Jarra otraJarra) {
		if(otraJarra.capacidadDisponible()) {
			if(this.cantidadAgua>otraJarra.capacidad) {
				otraJarra.cantidadAgua=otraJarra.capacidad;
				this.cantidadAgua-=otraJarra.capacidad;
			}else {
			otraJarra.cantidadAgua+=this.cantidadAgua;
			this.cantidadAgua=0;
			}
		}
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public double getCantidadAgua() {
		return cantidadAgua;
	}

	public void setCantidadAgua(double cantidadAgua) {
		this.cantidadAgua = cantidadAgua;
	}

	@Override
	public String toString() {
		return "tiene una capacidad de " + capacidad + "litros, y una cantidad de agua de " + cantidadAgua +"litros";
	}

	public boolean capacidadDisponible() {
		return (this.capacidad-this.cantidadAgua)>0;
	}
}
