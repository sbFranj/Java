package com.mapas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;

class MapeandoTest {

	@Test
	void testMapearPersonasPorGenero() {
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
		
		assert(new Mapeando().mapearPersonasPorGenero(prueba).size()==2);
	}

	@Test
	void testContarNumeros() {
		Collection<Integer> numeros = new ArrayList<>();
		numeros.add(5);
		numeros.add(5);
		numeros.add(7);
		numeros.add(8);
		numeros.add(5);
		numeros.add(7);
		
		assert(new Mapeando().contarNumeros(numeros).size()==3);
	}

}
