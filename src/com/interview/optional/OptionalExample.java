package com.interview.optional;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		// without optional class examples 
		String[] strings = new String[10];
		//String lowercaseString = strings[5].toLowerCase();
		//System.out.println(lowercaseString);
		
		// with optional class examples 
		String[] str= new String[10];
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if(checkNull.isPresent()) {
			System.out.println(str[5].toLowerCase());
		}else {
			System.out.println("String value is not present here ....");
		}
		//-------------------------------------------------
		String[] st = new String[10];
		st[5] = "JAVA OPTIONAL CLASS EXAMPLE";
		Optional<String> optional = Optional.ofNullable(st[5]);
		optional.ifPresent(System.out::println);// printing value by using method reference 
		System.out.println(optional.get()); // printing value by get method
		
		Optional<String> empty = Optional.empty();
		System.out.println(empty);
		Optional<String> value = Optional.of(st[5]);
		System.out.println("filtered value "+value.filter((s)->s.equals("ABC")));
		
		System.out.println("filtered value "+value.filter((s)->s.equals("JAVA OPTIONAL CLASS EXAMPLE")));
		
		System.out.println("getting values "+value.get());
		
		System.out.println("getting hash code "+value.hashCode());
		System.out.println("is Empty ---"+value.isEmpty()+"  is present ---"+value.isPresent());
		
		

	}

}
