package com.interview.thread;
class MyRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I am Runnable");
		}
		
		
	}
}
public class ThreadUsingRunnable {

	public static void main(String[] args) {
		
		MyRunnable r = new MyRunnable();
		Thread thread = new Thread(r);
		thread.start();

	}

}
