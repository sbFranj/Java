package com;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		//Programa que reciba 10 números y nos indique el valor máximo y mínimo.

		Scanner sc = new Scanner(System.in);
		
		
		int num, max, min;
		max = 0;
		min = 0;
		
		for(int i=0; i<10; i++) {
			System.out.print("introduce numero:");
			num = Integer.valueOf(sc.nextLine());
			if (num>max) {
				max=num;
				
			}
			if (num<min) {
				min=num;
			}
		}
		System.out.println(max+" es el numero mas alto");
		System.out.println(min+" es el numero mas bajo");
			
		
		
		
	}

}
