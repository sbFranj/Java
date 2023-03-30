package alquilerVehiculos;

import java.util.Scanner;

public class Main {
	
	public static int buscarVehiculo(Vehiculo[] jacaSixt, String matricula) {
		int posicion=-1;
		for(int i=0; i<jacaSixt.length && posicion==-1; i++) {
			if(jacaSixt[i]!=null && jacaSixt[i].getMatricula().equals(matricula)){
				posicion=i;
			}
		}
		
		return posicion;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Vehiculo[] jacaSixt = new Vehiculo[200];
		int opcion = 0;
		int singuienteVehiculo=0;
		
		
		while(opcion!=3) {
			try {
				System.out.print("      Menu\n"
						+ "1. Alta de vehiculo\n"
						+ "2. Calcular precio del alquiler\n"
						+ "3. Salir\n"
						+ "\n"
						+ "-----------> ");
				opcion=Integer.valueOf(sc.nextLine());
			} catch (Exception e) {
				System.out.println("ERROR Introduce una de estas opciones:");
			}
			if(opcion==1) {
				opcion=0;
				System.out.println("Alta de Vehiulo");
				try {
					System.out.println("Tipo de vehiculo\n"
									 + "1. Coche || 2. Microbús || 3. Furgoneta");
					opcion=Integer.valueOf(sc.nextLine());
				} catch (Exception e) {
					System.out.println("Vehiculo fuera de catalogo\n");
				}
				if(opcion==1) {
					System.out.println("Alta de Coche");
					String matricula;
					Gama gama;
					Combustible combustible;
						try {
							System.out.print("Introduce Matricula: ");
							matricula=sc.nextLine();
							System.out.print("Introduce Gama(Baja, Media, Alta): ");
							gama=Gama.valueOf(sc.nextLine().toUpperCase());
							System.out.print("Introduce tipo de Combustible(Diesel/Gasolina): ");
							combustible=Combustible.valueOf(sc.nextLine().toUpperCase());
							jacaSixt[singuienteVehiculo]=new Coche(matricula, gama, combustible);
							singuienteVehiculo++;
						} catch (Exception e) {
							e.printStackTrace();
						} finally {
							System.out.println("Done!");
						}
						
					matricula=null;
					gama=null;
					combustible=null;
				}else if(opcion==2) {
					System.out.println("Alta de Microbus");
					String matricula;
					Gama gama;
					int numPlazas;
						try {
							System.out.print("Introduce Matricula: ");
							matricula=sc.nextLine();
							System.out.print("Introduce Gama(Baja, Media, Alta): ");
							gama=Gama.valueOf(sc.nextLine().toUpperCase());
							System.out.print("Introduce numero de plazas: ");
							numPlazas=Integer.valueOf(sc.nextLine());
							jacaSixt[singuienteVehiculo]=new Microbus(matricula, gama, numPlazas);
							singuienteVehiculo++;
						} catch (Exception e) {
							e.printStackTrace();
						} finally {
							System.out.println("Done!");
						}
						
					matricula=null;
					gama=null;
					numPlazas=0;
				}if(opcion==3) {
					System.out.println("Alta de Furgoneta");
					String matricula;
					Gama gama;
					int pma;
						try {
							System.out.print("Introduce Matricula: ");
							matricula=sc.nextLine();
							System.out.print("Introduce Gama(Baja, Media, Alta): ");
							gama=Gama.valueOf(sc.nextLine().toUpperCase());
							System.out.print("Introduce numero de plazas: ");
							pma=Integer.valueOf(sc.nextLine());
							jacaSixt[singuienteVehiculo]=new Microbus(matricula, gama, pma);
							singuienteVehiculo++;
						} catch (Exception e) {
							e.printStackTrace();
						} finally {
							System.out.println("Done!");
						}
						
					matricula=null;
					gama=null;
					pma=0;
				}
				
			}else if(opcion==2) {
				int dias;
				String matricula;
				System.err.println("Calcular Precio");
				try {
					System.out.print("\nIntroduce matricula: ");
					matricula=sc.nextLine();
					System.out.print("Introduce numero de dias: ");
					dias=Integer.valueOf(sc.nextLine());
					if(buscarVehiculo(jacaSixt, matricula)!=-1) {
						System.out.print(jacaSixt[buscarVehiculo(jacaSixt, matricula)].calcularPrecio()*dias+"€\n");
						
					}
					
				} catch (Exception e) {
					System.out.println("ERROR");
				}
				
				
			}
		}

	}

}
