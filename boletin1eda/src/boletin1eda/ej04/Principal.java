package boletin1eda.ej04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		Historial nuevo = new Historial();
		
		while(opcion!=6) {
			System.out.print("Eliga una de estas opciones:\n"
							 + "1. Nueva pagina\n"
							 + "2. Consultar historial\n"
							 + "3. Consultar historial de un dia\n"
							 + "4. Borrar todo el historial\n"
							 + "5. Borrar visitas a una pagina\n"
							 + "6. Salir\n\n"
							 + "----------->");
			opcion = Integer.valueOf(sc.nextLine());
			switch (opcion) {
			case 1: {
				System.out.println("Introduzca nombre de la pagina web :");
				String temporal = sc.nextLine();
				nuevo.nuevaConsulta(temporal);
				temporal=null;
				
				break;
			}
			case 2: {
				System.out.println(nuevo.consultarHistorial());
				break;
			}
			case 3: {
				System.out.println("Introduzca dia: ");
				int dia=Integer.valueOf(sc.nextLine());
				System.out.println("Introduzca mes: ");
				int mes=Integer.valueOf(sc.nextLine());
				
				LocalDateTime temp = LocalDateTime.of(LocalDate.now().getYear(), mes, dia, LocalDateTime.now().getHour(),LocalDateTime.now().getMinute());
				System.out.println(nuevo.consultarHistorialDeUnDia(temp));
				
				
				break;
			}
			case 4: {
				nuevo.borrarHistorial();
				
				break;
			}
			case 5: {
				System.out.println("Introduzca nombre de la pagina web :");
				String temporal = sc.nextLine();
				nuevo.borrarVisitaPagina(temporal);;
				temporal=null;
				
				break;
			}

			
		}
		
	}

	}
}
