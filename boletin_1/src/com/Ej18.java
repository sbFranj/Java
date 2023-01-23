package com;

public class Ej18 {

	public static double calcularAreaCirculo(double radio) {
		double area = Math.PI * (radio*radio);
		if (radio<0) {
			area=0;
		}
		return area;
	}
	public static double calcularLongitudCirculo(double radio) {
		double longitud = Math.PI * (radio*2);
		if (radio<0) {
			longitud=0;
		}
		return longitud;
	}
	
	public static void main(String[] args) {
		/* Realizar un metodo llamado calcularAreaCiruclo que devuelva el area de un circulo y otro
		 * llamado calcularLongitudCirculo que devuelva su longitud*/
		 
		double area = calcularAreaCirculo(5);
		System.out.println(area);

		double longitud = calcularLongitudCirculo(-5);
		System.out.println(longitud);
		
		
	}

}
