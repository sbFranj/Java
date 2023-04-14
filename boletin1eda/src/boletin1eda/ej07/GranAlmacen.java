package boletin1eda.ej07;

import java.util.Arrays;

public class GranAlmacen {
	
	public static final int 		NUMERO_MAXIMO_CAJA = 20;
	private Caja[] cajas;
	
	public GranAlmacen() {
		super();
		this.cajas = new Caja[20];
	}
	
	public void abrirCaja(int numeroCaja) throws Exception {
		if(buscarPosicionCaja(numeroCaja)==-1) {
			cajas[(numeroCaja-1)%NUMERO_MAXIMO_CAJA]=new Caja();
			cajas[(numeroCaja-1)%NUMERO_MAXIMO_CAJA].setNumeroCaja(numeroCaja);
		}else {
			throw new Exception("Caja "+numeroCaja+" ya abierta");
		}
		
	}
	
	public void cerrarCaja(int numeroCaja) throws Exception {
		if(buscarPosicionCaja(numeroCaja)!=-1 && cajas[buscarPosicionCaja(numeroCaja)].numeroClientes()==0){
			cajas[buscarPosicionCaja(numeroCaja)]=null;
		}else if(buscarPosicionCaja(numeroCaja)==-1) {
			throw new Exception("Caja no encontrada");
		}else {
			throw new Exception("La caja "+numeroCaja+" aun tiene "+cajas[buscarPosicionCaja(numeroCaja)].numeroClientes()+" clientes");
		}
	}
	
	public String nuevoCliente() {
		Arrays.sort(cajas, new ComparaNumClienteANDnumCaja());
		Cliente tmp = new Cliente();
		cajas[0].addCliente(tmp);
		
		return "Es uste el cliente numero "+tmp.getNumeroCliente()+" y debe ir a la caja numero "+cajas[0].getNumeroCaja();		
	}
	
	public String atenderCliente(int numeroCaja) {
		int tmp = buscarPosicionCaja(numeroCaja);
		String mensaje="";
		if(tmp!=-1 && cajas[tmp].numeroClientes()!=0) {
			mensaje="Se ha atendido al cliente con numero "+cajas[tmp].clientes.get(0).getNumeroCliente();
			cajas[tmp].clientes.remove(0);
		}else if(tmp==-1) {
			mensaje="Caja cerrada";
		}else {
			mensaje="No hay clientes";
		}
		
		return mensaje;
	}
	
	public int buscarPosicionCaja(int numeroCaja) {
		int posicion =-1;
		boolean encontrada=false;
		for(int i=0; i<cajas.length && !encontrada; i++) {
			if(cajas[i]!=null && cajas[i].getNumeroCaja()==numeroCaja) {
				posicion=i;
				encontrada=true;
			}
		}
		
		return posicion;
	}

}
