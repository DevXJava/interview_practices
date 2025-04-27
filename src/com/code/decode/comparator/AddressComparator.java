package com.code.decode.comparator;

import java.util.Comparator;

public class AddressComparator implements Comparator<Employee>{
  @Override
public int compare(Employee o1, Employee o2) {
	// TODO Auto-generated method stub
	return o1.getAddress().compareTo(o2.getAddress());
}
}
