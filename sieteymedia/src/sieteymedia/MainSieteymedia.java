package sieteymedia;

import java.util.Scanner;

public class MainSieteymedia {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0 ;
		Baraja espaniola = new Baraja();
		
		while(opcion!=3) {
			try {
			System.out.println("1. Jugar 7 y Medio\n"
							+  "2. Barajar\n"
							+  "3. Salir\n");
			opcion=Integer.valueOf(sc.nextLine());
			}catch (Exception e) {
				System.out.println("****Error introduce alguno de estas opciones:");
			}
			int opcion2=0;
			int opcion3=0;
			if(opcion==1) {
				espaniola.barajar();
				espaniola.asignarCartaAjugador();
				try {
				System.out.println("Esta es tu carta: "+espaniola.getCartaJugador()+
						"\n1. Otra carta"
						+ "\n2. Me planto");
				opcion2 = Integer.valueOf(sc.nextLine());
				}catch (Exception e) {
					System.out.println("***********Error");
				}
				while(opcion2!=2) {
					if(opcion2==1) {
						espaniola.asignarCartaAjugador();
					}
					try {
						System.out.println("Esta es son tus cartas: "+espaniola.getCartaJugador()+
								"\n1. Otra carta"
								+ "\n2. Me planto");
						opcion2 = Integer.valueOf(sc.nextLine());
						}catch (Exception e) {
							System.out.println("***********Error");
						}
				}
					espaniola.asignarCartaAbanca();
					try {
					System.out.println("Carta de la banca: "+espaniola.getCartaBanca()+
							"\n1. Otra carta"
							+ "\n2. Me planto");
					opcion3 = Integer.valueOf(sc.nextLine());
					}catch (Exception e) {
						System.out.println("***********Error");
					}
				while(opcion3!=2) {
					if(opcion3==1) {
						espaniola.asignarCartaAbanca();
					}
					try {
					System.out.println("Cartas de la banca: "+espaniola.getCartaBanca()+
							"\n1. Otra carta"
							+ "\n2. Me planto");
					opcion3 = Integer.valueOf(sc.nextLine());
					}catch (Exception e) {
						System.out.println("***********Error");
					}
				
				}
				espaniola.calcularPuntuacionBanca();
				espaniola.calcularPuntuacionJugador();
				if(espaniola.puntuacionJugador>espaniola.puntuacionBanca && espaniola.puntuacionJugador<=7.5 
						&& espaniola.puntuacionBanca<=7.5 || espaniola.puntuacionBanca>7.5) {
					System.out.println("Jugador: "+espaniola.puntuacionJugador
							+"\nBanca: "+espaniola.puntuacionBanca
							+"\nEL JUGADOR GANA\n");
				}else{
					System.out.println("Jugador: "+espaniola.puntuacionJugador
							+"\nBanca: "+espaniola.puntuacionBanca
							+"\nLA BANCA GANA\n");
				}
				espaniola.juegoNuevo();
				opcion = 0;
				
			}else if(opcion==2) {
				espaniola.barajar();
				System.out.println("Barajado con exito!\n");
			}
		}

		
	}
}

