package com.interviews;

public class PrimeNumberFind {
	
	
	public static int checkPrimeNumber(int n) {
		int m = n/2; //getting reminder 
		int flag =0;
		if(n==0||n==1) {
			System.out.println(" Not a prime number !");
		}else {
			for(int i=2;i<=m;i++) {
				if(n%2==0) {
					System.out.println(n+" : is not prime number !");
					flag =1;
					break;
				}
			}
		}
		
		if(flag==0) {
			System.out.println(n+" : is prime number !");
		}
		
		return n;
	}
	

	public static void main(String[] args) {
		
		System.out.println(PrimeNumberFind.checkPrimeNumber(4));
		
		int reminder = 15/2;
		int cosent = 15%2;
		System.out.println("reminder is : "+reminder+"  cosent is :"+cosent);

	}

}
