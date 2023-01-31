package com;

public class Ej11 {

	public static void main(String[] args) {
		/* Realizar un método llamado minimoComunMultiplo que reciba dos números y
			calcule el mínimo común múltiplo de dos números. Con el máximo común divisor de
			una pareja de números podemos obtener fácilmente el mínimo común múltiplo de
			dicha pareja. El mínimo común múltiplo de dos números es igual al producto de los
			números dividido entre su máximo común divisor. Por ejemplo, el máximo común
			divisor de 24 y 36 es 12, por tanto el mínimo común múltiplo de 24 y 36 es
			(24×36)/12=72.*/

		System.out.println(mcm(24,36));
	}
	public static int gcd(int a, int b) {
		while(b>0) {
			int r=a%b;
			a=b;
			b=r;
		}return a;
	}
	
	public static int mcm(int a, int b) {
		int mcm=(a*b)/gcd(a, b);
			
		return mcm;
	}
}
