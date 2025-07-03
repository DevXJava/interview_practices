package com.interview.threads;

public class ThreadLifecycle extends Thread {
	@Override
	public void run() {
		System.out.println("RUNNING"); // RUNNING
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
	}

	public static void main(String[] args) throws InterruptedException {

		ThreadLifecycle lifecycle = new ThreadLifecycle();
		System.out.println(lifecycle.getState());  // NEW
		lifecycle.start();
		System.out.println(lifecycle.getState());  // RUNNABLE
		Thread.sleep(100);
		System.out.println(lifecycle.getState());  // TIMED_WAITTING
		lifecycle.join();
		System.out.println(lifecycle.getState());  // TERMINATED
	}

}
