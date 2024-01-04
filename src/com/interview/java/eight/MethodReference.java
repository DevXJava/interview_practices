package com.interview.java.eight;

import java.util.function.Consumer;

public class MethodReference {

	public static void main(String[] args) {
		Consumer methodRef = (o) -> o.toString();
		
		//rewritten above as follows 
		Consumer objectConsumer = Object::toString;
		
		//Constructor
		Consumer<String> constrConsumer = String::new;
		

	}

}
