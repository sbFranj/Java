package ejercicio04;

public class Main {

	public static void main(String[] args) {
		
		Complejo a = new Complejo(3.33, 4);
		Complejo b = new Complejo(3.33, 4);
		
		System.out.println(a.suma(b));
		System.out.println(a.resta(b));
		System.out.println(a.equals(b));
	}

}
