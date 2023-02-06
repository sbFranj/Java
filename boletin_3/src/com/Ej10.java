package com;

public class Ej10 {
	public static final String                             ABCEDARIO = "abcdefghijklmnñopqrstuvwxyz";

	public static void main(String[] args) {
/*El cifrado César es un tipo de cifrado por sustitución en el que una letra del alfabeto
es sustituida por otra que se encuentra situada en el abecedario
(abcdefghijklmnñopqrstuvwxyz) un número dado de posiciones desde la primera
Así, por ejemplo, la palabra CASADO, con un cifrado de tres posiciones pasaría a
ser FDVDGR.
a. Realiza una función que cifre un carácter según el cifrado César y un
desplazamiento dado.
b. Elabora una función que, haciendo uso de la anterior, reciba una palabra y un
número fijo de posiciones y la codifique según este algoritmo.
c. Diseña otra función que reciba dos palabras y compruebe si son equivalentes
según este tipo de cifrado e indique el nivel de sustitución utilizado, es decir,
si cifrando una de ellas podemos obtener la otra.
Ej: Si recibe CASADO y FDVDGR debe indicar que son equivalentes
y utilizan un nivel de codificación 3
Si recibe CASADO y AAAABD debe indicar que no s*/

		
		System.out.println(cifrar_caracter_a_cesar('B', 4));
		System.out.println(cifrar_cadena_a_cesar("casado", 3));
		System.out.println(esta_cifrada_y_nivel_codificacion("casado", "fdvdgr"));
		System.out.println(esta_cifrada_y_nivel_codificacion("casado", "lljbjmx"));
		System.out.println(ABCEDARIO.length());
	}

	public static char cifrar_caracter_a_cesar(char c, int nivel_cifrado) {
		char cifrado = ' ';		
		for (int i=0; i<ABCEDARIO.length(); i++) {
			if(Character.toLowerCase(c)==ABCEDARIO.charAt(i)) {
				cifrado = ABCEDARIO.charAt((i+nivel_cifrado)%(ABCEDARIO.length()));
			}
		}
	
		
		return cifrado;
	}
	public static String cifrar_cadena_a_cesar(String cadena, int nivel_cifrado) {
		String mensaje="";
		for (int i=0; i<cadena.length();i++) {
			mensaje+=cifrar_caracter_a_cesar(cadena.charAt(i), nivel_cifrado);
		}
		return mensaje;
		
	}
	
	public static int esta_cifrada_y_nivel_codificacion(String cadena, String cadena2) {
		int mensaje = -1;
		boolean bandera = true;
		int j =0 ; 
		while (j<ABCEDARIO.length() && bandera ) {
			if (cadena2.equals(cifrar_cadena_a_cesar(cadena, j))) {
				mensaje=j;
				bandera = false;
			}
			j++;
		}		
		return mensaje;
	}
}
