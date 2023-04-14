package boletin1eda.ej04;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Historial {
	
	protected List<PaginaWeb> historial;
	
	public Historial() {
		super();
		historial = new ArrayList<>();
	}
	
	public void nuevaConsulta(String url) {
		historial.add(new PaginaWeb(url));
	}
	
	public String consultarHistorial() {
		StringBuilder tmp = new StringBuilder();
		Iterator<PaginaWeb> it = historial.iterator();
		while (it.hasNext()) {
			tmp.append(it.next()+"\n");
		}
		
		return tmp.toString();
	}
	
	public String consultarHistorialDeUnDia(LocalDateTime dia) {
		List<PaginaWeb> temporal = new ArrayList<>();
		Iterator<PaginaWeb> it = this.historial.iterator();
		StringBuilder tmpString = new StringBuilder();
		for(;it.hasNext();) {
			PaginaWeb tmp = it.next();
			if(tmp.ultimaVisita.getDayOfMonth()==dia.getDayOfMonth()
					&& tmp.ultimaVisita.getMonthValue()==dia.getMonthValue()
					&& tmp.ultimaVisita.getYear()==dia.getYear())
					 {
				tmpString.append(it.next()+"\n");
			}
		}
		
		return tmpString.toString();
	}
	
	public void borrarHistorial() {
		this.historial.clear();
	}
	
	public void borrarVisitaPagina(String url) {
		Iterator<PaginaWeb> it = this.historial.iterator();
		for(;it.hasNext();) {
			if(it.next().url.equals(url)) {
				it.remove();
			}
		}
	}

}
