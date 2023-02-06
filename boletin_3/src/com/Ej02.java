package com;

public class Ej02 {

	public static void main(String[] args) {
		/* Un número es divisible por 3 si la suma de todas sus cifras reducidas a una cifra es
		igual a 0, 3, 6 ó 9.
		Por ejemplo, 156 ⇒ 1+5+6=12 ⇒ 1+2 = 3 es divisible,
		pero 157 ⇒ 1+5+7 =13 ⇒ 1+3 =4 no lo es.
		Elabora un programa que compruebe la divisibilidad por 3 según este algoritmo. El
		programa debe comprobar que el número facilitado es válido.*/

		System.out.println(esDivisiblePor3("156"));
		System.out.println(esDivisiblePor3("157"));
		System.out.println(esDivisiblePor3("158"));
	
		
	}
	public static boolean esDigito(String numero) {
		boolean mensaje = true;
		for(int i=0; i<numero.length() ; i++) {
			if (!Character.isDigit(numero.charAt(i))) {
				mensaje=false;
			}
		}
		
		return mensaje;
	}

	public static boolean esDivisiblePor3(String numero) {
		boolean mensaje = false;
		int suma=0;
		if (esDigito(numero) && numero!=null && !numero.isEmpty()) {
			do {
				for(int i=0; i<numero.length(); i++) {
					suma+=Character.getNumericValue(numero.charAt(i));				
				}
				numero=String.valueOf(suma);
				suma=0;
			}while(Integer.valueOf(numero)>9);
			
			
		}
		if (Integer.valueOf(numero)%3==0) {
			mensaje = true;
		}
		
		return mensaje;
	}
}
