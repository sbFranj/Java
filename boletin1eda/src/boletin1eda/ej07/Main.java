package boletin1eda.ej07;

public class Main {

	public static void main(String[] args) {
		
		GranAlmacen dia = new GranAlmacen();
		
		try {
			dia.abrirCaja(1);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			dia.abrirCaja(1);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			dia.abrirCaja(2);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			dia.cerrarCaja(2);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			dia.cerrarCaja(2);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			dia.abrirCaja(2);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println(dia.nuevoCliente());
		System.out.println(dia.nuevoCliente());
		
		System.out.println(dia.atenderCliente(1));
		System.out.println(dia.atenderCliente(1));
		System.out.println(dia.atenderCliente(4));
		
		
	}
}
