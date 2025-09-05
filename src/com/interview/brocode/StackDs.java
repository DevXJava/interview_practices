package com.interview.brocode;

import java.util.Stack;

public class StackDs {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		System.out.println(stack.isEmpty());
		
		stack.push("Java");
		stack.push("C");
		stack.push("C++");
		stack.push("SQL");
		stack.push("Java Script");
		
		System.out.println(stack.isEmpty());
		stack.pop();
		
		String poped = stack.pop();
		System.out.println("poped data :"+poped);
		
		System.out.println(stack);
		
		System.out.println(stack.search("Java"));

	}

}
