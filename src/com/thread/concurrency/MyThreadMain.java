package com.thread.concurrency;
class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("Thread runing by Thread class");
	}
}
public class MyThreadMain {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();

	}

}
