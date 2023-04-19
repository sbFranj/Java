package mockexamcolecciones;

import java.time.LocalDate;

public class Main {

	
	public static void main(String[] args) {
		
		int numero = (int)(Math.random()*50+1);
		int numero2 = (int)(Math.random()*12+1);
		
		Historial tmp = new Historial();
		
		System.out.println(numero);
		System.out.println(numero2);
		
		Combinacion uno;
		Combinacion dos;
		try {
			uno = new Combinacion(1,2,3,4,5,6,7);
			dos = new Combinacion(1,2,41,4,5,6,8);

			tmp.addSorteo(LocalDate.now(), uno);
			tmp.addSorteo(LocalDate.now().plusDays(1), dos);
			System.out.println(uno.comprobarCombinacion(dos));
			
			System.out.println(tmp.listarSorteosDesdeFecha(LocalDate.now()));
			
			try {
				System.out.println(tmp.comprobarAciertos(LocalDate.now(), dos));
			} catch (HistorialException e) {

				e.printStackTrace();
			}
		
		} catch (CombinacionException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
