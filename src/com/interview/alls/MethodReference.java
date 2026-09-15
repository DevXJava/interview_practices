package com.interview;

import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReference {

	public static void main(String[] args) {
		Consumer methodRef = (o) -> o.toString();
		
		//rewritten above as follows 
		Consumer objectConsumer = Object::toString;
		
		//Constructor
		Consumer<String> constrConsumer = String::new;
		
		Supplier<String> supplier = String::new;
		if(supplier.get().isBlank()) {
			System.out.println("I am blank !!!");
		}
		
       Predicate<String> predicate = String::isEmpty;
	}

}
