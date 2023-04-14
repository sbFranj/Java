package boletin1eda.ej02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args){
		
		
		Alumno a1 = new Alumno("antonio", "ant");
		Alumno a2 = new Alumno("manue", "man");
		Alumno a3 = new Alumno("rodolfo", "rod");
		Alumno a4 = new Alumno("eva", "eva");
		Alumno a5 = new Alumno("luna", "lun");
		Alumno a6 = new Alumno("ana", "ana");
		Alumno a7 = new Alumno("indigo", "rod");
		Alumno a8 = new Alumno("ale", "ale");
		
		Equipo a = new Equipo("A");
		Equipo b = new Equipo("B");
		
		try {
			a.addAlumno(a1);
			a.addAlumno(a3);
			a.addAlumno(a5);
			a.addAlumno(a7);
			//a.addAlumno(a1);
			
			b.addAlumno(a2);
			b.addAlumno(a4);
			b.addAlumno(a6);
			b.addAlumno(a8);
			//b.addAlumno(a2);
			
			a.removeAlumno(a1);
			b.removeAlumno(a2);
			//a.removeAlumno(a1);
			//b.removeAlumno(a2);
			
			System.out.println(a.existeAlumno(a8));
			System.out.println(b.existeAlumno(a8));
			
			System.out.println(a.listarAlumnos());
			System.out.println(b.listarAlumnos());
			
			System.out.println(a.unirEquipos(b).listarAlumnos());
			
			System.out.println(a.insercionEquipos(b).listarAlumnos());
			
		} catch (Exception e) {
			System.out.println(e);;
		}

		
	
		
		

	}

}
