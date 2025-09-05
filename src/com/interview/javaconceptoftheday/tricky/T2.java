package com.interview.javaconceptoftheday.tricky;
//Q. Is the below code written correctly? If yes, what will be the output? 

//Ans: Yes, the code is correct. You can call static methods through reference variable which is pointing to null. Output will be,
//Static Method

class T3{
	static void staticMethod()
    {
        System.out.println("Static Method");
    }
}

public class T2 {
	public static void main(String[] args) {
		T3 t3 = null;
		 
        t3.staticMethod();
	}
}
