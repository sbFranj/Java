package ejercicio03;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Maquina maquina;
		
		System.out.print("Monedero inicial: ");
		maquina= new Maquina(Double.valueOf(sc.nextLine()));
		
		int opcion;
		double dinero;
		
		do {
			System.out.print("Elija una opcion: \n"
					+ "       1. Servir cafe solo \n"
					+ "       2. Servir leche \n"
					+ "       3. Servir cafe con leche \n"
					+ "       4. Consultar estado de la maquina \n"
					+ "       5. Apagar maquina y salir \n"
					+ "-->");
			opcion=Integer.valueOf(sc.nextLine());
			
			switch (opcion) {
			case 1: {
				System.out.print("Cuanto dinero va a introducir: ");
				dinero=Double.valueOf(sc.nextLine());
				System.out.println(maquina.servirCafe(dinero));
				break;
				}
			case 2: {
				System.out.print("Cuanto dinero va a introducir: ");
				dinero=Double.valueOf(sc.nextLine());
				System.out.println(maquina.servirLeche(dinero));
				break;
				}
			case 3: {
				System.out.print("Cuanto dinero va a introducir: ");
				dinero=Double.valueOf(sc.nextLine());
				System.out.println(maquina.servirCafeConLeche(dinero));
				break;
				}
			case 4: {
				System.out.println(maquina);
				break;
				}			
			}
			
		}while(opcion!=5);
		

	}

}

