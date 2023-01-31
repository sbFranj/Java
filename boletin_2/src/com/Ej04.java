package com;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		/*Elabora un programa que codifique una cadena, de tal modo que en el resultado se
		inviertan cada 2 caracteres. Los caracteres intercambiados no pueden volver a
		intercambiarse. Ejemplo:
							Entrada -> Hola mundo
							Salida -> oHalm nuod   */

		
		Scanner sc = new Scanner(System.in);
		System.out.print("introduce un frase: ");
		String cadena = sc.nextLine();
		String invertida = "";
		int i = 1;
		while(i <cadena.length()) {
			System.out.print(cadena.charAt(i));
			System.out.print(cadena.charAt(i-1));
			i+=2;	
			}
		if (cadena.length()%2==1) {
			System.out.print(cadena.charAt(cadena.length()-1));
			}
		
	}

}
