package com.interview.designpattern;

interface Vehicle{
	void drive();
}
class Car implements Vehicle{
	@Override
	public void drive() {
		System.out.println("Driving a Car !");
		
	}
}
class Bike implements Vehicle{
	@Override
	public void drive() {
		System.out.println("Riding a Bike !");
		
	}
}
class VehicleFactory{
	public static Vehicle getVehicle(String type) {
		if("Car".equals(type)) {
			return new Car();
		}else if("Bike".equals(type)) {
			return new Bike();
		}
		throw new IllegalArgumentException("Unknow Vehicle type");
	}
}
public class FactoryDesignPattern {

	public static void main(String[] args) {
		//create car
		Vehicle car = VehicleFactory.getVehicle("Car");
		car.drive();
		
		//create bike
		Vehicle bike = VehicleFactory.getVehicle("Bike");
		bike.drive();

	}

}
