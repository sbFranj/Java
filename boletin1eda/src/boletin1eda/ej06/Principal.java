package boletin1eda.ej06;

public class Principal {

	public static void main(String[] args) {
		Diccionario rae = new Diccionario();
		
		rae.addPalabra("Perro", "animal de compañia");
		rae.addPalabra("Perro", "Persona vaga");
		rae.addPalabra("Pero", "Variedad de manzano que da como fruto una manzana más larga que gruesa");
		rae.addPalabra("Aguacate", "Fruta exotica");
		rae.addPalabra("Siesta", "Sueño de duracion corta");
		
		System.out.println(rae.buscarPalabra("Perro"));
		
		rae.borrarPalabra("Aguacate");
		
		System.out.println(rae.listarPalabrasQueEmpiecenPor("p"));
		
	
		
	}
	
	
}
