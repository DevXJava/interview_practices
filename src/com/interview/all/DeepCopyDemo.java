package com.interview.all;

class Department implements Cloneable {
	private String name;

	public Department(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected Department clone() throws CloneNotSupportedException {
		return (Department) super.clone(); // ✅ covariant return
	}
}

class EmployeeDeep implements Cloneable {
	private int id;
	private String name;
	private Department dept;

	public EmployeeDeep(int id, String name, Department dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Department getDept() {
		return dept;
	}

	@Override
	protected EmployeeDeep clone() throws CloneNotSupportedException {
		EmployeeDeep cloned = (EmployeeDeep) super.clone();
		cloned.dept = dept.clone(); // ✅ safe and clear
		return cloned;
	}
}

public class DeepCopyDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Department dept = new Department("HR");
		EmployeeDeep emp1 = new EmployeeDeep(101, "Alice", dept);
		EmployeeDeep emp2 = emp1.clone(); // deep copy

		// Change department name in cloned object
		emp2.getDept().setName("Engineering");

		System.out.println("emp1 dept: " + emp1.getDept().getName()); // HR
		System.out.println("emp2 dept: " + emp2.getDept().getName()); // Engineering
	}
}
