package ejercicio05;

import java.util.Scanner;

import ejercicio04.Complejo;


public class Menu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion;
		double numero1Real=0.0;
		double numero1Imaginaria=0.0;
		double numero2Real=0.0;
		double numero2Imaginaria=0.0;
	
		
		do {
		System.out.print("Elija una opcion: \n"
				+ "       1. Sumar \n"
				+ "       2. Restar \n"
				+ "       3. Salir \n"
				+ "-->");
		opcion = Integer.valueOf(sc.nextLine());
		switch (opcion) {
		case 1: {
			System.out.print("SUMA \nNumero 1 parte real: ");
			numero1Real = Double.valueOf(sc.nextLine());
			System.out.print("SUMA \nNumero 1 parte imaginaria: ");
			numero1Imaginaria = Double.valueOf(sc.nextLine());
			
			System.out.print("SUMA \nNumero 2 parte real: ");
			numero2Real = Double.valueOf(sc.nextLine());
			System.out.print("SUMA \nNumero 2 parte imaginaria: ");
			numero2Imaginaria = Double.valueOf(sc.nextLine());
			
			Complejo numero1=new Complejo(numero1Real, numero1Imaginaria);
			Complejo numero2=new Complejo(numero2Real, numero2Imaginaria);
			
			System.out.println("\nLa suma de "+numero1+" y "+numero2+" es:\n\n"+numero1.suma(numero2)+"\n");
			break;
		}
		case 2: {
			System.out.print("RESTA \nNumero 1 parte real: ");
			numero1Real = Double.valueOf(sc.nextLine());
			System.out.print("RESTA \nNumero 1 parte imaginaria: ");
			numero1Imaginaria = Double.valueOf(sc.nextLine());
			
			System.out.print("RESTA \nNumero 2 parte real: ");
			numero2Real = Double.valueOf(sc.nextLine());
			System.out.print("RESTA \nNumero 2 parte imaginaria: ");
			numero2Imaginaria = Double.valueOf(sc.nextLine());
			
			Complejo numero1=new Complejo(numero1Real, numero1Imaginaria);
			Complejo numero2=new Complejo(numero2Real, numero2Imaginaria);
			
			System.out.println("\nLa resta de "+numero1+" y "+numero2+" es:\n\n "+numero1.resta(numero2)+"\n");
			
			break;
		}
		
		}
		
		}while(opcion!=3);
		System.out.println("\n\nFIN");
	}

}
