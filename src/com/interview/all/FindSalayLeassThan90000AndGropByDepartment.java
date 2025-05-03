package com.interview.all;
import java.util.*;
import java.util.stream.Collectors;

import com.interview.stream.Employee;
public class FindSalayLeassThan90000AndGropByDepartment {

	public static void main(String[] args) {

		List<Employee> list = Employee.getEmployeeList();
		
		Map<String, List<Employee>> empoyeeMap = list.stream().filter(e->e.getSalary()<30000).collect(Collectors.groupingBy(Employee::getDepartment));
		
		Set  set = empoyeeMap.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			
			Map.Entry<String, List> map = (Map.Entry<String, List>)iterator.next();
			
			String getDepartment = map.getKey();
			List<Employee> empDetails = map.getValue();
			for(Employee emp:empDetails) {
				System.out.println(getDepartment+"  "+emp.getSalary());
			}
			
			
			
		}
		

	}

}
