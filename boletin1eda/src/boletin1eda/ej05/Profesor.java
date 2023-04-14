package boletin1eda.ej05;

import java.time.LocalDate;

public class Profesor extends Persona {

	public Profesor(String username, LocalDate fechaNacimiento) {
		super(username, fechaNacimiento);
	}

	@Override
	public void enviarMensaje(Persona destinatario, String texto) {
		destinatario.recibirMensaje(new Mensaje(this, texto));
	}

}
