package boletin1eda.ej05;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		Persona a1 = new Alumno("Pepito", LocalDate.of(2000, 11, 3));
		Persona a2 = new Alumno("Juanito", LocalDate.of(2005, 2, 23));
		Persona a3 = new Alumno("Rosita", LocalDate.of(2008, 5, 14));

		Persona p1 = new Alumno("Juanita", LocalDate.of(1998, 8, 7));
		
		
		try {
			
			a1.enviarMensaje(p1, "hola");
			p1.enviarMensaje(a2, "Buenos dias Juan, debes traer hoy el justificante");
			p1.enviarMensaje(a2, "Buenos dias Juan, no tienes mas dias para el justificante, te quedas sin excursion");
			a1.enviarMensaje(a2, "Me gusta tu sudadera");
		} catch (Exception e) {
			System.out.println("\nERROR: "+e+"\n");
		}			
			System.out.println(p1.leerMensaje());
			System.out.println(a2.leerMensaje());
			System.out.println(a2.leerMensajesOrdenados());
			
		try {
			a3.enviarMensaje(a1, "tienes lapiz?");
		} catch (Exception e) {
			System.out.println("\nERROR: "+e+"\n");
		}
		
		try {
			
			a2.borrarMensaje(2);
		} catch (Exception e) {
			System.out.println("\nERROR: "+e+"\n");
		}
		
		System.out.println(a2.leerMensajesOrdenados());
		try {
			System.out.println(a2.busquedaDeTexto("justificante"));
			
		} catch (Exception e) {
			System.out.println("\nERROR: "+e+"\n");
		}
		
		

	}

}
