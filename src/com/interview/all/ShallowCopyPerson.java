package com.interview.all;
class Address{
	String city;
    Address(String city) {
        this.city = city;
    }
}
public class ShallowCopyPerson implements Cloneable{

	String name;
	int age;
	Address address;
	
	public ShallowCopyPerson(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + ", address=" + address.city + "}";
	}
	public static void main(String[] args) {
		try {
            Address address = new Address("New York");
            ShallowCopyPerson original = new ShallowCopyPerson("Alice", 30, address);
            ShallowCopyPerson cloned = (ShallowCopyPerson) original.clone();
            System.out.println("Original: " + original);
            System.out.println("Cloned: " + cloned);
            // Modify the address in the cloned object
            cloned.address.city = "Los Angeles";
            
            System.out.println("After modifying cloned object:");
            System.out.println("Original: " + original);
            System.out.println("Cloned: " + cloned);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

	}

}
