package com;

import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {
		/* Escribe un programa que muestre los N primeros términos de la serie de Fibonacci.
		El primer término de la serie de Fibonacci es 1, el segundo es 1 y el resto se calcula
		sumando los dos anteriores, por lo que tendríamos que los términos son 1, 1, 2, 3, 5,
		8, 13, 21, 34, 55, 89, 144.*/
		
		Scanner sc = new Scanner(System.in);
		int num, bonifacci, suma, i;
		i =0;
		bonifacci =1;
		suma=0;
		System.out.println("introduce la longitud de la serie Bonifacci: ");
		num = Integer.valueOf(sc.nextLine());
		while(i<num) {
			suma+=bonifacci;
			bonifacci = suma-bonifacci;
			System.out.print((bonifacci)+" ");
			i++;
			
		}
	}

}
