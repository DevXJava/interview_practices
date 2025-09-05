package com.interview.thread.concurrency;
class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("Runnable executing here");
		
	}
}
public class MyRunnableMain {

	public static void main(String[] args) {
		Thread  thread = new Thread(new MyRunnable());
		thread.start();

	}

}
