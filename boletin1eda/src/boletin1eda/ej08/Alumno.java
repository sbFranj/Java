package boletin1eda.ej08;

import java.util.Objects;

public class Alumno {

	public final static int 		MAYORIA_EDAD =18;
	protected String nombre;
	private String dni;
	private int edad;
	private char sexo;
	private String ciudad;
	private static int secuencia;

	
	public Alumno(String nombre, String dni) {
		super();
		this.nombre=nombre;
		this.dni=dni+secuencia++;
	}
	public Alumno(String nombre, String dni, int edad, char sexo, String ciudad) {
		this(nombre, dni);
		this.edad=edad;
		if(String.valueOf(sexo).toUpperCase().equals("H") || String.valueOf(sexo).toUpperCase().equals("M")) {
			this.sexo=sexo;
		}else {
			this.sexo='X';
		}
		this.ciudad=ciudad;
		
	}
	
	public boolean esMayorDeEdad() {
		return this.edad>=MAYORIA_EDAD;
	}

	public int getEdad() {
		return edad;
	}


	public char getSexo() {
		return sexo;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	@Override
	public String toString() {
		String mensaje=nombre + " dni: " + dni;
		if(!String.valueOf(this.sexo).equals("X")) {
			mensaje=this.nombre + " dni: " + this.dni + ", " +this.edad+" años, residente en "+this.ciudad;
		}
		
		return mensaje;
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
