package com.interview.all;

public class MultiThreadedSingletonClass {
	
	// volatile keyword ensures visibility of changes to variables across threads
	private static volatile MultiThreadedSingletonClass instance;
	
	private MultiThreadedSingletonClass() {
		System.out.println("Singleton instance created!");
	}
	
	public static MultiThreadedSingletonClass getInstance() {
		if(instance==null) { //first check no locking
			synchronized (MultiThreadedSingletonClass.class) {
				if(instance==null) { //second check with locking
					instance = new MultiThreadedSingletonClass();
				}
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		Runnable task = () ->{
			MultiThreadedSingletonClass instance = MultiThreadedSingletonClass.getInstance();
			 System.out.println(Thread.currentThread().getName() + " - " + instance.hashCode());
		};
		
		Thread t1 = new Thread(task,"Thread-1");
		Thread t2 = new Thread(task,"Thread-1");
		Thread t3 = new Thread(task,"Thread-1");
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
