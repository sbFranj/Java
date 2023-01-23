package com;

import java.util.Scanner;

public class Ej09 {

	public static void main(String[] args) {
		// Método que pida 5 números e imprima si alguno es múltiplo de 3
		
		Scanner sc = new Scanner(System.in);
		
		for (int i=1; i<=5; i++) {
			System.out.println("Introduce numero: ");
			int num = Integer.valueOf(sc.nextLine());
			if (num%3==0) {
				System.out.println("Es multiplo de 3");
			}
		}
		
		
		
		
		
		
	}

}
