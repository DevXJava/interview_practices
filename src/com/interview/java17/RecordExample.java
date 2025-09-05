package com.interview.java17;
record Employee(String name,int age) {
	public String greet() {
        return "Hello, my name is " + name + " and I am " + age + " years old.";
    }
	public Employee {
		if(age<18) {
			throw new IllegalArgumentException("Age must be 18 or above ");
		}
	}
}
public class RecordExample {

	public static void main(String[] args) {
		Employee emp = new Employee("Alice", 30);  // ✅ Works fine
        Employee emp2 = new Employee("Bob", 19);
        System.out.println(emp.greet());

	}

}
