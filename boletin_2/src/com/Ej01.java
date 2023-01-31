package com;

public class Ej01 {

	public static String numeroSolucionesEcuacionSegundoGrado(double a, double b, double c) {
		double resultado1;
		double resultado2;
		resultado1 = (-b)+(Math.sqrt((b*b)-(4*a*c)));
		resultado2 = (-b)-(Math.sqrt((b*b)-(4*a*c)));
		
		
		if (b==0) {
			resultado1=-1;
			resultado2=-1;
			
		}
		return "los posibles resultados son: "+resultado1+" o "+resultado2;
	}
	
	public static void main(String[] args) {
		/* Realizar un método llamado numeroSolucionesEcuacionSegundoGrado que reciba
		los coeficientes de una ecuación de segundo grado y devuelva el número de
		soluciones que tiene. Si los argumentos no son válidos (el primer coeficiente tiene
		que ser distinto de cero) debe devolver un -1*/
		
		String ecuacion = numeroSolucionesEcuacionSegundoGrado(3,7,-10);
		System.out.println(ecuacion);

	}

}
