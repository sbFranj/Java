package comun;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		
		try {
			Nota listaCompra = new Nota("Platanos, Manzanas, Zanahorias, Leche, Cereales");
			Nota listaTareas = new Nota("Limpiar dormitorio, Limpiar Terraza, Sacar a Honorio a pasear");
			Nota caducaDNI = new NotaAlarma("Caduca el dni el dia 12 de mayo 2023", LocalDateTime.of(2023, 5, 12, 11, 30), true);
			
			System.out.println(listaCompra.getTexto());
			listaCompra.setTexto("Platanos, Manzanas, Zanahorias, Leche, Cereales, Yogurt");
			System.out.println(listaTareas.getCodigo());
			System.out.println(listaCompra.getFechaCreacion());
			System.out.println(listaCompra.getFechaUltimaModificacion());
			System.out.println(listaCompra.isModificado());
			System.out.println(listaTareas.isModificado());
			System.out.println(caducaDNI.isEmpty());
			System.out.println(listaCompra.isCreadoAnterior(caducaDNI));
			System.out.println(listaCompra.isModificadoAnterio(listaTareas));
			System.err.println(listaTareas.hashCode());
			System.out.println(listaTareas.equals(caducaDNI));
			System.out.println(listaCompra.equals(listaCompra));
			System.out.println(listaTareas);
			
			NotaAlarma renovarDemanda = new NotaAlarma("Renovar demanda el 10 de junio de 2023", LocalDateTime.of(2023, 6,10, 9,10), 20);
			System.out.println(renovarDemanda.getMINUTOS_REPETIR_POR_DEFECTO());
			renovarDemanda.desactivar();
			System.out.println(renovarDemanda.isActivado());
			System.out.println(((NotaAlarma) caducaDNI).isActivado());
			System.out.println(renovarDemanda);
			
			Bloc uno = new Bloc("mis cosas");
			Bloc dos = new Bloc("Cosas mama");
			
			uno.addNota(renovarDemanda);
			uno.addNota(caducaDNI);
			uno.addNota(listaTareas);
			uno.addNota(listaCompra);
			
			uno.activa(0);
			uno.desactiva(1);
			uno.updateNota(3, "Importante Renovar Demanda");
			System.out.println(uno.getNumerosNotasMaxima());
			System.out.println(uno.getNombre());
			System.out.println(uno);
			System.out.println(uno.hashCode());
			System.out.println(uno.equals(dos));
			System.out.println(uno.equals(uno));
			System.out.println(uno.ordenarBloc());
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
