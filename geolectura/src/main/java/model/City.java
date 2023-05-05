package main.java.model;

import java.util.ArrayList;
import java.util.List;

public class City {
	
	private int city_id;
	private String city;
	private List<Address> addresses;
	private int country_id;
	
	public City(int city_id,String city, int country_id) {
		this.city_id=city_id;
		this.city=city;
		this.country_id=country_id;
		this.addresses = new ArrayList<>();
	}
	
	public String getCity() {
		return this.city;
	}
	
	public int getCountryId() {
		return country_id;
	}
	
	public void addAddress(Address address) {
		this.addresses.add(address);
	}
	
	public int numeroDeDirecciones() {
		return this.addresses.size();
	}

	@Override
	public String toString() {
		return " -"+city_id + " "+this.city+" \n"  ;
	}
	
	
	

}
