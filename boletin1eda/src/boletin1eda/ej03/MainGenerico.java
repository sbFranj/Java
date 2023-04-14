package boletin1eda.ej03;

import boletin1eda.ej02.Alumno;
import boletin1eda.ej02.Equipo;

public class MainGenerico {

	public static void main(String[] args) {
		Alumno a1 = new Alumno("antonio", "ant");
		Integer a2 = 2;
		Alumno a3 = new Alumno("rodolfo", "rod");
		Integer a4 = 4;
		Alumno a5 = new Alumno("luna", "lun");
		Integer a6 = 6;
		Alumno a7 = new Alumno("indigo", "rod");
		Integer a8 = 8;
		
		EquipoGenerico<Alumno> a = new EquipoGenerico("A");
		EquipoGenerico<Integer> b = new EquipoGenerico("B");
		
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
			
			System.out.println(a.existeAlumno(a5));
			System.out.println(b.existeAlumno(a2));
			
			System.out.println(a.listarAlumnos());
			System.out.println(b.listarAlumnos());
			
			System.out.println(a.unirEquipos(b).listarAlumnos());
			
			System.out.println(a.insercionEquipos(b).listarAlumnos());
			
		} catch (Exception e) {
			System.out.println(e);;
		}

	}

}
