package com;

public class Ej09 {

	public static void main(String[] args) {
/*Escribir una función que devuelva el número de palabras, frases y párrafos que
existen en una cadena de texto que recibe como parámetro. Ten en cuenta que entre
dos palabras puede haber más de un blanco, las frases se separan por puntos y los
párrafos por saltos de línea.*/

		
		System.out.println(contarPalabrasFrasesParrafos("hola me gustan los quesitos. antonio. manue \n me gusta la vida"));
	}
	public static String contarPalabrasFrasesParrafos(String cadena) {
		String mensaje = "";
		int espaciodoble=0;
		int palabras=0;
		int parrafo=0;
		cadena=cadena.stripLeading().stripTrailing();
		for (int i=1; i<cadena.length(); i++) {
			if (Character.isWhitespace(cadena.charAt(i)) && Character.isWhitespace(cadena.charAt(i-1))) {
				espaciodoble++;
			}else if(Character.isWhitespace(cadena.charAt(i))){
				palabras++;
			}
			
		}
		mensaje="la cadena contiene "+(palabras+1)+" palabras, "+(contarPalabras(cadena, ".")+1)+" frases y "+(contarPalabras(cadena, "\n")+1)+" parrafos";
		return mensaje;
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
