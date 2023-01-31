package com;

public class Ej07 {

	public static void main(String[] args) {
		/* Realizar un método llamado segundosEntre que recibirá seis valores enteros, los
		tres primeros representarán la hora, minuto y segundos de la primera hora y los
		otros tres de la segunda hora. Se deberá devolver el número de segundos que hay
		entre la primera hora y la segunda (el valor debe ser siempre en positivo). Si los
		datos no son correctos se deberá devolver -1000. */

		System.out.println(segundosEntre(2,3,0,3,15,2));
	}
	public static int segundosEntre(int h1, int m1, int s1, int h2, int m2, int s2) {
		int mensaje = 5;
		int total1= (h1*3600)+(m1*60)+s1;
		int total2= (h2*3600)+(m2*60)+s2;
		int segundos;
		if ((h1<0 || h1>24) || (h2<0 || h2>24) || (m1<0 || m1>60) || (m2<0 || m2>60) || (s1<0 || s1>60) || (s2<0 || s2>60)) {
			mensaje = -1000;
		}else {
			mensaje =(segundos = total1-total2);
			}
		return Math.abs(mensaje);
	}

}
