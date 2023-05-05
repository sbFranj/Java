package main.java;

import java.util.List;

import main.java.model.Caseta;
import main.java.model.Clase;
import main.java.model.Feria;
import main.java.xml.reader.LectorXML;

public class Principal {

	
	public static void main(String[] args) {
		
		Feria sevilla = new Feria();
		
		List<Caseta> casetas = new LectorXML().cargarDatos("./files/casetas.xml");
		
		for(Caseta e : casetas) {
			sevilla.addCaseta(e);
			
		}
		System.out.println(sevilla.mostrarCasetasDeUnaCalle("PASCUAL MARQUEZ"));
		//System.out.println(sevilla.mostrarCasetasFamiliares());
		//System.out.println(sevilla.mostrarCasetasTipoDistrito());
		//System.out.println(sevilla.mostrarCasetasQueNoSonDistritoNiFamiliar());
		//System.out.println(sevilla.mostrarNumeroCasetasFamiliaresPorCalle());
		//System.out.println(sevilla.mostrarNumeroCasetasTipoDistritoPorCalle());
		System.out.println("******************************\n**************************");
		sevilla.borrarCaseta("PASCUAL MARQUEZ", 101);
		System.out.println(sevilla.mostrarCasetasDeUnaCalle("PASCUAL MARQUEZ"));
		
		
	}
}
