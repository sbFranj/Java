package mockexamcolecciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.spi.FileSystemProvider;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LecturaFicheros {

	public static void main(String[] args) {

		File historico = new File("/home/estudiante/Desktop/Euromillones.csv");
		
		
		
		//Map<LocalDate, Combinacion> historial = new HashMap<>();
		Historial historial = new Historial();
		
		try {
			FileReader reader = new FileReader(historico);
			BufferedReader buffer = new BufferedReader(reader);
			
			String linea;
			try {
				buffer.readLine();
				linea = buffer.readLine();
				while(linea!=null) {
					String [] partes = linea.split(",");
					String [] fecha = partes[0].split("/");
					try {
						historial.addSorteo(LocalDate.of(Integer.valueOf(fecha[2]), Integer.valueOf(fecha[1]), Integer.valueOf(fecha[0])), 
								new Combinacion(Integer.valueOf(partes[1]),Integer.valueOf(partes[2]),Integer.valueOf(partes[3])
										,Integer.valueOf(partes[4]),Integer.valueOf(partes[5]),Integer.valueOf(partes[7]),Integer.valueOf(partes[8])));
					} catch (NumberFormatException e) {
				
						e.printStackTrace();
					} catch (CombinacionException e) {
			
						e.printStackTrace();
					}
					linea = buffer.readLine();
				}
				System.out.println(historial.numerosMasRepetidos());
				System.out.println(historial.numerosMenosRepetidos());
				System.out.println(historial.estrellasMasRepetidas());
				System.out.println(historial.estrellasMenosRepetidas());
				System.out.println("-------------------");
				System.out.println(historial.mayorSecuenciaDeNumerosConsecutivos());
				try {
					System.out.println(historial.maximoAciertosPosibles(new Combinacion(12,45,1,6,4,3,1)));
				} catch (CombinacionException e) {
					
					e.printStackTrace();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	

}
