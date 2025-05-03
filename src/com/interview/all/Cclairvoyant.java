package com.interview.all;

class Aclairvoyant{
	public Aclairvoyant() {
		System.out.println("A");
	}
}

class Bclairvoyant extends Aclairvoyant{
	public Bclairvoyant() {
		System.out.println("B");
	}
}
public class Cclairvoyant extends Bclairvoyant {
	public Cclairvoyant() {
		System.out.println("C");
	}
	public static void main(String[] args) {
		Cclairvoyant c = new Cclairvoyant();
		System.out.println("==================================");
		Aclairvoyant a = new Cclairvoyant();
		
		System.out.println("===================================");
		
		Bclairvoyant b = new Bclairvoyant();
		
		//B b1 = new A();

	}

}
