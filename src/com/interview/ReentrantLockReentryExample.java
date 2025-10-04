package com.interview;

import java.util.concurrent.locks.ReentrantLock;

class ReentrantDemo{
	
	private final ReentrantLock lock = new ReentrantLock();
	
	public void outer() {
		lock.lock();
		try {
			System.out.println(Thread.currentThread().getName()+" -> outer()");
			inner(); //same thread calling inner
		} finally {
			lock.unlock();
		}
	}
	
	public void inner() {
		lock.unlock(); //same thread can acquire again
		try {
			System.out.println(Thread.currentThread().getName()+" -> inner()");
		} finally {
			lock.unlock();
		}
	}
	
}


public class ReentrantLockReentryExample {

	public static void main(String[] args) {
		ReentrantDemo demo = new ReentrantDemo();
		new Thread(demo::outer,"Thread-A").start();

	}

}
