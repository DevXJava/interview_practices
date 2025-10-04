package com.interview.all;

public class DeadLockExample {

	private final Object resource1 = new Object();
	private final Object resource2 = new Object();
	
	public void method1() {
		synchronized (resource1) {
			System.out.println(Thread.currentThread().getName()+" locked resource 1 : method1");
			
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			
			synchronized (resource2) {
				System.out.println(Thread.currentThread().getName()+" locked resource 2");
			}
		}	
	}
	
	public void method2() {
		synchronized (resource2) {
			System.out.println(Thread.currentThread().getName() + " locked resource 2 : method2");
			
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			
			synchronized (resource1) {
				System.out.println(Thread.currentThread().getName()+" locked resource 1");
			}
		}
	}
	
	public static void main(String[] args) {
		DeadLockExample lockExample = new DeadLockExample();
		
		Thread t1 = new Thread(lockExample::method1,"Thread-1");
		Thread t2 = new Thread(lockExample::method2,"Thread-2");
		t1.start();
		t2.start();

	}

}
