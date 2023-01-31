package com;

public class Ej08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(toBinary(14));
		
	}

	
	
	public static String toBinary(int num) {
		int cociente=0;
		int resto;
		String binario="";
		String cadenabinario="";
		while(num>=2) {
			cociente=num/2;
			resto=num%2;
			binario+=Integer.valueOf(resto);
			num=cociente;
		}
		binario+=Integer.valueOf(cociente);
		
		for(int i = binario.length()-1 ; i>=0; i--) {
			cadenabinario+=binario.charAt(i);
		}
		return cadenabinario;
	}
	
}
