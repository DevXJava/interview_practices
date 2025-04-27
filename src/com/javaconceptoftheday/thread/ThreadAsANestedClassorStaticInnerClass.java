package com.javaconceptoftheday.thread;

public class ThreadAsANestedClassorStaticInnerClass {
	
	//2)Thread class as a nested class or Static Inner Class of the ThreadAsANestedClassorStaticInnerClass class
	static class MyThread1 extends Thread{
		@Override
		public void run() {
			System.out.println("Thread 1");
		}
	}
	
	static class MyThread2 implements Runnable{
		@Override
		public void run() {
			System.out.println("Thread 1");
			
		}
	}

	public static void main(String[] args) {
		//Using the MyThread1 and it's task
		 
        MyThread1 thread1 = new MyThread1();
        thread1.start();
 
        //Using MyThread2 and it's task
 
        MyThread2 thread2 = new MyThread2();
        Thread t = new Thread(thread2);
        t.start();

	}

}
