package com;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		/* Calcular las calificaciones de un alumno con un método que reciba la nota de la
	parte práctica, la nota de los problemas y la parte teórica. La nota final se calcula
	según el siguiente criterio: la parte práctica vale el 10%; la parte de problemas vale
	el 50% y la parte teórica el 40%. Las notas deben estar entre 0 y 10, si no lo están,
	deberá devolver un mensaje de error.
	Realiza el método que calcule la media de tres notas y te devuelva la nota del
	boletín (insuficiente, suficiente, bien, notable o sobresaliente).
		 */
		
		Scanner sc = new Scanner(System.in);
		
		float practica = 1;
		do {
			System.out.print("Introduce nota de parte practica: ");
			practica = Float.valueOf(sc.nextLine());
		}while(practica<0 || practica>10);
		
		float problemas = 1;
		do {
			System.out.print("Introduce nota parte de problemas: ");
			problemas = Float.valueOf(sc.nextLine());
		}while(problemas<0 || problemas>10);
		
			float teorica = 1;
		do {
			System.out.print("Introduce nota de parte teorica: ");
			teorica = Float.valueOf(sc.nextLine());
		}while(teorica<0 || teorica>10);
		
		float media = (practica+teorica+problemas)/3;
		
		if (media>=5 && media<6) {
			System.out.println("Tu nota media es Suficiente");
		}else if (media>=6 && media<7) {
			System.out.println("Tu nota media es Bien");
		}else if (media>=7 || media<=8) {
			System.out.println("Tu nota media es Notable");
		}else if (media>=9 || media<=10){
			System.out.println("Tu nota media es Sobresaliente");
		}else {
			System.out.println("Tu nota media es Insuficiente");
		}
		
		System.out.println("Tu nota final es: " +((practica*0.1)+(problemas*0.5)+(teorica*0.4)));
		
		
		
		
	}

}
