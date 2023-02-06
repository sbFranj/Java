package com;

public class Ej05 {

	public static void main(String[] args) {
		/*iseña una función llamada esPalindromo que reciba una cadena de caracteres y
		determine si constituye un palíndromo o no. Una palabra es un palíndromo si puede
		leerse del mismo modo de izquierda a derecha que de derecha a izquierda. Obvia
		los espacios en blanco y caracteres separadores, así como tildes, etc.
		Ejemplos de palíndromos: ‘Ligar es ser ágil’, ‘dabale arroz a la zorra el abad’.*/

		System.out.println(esPalindromo("ligar es ser agil"));
		System.out.println(esPalindromo("antonio juega en el parque"));
		System.out.println(esPalindromo("dabale arroz a la zorra el abad"));


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

public static boolean esPalindromo2(String cadena) {//version que saqué jueves 2feb 17:15h por recomendacion de Jose.
		boolean mensaje=true;
		String palindromo1="";
		String palindromo2="";
		if (!cadena.isEmpty() && cadena!=null) {
			for (int i=0; i<cadena.length() ; i++) {
				if (!Character.isWhitespace(cadena.charAt(i))) {
					palindromo1+=cadena.charAt(i);	
				}
			}			
			for (int j=0; j<palindromo1.length() ; j++) {
				if (palindromo1.charAt(j)!=palindromo1.charAt(palindromo1.length()-1-j)) {
					mensaje=false;
				}			
			}		
		}		
		return mensaje;
	}
	public static boolean esPalindromo3(String cadena) {//verison que saqué miercoles 1 feb, Jose en clase me recomendó hacerlo con el for.
		boolean mensaje=false;
		String palindromo1="";
		String palindromo2="";
		if (!cadena.isEmpty() && cadena!=null) {
			for (int i=0; i<cadena.length() ; i++) {
				if (!Character.isWhitespace(cadena.charAt(i))) {
					palindromo1+=cadena.charAt(i);
					palindromo2=cadena.charAt(i)+palindromo2;	
				}
			}
		}
		if (palindromo1.equals(palindromo2)) {
			mensaje=true;
		}
		
		
		return mensaje;
	}
}
