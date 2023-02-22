package ejercicio02;

public class Cuenta {
	
	private double saldo;
	private int contadorReintegro;
	private int contadorIngreso=-1;
	
	public Cuenta(double saldo) {
		this.saldo=saldo;
	}
	
	public Cuenta() {
		this.saldo=0;
	}
	
	public double sacarDinero(double cantidad) {
		this.contadorReintegro++;
		
		return this.saldo>cantidad? this.saldo-=cantidad:0;
	}
	
	public double meterDinero(double cantidad) {
		this.contadorIngreso++;
		
		return cantidad>0? this.saldo+=cantidad:0;
	}

	@Override
	public String toString() {
		return "Su saldo es " + saldo + ", ha sacado dinero " + contadorReintegro + " veces y ha ingresado dinero "
				+ contadorIngreso + " veces";
	}

	public double getSaldo() {
		return saldo;
	}

	public int getContadorReintegro() {
		return contadorReintegro;
	}

	public int getContadorIngreso() {
		return contadorIngreso;
	}	

	
	
	

}
