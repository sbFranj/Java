package boletin1eda.ej08;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args){
		
		//Te queda comprobar los metodos del 8 y hacer el tostring nuevo de Alumno
		
		Alumno a1 = new Alumno("antonio", "ant", 19, 'H', "Sevilla");
		Alumno a2 = new Alumno("manue", "man", 17, 'H', "Malaga");
		Alumno a3 = new Alumno("rodolfo", "rod", 21, 'H', "Cordoba");
		Alumno a4 = new Alumno("eva", "eva", 16, 'M', "Madrid");
		Alumno a5 = new Alumno("luna", "lun", 18, 'M', "Rubi");
		Alumno a6 = new Alumno("ana", "ana", 17, 'M', "Madrid");
		Alumno a7 = new Alumno("indigo", "rod", 20, 'M', "Sevilla");
		Alumno a8 = new Alumno("ale", "ale", 19, 'H', "Cordoba");
		
		Equipo a = new Equipo("A");
		Equipo b = new Equipo("B");
		Equipo c = new Equipo("C");
		
		try {
			a.addAlumno(a1);
			a.addAlumno(a3);
			a.addAlumno(a5);
			a.addAlumno(a7);
			
			b.addAlumno(a2);
			b.addAlumno(a4);
			b.addAlumno(a6);
			b.addAlumno(a8);
			
			c.addAlumno(a4);
			c.addAlumno(a5);
			c.addAlumno(a6);
			c.addAlumno(a7);
			
			
			System.out.println(a.listarJugadoresMayoresDeEdad());
			System.out.println(a.esEquipoFemenino());
			System.out.println(c.esEquipoFemenino());
			System.out.println(a.numeroDeJugadoresMayoresDeEdad());
			System.out.println(b.numeroDeJugadoresMayoresDeEdad());
			System.out.println(c.edadJugadoraMasMayor());
			System.out.println(b.listadoDNIjugadoresMenoresEdad());
			System.out.println(c.listarJugadorasPorNombre());
			System.out.println(c.existeJugadoraMayorDeEdad());
			System.out.println(b.existeJugadoraMayorDeEdad());
			System.out.println(b.numeroDeCiudadesDiferentes());
			
			
			
			
			;
			
		} catch (Exception e) {
			System.out.println(e);;
		}

		
	
		
		

	}

}
