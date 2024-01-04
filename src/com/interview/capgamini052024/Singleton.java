package com.interview.capgamini052024;

public class Singleton {
	
	private String str;
	private static Singleton singleton;
    
	private Singleton() {
		str="Hello I am singleton class";
	}
	
	public static synchronized Singleton  getInstance() {
		
		if(singleton ==null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	

	public static void main(String[] args) {
		
		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		Singleton c = Singleton.getInstance();
		System.out.println(a.hashCode()+"   "+b.hashCode()+"  "+c.hashCode());
		if(a==b&&b==c) {
			System.out.println("Object is singleton");
		}
		

	}

}
