package parking;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;

import vehiculo.Vehiculo;

public class ComparaFechaEntrada implements Comparator {
	

	@Override
	public int compare(Object o1, Object o2) {
		//compara por fecha de entrad)
		return (int)ChronoUnit.YEARS.between(((Vehiculo)o1).getFechaEntrada().getFecha(),((Vehiculo)o2).getFechaEntrada().getFecha());
	}

}
