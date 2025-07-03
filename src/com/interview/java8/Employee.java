package com.interview.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public record Employee(String name, String department, Double salary) {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Ramesh", "IT", 750000.0),
				new Employee("Suresh", "HR", 450000.0), new Employee("Vishal", "Account", 55000.0),
				new Employee("Mohit", "HR", 850000.0), new Employee("Sachin", "IT", 40000.0)

		);
		
		//1. Group by department 
		Map<String, List<Employee>> grpByDept = employees.stream()
				.collect(Collectors.groupingBy(emp->emp.department,Collectors.filtering(e->e.salary>50000, Collectors.toList())));
		//2. high earn name
		Map<String, List<String>> highEarnNames = employees.stream()
				.collect(Collectors.groupingBy(emp->emp.department,
				Collectors.filtering(emp->emp.salary>50000, Collectors.mapping(emp->emp.name, Collectors.toList()))));

	}

}
