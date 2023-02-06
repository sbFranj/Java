package com;

public class Ej04 {

	public static void main(String[] args) {
		/* Crea tres funciones cuyo comportamiento sea como el de los métodos de String
		startsWirth, contains y endsWith, pero sin utilizar ninguno de ellos.	*/

		System.out.println(empiezaPor("mi prima la coja", "mi"));
		System.out.println(empiezaPor("mi prima la coja", "prima"));
		System.out.println(terminaPor("mi prima la coja", "coja"));
		System.out.println(terminaPor("mi prima la coja", "prima"));
		System.out.println(contiene("mi prima la coja", "coja"));
		System.out.println(contiene("mi prima la coja", "primo"));
	}
	public static boolean empiezaPor(String cadena, String palabra) {
		boolean mensaje = false;
		if (cadena.indexOf(palabra)==0) {
			mensaje=true;
		}
		return mensaje;
	}
	
	public static boolean terminaPor(String cadena, String palabra) {
		boolean mensaje = false;
		if (cadena.indexOf(palabra)==(cadena.length())-palabra.length()) {
			mensaje=true;
		}
		return mensaje;
	}
	public static boolean contiene(String cadena, String palabra) {
		boolean mensaje = false;
		for(int i=0; i<cadena.length(); i++) {
			if (cadena.indexOf(palabra)==i) {
				mensaje = true;
			}
		}
		
		return mensaje;
	}

}
