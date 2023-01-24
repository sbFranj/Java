package com;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		/*  Crea un programa que permita sumar N números. El usuario decide cuándo termina
		de introducir números al indicar la palabra ‘fin’*/

		
		Scanner sc = new Scanner(System.in);
		String cadena = "0";
		int suma = 0;
		
		do {
			suma+=Integer.valueOf(cadena);
			System.out.print("Introduce numero: ");
			cadena = sc.nextLine();
		}while (!cadena.equals("fin"));
		System.out.println(suma);
	}

}
