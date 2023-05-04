package mockexamcolecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Combinacion {
	
	protected static final int VALOR_MINIMO=1;
	protected static final int VALOR_MAXIMO_NUMEROS=50;
	protected static final int VALOR_MAXIMO_ESTRELLAS=12;
	protected static final int TOTAL_NUMEROS=5;
	protected static final int TOTAL_ESTRELLAS=2;
	
	private Set<Integer> numeros;
	private Set<Integer> estrellas;
	
	public Combinacion(int nUno, int nDos, int nTres, int nCuatro, int nCinco, int eUno, int eDos) throws CombinacionException {
		int[] numeros = {nUno, nDos, nTres, nCuatro, nCinco};
		int[] estrellas = {eUno, eDos};
		
		if(numerosCorrectos(numeros, estrellas)) {
			this.numeros=new HashSet<Integer>(Set.of(nUno,nDos,nTres,nCuatro,nCinco));
			this.estrellas=new HashSet<Integer>(Set.of(eUno,eDos));
		}else {
			throw new CombinacionException();
		}
		
		
	}
	
	public Combinacion(int[] numeros, int[] estrellas) throws CombinacionException {
		if(numerosCorrectos(numeros, estrellas)) {
			this.numeros=new HashSet<Integer>();
			this.estrellas=new HashSet<Integer>();
			for(int n : numeros) {
				this.numeros.add(n);
			}
			for(int e : estrellas) {
				this.estrellas.add(e);
			}
		}else {
			throw new CombinacionException();
		}
	}
	
	public Set<Integer> getNumeros() {
		return this.numeros;
	}
	
	public Set<Integer> getEstrellas() {
		return this.estrellas;
	}
	
	public int comprobarCombinacion(Combinacion combinacion) {
		int nAciertosN = 0;
		int nAciertosE = 0;
		Set<Integer> listaN1 = new HashSet<>();
		Set<Integer> listaN2 = new HashSet<>();
		Set<Integer> listaE1 = new HashSet<>();
		Set<Integer> listaE2 = new HashSet<>();
			
		for(int n : this.getNumeros()) {
			listaN1.add(n);
		}
		for(int n : this.getEstrellas()) {
			listaE1.add(n);
		}
		for(int n : combinacion.getNumeros()) {
			listaN2.add(n);
		}
		for(int n : combinacion.getEstrellas()) {
			listaE2.add(n);
		}
		listaN1.retainAll(listaN2);
		nAciertosN=listaN1.size();
		listaE1.retainAll(listaE2);
		nAciertosE=listaE1.size();
		return nAciertosN+nAciertosE;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(estrellas, numeros);
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		if(!sonIguales && obj!=null && obj instanceof Combinacion) {
			Combinacion casteado = (Combinacion) obj;
			sonIguales=this.hashCode()==casteado.hashCode();
		}
		return sonIguales;
	}
	
	

	@Override
	public String toString() {
		return numeros + " " + estrellas;
	}

	public boolean numerosCorrectos(int[] numeros, int[]estrellas){
		boolean numeroEstrellasCorrecto = true;
		Set<Integer> tmpEstrellas = new HashSet<>();
		for(int e : estrellas) {
			tmpEstrellas.add(e);
			if(e>VALOR_MAXIMO_ESTRELLAS || e<VALOR_MINIMO) {
				numeroEstrellasCorrecto=false;
			}
		}if(tmpEstrellas.size()!=TOTAL_ESTRELLAS) {
			numeroEstrellasCorrecto=false;
		}
											
		boolean numeroNumerosCorrecto = true;		
		Set<Integer> tmpNumeros = new HashSet<>();
		for(int n : numeros) {
			tmpNumeros.add(n);
			if(n>VALOR_MAXIMO_NUMEROS || n<VALOR_MINIMO) {
				numeroNumerosCorrecto=false;
			}
		}if(tmpNumeros.size()!=TOTAL_NUMEROS) {
			numeroNumerosCorrecto=false;
		}
											
		return numeroEstrellasCorrecto && numeroNumerosCorrecto;
	}
	
	public int numeroDeNumerosConsecutivos() {
		int contador=1;
		boolean stop = true;
		List<Integer> tmp = new ArrayList<>();
		tmp.addAll(numeros);
		for(int i=1; i<5 ; i++) {
			if(tmp.get(i)==tmp.get(i-1)+1 && stop) {
				contador++;
			}else {
				stop=false;
			}
		}
		
		
		return contador;
	}
	
	public int generarNumeroAleatorio(int minimo, int maximo) {
		return (int)(Math.random()*maximo+minimo);
	}

}
