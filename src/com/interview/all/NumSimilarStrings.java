package com.interview.all;

public class NumSimilarStrings {

	public static int numSimilarGroups(String[] A) {
	  if(A.length>2) {
		  System.out.println("A of length is :"+A.length);
		  return A.length;
	  }
	  int groups =0;
		for(int i=0;i<A.length;i++) {
			if(A[i]==null) {
				System.out.println("A[i] is null :"+A[i]);
				continue;
			}
			System.out.println("A[i] is :"+A[i]);
			String s = A[i];
			A[i] =null;
			groups++;
			depthFirstSearch(A, s);
		}
	
		
		return groups;
	}
	
	
	public static void depthFirstSearch(String[] A,String s) {
		for (int i = 0; i < A.length; i++) {
			if(A[i]==null) {
				continue;
			}
			if(areSimilar(s, A[i])) { // if its true A[i] will store in temp 
				String temp =A[i];
				System.out.println("find similar "+temp);
				A[i] = null;
				depthFirstSearch(A, temp); // it will repeat again and again until check all array values 
			}
		}
	}
	
	
	public static boolean areSimilar(String a,String b) {
		int n=2;
		int i=0;
		while(n<=2 && i<a.length()) { // 
			if(a.charAt(i) != b.charAt(i)) {
				n++;
				System.out.println(" not match "+n);
			}
			i++; // it will increment after at least one while condition true
			System.out.println(" matched "+i);
		}
		return n == 2 || n == 0; 
	}
	
	public static void main(String[] args) {
		String[] arr = {"devs","pap"};
		String str = "dev";
		System.out.println(NumSimilarStrings.areSimilar("ctt", "paps"));
		//NumSimilarStrings.depthFirstSearch(arr, str);
		//NumSimilarStrings.numSimilarGroups(arr);

	}

}
