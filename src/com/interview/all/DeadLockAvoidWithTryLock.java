package com.interview.all;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockAvoidWithTryLock {

	private final ReentrantLock lock1 = new ReentrantLock();
	private final ReentrantLock lock2 = new ReentrantLock();

	public void method1() {
        try {
            if (lock1.tryLock(500, TimeUnit.MILLISECONDS)) {
                System.out.println(Thread.currentThread().getName() + " locked lock1");

                Thread.sleep(100);

                if (lock2.tryLock(500, TimeUnit.MILLISECONDS)) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " locked lock2");
                        // do some work
                    } finally {
                        lock2.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " could not acquire lock2, releasing lock1");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock1.isHeldByCurrentThread()) {
                lock1.unlock();
            }
        }
    }

	public void method2() {
		try {
			if (lock2.tryLock(500, TimeUnit.MILLISECONDS)) {
				System.out.println(Thread.currentThread().getName() + " locked lock2");

				Thread.sleep(100);

				if (lock1.tryLock(500, TimeUnit.MILLISECONDS)) {
					try {
						System.out.println(Thread.currentThread().getName() + " locked lock1");
						// do some work
					} finally {
						lock1.unlock();
					}
				} else {
					System.out.println(Thread.currentThread().getName() + " could not acquire lock1, releasing lock2");
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if (lock2.isHeldByCurrentThread()) {
				lock2.unlock();
			}
		}
	}

	
	public static void main(String[] args) {
		DeadLockAvoidWithTryLock deadlock = new DeadLockAvoidWithTryLock();
		Thread t1 = new Thread(deadlock::method1,"Thread-1");
		Thread t2 = new Thread(deadlock::method2,"Thread-2");
		t1.start();
		t2.start();
	}
}
