package com.interview;

public class SingletonClass {
	private static SingletonClass singletonClass;
	
	String str;
	
	private SingletonClass() {
		str="Hello I am part of singleton";
	}
	
	public static synchronized SingletonClass getInstance() {
		if(singletonClass==null) {
			singletonClass = new SingletonClass();
		}
		
		return singletonClass;
	}

	public static void main(String[] args) {
		SingletonClass a = SingletonClass.getInstance();
		SingletonClass b = SingletonClass.getInstance();
		SingletonClass c = SingletonClass.getInstance();
		
		System.out.println(" a hash code "+a.hashCode()+" b hash code:  "+b.hashCode()+" c hash code:  "+c.hashCode());
		if(a==b&&b==c) {
			System.out.println("pointing same memory and object");
		}else {
			System.out.println("pointing different memory and object");
		}
		

	}

}
