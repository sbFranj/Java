package com;

public class Ej09 {

	public static void main(String[] args) {
		/*Realiza un método llamado toDecimal que reciba un String con un valor numérico
en binario como argumento y devuelva un número con el número decimal
correspondiente.*/
		
		System.out.println(toDecimal("01101"));

	}
	
	public static  String toDecimal(String num) {
		String decimal="";
		double sumadecimal=0.0;
		double valor=0.0;
		
		int j=0;
		String cadenanumero=String.valueOf(num);
		for(int i=String.valueOf(num).length()-1; i>=0 ; i--) {
			int digito=Character.getNumericValue(String.valueOf(num).charAt(i));
			
			valor=(Math.pow(2, j))*digito;
			
			sumadecimal+=valor;
			j++;
		}
		decimal=String.valueOf(sumadecimal);
		
		
		return decimal;
	}


}
