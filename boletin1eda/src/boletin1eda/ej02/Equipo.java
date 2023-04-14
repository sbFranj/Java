package boletin1eda.ej02;

import java.util.ArrayList;
import java.util.Collection;
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
		for(;it.hasNext();) {
			temp.append("      "+it.next().nombre+"\n");
		}
		
		return temp.toString();
	}
	
	public Equipo unirEquipos(Equipo otroEquipo) throws Exception {
		Equipo nuevoEquipo = new Equipo(this.nombre+otroEquipo.nombre);
		otroEquipo.grupo.addAll(this.grupo);
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

}
