package com.interview.all;

public class RunnableInterface implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Runnable is runing !");
		
	}

	public static void main(String[] args) {
		
      Thread thread = new Thread(new RunnableInterface());
      thread.start();
	}

}
