package com.interview.threads;

import java.util.Collection;

class ThreadTest extends Thread{
	 @Override
	public void run() {
		super.run();
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hi i am runing !");
			  
		}
		
	}
	 
	public synchronized void  testSync() {
		
	}
	
}


public class Test {

	public static void main(String[] args) {
		ThreadTest test = new ThreadTest();
		System.out.println("Id is : "+test.getId()+"  Thread name is :"+test.getName()+" Priority is : "+test.getPriority()+" State is :"+test.getState());
		
		System.out.println("I am main thread ... !");
		
		System.out.println("Id is : "+test.getId()+"  Thread name is :"+test.getName()+" Priority is : "+test.getPriority()+" State is :"+test.getState());
		
		test.start();
		System.out.println("Id is : "+test.getId()+"  Thread name is :"+test.getName()+" Priority is : "+test.getPriority()+" State is :"+test.getState());
		
		
		

	}

}
