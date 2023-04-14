package boletin1eda.ej05;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class Persona {
	
	public static final int 				MAYORIA_DE_EDAD = 18;
	
	private LocalDate fechaNacimiento;
	private String username;
	private static int idUsuario;
	private Set<Mensaje> buzon;
	
	
	public Persona(String username, LocalDate fechaNacimiento) {
		super();
		this.username=username+idUsuario++;
		this.fechaNacimiento=fechaNacimiento;
		buzon = new HashSet<>();
	}
	
	public abstract void enviarMensaje(Persona destinatario, String texto) throws Exception;
	
	public String getUsername() {
		return this.username;
	}
	
	public String leerMensaje() {
		StringBuilder lista = new StringBuilder();
		Iterator<Mensaje> it = this.buzon.iterator();
		while(it.hasNext()) {
			lista.append(it.next());
		}
		
		
		return lista.toString();
	}
	
	public boolean recibirMensaje(Mensaje mensaje) {
		boolean recibido=false;
		this.buzon.add(mensaje);
		
		return recibido;
	}
	
	public String leerMensajesOrdenados() {
		StringBuilder lista = new StringBuilder();
		List<Mensaje> temporal = new ArrayList<>();
		temporal.addAll(buzon);
		Collections.sort(temporal, new ComparaNombre());
		Iterator<Mensaje> it = temporal.iterator();
		while(it.hasNext()) {
			lista.append(it.next()+"\n");
		}
		
		
		return lista.toString();
	}
	
	public boolean borrarMensaje(int id) throws Exception {
		boolean borrado=false;
		Iterator<Mensaje> it = this.buzon.iterator();
		while(it.hasNext()) {
			if(it.next().getidMensaje()==id) {
				it.remove();
				borrado=true;
			}
		}if(!borrado) {
			throw new Exception("No existe ese mensaje");
		}
		
		
		return borrado;
	}
	
	public String busquedaDeTexto(String busqueda) throws Exception {
		StringBuilder temporal = new StringBuilder();
		boolean encontrado=false;
		Iterator<Mensaje> it = this.buzon.iterator();
		
		while(it.hasNext()) {
			Mensaje tmp = it.next();
			if(tmp.getTexto().contains(busqueda)) {
				temporal.append(tmp+"\n");
				encontrado=true;
			}
		}if(!encontrado) {
			throw new Exception("Texto no encontrado");
		}
		
		return temporal.toString();
	}
	
	public boolean esMayorDeEdad() {
		return (int)ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now())>=MAYORIA_DE_EDAD;
	}
	
	
	
	
	

}
