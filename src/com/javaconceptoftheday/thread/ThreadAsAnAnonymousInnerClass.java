package com.javaconceptoftheday.thread;

//5) Thread As An Anonymous Inner Class
//Threads can be declared as anonymous inner class. This method is useful when some task is needed only once. You can’t use the thread which is declared as anonymous inner class multiple times. You can use it only once.
public class ThreadAsAnAnonymousInnerClass {

	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				System.out.println("something....");
			}
		}.start();
		
		new Thread() {
			public void run() {
				System.out.println("something....");
			};
		}.start();
	}

}
