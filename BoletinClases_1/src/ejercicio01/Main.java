package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Rectangulo rectangulo;
		double ancho=0;
		double longitud=0;
		
		System.out.println("Longitud del rectangulo: ");
		longitud=Double.valueOf(sc.nextLine());
		System.out.println("Ancho del rectangulo: ");
		ancho=Double.valueOf(sc.nextLine());
		
		rectangulo = new Rectangulo(longitud, ancho);
		
		System.out.println("El area del rectangulo es "+rectangulo.calcularArea());
		System.out.println("El perimetro del rectangulo es "+rectangulo.calcularPerimetro());
	}


}
