package com.interview;

public class AbstractTest extends AbstractParent{

	public AbstractTest(int id,String name) {
		super(id,name);
	}
	
	@Override
	void makeSound() {
		System.out.println("sound is wooo.....");
		
	}
	
	public static void main(String[] args) {
		
		AbstractTest abstractTest = new AbstractTest(1,"dev"); 
		abstractTest.displayInfo();
		abstractTest.makeSound();
		System.out.println(abstractTest.getId()+" : "+abstractTest.getName());

	}



	

}
