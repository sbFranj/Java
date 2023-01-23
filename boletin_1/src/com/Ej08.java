package com;

import java.util.Scanner;

public class Ej08 {

	public static void main(String[] args) {
		// Método que pida 15 números y realice su suma.
		
		
		Scanner sc = new Scanner(System.in);
		int num;
		int suma;
		suma = 0;
		for (int i=1; i<=15; i++) {
			System.out.print("Introduce numeros a sumar: ");
			num = Integer.valueOf(sc.nextLine());
			suma+=num;
		}
		System.out.println(suma);
		

	}

}
