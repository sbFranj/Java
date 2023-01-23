package com;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		/*Realiza un programa que sume los 100 números siguientes a un número entero y
			positivo introducido por teclado. Se debe comprobar que el dato introducido es
			correcto (que es un número positivo)*/
		Scanner sc = new Scanner(System.in);
		int num=0;
		do {
			System.out.println("Introduce un numero entero positivo:");
			num = Integer.valueOf(sc.nextLine());
		}while (num<0);
		int suma=0;
		for (int i=num; i<=100+num; i++) {
			suma=suma+i;
			System.out.println(suma);
		}

	}

}
