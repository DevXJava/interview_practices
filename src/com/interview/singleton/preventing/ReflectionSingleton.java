package com.interview.singleton.preventing;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingleton {
	
	public static void main(String[] args) {
		Singleton singleton= Singleton.getInstance();
		Singleton singleton2=null;
		
		try {
			Constructor constructor = Singleton.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			singleton2 = (Singleton)constructor.newInstance();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Hashcode of Object 1 - "+singleton.hashCode());
        System.out.println("Hashcode of Object 2 - "+singleton2.hashCode());
	}

}
