package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Cuenta cuenta= new Cuenta();
		int terminar=0;
		
		System.out.print("Introduzca saldo inicial: ");
		cuenta.meterDinero(Double.valueOf(sc.nextLine()));
		do {
		int opcion;
		System.out.print("Elija una opcion: \n"
						+ "       1. Sacar dinero \n"
						+ "       2. Meter dinero \n"
						+ "       3. Consultar datos de la cuenta \n"
						+ "       4. Salir \n"
						+ "-->");
		opcion=Integer.valueOf(sc.nextLine());
		
		switch (opcion) {
		case 1: {
			System.out.print("Que cantidad desea retirar: ");
			cuenta.sacarDinero(Double.valueOf(sc.nextLine()));
			System.out.println("\n** Su saldo actual es: "+cuenta.getSaldo()+"\n");
			break;
		}case 2: {
			System.out.print("Que cantidad desea ingresar: ");
			cuenta.meterDinero(Double.valueOf(sc.nextLine()));
			System.out.println("\n** Su saldo actual es: "+cuenta.getSaldo()+"\n");
			break;
		}case 3: {
			System.out.println(cuenta);
			break;
		}case 4: {
			System.out.print("Realmente desea salir?(S/N) ");
			if(sc.nextLine().equalsIgnoreCase("s")) {
				terminar=1;
				System.out.println("\n** Su saldo actual es: "+cuenta.getSaldo()+"\n");
			}
			break;
		}
			
	}
		}while(terminar!=1);
		
}
	}
