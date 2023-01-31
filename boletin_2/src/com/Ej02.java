package com;

import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {
		//Realiza un programa que pida un número por teclado y que después muestre ese número al revés
		
		Scanner sc = new Scanner(System.in);
		System.out.print("introduce un numero: ");
		String numero = sc.nextLine();
		String invertida = "";
		/*for( int i = numero.length() -1; i >=0 ; i--) {
			invertida+=numero.charAt(i);
		}*/
		int i2= numero.length()-1;
		while(i2>=0) {
			invertida+=numero.charAt(i2);
			i2--;
		}
		System.out.println(invertida);
		
	}

}
