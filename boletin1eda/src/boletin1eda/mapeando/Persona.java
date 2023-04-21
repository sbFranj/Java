package com.mapas;

import java.util.Objects;

public class Persona {

	
	private String nombre;
	private String apellidos;
	private Genero genero;
	
	
	public Persona(String nombre, String apellidos, Genero genero) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
	}


	
	
	public Genero getGenero() {
		return genero;
	}




	@Override
	public String toString() {
		return nombre +" "+ apellidos ;
	}


	@Override
	public int hashCode() {
		return Objects.hash(apellidos, genero, nombre);
	}


	
	
	
	
}
