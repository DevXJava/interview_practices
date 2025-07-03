package com.interview.threads;
/*
 Thread.setDaemon(boolean): Marks the thread as either a daemon thread or a user thread. 
 When the JVM exits, all daemon threads are terminated. 
 */
public class SetDaemonMethod extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("Hello world !");
		}
	}

	public static void main(String[] args) {
		SetDaemonMethod myThread  = new SetDaemonMethod();
		myThread .setDaemon(true); // myThread is daemon thread ( like Garbage collector ) now
		SetDaemonMethod t2 = new SetDaemonMethod();
		t2.start();// it is user thread
		myThread .start();
        System.out.println("Main Done");
		

	}

}
