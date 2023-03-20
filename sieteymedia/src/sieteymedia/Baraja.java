package sieteymedia;

import java.util.Arrays;
import java.util.Random;

public class Baraja {
	
	protected int numCartas;
	protected int siguiente;
	
	private Carta[] jugador = new Carta[10];
	private int contadorJugador;
	public double puntuacionJugador;
	
	private Carta[] banca = new Carta[10];
	private int contadorBanca;
	public double puntuacionBanca;
	
	private Carta[] cartas;
	
	public Baraja() {
		super();
		this.siguiente=0;
		this.numCartas=40;
		this.cartas= new Carta[this.numCartas];
		meterCartas();
	}
	
	/*public Carta getSiguiente() {
		siguiente++;
		
		return cartas[siguiente];
	}*/
	
	public void asignarCartaAjugador() {
		
		jugador[contadorJugador]=cartas[siguiente];
		contadorJugador++;
		siguiente++;
	}
	
	public void asignarCartaAbanca() {
		
		banca[contadorBanca]=cartas[siguiente];
		contadorBanca++;
		siguiente++;
	}
	
	public String getCartaJugador() {
		StringBuilder cartas = new StringBuilder();
		for(Carta c : jugador) {
			if (c!=null) {
				cartas.append(c+", ");
			}
		}
		return cartas.toString();
	}
	
	public String getCartaBanca() {
		StringBuilder cartas = new StringBuilder();
		for(Carta c : banca) {
			if (c!=null) {
				cartas.append(c+", ");
			}
		}
		return cartas.toString();
	}
	
	public void calcularPuntuacionJugador() {
		for(Carta c : jugador) {
			if (c!=null) {
				puntuacionJugador+=c.getValor();
			}
		}
	}
	public void calcularPuntuacionBanca() {
		for(Carta c : banca) {
			if (c!=null) {
				puntuacionBanca+=c.getValor();
			}
		}
	}
	public void juegoNuevo() {
		jugador = new Carta[10];
		contadorJugador=0;
		puntuacionJugador=0;
		
		banca = new Carta[10];
		contadorBanca=0;
		puntuacionBanca=0;
	}
	
	private int generarNumero() {
		int numeroCarta = (int)(Math.random()*12+1);
		while(numeroCarta==8 || numeroCarta==9) {
			numeroCarta =(int)(Math.random()*12+1);
		}
		
		return numeroCarta;
	}
	
	private Palo generarPalo() {
		int numero = (int)(Math.random()*4);
		Palo palo=null;
		if(numero==0) {
			palo=palo.ORO;
		}else if(numero==1) {
			palo=palo.COPA;
		}else if(numero==2) {
			palo=palo.ESPADA;
		}else if(numero==3) {
			palo=palo.BASTO;
		}
		
		return palo;
	}
	
	public void meterCartas() {
		int contador=0;
		for (Palo p : Palo.values() ) {
			for(int i=1; i<13; i++) {
				if(i!=8 && i!=9) {
					cartas[contador]= new Carta(i, p);
					contador++;
				}
			}
		}
	}
	
	public void barajar() {
		this.siguiente=0;
		for(int i=0; i<cartas.length;i++) {//recorremos el array en su longitud
			int posAleatoria = (int)(Math.random()*this.numCartas);//elegimos una posicion al azar
			Carta temporal = cartas[i];//guardamos la carta de la posicion de i en una carta temporal
			cartas[i] = cartas[posAleatoria];//le asignamos a la posicion del array i la carta del array de la posicion al azar
			cartas[posAleatoria]=temporal;//luego le asiganamos a la posicion del array al azar la carta que estaba en la posicion i
		}/*
			En conclusion:
				*pongamos que generamos el 15 en posicion aleatoria e i vale 2*
				
				Carta temporal = cartas[2]
				cartas[2] = cartas[15]
				cartas[15] = temporal
			*/
	}
	

	
	

	@Override
	public String toString() {
		return Arrays.toString(cartas);
	}

}
