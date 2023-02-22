package ejercicio03;


public class Maquina {
	public static final double          PRECIOCAFE = 1.00;
	public static final double         PRECIOLECHE = 0.80;
	public static final double     PRECIOCAFELECHE = 1.50;
	
	private double monedero;
	private int dosisCafe;
	private int dosisLeche;
	private int dosisVasos;
	private int totalRecaudado;
	
	public Maquina(double monedero) {
		this.monedero=monedero;
		this.dosisCafe=50;
		this.dosisLeche=50;
		this.dosisVasos=80;
	}
	
	public String servirCafe(double cantidad){
		String mensaje="";
		double cambio=cantidad-PRECIOCAFE;
		if(cantidad<PRECIOCAFE) {
			mensaje+="Cantidad insuficiente \n";
		}else if(cambio>this.monedero) {
			mensaje+="La maquina no tiene cambio \n";			
		}else if(this.dosisCafe==0) {
			mensaje+="La maquina no tiene cafe \n";
		}else if(this.dosisVasos==0) {
			mensaje="La maquina no tiene vasos \n";
		}else {		
			this.monedero+=PRECIOCAFE;
			this.dosisCafe--;
			this.dosisVasos--;
		mensaje="\n Producto Servido \n Recoja su cambio "+cambio+"€ \n";
		}
		return mensaje;
	}
	public String servirLeche(double cantidad){
		String mensaje="";
		double cambio=cantidad-PRECIOLECHE;
		if(cantidad<PRECIOLECHE) {
			mensaje+="Cantidad insuficiente \n";
		}else if(cambio>this.monedero) {
			mensaje+="La maquina no tiene cambio \n";			
		}else if(this.dosisLeche==0) {
			mensaje+="La maquina no tiene leche \n";
		}else if(this.dosisVasos==0) {
			mensaje+="La maquina no tiene vasos \n";
		}else {		
			this.monedero+=PRECIOLECHE;
			this.dosisLeche--;
			this.dosisVasos--;
		mensaje="Producto Servido \n Recoja su cambio "+cambio+"€";
		}
		return mensaje;
	}
	public String servirCafeConLeche(double cantidad){
		String mensaje="";
		double cambio=cantidad-PRECIOCAFELECHE;
		if(cantidad<PRECIOCAFELECHE) {
			mensaje+="Cantidad insuficiente \n";
		}else if(cambio>this.monedero) {
			mensaje+="La maquina no tiene cambio \n";			
		}else if(this.dosisLeche==0) {
			mensaje+="La maquina no tiene leche \n";
		}else if(this.dosisVasos==0) {
			mensaje+="La maquina no tiene vasos \n";
		}else if(this.dosisCafe==0) {
			mensaje+="La maquina no tiene cafe \n";
		}else{		
			this.monedero+=PRECIOCAFELECHE;
			this.dosisCafe--;
			this.dosisLeche--;
			this.dosisVasos--;
		mensaje="Producto Servido \n Recoja su cambio "+cambio+"€";
		}
		return mensaje;
	}
	public void llenarDepositos() {
		this.dosisCafe=50;
		this.dosisLeche=50;
		this.dosisVasos=80;
	}
	public void vaciaMonedero() {
		this.totalRecaudado+=this.monedero;
		this.monedero=0;
	}

	@Override
	public String toString() {
		return "El monedero tiene recaudado " + this.monedero + "€, " + this.dosisCafe + " dosis de cafe, " + this.dosisLeche
				+ " dosis de leche y " + this.dosisVasos + " dosis de vasos";
	}

	public double getMonedero() {
		return monedero;
	}

	public int getDosisCafe() {
		return dosisCafe;
	}

	public int getDosisLeche() {
		return dosisLeche;
	}

	public int getDosisVasos() {
		return dosisVasos;
	}
	
	

}
