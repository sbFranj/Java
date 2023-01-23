package com;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		/* Realiza un programa que vaya pidiendo números hasta que se introduzca un
		número negativo y nos diga cuántos números se han introducido, la media de los
		impares y el mayor de los pares. El número negativo sólo se utiliza para indicar el
		final de la introducción de datos pero no se incluye en el cómputo.*/
		
		Scanner sc = new Scanner(System.in);
		
		int num, i, par, impar,i2;
		i = 0;
		i2 = 0;
		impar = 0;
		par = 0;
		do {
			System.out.print("Introduce numero:");
			num = Integer.valueOf(sc.nextLine());
			i++;
			if (num%2!=0 && num>0) {
				impar+=num;
				i2++;
			}
			if (num%2==0 && num>0) {
				if (num>par) {
					par=num;
				}
			}
		}while(num>0);
		
		System.out.println("Se han introducido " +(i-1)+ " numeros");
		System.out.println("La media de los numeros impares es: "+(impar/i2));
		System.out.println("El numero par mas alto es: "+par);
	}

}
