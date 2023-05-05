package main.java.model;

import java.util.Objects;


public class Caseta {
	
	private String titulo;
	private String calle;
	private int numero;
	private int modulos;
	private Clase clase;
	private String entidad;
	private int id;
	private int id_calle;
	
	
	
	public Caseta(String titulo, String calle, int numero, int modulos, Clase clase, int id, int id_calle) {
		super();
		this.titulo = titulo;
		this.calle = calle;
		this.numero = numero;
		this.modulos = modulos;
		this.clase = clase;
		this.id = id;
		this.id_calle = id_calle;
		this.entidad="ninguna";
	}
	
	public Caseta(String titulo, String calle, int numero, int modulos, Clase clase, int id, int id_calle, String entidad) {
		this(titulo, calle, numero, modulos, clase, id, id_calle);
		this.entidad=entidad;
		
	}
	
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCalle() {
		return calle;
	}

	public int getNumero() {
		return numero;
	}

	public int getModulos() {
		return modulos;
	}

	public Clase getClase() {
		return clase;
	}

	public String getEntidad() {
		return entidad;
	}

	public int getId() {
		return id;
	}

	public int getId_calle() {
		return id_calle;
	}

	@Override
	public int hashCode() {
		return Objects.hash(calle, clase, entidad, id, id_calle, modulos, numero, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		if(!sonIguales && obj!=null && obj instanceof Caseta) {
			Caseta casteado = (Caseta) obj;
			sonIguales=this.hashCode()==casteado.hashCode();
		}
		return sonIguales;
	}

	@Override
	public String toString() {
		return String.format("Caseta %s, en la calle: %s, numero %s, con %s modulo/s de tipo %s, entidad %s, id %s y con idcalle %s",
							this.titulo, 
							this.calle, 
							this.numero, 
							this.modulos, 
							this.clase, 
							this.entidad, 
							this.id, 
							this.id_calle);
	}
	
	
	
	
	
	
	
	

}
