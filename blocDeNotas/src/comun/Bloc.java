package comun;

import java.util.Arrays;
import java.util.Objects;

import exceptions.BlocException;

public class Bloc{
	
	private static final int NUMERO_NOTAS_MAXIMAS = 10;
	
	private int numNotas;
	private String nombre;
	
	private Nota[] notas;
	
	public Bloc(String nombre) {
		super();
		this.nombre=nombre;
		notas = new Nota[NUMERO_NOTAS_MAXIMAS];
	}
	
	public boolean addNota(Nota nota) throws BlocException {
		boolean isAdd=false;
		if(nota!=null && buscarPosicionNota(nota)==-1) {
			notas[numNotas++]=nota;
		}else {
			throw new BlocException("Error al añadir nota");
		}
		
		return isAdd;
	}
	
	public String getNota(int numNota) throws BlocException{
		String nota="";
		if(notas[numNota]!=null) {
			nota=notas[numNota].getTexto();
		}else {
			throw new BlocException("No hay notas en esa posicion");
		}
		
		return nota;
	}
	
	public void updateNota(int numNota, String textonuevo) throws Exception {
		boolean done = false;
		for(int i=0; i<notas.length;i++) {
			if(notas[i]!=null && notas[i].getCodigo()==numNota) {
				notas[i].setTexto(textonuevo);
				done=true;
			}
		}if(!done) {
			throw new BlocException("Nota no encontrada");
		}
	}
	
	public void activa(int num) throws BlocException {
		if(notas[num]!=null && notas[num] instanceof NotaAlarma) {
			((NotaAlarma) notas[num]).activar();
		}else {
			throw new BlocException("Nota no encontrada/No es nota de alarma");
		}
	}
	
	public void desactiva(int num) throws BlocException {
		if(notas[num]!=null && notas[num] instanceof NotaAlarma) {
			((NotaAlarma) notas[num]).desactivar();
		}else {
			throw new BlocException("Nota no encontrada/No es nota de alarma");
		}
	}
	
	public static int getNumerosNotasMaxima() {
		return NUMERO_NOTAS_MAXIMAS;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	
	@Override
	public String toString() {
		StringBuilder n = new StringBuilder();
		for(Nota p: notas) {
			if(p!=null) {
				n.append(p+"\n");
			}
		}
		return "Bloc: "+this.nombre+"("+this.numNotas+" notas)";
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(notas);
		result = prime * result + Objects.hash(nombre, numNotas);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		
		if(!sonIguales && obj!=null && obj instanceof Bloc) {
			Bloc casteado = (Bloc) obj;
			sonIguales = this.nombre.endsWith(casteado.getNombre());
		}
		return sonIguales;
	}

	public int buscarPosicionNota(Nota nota) {
		int posicion=-1;
		for(int i=0; i<notas.length && posicion==-1; i++) {
			if(notas[i]!=null && notas[i].equals(nota)) {
				posicion=i;
			}
		}
		return posicion;
		
	}
	
	public String ordenarBloc() {
		StringBuilder ordenado=new StringBuilder();
		Arrays.sort(notas, new ComparaTextoANDfechahora());
		for(Nota n: notas) {
			if(n!=null) {
				ordenado.append(n+"\n");
			}
		}
		
		return ordenado.toString();
	}
	
	

}
