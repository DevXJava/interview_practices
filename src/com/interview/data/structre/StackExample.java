package com.interview.data.structre;

import java.util.Stack;

public class StackExample {
	private int arr[]; // array is as a stack
	private int top; // putting element on stack
	private int capacity; // putting size

	public StackExample(int size) {
		arr = new int[size];
		top = -1; // it is default value in stack
		capacity = size;
	}

	public void push(int element) {
		if(isFull()) {
			System.out.println("Stack is already full");
		}
		try {
			arr[++top] = element;
			System.out.println("Inserting element "+element);
		} catch (Exception e) {
			
		}	
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is already empty we cant remove anything ");
		}
		return arr[top--];
	}
	
	public void printStack() {
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	}
	public Boolean isFull() {
		return top == capacity - 1; // if we are able to remove one element
	}
	public Boolean isEmpty() {
		return top == -1; //if top is -1
		
	}
	public int stacksSize() {
		return top +1;
	}
	public static void main(String[] args) {
		StackExample stack = new StackExample(3);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		stack.printStack();

	}

}
