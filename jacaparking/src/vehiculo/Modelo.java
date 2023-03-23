package vehiculo;

import java.util.Objects;

public class Modelo {
		
		private String modelo;
		private String descripcion;
		
		public Modelo() {
			super();
			this.descripcion="";
		}
		public Modelo(String modelo, String descripcion) {
			this();
			this.modelo=modelo;
			this.descripcion=descripcion;
		}
		public Modelo(String modelo) {
			this();
			this.modelo=modelo;
			
		}
		
		public String getModelo() {
			return this.modelo;
		}
		@Override
		public int hashCode() {
			return Objects.hash(descripcion, modelo);
		}
		
		@Override
		public boolean equals(Object obj) {
			
			boolean sonIguales = this==obj;
			
			if(!sonIguales && obj!=null && obj instanceof Modelo) {
				Modelo casteado = (Modelo) obj;
				sonIguales = this.hashCode()==casteado.hashCode();
			}
			return sonIguales;
		}
		@Override
		public String toString() {
			return modelo + ", " + descripcion;
		}
		
		
		
		
	


}
