package com;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		/*  Crea un programa que permita sumar N números. El usuario decide cuándo termina
		de introducir números al indicar la palabra ‘fin’*/

		
		Scanner sc = new Scanner(System.in);
		int num;
		int suma;
		suma = 0;
	
		
		do {
			
			System.out.print("Introduce numeros a sumar: ");
			num = Integer.valueOf(sc.nextLine());
			suma+=num;
			
		}while(Integer.toString(num)!="fin");
		System.out.println(suma);
	}

}
