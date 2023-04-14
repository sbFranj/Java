package boletin1eda.ej02;

import java.util.Objects;

public class Alumno {

	
	protected String nombre;
	protected String dni;
	private static int secuencia;
	
	public Alumno(String nombre, String dni) {
		super();
		this.nombre=nombre;
		this.dni=dni+secuencia++;
	}

	@Override
	public String toString() {
		return nombre + " dni: " + dni;
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		if(!sonIguales && obj!=null && obj instanceof Alumno casteado) {
			sonIguales = this.dni.equals(casteado.dni);
		}
		
		return sonIguales;
	}
	
	
}
