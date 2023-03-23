package vehiculo;


import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.Objects;

public class Vehiculo implements Comparator {

	private Marca marca;
	private Modelo modelo;
	private Matricula matricula;
	private Combustible combustible;
	private FechaEntrada fechaentrada;
	private TipoVehiculo tipovehiculo;
	
	
	public Vehiculo(Marca marca, Modelo modelo, Matricula matricula, Combustible combustible,
			FechaEntrada fechaentrada, TipoVehiculo tipovehiculo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.combustible = combustible;
		this.fechaentrada = fechaentrada;
		this.tipovehiculo = tipovehiculo;
	}



	public boolean equals(Object obj) {
		
		boolean sonIguales = this==obj;
		
		if(!sonIguales && obj!=null && obj instanceof Vehiculo) {
			Vehiculo casteado = (Vehiculo) obj;
			sonIguales = this.matricula.equals(casteado.matricula);
		}
		return sonIguales;
	}

	public FechaEntrada getFechaEntrada() {
		return this.fechaentrada;
	}
	
	public String getMarca() {
		return this.marca.getMarca();
	}
	public String getModelo() {
		return this.modelo.getModelo();
	}
	public String getCombustible() {
		return this.combustible.toString();
	}
	public String getTipo() {
		return this.tipovehiculo.toString();
	}
	public String getMatricula() {
		return this.matricula.getMatricula();
	}




	@Override
	public String toString() {
		return String.format("%s %s %s %s con matricula %s", this.tipovehiculo.toString().toLowerCase(), this.marca, this.modelo,this.combustible.toString().toLowerCase() ,this.matricula);
	}



	@Override
	public int compare(Object o1, Object o2) {
		//compara por fecha de entrad)
		return (int)ChronoUnit.YEARS.between(((Vehiculo)o1).getFechaEntrada().getFecha(),((Vehiculo)o2).getFechaEntrada().getFecha());
	}

	
	
	
	
	
	
	
}
