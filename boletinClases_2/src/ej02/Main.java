package ej02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto uno = new Producto("azul", 10);
		Producto dos = new Producto("verde", 11);
		
		System.out.println(uno.hashCode());
		System.out.println(dos.hashCode());
		
		System.out.println(uno.calcularPrecioIVA());
	}

}
