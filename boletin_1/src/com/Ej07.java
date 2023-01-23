package com;

public class Ej07 {

	public static void main(String[] args) {
		/*
		 Codifica las siguientes secuencias numéricas haciendo uso de estructuras: i) for, ii)
		 while, iii) do-while en cada una de ellas:
				
		 */

		//a. Crea un método que muestre los números del 1 al 100
		
		for(int fa=1; fa<=100; fa++) {
			System.out.println("a/for: "+fa);
		}
		int wa = 1;
		while(wa<=100) {
			System.out.println("a/while: "+ wa);
			wa++;
		}
		int da = 1;
		do {
			System.out.println("a/do-while: "+ da);
			da++;
		}while(da<=100);
		
		
		//b. Repite el ejercicio anterior, pero en formato descendente, es decir, del 100 al 1.
		
		for(int fb=100; fb>=1; fb--) {
			System.out.println("b/for: "+fb);
		}
		int wb = 100;
		while(wb>=1) {
			System.out.println("b/while: "+ wb);
			wb--;
		}
		int db = 100;
		do {
			System.out.println("b/do-while: "+ db);
			db--;
		}while(db>=1);
		
		
		
		//c. Crea un programa que calcule y escriba los números múltiplos de 5 de 0 a 100.
		
		for(int fc=1; fc<=100; fc++) {
			if (fc%5==0) {
				System.out.println("c/for: "+fc+" Es multiplo de 5");
			}
		}
		int wc=1;
		while (wc<=100) {
			System.out.println("c/while: "+wc+" Es multiplo de 5");
			wc++;
		}
		int dc=1;
		do {
			System.out.println("c/do-while: "+dc+" Es multiplo de 5");
			dc++;
		}while(dc<=100);
		
		
		
		//d. Escribe los números del 320 al 160, contando de 20 en 20 hacia atrás.
		
		for(int fd=320; fd>=160; fd=fd-20) {
			System.out.println("d/for: "+fd);
		}
		int wd=320;
		while(wd>=160) {
			System.out.println("d/while: "+wd);
			wd=wd-20;
		}
		int dd=320;
		do {
			System.out.println("d/do-while: "+dd);
			dd=dd-20;
		}while(dd>=160);
	}

}
