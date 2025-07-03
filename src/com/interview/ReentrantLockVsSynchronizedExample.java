package com.interview;

import java.util.concurrent.locks.ReentrantLock;

class SynchronizedExample {
	/*
	 The synchronized keyword in Java is used to control access to a block of code or method by multiple threads to ensure thread safety. 
	 It prevents race conditions by allowing only one thread to access the synchronized code at a time for a given object or class.
	 */
	private int counter = 0;

	public synchronized void increment() {
		counter++;
	}

	public synchronized int getCounter() {
		return counter;
	}

	public void SynchronizedExamples() throws InterruptedException {
		SynchronizedExample example = new SynchronizedExample();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				example.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				example.increment();
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Counter: " + example.getCounter()); // Expected: 2000
	}

}
//---------------------------------------------------------------------

class ReentrantLockExample {
	
	/*
	 ReentrantLock is a class provided in java.util.concurrent.locks package that offers an explicit locking mechanism. 
	 It is an alternative to the synchronized keyword and provides more control and flexibility. 
	 */
	private int counter = 0;
	private final ReentrantLock lock = new ReentrantLock();

	public void increment() {
		lock.lock();
		try {
			counter++;
		} finally {
			lock.unlock(); // Important to avoid deadlocks!
		}
	}

	public int getCounter() {
		return counter;
	}

	public void reentrantLockExamples() throws InterruptedException {
		ReentrantLockExample example = new ReentrantLockExample();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				example.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				example.increment();
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Counter: " + example.getCounter()); // Expected: 2000
	}

}

public class ReentrantLockVsSynchronizedExample {
	public static void main(String[] args) throws InterruptedException {
      new SynchronizedExample().SynchronizedExamples();
      new ReentrantLockExample().reentrantLockExamples();
	}
}
