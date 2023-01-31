package com;

public class Ej05 {

	public static void main(String[] args) {
		// Realizar un método llamado esMultiplo que recibirá dos números y devuelva True si el primer número es múltiplo del segundo.
		String multiplo = esMultiplo(4, 2);
		System.out.println(multiplo);

	}
	public static String esMultiplo(int num, int num2) {
		String mensaje = num + " no es multiplo de "+num2;
		if (num%num2==0) {
			mensaje = num + " es multiplo de "+num2;
		}
		return mensaje;
	}

}
