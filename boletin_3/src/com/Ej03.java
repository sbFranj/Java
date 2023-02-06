package com;

public class Ej03 {

	public static void main(String[] args) {
		/* Diseña un programa que cuente el número de veces que aparece una palabra en
		una cadena de texto.*/
		
		System.out.println(contarPalabras("los me gustan los quesitos los", "los"));

	}
	public static int contarPalabras(String cadena, String palabra) {
		int mensaje=0;
		int i=0;
		if (cadena!=null || !cadena.isEmpty()) {
			do {
				if (cadena.contains(palabra)) {
				mensaje++;
				
				cadena=cadena.substring(cadena.indexOf(palabra)+palabra.length());
				}
				i++;
			}while(i<cadena.length());
		}
		
		
		return mensaje;
	}

}
