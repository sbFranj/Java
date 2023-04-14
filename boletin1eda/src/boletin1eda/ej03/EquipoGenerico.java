package boletin1eda.ej03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class EquipoGenerico<T> {

	protected String nombre;
	protected Set<T> grupo;
	
	public EquipoGenerico(String nombre) {
		super();
		this.nombre=nombre;
		this.grupo = new HashSet<>();
	}
	
	public boolean addAlumno(T alumno) throws Exception {
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
	
	public boolean removeAlumno(T alumno) throws Exception {
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
	
	public T existeAlumno(T alumno) {
		T temp=null;
		if(this.grupo.contains(alumno)) {
			temp=alumno;
		}
		
		return temp;
		
	}
	
	public String listarAlumnos() {
		StringBuilder temp = new StringBuilder("Equipo "+this.nombre+":\n");
		Iterator<T> it = this.grupo.iterator();
		for(;it.hasNext();) {
			temp.append("      "+it.next()+"\n");
		}
		
		return temp.toString();
	}
	
	public EquipoGenerico unirEquipos(EquipoGenerico otroEquipo) throws Exception {
		EquipoGenerico nuevoEquipo = new EquipoGenerico(this.nombre+otroEquipo.nombre);
		otroEquipo.grupo.addAll(this.grupo);
		nuevoEquipo.grupo.addAll(otroEquipo.grupo);
		
		return nuevoEquipo;
		
	}
	
	public EquipoGenerico insercionEquipos(EquipoGenerico otroEquipo) {
		EquipoGenerico nuevoEquipo = new EquipoGenerico(this.nombre+otroEquipo.nombre);
		List<T> lista = new ArrayList<>();
		nuevoEquipo.grupo.addAll(otroEquipo.grupo);
		nuevoEquipo.grupo.retainAll(lista);
		
		return nuevoEquipo;
	}

}


