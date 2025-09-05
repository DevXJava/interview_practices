package com.interview.thread.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockObject {
	Lock lock = new ReentrantLock();
	public void lockMethod() {
		lock.lock();
		try {
			
		}finally {
			lock.unlock();
		}
	}
	public static void main(String[] args) {
		

	}

}
