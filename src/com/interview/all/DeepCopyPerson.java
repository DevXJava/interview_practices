package com.interview.all;

public class DeepCopyPerson implements Cloneable{
	String name;
	int age;
	public DeepCopyPerson(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	 @Override
	public String toString() {
		 return "Person{name='" + name + "', age=" + age + "}";
	}
	
	public static void main(String[] args) {
		try {
			DeepCopyPerson original = new DeepCopyPerson("Devs", 30);
			DeepCopyPerson cloned = (DeepCopyPerson) original.clone();
			System.out.println("original : "+original);
			System.out.println("cloned : "+cloned);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		

	}

}
