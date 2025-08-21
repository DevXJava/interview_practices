package com.interview.all;

final class EmployeeI {
	private final int id;
	private final String name;

	public EmployeeI(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}

public class CustomImmutable {
	private final int id;
	private final String name;
	private final EmployeeI emp;

	public CustomImmutable(int id, String name, EmployeeI emp) {
		this.id = id;
		this.name = name;
		this.emp = new EmployeeI(id, name);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public EmployeeI getEmployeeI() {
		return new EmployeeI(emp.getId(), emp.getName());
	}

	public static void main(String[] args) {

	}

}
