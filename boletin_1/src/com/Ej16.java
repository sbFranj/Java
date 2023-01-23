package com;

import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {
		/* Pedir 10 valores numéricos que representan el salario mensual de 10 empleados.
		Mostrar su suma y cuantos hay mayores de 1000€.*/
		
		Scanner sc = new Scanner(System.in);
		int salario;
		int s = 0;
		int suma=0;
		for (int i =0; i<3; i++) {
			System.out.print("Introduzca salario: ");
			salario = Integer.valueOf(sc.nextLine());
			suma+=salario;
			if (salario>1000) {
				s++;
			}
		}
		System.out.println("La suma de los salarios es "+suma+ "y hay "+s+" salarios mayores a 1000€");
	}

}
