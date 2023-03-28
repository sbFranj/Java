package comun;

import java.time.LocalDateTime;

public class NotaAlarma extends Nota implements Activable{
	
	private final static int MINUTOS_REPETIR_POR_DEFECTO = 5;
	
	private LocalDateTime fechaArlama;
	private int minutosRepetir;
	private boolean activado;
	

	public NotaAlarma(String texto) throws Exception {
		super(texto);
	}
	
	public NotaAlarma(String texto, LocalDateTime fechaArlarma, boolean activado) throws Exception {
		this(texto);
		this.fechaArlama=fechaArlarma;
		this.activado=activado;
		this.minutosRepetir=MINUTOS_REPETIR_POR_DEFECTO;
	}
	
	public NotaAlarma(String texto, LocalDateTime fechaArlarma, int minutosRepetir ) throws Exception {
		this(texto);
		this.fechaArlama=fechaArlarma;
		this.activado=true;
		this.minutosRepetir=minutosRepetir;
	}
	
	private void setFechaAlarma(LocalDateTime fecha) {
		this.fechaArlama=fecha;
	}
	
	public static int getMINUTOS_REPETIR_POR_DEFECTO() {
		return MINUTOS_REPETIR_POR_DEFECTO;
	}

	@Override
	public void activar() {
		this.activado=true;
	}

	@Override
	public void desactivar() {
		this.activado=false;
	}
	
	public boolean isActivado() {
		return this.activado;
	}

	@Override
	public String toString() {
		return super.toString()+"\nFecha larma: "+this.fechaArlama+"\nActivado: "+this.activado+"\nRepetir cada: "+this.minutosRepetir+"min";
	}
	
	
	
	

}
