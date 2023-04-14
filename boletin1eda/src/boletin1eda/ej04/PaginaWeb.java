package boletin1eda.ej04;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PaginaWeb {

	protected String url;
	protected LocalDateTime ultimaVisita;
	
	public PaginaWeb(String url) {
		super();
		this.url=url;
		this.ultimaVisita=LocalDateTime.now();
	}

	@Override
	public String toString() {
		return url + " " + ultimaVisita.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm")) ;
	}
	
	

	
	
}
