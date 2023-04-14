package boletin1eda.ej08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Equipo {
	
	protected String nombre;
	protected Set<Alumno> grupo;
	
	public Equipo(String nombre) {
		super();
		this.nombre=nombre;
		this.grupo = new HashSet<>();
	}
	
	public boolean addAlumno(Alumno alumno) throws Exception {
		boolean noExiste=false;
		int sizeTemp=grupo.size();
		this.grupo.add(alumno);
		if(grupo.size()==(sizeTemp+1)) {
			noExiste=true;
		}else {
			throw new Exception("El alumno ya existe");
		}
		
		return noExiste;		
	}
	
	public boolean removeAlumno(Alumno alumno) throws Exception {
		boolean Existe=false;
		int sizeTemp=grupo.size();
		this.grupo.remove(alumno);
		if(grupo.size()==(sizeTemp-1)) {
			Existe=true;
		}else {
			throw new Exception("El alumno no existe");
		}
		
		return Existe;		
	}
	
	public Alumno existeAlumno(Alumno alumno) {
		Alumno temp=null;
		if(this.grupo.contains(alumno)) {
			temp=alumno;
		}
		
		return temp;
		
	}
	
	public String listarAlumnos() {
		StringBuilder temp = new StringBuilder("Equipo "+this.nombre+":\n");
		Iterator<Alumno> it = this.grupo.iterator();
		while(it.hasNext()) {
			temp.append("      "+it.next()+"\n");
		}
		
		return temp.toString();
	}
	public Equipo unirEquipos(Equipo otroEquipo) throws Exception {
		Equipo nuevoEquipo = new Equipo(this.nombre+otroEquipo.nombre);
		nuevoEquipo.grupo.addAll(this.grupo);
		nuevoEquipo.grupo.addAll(otroEquipo.grupo);
		
		return nuevoEquipo;
		
	}
	
	
	public Equipo insercionEquipos(Equipo otroEquipo) {
		Equipo nuevoEquipo = new Equipo(this.nombre+otroEquipo.nombre);
		List<Alumno> lista = new ArrayList<>();
		nuevoEquipo.grupo.addAll(otroEquipo.grupo);
		nuevoEquipo.grupo.retainAll(lista);
		
		return nuevoEquipo;
	}
	
	public String listarJugadoresMayoresDeEdad() {
		StringBuilder temp = new StringBuilder("Equipo de jugadores mayores de edad:\n");
		List<Alumno> listaTmp = new ArrayList<>();
		listaTmp.addAll(grupo);
		Collections.sort(listaTmp, new ComparaEdad());
		Iterator<Alumno> it = listaTmp.iterator();
		while(it.hasNext()) {
			Alumno tmp=it.next();
			if(tmp.esMayorDeEdad() && tmp.getSexo()=='H') {
				temp.append("      "+tmp+"\n");
			}
		}
		
		return temp.toString();
	}
	
	public boolean esEquipoFemenino() {
		Iterator<Alumno> it = this.grupo.iterator();
		boolean esFemenino=true;
		while(it.hasNext()) {
			if(it.next().getSexo()=='H') {
				esFemenino=false;
			}
		}
		
		return esFemenino;
	}
	
	public int numeroDeJugadoresMayoresDeEdad() {
		Iterator<Alumno> it = this.grupo.iterator();
		int contador=0;
		while(it.hasNext()) {
			if(it.next().esMayorDeEdad()) {
				contador++;
			}
		}
		
		return contador;
	}
	
	public int edadJugadoraMasMayor() {
		List<Alumno> listaTmp = new ArrayList<>();
		listaTmp.addAll(grupo);
		Collections.sort(listaTmp, new ComparaEdad());
		Iterator<Alumno> it = listaTmp.iterator();
		int edad=-1;
		while(it.hasNext()) {
			Alumno tmp=it.next();
			if(tmp.esMayorDeEdad() && tmp.getSexo()=='M') {
				if(tmp.getEdad()>edad) {
					edad=tmp.getEdad();
				}
			}
		}
		
		return edad;
	}
	
	public Set<Alumno> listadoDNIjugadoresMenoresEdad(){
		Set<Alumno> tmp = new HashSet<>();
		Iterator<Alumno> it = this.grupo.iterator();
		while(it.hasNext()) {
			Alumno tmpA=it.next();
			if(!tmpA.esMayorDeEdad() && tmpA.getSexo()=='H') {
				tmp.add(tmpA);
			}
		}

		return tmp;
	}
	
	public String listarJugadorasPorNombre() {
		StringBuilder temp = new StringBuilder("Equipo jugadoras ordenados por nombre:\n");
		List<Alumno> listaTmp = new ArrayList<>();
		listaTmp.addAll(grupo);
		Collections.sort(listaTmp, new ComparaNombre());
		Iterator<Alumno> it = listaTmp.iterator();
		while(it.hasNext()) {
			Alumno tmpA=it.next();
			if(tmpA.getSexo()=='M') {
				temp.append("      "+tmpA+"\n");
			}
		}
		
		return temp.toString();
	}
	
	public boolean existeJugadoraMayorDeEdad() {
		Iterator<Alumno> it = this.grupo.iterator();
		boolean existe=false;
		while(it.hasNext()) {
			Alumno tmpA=it.next();
			if(tmpA.getSexo()=='M' && tmpA.esMayorDeEdad()) {
				existe=true;
			}
		}
		
		return existe;
	}
	
	public int numeroDeCiudadesDiferentes() {
		Iterator<Alumno> it = this.grupo.iterator();
		Set<String> ciudades = new HashSet<>();
		while(it.hasNext()) {
			ciudades.add(it.next().getCiudad());
		}
		
		return ciudades.size();
	}
	

}
