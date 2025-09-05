package com.interview.javaconceptoftheday.thread;

//3) Thread As A Member Inner Class or Non-static Inner Class
public class ThreadAsAMemberInnerClassorNonStaticInnerClass {
	//Thread class as a member inner class or Non-static Inner Class of the usage class
    class MyThread1 extends Thread
    {
        @Override
        public void run()
        {
            System.out.println("Keep Some task here.....");
        }
    }
 
    //Another thread class as a member inner class or Non-Static Inner Class of the usage class
    class MyThread2 implements Runnable
    {
        @Override
        public void run()
        {
            System.out.println("Keep some task here.....");
        }
    }
	public static void main(String[] args) {
		//Using MyThread1 and it's task
		 
        MyThread1 thread1 = new ThreadAsAMemberInnerClassorNonStaticInnerClass().new MyThread1();
        thread1.start();
 
        //Using MyThread2 and it's task
 
        MyThread2 thread2 = new ThreadAsAMemberInnerClassorNonStaticInnerClass().new MyThread2();
        Thread t = new Thread(thread2);
        t.start();

	}

}
