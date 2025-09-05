package com.interview.instacode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	private String name;
	private int age;
	public Employee(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
}

public class ShortListUsingLambda {
	public static void convertLisToMap() {
		List<Employee> employees = Arrays.asList(new Employee("John", 30),new Employee("Emma", 25),new Employee("Alex", 35));
		Map<Integer, String> map = employees.stream().collect(Collectors.toMap(e->e.getAge(), e->e.getName()));
		
	}
	
	// Given a list of integers, filter even numbers,square them and sort the result in descending order 
	public static void filterEvenAndSquareInDescendingOrder() {
		List<Integer> list = Arrays.asList(5,2,8,1,3,7,6);
		List<Integer> result = list.stream()
				                //Filter even number
				               .filter(n->n%2==0)
				               //square the number
				               .map(n->n*n)
				               //sorting in descending order
				               .sorted((a,b)->a-b)
				               .collect(Collectors.toList());
		result.forEach(System.out::println);
	}

	public static void sortListAscendingOrder() {
		List<Employee> employees = Arrays.asList(new Employee("John", 30),new Employee("Emma", 25),new Employee("Alex", 35));
		List<Employee> list =employees.stream().sorted(Comparator.comparingInt(e->e.getAge())).collect(Collectors.toList());
		List<Employee> listReversed =employees.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList());
		list.forEach(System.out::print);
	}
	public static void main(String[] args) {
		
       ShortListUsingLambda.filterEvenAndSquareInDescendingOrder();
	}

}
