package com;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		/* Realiza un programa que pida números y muestre su cuadrado, repitiendo el
		proceso hasta que se introduzca un número negativo.*/

		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.print("Introduce numero:");
			num = Integer.valueOf(sc.nextLine());
			System.out.println(num*num);
		}while(num>0);
	}

}
