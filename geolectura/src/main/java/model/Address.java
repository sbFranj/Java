package main.java.model;

public class Address {

	
	private int address_id;
	private String address;
	private String city;
	
	public Address(int address_id, String address, String city) {
		this.address=address;
		this.address_id=address_id;
		this.city=city;
	}
	

	
	public String getCity() {
		return this.city;
	}


	@Override
	public String toString() {
		return "\n  *" + address_id + " " + address;
	}
	
	
	
}
