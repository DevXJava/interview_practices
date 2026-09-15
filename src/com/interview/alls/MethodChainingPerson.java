package com.interview;

public class MethodChainingPerson {

	private String firstName;
	private String lastName;
	private int age;

	public MethodChainingPerson() {

	}

	public MethodChainingPerson(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public MethodChainingPerson setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public String getLastName() {
		return lastName;
	}

	public MethodChainingPerson setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public int getAge() {
		return age;
	}

	public MethodChainingPerson setAge(int age) {
		this.age = age;
		return this;
	}

	@Override
	public String toString() {
		return "Person{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", age=" + age+"}";
	}

	public static void main(String[] args) {
		MethodChainingPerson methodChainingPerson =
				new MethodChainingPerson().setFirstName("John").setLastName("Cherry").setAge(25);
		System.out.println(methodChainingPerson);
	}

}
