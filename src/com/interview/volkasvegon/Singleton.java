package com.interview.volkasvegon;

public class Singleton {
	
	static Singleton singleton;
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static synchronized Singleton getInstance() {
		
		if(singleton==null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	

}
