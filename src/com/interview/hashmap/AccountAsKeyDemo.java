package com.interview.hashmap;

import java.util.HashMap;

public class AccountAsKeyDemo {

	public static void main(String[] args) {
		HashMap<Account, String> hashMap = new HashMap<Account,String>();
		
		//Create key 1
		Account a1 = new Account(1);
		a1.setHolderName("A_ONE");
		//Create key 2
		Account a2 = new Account(2);
		a2.setHolderName("A_TWO");
		
		//Put mutable key and value in map
		hashMap.put(a1, a1.getHolderName());
		hashMap.put(a2, a2.getHolderName());
		
		//Change the keys state so hash map should be calculated again
		a1.setHolderName("Defaulter");
		a2.setHolderName("Bankrupt");
		
		//Success !! We are able to get back the values
		System.out.println(hashMap.get(a1)); //Prints A_ONE
		System.out.println(hashMap.get(a2)); //Prints A_TWO
		
		//Try with newly created key with same account number
		Account a3 = new Account(3);
		a3.setHolderName("A_THREE");
		hashMap.put(a3, a3.getHolderName());
		  
		//Success !! We are still able to get back the value for account number 1
		System.out.println(hashMap.get(a3)); //Prints A_ONE
		
		System.out.println("=======================================================");
		

	}

}
