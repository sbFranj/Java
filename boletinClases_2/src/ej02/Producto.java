package ej02;

import java.util.Objects;


public class Producto {
	
	public static final double                     IVA  =   1.20;
	

	private String descripcion;
	private double precioBruto;
	
	public Producto(String descripcion, double precioBruto) {
		this.descripcion=descripcion;
		this.precioBruto=precioBruto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descripcion,precioBruto);
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioBruto() {
		return precioBruto;
	}

	public void setPrecioBruto(double precioBruto) {
		this.precioBruto = precioBruto;
	}
	
	public double calcularPrecioIVA() {
		
		return this.precioBruto*IVA;
	}


}
