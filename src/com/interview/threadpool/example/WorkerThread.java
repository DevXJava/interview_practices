package com.interview.threadpool.example;


// 1. WorkerThread
// 2. SimpleThreadPool
// 3. RejectedExecutionHandlerImpl
// 4. MyMonitorThread
public class WorkerThread implements Runnable{

	String command;
	
	public WorkerThread(String command) {
		this.command=command;
	}
	
	@Override
	public synchronized void  run() {
		System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
		processCommand();
		System.out.println(Thread.currentThread().getName()+" End."+command);
	}
	
	public synchronized void  processCommand() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.command;
	}
}
