package com.guess.output;

import java.util.HashMap;
import java.util.Map;

class Employee {
	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

public class Test5 {

	public static void main(String[] args) {
		Map<Employee, String> map = new HashMap<>();
		map.put(new Employee(1, "A"), "HR");
		map.put(new Employee(2, "B"), "IT");
		System.out.println(map.get(new Employee(1, "A")));
	}

}
