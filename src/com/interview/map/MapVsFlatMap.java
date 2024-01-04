package com.interview.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class EmployeeMap {

	private int id;
	private String name;
	private int salary;
	private List<String> phoneNumber;

	public EmployeeMap(int id, String name, int salary,List<String> phoneNumber) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.phoneNumber = phoneNumber;;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + " " + this.name + " " + this.salary+" "+ phoneNumber;
	}
}

public class MapVsFlatMap {

	public static void main(String[] args) {
		List<EmployeeMap> list = Arrays.asList(new EmployeeMap(1, "Deve1", 2000,Arrays.asList("121","456")),
				                               new EmployeeMap(2, "Deve2", 2000,Arrays.asList("122","457")),
				                               new EmployeeMap(3, "Deve3", 2000,Arrays.asList("123","458")));
				
	     // name of all employee
	     List<String> empName = list.stream().map(emp -> emp.getName()).collect(Collectors.toList());
	     System.out.println("This is normal map empName :"+empName);
	     
	     List<List<String>> empPhone = list.stream().map(empsphone -> empsphone.getPhoneNumber()).collect(Collectors.toList());
	     System.out.println("This is normal map empPhone :"+empPhone);
	     
	     //flat map
	     List<String> flat = list.stream().flatMap(phone->phone.getPhoneNumber().stream()).collect(Collectors.toList());
	     System.out.println("this is flat map value :"+flat);
	     
	     //flat employee name
	     List<String> flatEmpname = list.stream().flatMap(empname->empname.getPhoneNumber().stream()).collect(Collectors.toList());
	     
	     
	     
	}

}
