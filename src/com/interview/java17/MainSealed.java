package com.interview.java17;

sealed class Vehicle permits Car,Bike{

	public void start() {
		System.out.println("Vehicle is starting...");
	}

}

//Permitted subclass
final class Car extends Vehicle {
	public void drive() {
		System.out.println("Car is driving...");
	}
}

//Permitted subclass
final class Bike extends Vehicle {
	public void ride() {
		System.out.println("Bike is riding...");
	}
}
// This will not allow because we not permitted 
//final class Truck extends Vehicle{}
public class MainSealed {

	public static void main(String[] args) {
		Vehicle car = new Car();
		car.start();
		((Car)car).drive();
		Vehicle bike = new Bike();
		bike.start();
		((Bike) bike).ride();

	}

}
