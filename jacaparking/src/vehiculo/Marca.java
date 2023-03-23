package vehiculo;

import java.util.Objects;


public class Marca {
	
	private String marca;
	private String descripcion;
	
	public Marca() {
		super();
		this.descripcion="";
	}
	public Marca(String marca) {
		this();
		this.marca=marca;
	}
	public Marca(String marca, String descripcion) {
		this();
		this.marca=marca;
		this.descripcion=descripcion;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(descripcion, marca);
	}
	@Override
	public boolean equals(Object obj) {
		
		boolean sonIguales = this==obj;
		
		if(!sonIguales && obj!=null && obj instanceof Marca) {
			Marca casteado = (Marca) obj;
			sonIguales = this.hashCode()==casteado.hashCode();
		}
		return sonIguales;
	}
	@Override
	public String toString() {
		return marca + ", " + descripcion;
	}
	
	
	
	
}
