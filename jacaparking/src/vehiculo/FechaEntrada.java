package vehiculo;

import java.time.LocalDate;
import java.time.LocalTime;

public class FechaEntrada {

	
	private LocalDate fecha;
	private LocalTime hora;
	
	public FechaEntrada(int year, int mes, int dia, int horas, int minutos) {
		super();
		this.fecha =  LocalDate.of(year, mes, dia);
		this.hora= LocalTime.of(horas, minutos);	
						
	}
	public FechaEntrada(LocalDate fecha, LocalTime hora) {
		super();
		this.fecha =  fecha;
		this.hora= hora;	
						
	}

	public LocalDate getFecha() {
		return this.fecha;
	}
	@Override
	public String toString() {
		return fecha + ", " + hora.getHour() + "h:"+hora.getMinute()+"m";
	}
	
	
}
