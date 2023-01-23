package com;

import java.util.Scanner;

public class Ej02 {

	public static void main(String[] args) {
		/* Escribe un método que reciba por parámetro el día de la semana (Lunes, Martes, Miércoles, etc) y 
		 devuelva qué asignatura toca a primera hora ese día */
		
		System.out.print("Introduce el dia de la semana: ");
		Scanner sc = new Scanner(System.in);
		String mes = sc.nextLine();
		
		switch (mes) {
		case "lunes", "Lunes", "LUNES":{
			System.out.println("Entornos de desarrollo");
			break;
		}case "martes", "Martes", "MARTES":{
			System.out.println("Fol");
			break;
		}case "miercoles", "Miercoles", "MIERCOLES":{
			System.out.println("Sistemas informaticos");
			break;
		}case "jueves", "Jueves", "JUEVES":{
			System.out.println("Base de datos");
			break;
		}case "viernes", "Viernes", "VIERNES":{
			System.out.println("Sistemas informaticos");
			break;
		}default:{
			System.out.println("Dia de la semana invalido");
		}
		}
	}

}
