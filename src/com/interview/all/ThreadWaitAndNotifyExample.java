package com.interview.all;

public class ThreadWaitAndNotifyExample {

	public static void main(String[] args) throws InterruptedException {
		Object lock = new Object();

		Thread t1 = new Thread(() -> {

			synchronized (lock) {
				try {
					System.out.println("Thread 1 is waiting ");
					lock.wait();
					System.out.println("Thread 1 is resumed ");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});
		
		Thread t2 = new Thread(()->{
			synchronized (lock) {
				System.out.println("Thread 2 is notfying !");
				lock.notify();
			}
		});
		
		t1.start();
		Thread.sleep(10000);
		t2.start();

	}

}
