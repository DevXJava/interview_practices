package com.interview.objectsorting;

import java.util.*;

class Employee_One implements Comparable<Employee_One> {

	int id;
	String empname;
	String empdept;

	public Employee_One(int id, String empname, String empdept) {
		super();
		this.id = id;
		this.empname = empname;
		this.empdept = empdept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpdept() {
		return empdept;
	}

	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}

	@Override
	public int compareTo(Employee_One o) {
		if (id > o.id) {
			return 1;
		} else if (id < o.id) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empname=" + empname + ", empdept=" + empdept + "]";
	}
}

class SortByEmpName implements Comparator<Employee_One> {
	@Override
	public int compare(Employee_One o1, Employee_One o2) {
		return o1.empname.compareTo(o2.empname);
	}

}

public class ComparableComparatorTest {

	public static void main(String[] args) {
		Comparator<Employee_One> sortByDepart = (a, b) -> a.empdept.compareTo(b.empdept);
		ArrayList<Employee_One> list = new ArrayList<Employee_One>();
		list.add(new Employee_One(8, "Deve", "Chemical"));
		list.add(new Employee_One(5, "Aeve", "Physics"));
		list.add(new Employee_One(2, "Eeve", "Machenical"));

		Collections.sort(list, new SortByEmpName());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).empname);
		}

		Collections.sort(list, sortByDepart);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).empdept);
		}
		Collections.sort(list);
		for (Employee_One emp : list) {
			System.out.println(emp.getId());
		}

		// System.out.println(list);
	}

}
