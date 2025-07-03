package com.functional.interfaces;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//1. What is functional interface
/*Ans : A functional interface is an interface with only one abstract method. it can have default and static method 
 but must have one SAM (single abstract method).
 Example : Runnable , Callable , Comparator, Comparable, Function , Predicate, Supplier , Consumer
 */
//2. create custom functional interface
@FunctionalInterface
interface Calculator {
	int operate(int a, int b);
}

public class FunctionalInterfaceTest_01 {

	public static void main(String[] args) {
		Calculator add = (a, b) -> a + b;
		int sumIs = add.operate(10, 20);
		System.out.println("sum is : " + sumIs);
		
		//3. Use Predicate<T> to filter data
		System.out.println("------------Predicate----------------");
		Predicate<String> startWithJ = s->s.startsWith("J");
		System.out.println(startWithJ.test("Java"));
		System.out.println(startWithJ.test("Python"));
		
		//4. Use Function<T,R> to Convert Type
		System.out.println("------------Function------------------");
		Function<String, Integer> strLength = s->s.length();
		System.out.println(strLength.apply("Devendra"));
		
		//5. Use Consumer<T> for Side Effects e.g. print
		System.out.println("------------Consumer-------------------");
		Consumer<String> print = s->System.out.println("Hello "+ s);
		print.accept("World");
		
		//6. Use Supplier<T> to Provide values
		System.out.println("------------Supplier-------------------");
		Supplier<String> greeting = () -> "Hello from Supplier";
		System.out.println(greeting.get());
		
		//7. Use BiFunction<T,U,R> to combine Two Inputs 
		System.out.println("---------------BiFunction---------------");
		BiFunction<Integer, Integer, Integer> multiply = (a,b) -> (a*b);
		System.out.println(multiply.apply(10, 20));
		
		//8. Use Greet Functional interface here
		System.out.println("------------Funtional Interface-----------");
		Greet greet = () ->System.out.println("Hello !");
		greet.sayHello();
		greet.bye();
		Greet.info();
		
		//9. Chain function using and then
		System.out.println("-------------Chain funtion using and then-----------");
	}
	
	//8. Functional Interface with default + static methods
	@FunctionalInterface
	interface Greet{
		void sayHello();
		default void bye() {
			System.out.println("bye !");
		}
		static void info() {
			System.out.println("I am functional interface !");
		}
	}
}
