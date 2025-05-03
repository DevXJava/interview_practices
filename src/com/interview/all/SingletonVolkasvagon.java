package com.interview.all;

public class SingletonVolkasvagon {
	
	static SingletonVolkasvagon singleton;
	private SingletonVolkasvagon() {
		// TODO Auto-generated constructor stub
	}
	
	public static synchronized SingletonVolkasvagon getInstance() {
		
		if(singleton==null) {
			singleton = new SingletonVolkasvagon();
		}
		return singleton;
	}
	

}
