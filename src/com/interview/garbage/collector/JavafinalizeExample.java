package com.interview.garbage.collector;

public class JavafinalizeExample {
	
	//this method is called by JVM automatically  by Systme.gc();
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalize method called");  
	}

	public static void main(String[] args) {
		JavafinalizeExample obj = new JavafinalizeExample();   
        System.out.println(obj.hashCode());   
        obj = null;   
        // calling garbage collector    
        System.gc();   
        System.out.println("end of garbage collection");   
  
    }   

	}


