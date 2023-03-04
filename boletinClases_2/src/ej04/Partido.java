package ej04;


public class Partido {
	
	private static int jornada;
	private static int nGolesLocal;
	private static int nGolesVisitante;
	private char resultadoQuiniela;
	
	private Equipo local;
	private Equipo visitante;
	
	public Partido() {
		super();
		this.resultadoQuiniela='0';
	}
	
	public Partido(Equipo local, Equipo visitante, int jornada) {
		this();
		if(!local.equals(visitante)) {
			this.local=local;
			this.visitante=visitante;
			this.jornada=jornada;
		}		
	}
	
	public void ponerResultado(Partido partido, String resultado) {
		
		if(resultado.length()==3 && Character.isDigit(resultado.charAt(0)) && Character.isDigit(resultado.charAt(2))) {
			int resultadoLocal=Character.getNumericValue(resultado.charAt(0));
			int resultadoVisitante=Character.getNumericValue(resultado.charAt(2));
			partido.nGolesLocal=resultadoLocal;
			partido.nGolesVisitante=resultadoVisitante;
			if(resultadoLocal>resultadoVisitante) {
				partido.resultadoQuiniela='2';
				partido.local.sumarPartidoGanado();;
			}else if(resultadoVisitante>resultadoLocal) {
				partido.resultadoQuiniela='1';
				partido.visitante.sumarPartidoGanado();
			}else {
				partido.resultadoQuiniela='X';
			}
			
		}else {
			partido.resultadoQuiniela='Y';
		}
	}

	@Override
	public String toString() {
		String mensaje="";
		if (this.resultadoQuiniela=='0') {
			mensaje=String.format("Partido entre equipo local %s y el equipo visitante %s todavia no se ha "
					+ "jugado", this.local.getNombre(), this.visitante.getNombre());
		}if (this.resultadoQuiniela=='Y') {
				mensaje=String.format("Error");
		}else {
			mensaje=String.format("Partido entre equipo local %s y el equipo visitante %s "
					+ "jugado en el estadio %s de la ciudad %s ha finalizado con %s goles del equipo local "
					+ "y %s del equipo visitante. Resultado de la quiniela = %s", this.local.getNombre(), this.visitante.getNombre(), 
					this.local.getEstadio(), this.local.getCiudad(), this.nGolesLocal, this.nGolesVisitante, this.resultadoQuiniela);
		}
		return mensaje;
	}
	
	

}
