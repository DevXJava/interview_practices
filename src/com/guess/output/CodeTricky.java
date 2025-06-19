package com.guess.output;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CodeTricky {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("a", "b", "c");
		list.set(0, "x");
		//list.add("y");  // here we can not modify the list 
		System.out.println(list);
		/*✅ Step-by-step Explanation:
			1. Arrays.asList("a", "b", "c")
			Creates a fixed-size list backed by an array.
			
			You can modify elements using set(), but cannot change the size (i.e., can't add or remove).
			
			2. list.set(0, "x")
			Replaces the element at index 0 ("a") with "x".
			
			List becomes: ["x", "b", "c"]
			
			3. list.add("y")
			❌ Throws UnsupportedOperationException
			
			Because the list is fixed-size — you cannot add new elements.*/
		
		//2. 
		List<String> names = Arrays.asList("pear","banana","apple","grape");
		names.stream().limit(2).sorted().forEach(n->System.out.println(n));
		
		//3.
		List<String> listD = Arrays.asList("one", "two", "three");
		listD.stream()
	    .filter(s -> {
	        System.out.println("Filtering: " + s);
	        return s.length() > 3;
	    })
	    .findFirst();
		
		//4.
		IntStream.range(1, 5).map(i -> i * i).peek(System.out::println).count();
		
		//5.
		Stream<Integer> stream = Arrays.asList(1,2).stream();
		stream.forEach(System.out::println);
		//stream.forEach(System.out::println); //  Here Two time we can not print the stream because its already closed 
		
		//6.
		String a = "hello";
        String b = "he" + "llo"; // constant expression
        String c = "he";
        String d = c + "llo";   // runtime concatenation

        System.out.println(a == b); // Line 1  true
        System.out.println(a == d); // Line 2  false
        System.out.println(a.equals(d)); // Line 3 true
        
        //7.
        	 int x = 15;
        	 if(x <= 15){
        	 System.out.print("Inside if "); // after this condition execute it will not got in else part
        	 }else if(x == 15){
        	 System.out.print("Inside else if ");
        	 }
        	 System.out.println(x);
        	 
       //9.
        	 //⁉️What is the output of this Java code?
             System.out.println(true ? null : "yes");
             /*
             System.out.println(null) has multiple overloaded versions.
             println(String x)
             println(Object x)
             Now the problem is:
             null can match both:
             println(String x)

             println(Object x)

             But the compiler cannot decide which one to call, because:

             null is valid for both String and Object.

             And neither is more specific than the other.

             So the compiler gets confused → ambiguous method call.

             ✅ How to Fix It?
             You cast null explicitly to the type you want.
             System.out.println((String) null);  // prints: null
             System.out.println((Object) null);  // prints: null
        	*/
             
            //10.
             char[] str ={'A','B','C'} ;
             System.out.println(str);
            /* 🧠 Why?
            		 Because in Java:
            		 When you print a char[] (character array) using System.out.println(),
            		 It is implicitly converted into a String, not the memory address (like with other arrays).
            		 This is a special behavior for char[] only.
            		 
            		 int[] arr = {1, 2, 3};
					System.out.println(arr);   // prints something like [I@6f94fa3e
					For int[] or Object[], it prints the type + hashcode, because toString() is not overridden.
               */
	}

}
