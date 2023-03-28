package comun;

import java.time.LocalDateTime;
import java.util.Objects;

public class Nota {
	
	private static int codigoSiguiente;
	private int codigo;
	private String texto;
	private LocalDateTime fechaCreacion;
	private LocalDateTime fechaUltimaModificacion;
	
	public Nota(String texto) throws Exception {
		super();
		if(texto!=null) {
			this.texto=texto;
			this.codigo=codigoSiguiente++;
			this.fechaCreacion=LocalDateTime.now();
			this.fechaUltimaModificacion=this.fechaCreacion;
		}else {
			throw new Exception("NotaCreationException");
		}
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	public void setTexto(String texto) throws Exception {
		if(this.fechaCreacion.isBefore(LocalDateTime.now())) {
			this.texto=texto;
			this.fechaUltimaModificacion=LocalDateTime.now();
		}else {
			throw new Exception("NotaException");
		}
	}
	
	public int getCodigo() {
		return this.codigo;
	}

	public LocalDateTime getFechaCreacion() {
		return this.fechaCreacion;
	}

	public LocalDateTime getFechaUltimaModificacion() {
		return this.fechaUltimaModificacion;
	}

	public boolean isModificado() {
		return !fechaCreacion.equals(fechaUltimaModificacion);
	}
	
	public boolean isEmpty() {
		return this.texto.isEmpty();
	}
	
	public boolean isCreadoAnterior(Nota otra) {
		return this.fechaCreacion.isBefore(otra.fechaCreacion);
	}
	
	public boolean isModificadoAnterio(Nota otra) {
		return this.fechaUltimaModificacion.isBefore(otra.fechaUltimaModificacion);
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaCreacion, texto);
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = this==obj;
		
		if(!sonIguales && obj!=null && obj instanceof Nota) {
			Nota casteado = (Nota) obj;
			sonIguales = this.hashCode()==casteado.hashCode();
		}
		return sonIguales;
	}

	@Override
	public String toString() {
		return String.format("\nNota %s \n"
						   + "Contenido: %s\n"
						   + "Fecha de Creacion: %s\n"
						   + "Ultima modificacion: %s", 
						   
						   this.codigo,
						   this.texto,
						   this.fechaCreacion,
						   this.getFechaUltimaModificacion());
	}
	
	

}
