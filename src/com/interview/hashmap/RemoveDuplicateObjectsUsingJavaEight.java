package com.interview.hashmap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicateObjectsUsingJavaEight {

	public static void main(String[] args) {
		
		List<BankAccount> list = new ArrayList<BankAccount>();
		//compute based on account number 
		list.add(new BankAccount(1,"Devendra","Saving"));
		list.add(new BankAccount(1,"Kumar","Regular"));
		list.add(new BankAccount(2,"Rahangdale","Saving"));
		list.add(new BankAccount(3,"Dev","Regular"));
		list.add(new BankAccount(4,"Devs","Saving"));
		
		Map<Integer,BankAccount> map = list.stream().distinct()
				.collect(Collectors.toMap(BankAccount::getAccountNumber, Function.identity()));
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, BankAccount> entry = (Map.Entry<Integer, BankAccount>)itr.next();
			
			System.out.println(entry.getKey()+"   "+entry.getValue().getHolderName());
			
			
		}
				

	}

}
