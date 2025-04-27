package com.javaconceptoftheday.thread;

public class UsageClassItselfAsaThreadClass extends Thread{
	@Override
	public void run() {
		System.out.println("Something....");
	}

	public static void main(String[] args) {
		UsageClassItselfAsaThreadClass asaThreadClass = new  UsageClassItselfAsaThreadClass();
		asaThreadClass.start();

	}
}

//Another class 
class AnotherClass{
	void method() {
		UsageClassItselfAsaThreadClass asaThreadClass = new UsageClassItselfAsaThreadClass();
		asaThreadClass.start();
	}
}
