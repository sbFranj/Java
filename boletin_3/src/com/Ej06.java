package com;

public class Ej06 {

	public static void main(String[] args) {
		/* Haciendo uso de la función anterior crea una función esCapicúa que acepte
		números tanto enteros como decimales.*/

		System.out.println(esPalindromo(22));
		System.out.println(esPalindromo(23));
		System.out.println(esPalindromo(23.32));
		System.out.println(esPalindromo(23.10));
	}
	public static boolean esPalindromo(String cadena) {//version 2feb 17:45h mejorada tras darle un par de vueltas.
		boolean mensaje=true;
		if (!cadena.isEmpty() && cadena!=null) {		
			for (int j=0; j<cadena.replace(" ", "").length() ; j++) {
				if (cadena.replace(" ", "").charAt(j)!=cadena.replace(" ", "").charAt(cadena.replace(" ", "").length()-1-j)) {
					mensaje=false;
				}			
			}		
		}		
		return mensaje;
	}
	public static boolean esPalindromo(int num) {
		boolean mensaje=true;
		if (!String.valueOf(num).isEmpty() && String.valueOf(num)!=null) {
			for (int k=0; k<String.valueOf(num).length(); k++) {
				if(String.valueOf(num).charAt(k)!=String.valueOf(num).charAt(String.valueOf(num).length()-1-k)) {
					mensaje=false;
				}
			}
		}		
		return mensaje;
	}
	public static boolean esPalindromo(double num) {
		boolean mensaje=true;
		if (!String.valueOf(num).isEmpty() && String.valueOf(num)!=null) {
			for (int k=0; k<String.valueOf(num).length(); k++) {
				if(String.valueOf(num).charAt(k)!=String.valueOf(num).charAt(String.valueOf(num).length()-1-k)) {
					mensaje=false;
				}
			}
		}		
		return mensaje;
	}

}
