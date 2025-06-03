package com.javaconceptoftheday.thread;
class Shared{
	int i;
	public void sharedMethod() {
		i = 10;
        System.out.println(i);
        i = 20;
        System.out.println(i);
        i = 30;
        System.out.println(i);
	}
}
public class ThreadInterference {

	public static void main(String[] args) {
		final Shared shared = new Shared();
		
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				shared.sharedMethod();
			}
		};
		
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				shared.sharedMethod();
			}
		};
		thread1.start();
		thread2.start();

	}

}
