package ej01;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Punto puntoA = new Punto(2,3);
		Punto puntoB = new Punto(4,5);
		Linea linea1= new Linea(puntoA, puntoB);
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
		System.out.print("Elija una opcion: \n"
				+ "       1. Mover linea \n"
				+ "       2. Mostrar linea \n"
				+ "       3. Salir \n"
				+ "-->");
		opcion=Integer.valueOf(sc.nextLine());
		
		switch (opcion) {
		case 1: {
			System.out.println("Hacia que posicion quieres mover(A-arriba, B-ABajo, I-Izquierda, D-Derecha): ");
			String posicion=sc.nextLine();
			System.out.println("Cuanto quieres mover: ");
			double cantidad=Double.valueOf(sc.nextLine());
			
			switch (posicion.toUpperCase()) {
			case "A": {
				linea1.moverArriba(cantidad);
				break;
			}
			case "B": {
				linea1.moverAbajo(cantidad);
				break;
			}
			case "I": {
				linea1.moverIzquierda(cantidad);
				break;
			}
			case "D": {
				linea1.moverDerecha(cantidad);
				break;
			}						
			}
			break;
		}
		case 2:{
			System.out.println("\n"+linea1+"\n");
			break;
		}
		
		}
	}while(opcion!=3);

	}

}
