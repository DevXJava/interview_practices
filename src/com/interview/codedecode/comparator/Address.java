package com.interview.codedecode.comparator;

public class Address implements Comparable<Address>{
	private String streetName;
	private int pincode;
	
	public Address(String streetName, int pincode) {
		super();
		this.streetName = streetName;
		this.pincode = pincode;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", pincode=" + pincode + "]";
	}

	@Override
	public int compareTo(Address o) {
		// TODO Auto-generated method stub
		return this.getPincode()-o.getPincode();
		// -ve if 6-8 = -2
	}
}
