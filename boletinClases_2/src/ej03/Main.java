package ej03;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Capacidad de la Jarra A: ");
		Jarra A = new Jarra(Integer.valueOf(sc.nextLine()));
		System.out.print("Capacidad de la Jarra B: ");
		Jarra B = new Jarra(Integer.valueOf(sc.nextLine()));
		
		
		int opcion;
		do {
		System.out.print("\nElija una opcion: \n"
				+ "       1. Llenar jarra \n"
				+ "       2. Vaciar jarra \n"
				+ "       3. Volcar jarra A en B \n"
				+ "       4. Volcar jarra B en A \n"
				+ "       5. Ver estado de jarras \n"
				+ "       6. Salir \n"
				+ "-->");
		opcion=Integer.valueOf(sc.nextLine());
		
		switch (opcion) {
		case 1: {
			System.out.println("Que jarra desea llenar?(A/B)");
			String jarra = sc.nextLine();
			if(jarra.toUpperCase().equals("A")){
				A.llenarJarraPorCompleto();
			}else if(jarra.toUpperCase().equals("B")){
				B.llenarJarraPorCompleto();
			}else {
				System.out.println("     **Esa jarra no existe.");
			}
			break;
		}
		case 2: {
			System.out.println("Que jarra desea vaciar?(A/B)");
			String jarra = sc.nextLine();
			if(jarra.toUpperCase().equals("A")){
				A.vaciaJarraPorCompleto();
			}else if(jarra.toUpperCase().equals("B")){
				B.vaciaJarraPorCompleto();
			}else {
				System.out.println("     **Esa jarra no existe.");
			}
			break;
		}
		case 3: {
			A.volcaContenido(B);
			break;
		}
		case 4: {
			B.volcaContenido(A);
			break;
		}
		case 5: {
			System.out.println("La jarra A "+A+"\nLa jarra B "+B);
			break;
		}
		
		}					
		
		}while(opcion!=6);
	System.out.println("\nEl total de agua que se ha gastado llenando jarras es "+A.totalAgua+" litros\n");
	
}
}

