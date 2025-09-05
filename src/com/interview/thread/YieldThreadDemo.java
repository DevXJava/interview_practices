package com.interview.thread;

class YieldExample extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			Thread.yield();
			System.out.println("Child Thread ...");
		}
	}
}


public class YieldThreadDemo {

	public static void main(String[] args) {
		
     YieldExample example = new YieldExample();
     //example.setPriority(10);
     example.start();
     for (int i = 0; i < 5; i++) {
		System.out.println("Main thread");
		// Priority is always high of main thread by default
	}
	}

}
