package com;

public class Ej01 {

	public static void main(String[] args) {
		/* Escribe una función que reciba una cadena de texto y una variable bandera
		(par/impar) e imprima solo los caracteres que se encuentran situados en las
		posiciones pares o impares (según indique la variable bandera).
		Desarrolla el código con un bucle for y después modifica el código para que utilice
		una estructura while y do-while.*/
		
		System.out.println(imprimirPosicionFor("par", "palabra"));
		System.out.println(imprimirPosicionFor("impar", "palabra"));
		System.out.println(imprimirPosicionWhile("par", "palabra"));
		System.out.println(imprimirPosicionWhile("impar", "palabra"));
		System.out.println(imprimirPosicionDoWhile("par", "palabra"));
		System.out.println(imprimirPosicionDoWhile("impar", "palabra"));
	}

	public static String imprimirPosicionFor(String bandera, String cadena) {
		String mensaje="";
		if (bandera.equals("par")) {
			for(int i=0; i<cadena.length() ; i++) {
				if (i%2==0) {
				mensaje+=cadena.charAt(i);
				}
			}
		}else if (bandera.equals("impar")) {
			for(int i=0; i<cadena.length();i++) {
				if (i%2==1) {
					mensaje+=cadena.charAt(i);
				}
			}
		}else {
			mensaje="ERROR";
		}
		
		return mensaje;
	}
	
	public static String imprimirPosicionWhile(String bandera, String cadena) {
		String mensaje="";
		if (bandera.equals("par")) {
			int i=0;
			while( i<cadena.length() ) {
				if (i%2==0) {
				mensaje+=cadena.charAt(i);
				}
				i++;
			}
		}else if (bandera.equals("impar")) {
			int i=0;
			while( i<cadena.length() ) {
				if (i%2==1) {
				mensaje+=cadena.charAt(i);
				}
				i++;
			}
		}else {
			mensaje="ERROR";
		}
		
		return mensaje;
	}
	
	public static String imprimirPosicionDoWhile(String bandera, String cadena) {
		String mensaje="";
		if (bandera.equals("par")) {
			int i=0;
			do{
				if (i%2==0) {
				mensaje+=cadena.charAt(i);
				}
				i++;
			}while( i<cadena.length() );
		}else if (bandera.equals("impar")) {
			int i=0;
			do {
				if (i%2==1) {
				mensaje+=cadena.charAt(i);
				}
				i++;
			}while( i<cadena.length() );
		}else {
			mensaje="ERROR";
		}
		
		return mensaje;
	}
}
