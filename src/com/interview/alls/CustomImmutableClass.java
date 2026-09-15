package com.interview;

import java.util.Date;

final class Address {
	private final String city;
	private final String state;

	public Address(String city, String state) {
		this.city = city;
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	// Copy constructor (used for defensive copy)
	public Address(Address other) {
		this.city = other.city;
		this.state = other.state;
	}

	@Override
	public String toString() {
		return city + ", " + state;
	}
}

final class EmployeeImmutable {
	private final int id;
	private final String name;
	private final Date dateOfJoining;
	private final Address address;

	public EmployeeImmutable(int id, String name, Date dateOfJoining, Address address) {
		this.id = id;
		this.name = name;
		this.dateOfJoining = new Date(dateOfJoining.getTime()); // defensive copy
		this.address = new Address(address); // defensive copy using copy constructor
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getDateOfJoining() {
		return new Date(dateOfJoining.getTime()); // defensive copy
	}

	public Address getAddress() {
		return new Address(address); // defensive copy
	}

	@Override
	public String toString() {
		return "Employee{id=" + id + ", name='" + name + "', dateOfJoining=" + dateOfJoining + ", address=" + address
				+ '}';
	}
}

public class CustomImmutableClass {

	public static void main(String[] args) {
		Address addr = new Address("Mumbai", "MH");
		Date doj = new Date();

		EmployeeImmutable emp = new EmployeeImmutable(1, "Niraj", doj, addr);

		// Try modifying original objects
		doj.setTime(0);
		Address newAddr = emp.getAddress();
		System.out.println("Before change: " + emp);
		System.out.println("Modifying returned address...");
		Address leaked = emp.getAddress();
		// No setter to change `leaked`, so safe

		System.out.println("After change: " + emp); // Employee still safe

	}

}
