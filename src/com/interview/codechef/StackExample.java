package com.interview.codechef;

import java.util.ArrayList;

class Stack<T>{
	private ArrayList<T> stack;
	public Stack() {
		stack = new ArrayList<T>();
	}
	// add an item to the top of the stack
	public void push(T item) {
		stack.add(item);
	}
	//remove and the top item from the stack
	public T pop() {
		if(isEmpty()) {
			throw new IllegalStateException("stack is empty");
		}
		return stack.remove(stack.size()-1);
	}
	//Look at the top item without removing it.
	public T peek() {
		if(isEmpty()) {
			throw new IllegalStateException("stack is empty");
		}
		return stack.get(stack.size()-1);
	}
	
	//check if the stack is empty
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	//get the size of stack
	public int size() {
		return stack.size();
	}
}

public class StackExample {

	public static void main(String[] args) {
		Stack<String> bookStack = new Stack<String>();

        // Add books to the stack
        bookStack.push("Book 1");
        bookStack.push("Book 2");
        bookStack.push("Book 3");

        System.out.println("Stack size: " + bookStack.size());
        System.out.println("Top book: " + bookStack.peek());

        // Remove the top book
        String removedBook = bookStack.pop();
        System.out.println("Removed book: " + removedBook);

        System.out.println("New stack size: " + bookStack.size());
        System.out.println("New top book: " + bookStack.peek());

	}

}
