package com.predicates;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		/*predicate is giving only boolean values
		 * 
		 * 
		 */
		Predicate<String> str = a-> (a=="Devendra");
		Predicate<Integer> ints = i->(i>21);
		
		boolean result = str.equals("India");
		System.out.println("result is :"+result);
		
		boolean intres = ints.test(22);
		System.out.println("ints is :"+intres);
		
		Predicate<Integer> val1  = v->(v>44);
		Predicate<Integer> val2  = v->(v<48);
		System.out.println(val1.and(val2).test(10));
		

	}

}
