package com.thread;

class VolatileData{
	private volatile int counter =0;
	public int getCounter() {
		return counter;
	}
	public void increaseCounter() {
		++counter;
	}
	
}
class VolatileThread extends Thread{
	
	private final VolatileData volatileData;
	
	public VolatileThread(VolatileData volatileData) {
		this.volatileData=volatileData;
	}
	@Override
	public void run() {
		int oldValue = volatileData.getCounter();  
		System.out.println("[Thread " + Thread.currentThread().getId() + "]: Old value = " + oldValue);  
		volatileData.increaseCounter();  
		int newValue = volatileData.getCounter();  
		System.out.println("[Thread " + Thread.currentThread().getId() + "]: New value = " + newValue);  
	}
	
}

public class VolatileMain {
	private final static int noOfThreads = 2;  
	public static void main(String[] args) throws InterruptedException {
		VolatileData volatileData = new VolatileData();     //object of VolatileData class  
		Thread[] threads = new Thread[2];     //creating Thread array   
		for(int i = 0; i < noOfThreads; ++i)  
		threads[i] = new VolatileThread(volatileData);  
		for(int i = 0; i < noOfThreads; ++i)  
		threads[i].start();                 //starts all reader threads  
		for(int i = 0; i < noOfThreads; ++i)  
		threads[i].join();                  //wait for all threads  

	}

}
