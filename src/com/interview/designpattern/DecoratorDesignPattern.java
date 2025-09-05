package com.interview.designpattern;
/*The "Decorator Design Pattern" is your go-to solution when you need to extend the behavior of objects dynamically 
without modifying their structure. 
It allows for adding responsibilities to objects at runtime, keeping your code clean and flexible.
*/

//Example Coffee ordering system
//step 1: create the Component interface
interface Coffee{
	String getDescription();
	double cost();
}
//step 2: Implement a Concrete Component
class SimpleCoffee implements Coffee{
	@Override
	public String getDescription() {
		return "Simple coffee";
	}
	@Override
	public double cost() {
		return 50.0;
	}
}
//step 3: create the Decorator class
abstract class CoffeeDecorator implements Coffee{
	protected Coffee coffee; // The component we are decorating 
	public CoffeeDecorator(Coffee coffee) {
		this.coffee=coffee;
	} 
	@Override
	public String getDescription() {
		return coffee.getDescription();
	}
	@Override
	public double cost() {
		return coffee.cost();
	}
	
}
//step 3: Implement Concrete Decorators (add ons)
class MilkDecorator extends CoffeeDecorator{
	public MilkDecorator(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public String getDescription() {
		return coffee.getDescription()+", Milk";
	}
	
	@Override
	public double cost() {
		return coffee.cost()+10.0;
	}
}
class SugarDecorator extends CoffeeDecorator{
	public SugarDecorator(Coffee coffee) {
		super(coffee);
	}
	@Override
	public String getDescription() {
		return coffee.getDescription()+", Sugar";
	}
	
	@Override
	public double cost() {
		return coffee.cost()+5.0;
	}
}
// Use the Decorator pattern
public class DecoratorDesignPattern {

	public static void main(String[] args) {
		Coffee coffee = new SimpleCoffee();
		System.out.println(coffee.getDescription()+" : "+coffee.cost());
		
		//Add milk
		coffee = new MilkDecorator(coffee);
		System.out.println(coffee.getDescription()+" : "+coffee.cost());
		
		//Add Sugar 
		coffee = new SugarDecorator(coffee);
		System.out.println(coffee.getDescription()+" : "+coffee.cost());

	}

}
