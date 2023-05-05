package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import main.java.model.Address;
import main.java.model.City;
import main.java.model.Country;

public class Principal {
	
	public static void main(String[] args) {
		
		File address = new File("./files/address.txt");
		File city = new File("./files/city.txt");
		File country = new File("./files/country.txt");
		
		List<Address> addresses = new ArrayList<>();
		List<City> cities = new ArrayList<>();
		List<Country> countries = new ArrayList<>();
				
			try {
				FileReader readerAddress = new FileReader(address);
				BufferedReader bufferAddress = new BufferedReader(readerAddress);
				
				String lineaAddress;
				bufferAddress.readLine();
				lineaAddress = bufferAddress.readLine();
				
				while(lineaAddress!=null) {
					String [] partesAddress = lineaAddress.split(",");
					
					if(!partesAddress[2].isEmpty() && partesAddress[2]!=null) {
						addresses.add(new Address(Integer.valueOf(partesAddress[0]), partesAddress[1], partesAddress[2]));
					}else if(!partesAddress[3].isEmpty() && partesAddress[3]!=null) {
						addresses.add(new Address(Integer.valueOf(partesAddress[0]), partesAddress[1], partesAddress[3]));
					}
					
					lineaAddress = bufferAddress.readLine();
				}//System.out.println(addresses.toString());
				
				
				FileReader readerCity = new FileReader(city);
				BufferedReader bufferCity = new BufferedReader(readerCity);
				
				String lineaCity;
				bufferCity.readLine();
				lineaCity = bufferCity.readLine();
				while(lineaCity!=null) {
					String [] partesCity = lineaCity.split(",");
					cities.add(new City(Integer.valueOf(partesCity[0]), partesCity[1], Integer.valueOf(partesCity[2])));
					
					lineaCity = bufferCity.readLine();
				}//System.out.println(cities.toString());
				
				
				FileReader readerCountry = new FileReader(country);
				BufferedReader bufferCountry = new BufferedReader(readerCountry);
				
				String lineaCountry;
				bufferCountry.readLine();
				lineaCountry = bufferCountry.readLine();
				while(lineaCountry!=null) {
					String [] partesCountry = lineaCountry.split(",");
					countries.add(new Country(Integer.valueOf(partesCountry[0]), partesCountry[1]));
					lineaCountry = bufferCountry.readLine();
				}
				
				Iterator<City> it2 = cities.iterator();
				while(it2.hasNext()) {
					City tmp = it2.next();
					for(Address a : addresses) {
						if(tmp.getCity().equals(a.getCity())) {
							tmp.addAddress(a);
						}
					}
				}
				
				Iterator<Country> it = countries.iterator();
				while(it.hasNext()) {
					Country tmp = it.next();
					for(City c : cities) {
						if(tmp.getId()==c.getCountryId()) {
							tmp.addCity(c);
						}
					}
				}
				
				File fichero = new File("./files/paises.txt");
				fichero.createNewFile();
				
				FileWriter writer = new FileWriter(fichero);
				PrintWriter printer = new PrintWriter(writer);
				
				for(Country c : countries) {
					printer.println(c);					
				}
				printer.close();
				writer.close();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		
		
	}

}
