package com.javaconceptoftheday.thread;
class SharedSync{
	synchronized void methodOne(SharedSync s) {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+"is executing methodOne...");
        System.out.println(thread.getName()+"is calling methodTwo...");
        
        s.methodTwo(s);
        System.out.println(thread.getName()+"is finished executing methodOne...");
 
	}
	
	synchronized void methodTwo(SharedSync s) {
		Thread thread = Thread.currentThread();
		 
        System.out.println(thread.getName()+"is executing methodTwo...");
        System.out.println(thread.getName()+"is calling methodOne...");
 
        s.methodOne(this);
        System.out.println(thread.getName()+"is finished executing methodTwo...");
	}
}
public class DeadLockInJava {

	public static void main(String[] args) {
		final SharedSync s1 = new SharedSync();
		final SharedSync s2 = new SharedSync();
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				s1.methodOne(s2);
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
			s2.methodTwo(s1);	
			}
		};
		t1.start();
		t2.start();

	}

}
