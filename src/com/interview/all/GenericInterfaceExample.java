package com.interview.all;

//Define an interface
interface Animal{
	void makeSound();
}

//Implement a interface in a class
class Dog implements Animal{
	@Override
	public void makeSound() {
		System.out.println("woof Woof woof !!!");
		
	}
}
//Generic class that accept only type Animal
class AnimalHandler <T extends  Animal>{
	private T animal;
	public AnimalHandler(T animal) {
		this.animal = animal;
	}
	
	public void playSound() {
		animal.makeSound();
	}
}
//main method
public class GenericInterfaceExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		AnimalHandler<Dog> animalHandler = new AnimalHandler(dog);
		animalHandler.playSound();

	}

}
