package com.interview.objectsorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class EmployeeThird {

	private int id;
	private String name;
	private int salary;

	public EmployeeThird(int id, String name, int salary) {
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

		List<EmployeeThird> list = Arrays.asList(new EmployeeThird(6, "Devendra", 3000), new EmployeeThird(3, "Devendra Patel", 2000),
				new EmployeeThird(5, "Aevendra", 1000), new EmployeeThird(2, "Cevendra", 9000));
		System.out.println("sort based on salary :."+list.stream().sorted((a,b)->(b.getSalary()-a.getSalary())).collect(Collectors.toList()));
		
		System.out.println("Third largest salary:. "+list.stream().sorted((a,b)->(b.getSalary()-a.getSalary())).skip(2).findFirst().get());
		
		System.out.println("Third Largest salary name:. "+list.stream().sorted((a,b)->(b.getSalary()-a.getSalary())).skip(2).map(EmployeeThird::getName).findFirst().get());
			
		System.out.println("sort based on id :."+list.stream().sorted((c,d)->(c.getId()-d.getId())).collect(Collectors.toList()));
		
		EmployeeThird thirdLargestSal = list.stream().sorted(Comparator.comparing(EmployeeThird::getSalary).reversed()).skip(2).findFirst().orElseThrow(null);
		
	}

}
