package com;

public class Ej03 {

	public static void main(String[] args) {
		/*Diseña una función que, dada una cadena de entrada, comprueba si es una
		contraseña fuerte o no. Se considera que una contraseña es fuerte si contiene 8 o
		más caracteres, y entre ellos al menos hay una mayúscula, una minúscula, un signo
		de puntuación y al menos un dígito.*/
		
		
		System.out.println(esPasswordFuerte("abcDEF123?"));
		System.out.println(esPasswordFuerte("abcDEF123"));

		
		
		
	}
	public static String esPasswordFuerte(String password) {
		String mensaje="";
		int char8 = 0;
		int mayus = 0;
		int minus = 0;
		int punt = 0;
		int digit =0;
		if (password.length()>=8) {
			char8 = 1;
			for (int i = 0 ; i<password.length() ; i++) {
			
				if (Character.isUpperCase(password.charAt(i))){
					mayus = 1;
				}else if (Character.isLowerCase(password.charAt(i))){
					minus = 1;
				}else if((password.charAt(i)=='.') || (password.charAt(i)==',') || (password.charAt(i)==';') || (password.charAt(i)==':') || (password.charAt(i)=='"') || (password.charAt(i)=='?') || (password.charAt(i)=='!') || (password.charAt(i)=='-') || (password.charAt(i)=='_'))
				{
					punt = 1;
				}else if (Character.isDigit(password.charAt(i)))
					digit = 1;
			}
		}
		if ((char8==1) && (mayus==1) && (minus==1) && (punt==1) && (digit==1)) {
			mensaje = password +" Es contraseña segura";
			
		}else {
			mensaje =password +" No es segura";
		}
		return mensaje;
	}

}
