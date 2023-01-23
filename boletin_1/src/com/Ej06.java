package com;

import java.util.Scanner;

public class Ej06 {

	public static void main(String[] args) {
		/*Programar un sistema de calefacción-refrigeración que compruebe en función del
		día y el mes, la estación en la que estamos y dependiendo de la estación programe
		la temperatura: Invierno→19º, Primavera→20º, Verano→24º, Otoño→19º.
		El método deberá recibir como parámetro el mes y el día actual y devolver los
		grados a los que deberemos programar el sistema.*/

		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce dia: ");
		int dia = Integer.valueOf(sc.nextLine());
		
		System.out.print("Introduce mes: ");
		int mes = Integer.valueOf(sc.nextLine());
		
		
		//Primavera: inicia el 20 de marzo al 21 de junio. 
		//Verano: inicia el 21 de junio y finaliza el 23 de septiembre. 
		//Otoño: inicia el 23 de septiembre y finaliza el 21 de diciembre. 
		//Invierno: inicia el 21 de diciembre y finaliza el 20 de marzo.
		
		if(mes>0 && mes<12 && dia>0 && dia<31) {
			if ((dia>=20 && mes==3) || mes==4 || mes==5 || (dia<=21 && mes==6)) {
				System.out.println("Primavera→20º");
			}else if((dia>=21 && mes==6) || mes==7 || mes==8 || (dia<=223 && mes==9)) {
				System.out.println("Verano→24º");
			}else if((dia>=24 && mes==9) || mes==10 || mes==11 || (dia<=21 && mes==12)) {
				System.out.println("Otoño→19º");
			}else {
				System.out.println("Invierno→19º");
			}
		}else {
			System.out.println("Error");
		}
		
		
	}

}
