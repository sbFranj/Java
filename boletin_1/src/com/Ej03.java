package com;

import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		/*Escribir un método que reciba un carácter y devuelva el tipo de carácter que es.
		  Debe devolver una de los siguientes mensajes según corresponda:
			◦ Letra mayúscula
			◦ Letra minúscula
			◦ Dígito entre 0 y 9
			◦ Signo de puntuación
			◦ Espacio en blanco
			◦ Paréntesis () o llaves {}
			◦ Otro carácter */
		
		System.out.print("introduce un caracter: ");
		Scanner sc = new Scanner(System.in);
		
		char c = sc.nextLine().charAt(0);
		
		
		if (Character.isUpperCase(c)) {
			System.out.println(c+" Es letra mayuscula");
		}else if(Character.isLowerCase(c)) {
			System.out.println(c+" Es letra minuscula");
		}else if(Character.isDigit(c)) {
			System.out.println(c+" Es digito entre 0 y 9");
		}else if((c=='.') || (c==',') || (c==';') || (c==':') || (c=='"') || (c=='?') || (c=='!') || (c=='-') || (c=='_')){
			System.out.println(c+" Es signo de puntuacion");
		}else if(Character.isWhitespace(c)) {
			System.out.println(c+" Es espacio en blanco");
		}else if((c=='(') || (c==')') || (c=='{') || (c=='}')) {
			System.out.println(c+" Es parentesis o llave");
		}else {
			System.out.println(c+" Es otro caracter");
		}
		
		
		
	}

}

