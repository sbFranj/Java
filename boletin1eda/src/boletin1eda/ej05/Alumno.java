package boletin1eda.ej05;

import java.time.LocalDate;


public class Alumno extends Persona {

	public Alumno(String username, LocalDate fechaNacimiento) {
		super(username, fechaNacimiento);
	}

	@Override
	public void enviarMensaje(Persona destinatario, String texto) throws Exception {
		if(esMayorDeEdad() || destinatario instanceof Profesor) {
			destinatario.recibirMensaje(new Mensaje(this, texto));
			
		}else {
			throw new Exception("Error al enviar mensaje");
		}

	}

}
