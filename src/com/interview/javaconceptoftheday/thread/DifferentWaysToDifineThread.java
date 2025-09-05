package com.interview.javaconceptoftheday.thread;
//1) Thread As A Separate Concrete Class
class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("extneding thread");
	}
}

//Usage Class
class UsageClassOne{
	void method() {
		MyThread myThread = new MyThread();
		myThread.start();
	}
}

//Usage Class
class UsageClassTwo{
	void method() {
		MyThread myThread = new MyThread();
		myThread.start();
	}
}

//2) Thread As A Nested Class or Static Inner Class


public class DifferentWaysToDifineThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
