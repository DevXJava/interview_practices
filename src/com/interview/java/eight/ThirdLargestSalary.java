package com.interview.java.eight;

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
		return this.id + " " + this.name + " " + this.salary;
	}

}

public class ThirdLargestSalary {

	public static void main(String[] args) {

		List<Employees> list = Arrays.asList(new Employees(6, "Devendra", 3000), new Employees(3, "Devendra Patel", 2000),
				new Employees(5, "Aevendra", 1000), new Employees(2, "Cevendra", 9000));
		System.out.println("sort based on salary :."+list.stream().sorted((a,b)->(b.getSalary()-a.getSalary())).collect(Collectors.toList()));
		
		System.out.println("Third largest salary:. "+list.stream().sorted((a,b)->(b.getSalary()-a.getSalary())).skip(2).findFirst().get());
		
		System.out.println("Third Largest salary name:. "+list.stream().sorted((a,b)->(b.getSalary()-a.getSalary())).skip(2).map(Employees::getName).findFirst().get());
			
		System.out.println("sort based on id :."+list.stream().sorted((c,d)->(c.getId()-d.getId())).collect(Collectors.toList()));
		
	}

}
