package parking;

import java.time.LocalDate;
import java.time.LocalTime;

import vehiculo.Combustible;
import vehiculo.FechaEntrada;
import vehiculo.Marca;
import vehiculo.Matricula;
import vehiculo.Modelo;
import vehiculo.TipoVehiculo;
import vehiculo.Vehiculo;

public class MainParking {

	public static void main(String[] args) {
		
		Parking santajusta = new Parking();
		
		try {
			Vehiculo uno = new Vehiculo(new Marca("Ford"), new Modelo("Focus"), new Matricula("ABCD",1234), 
					Combustible.GASOIL, new FechaEntrada(LocalDate.now(), LocalTime.now()),TipoVehiculo.AUTOMOVIL );
		
			Vehiculo dos = new Vehiculo(new Marca("Citroen"), new Modelo("C4"), new Matricula("ZZZ",999), 
					Combustible.ELECTRICO, new FechaEntrada(LocalDate.now(), LocalTime.now()),TipoVehiculo.AUTOMOVIL );
		
			Vehiculo tres = new Vehiculo(new Marca("Kawasaki"), new Modelo("Ninja"), new Matricula("IJKL",9012), 
					Combustible.GASOLINA, new FechaEntrada(LocalDate.now(), LocalTime.now()),TipoVehiculo.CICLOMOTOR );
		
			Vehiculo cinco = new Vehiculo(new Marca("Audi"), new Modelo("A4"), new Matricula("PQRS",7890), 
					Combustible.GASOLINA, new FechaEntrada(LocalDate.now(), LocalTime.now()),TipoVehiculo.AUTOMOVIL );
			
			Vehiculo cuatro = new Vehiculo(new Marca("Peugeot"), new Modelo("207"), new Matricula("MNÑO",3456), 
					Combustible.HIBRIDO, new FechaEntrada(LocalDate.now(), LocalTime.now()),TipoVehiculo.AUTOMOVIL );
		
			
			System.out.println(santajusta.addVehiculo(uno));
			System.out.println(santajusta.addVehiculo(dos));
			System.out.println(santajusta.addVehiculo(tres));
			System.out.println(santajusta.addVehiculo(cuatro));
			System.out.println(santajusta.addVehiculo(cinco));
			
			
			System.out.println("Por defecto");
			System.out.println(santajusta);
			
			System.out.println("Marca y modelo");
			System.out.println(santajusta.ordenarPorMarcayModelo());
			
			System.out.println(santajusta.removeVehiculo("PQRS7890"));
			System.out.println("Matricula");
			System.out.println(santajusta.ordenarPorMatricula());
			
			System.out.println(santajusta.removeVehiculo("MNÑO3456"));
			System.out.println("Tipo y Combustible");
			System.out.println(santajusta.ordenarPorTipoyCombustible());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Done!");
		}
		
		
		
		
		
		
		
		
	}
	
	

}
