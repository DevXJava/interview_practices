package com.interview.all;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.medium.Employee;

public class FindSecondHighestSalary {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Yanksha", 28, 123, "F", "HR", "Blore", 2020));
		list.add(new Employee(2, "Francesca", 29, 120, "F", "HR", "Hyderabad", 2015));
		list.add(new Employee(3, "Ramesh", 30, 115, "M", "HR", "Chennai", 2014));
		list.add(new Employee(4, "Melanie", 32, 125, "F", "HR", "Chennai", 2013));

		list.add(new Employee(5, "Padma", 22, 150, "F", "IT", "Noida", 2013));
		list.add(new Employee(6, "Milad", 27, 140, "M", "IT", "Gurugram", 2017));
		list.add(new Employee(7, "Uzma", 26, 130, "F", "IT", "Pune", 2016));
		list.add(new Employee(8, "Ali", 23, 145, "M", "IT", "Trivandam", 2015));
		list.add(new Employee(9, "Ram", 25, 160, "M", "IT", "Blore", 2010));
		
		
		Optional<Employee> secondHighestSal = list.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();

	}

}
