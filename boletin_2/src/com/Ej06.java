package com;

public class Ej06 {

	public static void main(String[] args) {
		/* Realizar un método llamado horaMayor que recibirá seis valores enteres, los tres
		primeros representarán la hora, minuto y segundos de la primera hora y los otros
		tres de la segunda hora. Se deberá devolver un 1 si la primera hora es mayor que la
		segunda, un 2 si la segunda hora es mayor que la primera, un 0 si son iguales y un
		-1000 si los datos no son correctos. */

		System.out.println(horaMayor(2,3,0,3,0,0));
		System.out.println(horaMayor(4,3,0,3,0,0));
		System.out.println(horaMayor(2,3,0,2,3,0));
		System.out.println(horaMayor(-5,3,0,3,0,0));
		
	}
	public static int horaMayor(int h1, int m1, int s1, int h2, int m2, int s2) {
		int mensaje = 5;
		int total1= (h1*3600)+(m1*60)+s1;
		int total2= (h2*3600)+(m2*60)+s2;
		if ((h1<0 || h1>24) || (h2<0 || h2>24) || (m1<0 || m1>60) || (m2<0 || m2>60) || (s1<0 || s1>60) || (s2<0 || s2>60)) {
			mensaje = -1000;
		}else {
			if (total1<total2) {
				mensaje = 2;
			}else if (total1==total2) {
				mensaje = 0;
			}else if (total1>total2) {
				mensaje = 1;
			}
		}
		return mensaje;
	}

}
