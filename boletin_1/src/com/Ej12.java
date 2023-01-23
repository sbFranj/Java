package com;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		/* Realiza un programa que pida números hasta que se teclee uno negativo y muestre
		cuántos números se han introducido.*/
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int num;
		do {
			System.out.print("Introduce numero:");
			num = Integer.valueOf(sc.nextLine());
			i++;
		}while(num>0);
		System.out.println(i-1);
	}

}
