package com.guess.output;

public class Test4 {
	public static void swap(Integer i, Integer j) {
        Integer temp = new Integer(i);  // temp = 10
        i = j;                          // i = 20 (but only locally)
        j = temp;                       // j = 10 (but only locally)
    }

    public static void main(String[] args) {
        Integer i = new Integer(10);
        Integer j = new Integer(20);
        swap(i, j);
        System.out.println("i = " + i + ", j = " + j);
    }
    //O/P : 10,20 
}
