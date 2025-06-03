package com.interview.all;

final class Person {
	private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Only getters, no setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class ImmutablePersonClass {

	public static void main(String[] args) {
		Person person = new Person("Dev", 1);
		System.out.println(person.getName()+"  "+person.getAge());

	}

}
