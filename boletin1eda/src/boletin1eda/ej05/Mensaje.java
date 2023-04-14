package boletin1eda.ej05;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mensaje {
	
	private Persona remitente;
	private String texto;
	private LocalDateTime fechaHora;
	private int idMensaje;
	private static int contadorMensaje; 
	
	
	public Mensaje(Persona remitente, String texto) {
		super();
		if(this.contadorMensaje==0) {
			this.contadorMensaje=1;
		}			
		this.idMensaje=contadorMensaje++;		
		this.remitente=remitente;
		this.texto=texto;
		this.fechaHora=LocalDateTime.now();
	}

	public Persona getRemitente() {
		return this.remitente;
	}
	
	public String getTexto() {
		return this.texto;
	}

	public int getidMensaje() {
		return this.idMensaje;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyy - HH:mm");
		return "MENSAJE "+this.idMensaje+"\n"
				+"De: "+this.remitente.getUsername()+"\n"
				+"Texto: "+this.texto+"\n"
				+"Fecha y hora: "+this.fechaHora.format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm"))+"\n";
	}
	
	

}
