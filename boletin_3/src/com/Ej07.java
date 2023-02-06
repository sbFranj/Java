package com;

public class Ej07 {

	public static void main(String[] args) {
/*
Realizar una función que busque una palabra escondida dentro de un texto. Por
ejemplo, si la cadena es “shybaoxlna” y la palabra que queremos buscar es “hola”,
entonces si se encontrará y deberá devolver True, en caso contrario deberá devolver
False. Las letras de la palabra escondida deben aparecer en el orden correcto en la
cadena que la oculta:
						shybaoxlna ⇒ hola: True
						soybahxlna ⇒ hola: False
*/
		System.out.println(encontrarPalabra("shybaoxlna", "hola"));
		System.out.println(encontrarPalabra("soybahxlna", "hola"));
		System.out.println(encontrarPalabra("ysxpkrññinwmppa", "prima"));

	}

	public static boolean encontrarPalabra(String cadena, String palabra) {
		boolean mensaje=false;
		String encontrada="";
		int j=0;		
		for (int i=0; i<cadena.length() ; i++) {
				while(cadena.charAt(i)==palabra.charAt(j) && j<palabra.length()) {
					encontrada+=cadena.charAt(i);
					if (palabra.equals(encontrada)) {
						j=0;
					}				
					j++;					
				}			
		}
		if (palabra.equals(encontrada)) {
			mensaje=true;
		}		
		return mensaje;
	}
}
