package ej03;

public class Main2 {

	public static void main(String[] args) {
		
		Jarra A = new Jarra(7);
		Jarra B = new Jarra(4);
		
		B.llenarJarraPorCompleto();
		B.volcaContenido(A);
		System.out.println(A);
		System.out.println(B);

	}

}
