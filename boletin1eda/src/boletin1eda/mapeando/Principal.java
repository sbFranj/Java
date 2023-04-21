package com.mapas;

import java.util.ArrayList;
import java.util.Collection;

public class Principal {

	
	public static void main(String[] args) {
		
		Persona p1 = new Persona("Antonio","Arenas", Genero.MASCULINO);
		Persona p2 = new Persona("Manuel","Rodriguez", Genero.MASCULINO);
		Persona p3 = new Persona("Rafael","Hilasa", Genero.MASCULINO);
		Persona p4 = new Persona("Rodrigo","Beniez", Genero.MASCULINO);
		Persona p5 = new Persona("Eva","Pelaez", Genero.FEMENINO);
		Persona p6 = new Persona("Maria","Ortiz", Genero.FEMENINO);
		Persona p7 = new Persona("Nuria","Morea", Genero.FEMENINO);
		Persona p8 = new Persona("Pepa","Perez", Genero.FEMENINO);
		
		Collection<Persona> prueba =new ArrayList<>();
		
		prueba.add(p1);prueba.add(p2);prueba.add(p3);prueba.add(p4);
		prueba.add(p5);prueba.add(p6);prueba.add(p7);prueba.add(p8);
		
		System.out.println(new Mapeando().mapearPersonasPorGenero(prueba).toString());
		System.out.println();
		
		
		Collection<Integer> numeros = new ArrayList<>();
		numeros.add(5);
		numeros.add(5);
		numeros.add(7);
		numeros.add(8);
		numeros.add(5);
		numeros.add(7);
		
		System.out.println(new Mapeando().contarNumeros(numeros));
		
	}

	
}
