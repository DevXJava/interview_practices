package com.interview;

public class SingletonExample {
	
	public static SingletonExample singleton=null;
	
	private SingletonExample() {
		
	}
	
	public static SingletonExample getInstance() {
		
		if(singleton==null) {
			singleton = new SingletonExample();
		}
		return singleton;
	}

	public static void main(String[] args) {
		System.out.println("same hashCode : "+SingletonExample.getInstance().hashCode());
		System.out.println("same hashCode : "+SingletonExample.getInstance().hashCode());


	}

}
