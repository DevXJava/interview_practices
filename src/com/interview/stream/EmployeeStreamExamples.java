package com.interview.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeStreamExamples {

	public static void main(String[] args) {
		//1. How many employees are there in office ?
		
		List<Employee> list = Employee.getEmployeeList();
		Long count = list.stream().count();
		Long cont = list.stream().collect(Collectors.counting());
		
		//2. Sort the List of Employee objects based on salary in Ascending order
		
		List<Employee> sortEmponSalaryAsc = list.stream().sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).collect(Collectors.toList());
		
		//3. Sort the List of Employee objects based on salary in Descending order
		
		List<Employee> sortEmponSalaryDesc = list.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).collect(Collectors.toList());
		
		//4. How many male and female employees are there in the organization?
		
		Map<String,Long> oOfMaleAndFemaleEmployees = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		
		//5. How many employees are there in each department?
		
		Map<String,Long> noOfEmployeeInEachDepartment = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		//noOfEmployeeInEachDepartment.forEach((k,v)->{System.out.println(k+"   "+v);});
		
		//6. Get the name of all the department
		List<String> departmentName = list.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
		
		//7. Find the average salary of the male and female employee
		Map<String,Double> averageSalaryGenderWise = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
		
		//8. Fetch the highest-paid male and female employee
		
		Map<String,Optional<Employee>> maxSalaryMaleAndFemale = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender,Collectors.maxBy((o1,o2)->(int)(o1.getSalary()-o2.getSalary()))));
		
		//9. Fetch the lowest-paid male and female employee
		Map<String,Optional<Employee>> minSalaryMaleAndFemale = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender,Collectors.minBy((o1,o2)->(int)(o1.getSalary()-o2.getSalary()))));

		
		//10. Get the highest-paid employee in each department
		
		Map<String,Optional<Employee>> highestPaidEmpEachDept = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy((o1,o2)->(int)(o1.getSalary()-o2.getSalary()))));
		
		//11. Get the details of the highest paid employee in the organization?
		Optional<Employee> maxEmpSal = list.stream().max(Comparator.comparing(Employee::getSalary));
		Employee empMaxSal = maxEmpSal.get();
		//System.out.println("empMaxSal is :"+empMaxSal.getSalary());
		
		//Q. find salary is less than 9000 and its department wise ?
		Map<String, List<Employee>> lstr = list.stream().filter(e->e.getSalary()<30000).collect(Collectors.groupingBy(Employee::getDepartment));
		lstr.forEach((k,v)->{System.out.println(k+"  "+v);});
		
		
		// 12. Find the average salary of each department?
		Map<String,Double> avgSalaryOfDepartments = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		Set<Map.Entry<String, Double>> entrySet = avgSalaryOfDepartments.entrySet();
		System.out.println("Average salary of each department\n");
		for (Map.Entry<String, Double> entry : entrySet){
		   System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
	}

}
