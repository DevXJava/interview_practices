package com.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Address1 {
	private int addressid;
	private String city;
	private int pincode;

	public Address1() {
		// TODO Auto-generated constructor stub
	}

	public Address1(int addressid, String city, int pincode) {
		super();
		this.addressid = addressid;
		this.city = city;
		this.pincode = pincode;
	}

	public int getAddressid() {
		return addressid;
	}

	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}

class Employee1 {
	private int empid;
	private String empname;
	private Address1 address1;

	public Employee1() {
		// TODO Auto-generated constructor stub
	}

	public Employee1(int empid, String empname, Address1 address1) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.address1 = address1;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Address1 getAddress1() {
		return address1;
	}

	public void setAddress1(Address1 address1) {
		this.address1 = address1;
	}

}

public class ShortEmployeeAddress {
//Q.Short Employee by city descending order
	public static void main(String[] args) {
		Employee1 emps = new Employee1();

		List<Employee1> list = Arrays.asList(new Employee1(1, "Ram", new Address1(1, "Indore", 123456)),
				new Employee1(2, "Shyam", new Address1(2, "Bhopal", 12345)),
				new Employee1(3, "Shiva", new Address1(3, "Mumbai", 1234)),
				new Employee1(4, "Vishnu", new Address1(4, "Mathura", 123)));

		List<Employee1> sortByCityDesc = list.stream()
				.sorted(Comparator.comparing((Employee1 emp) -> emp.getAddress1().getCity()).reversed())
				.collect(Collectors.toList());

	}

}
