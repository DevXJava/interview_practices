package com.interview.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class EmployeeTest{
	private int id;
	private String name;
	private double salary;
	public EmployeeTest(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}

public class Test {

	public static void main(String[] args) {
		EmployeeTest test1 = new EmployeeTest(1, "Java", 20000);
		EmployeeTest test2 = new EmployeeTest(1, "Java", 20000);
		EmployeeTest test3 = new EmployeeTest(2, "Python", 30000);
		EmployeeTest test4 = test1;
		Set<EmployeeTest> set = new HashSet<>();
		set.add(test1);
		set.add(test2);
		set.add(test3);
		set.add(test4);
		System.out.println(set.size());
		
		List<Integer> list = Arrays.asList(1,4,6,5,8,10,11);
		
		List<Integer> even = list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(even);
		List<Integer> odd = list.stream().filter(n->n%2==0).collect(Collectors.toList());
				

	}

}
