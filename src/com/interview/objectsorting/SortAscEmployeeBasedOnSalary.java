package com.interview.objectsorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employees {

	private int id;
	private String name;
	private int salary;

	public Employees(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" "+this.name+" "+this.salary;
	}

}

public class SortAscEmployeeBasedOnSalary {

	public static void main(String[] args) {
		List<Employees> list = Arrays.asList(
		new Employees(1, "Devendra", 3000),
		new Employees(3, "Devendra", 2000),
		new Employees(5, "Devendra", 1000),
		new Employees(2, "Devendra", 9000));

		List<Employees> sortedList = list.stream().sorted((a, b) -> (a.getSalary() - b.getSalary()))
				.collect(Collectors.toList());
		System.out.println(sortedList);
		

	}

}
