package com.interview.all;

/*
To handle two max priority threads in a Singleton class, you need to ensure:
Thread-safe Singleton implementation
Threads are coordinated properly, especially if both have MAX_PRIORITY.
✅ Step 1: Thread-safe Singleton Implementation (Double-Checked Locking)
 
 */
class SingleTone{
	private static volatile SingleTone singleton = null;
	
	private SingleTone() {
		
	}
	public static SingleTone getInstance() {
		if(singleton == null) {
			synchronized (SingleTone.class) {
				if(singleton == null) {
					singleton = new SingleTone();
				}
			}
		}
		return singleton;
	}
	
	public void doWork(String threadName) {
		System.out.println("Executed by : "+threadName);
	}
}

/*
 ✅ Step 2: Create Two MAX_PRIORITY Threads 
 */
public class HandleTwoMaxPriorityThread {

	public static void main(String[] args) {
		Runnable runnable = () ->{
			SingleTone singleTone = SingleTone.getInstance();
			singleTone.doWork(Thread.currentThread().getName());	
		};
		
		Thread thread1 = new Thread(runnable,"MAX_PRIORITY Thread 1");
		Thread thread2 = new Thread(runnable,"MAX_PRIORITY Thread 2");
		
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MAX_PRIORITY);
		
		thread1.start();
		thread2.start();

	}

}
