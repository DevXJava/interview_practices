package com.interview.guess.output;

import java.util.TreeSet;

class Employee9{
	int id;
	String name;

	public Employee9(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
public class Test9 {

	public static void main(String[] args) {
		TreeSet<Employee9> treeSet = new TreeSet<>();
		treeSet.add(new Employee9(1, "A"));  // Exception here we need to use Comparator or Comparable
		treeSet.add(new Employee9(2, "B"));
	}

}
