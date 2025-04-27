package com.javaconceptoftheday;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String gender;
	private String department;
	private int yearOfJoining;
	private double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getDepartment() {
		return department;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Id : " + id + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Department : "
				+ department + ", Year Of Joining : " + yearOfJoining + ", Salary : " + salary;
	}
	
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

	//1. Query 3.1 : How many male and female employees are there in the organization?
		Map<String, Long> countMaleFemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println("Number of male and female :"+countMaleFemale);
		
	//2. Query 3.2 : Print the name of all departments in the organization?
		List<String> department = employeeList.stream()
				.map(Employee::getDepartment).distinct().collect(Collectors.toList());
		System.out.println("All the department name is :"+department);
		
   //3.  Query 3.3 : What is the average age of male and female employees?
		Map<String, Double> averageAge = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		
   //4.  Query 3.4 : Get the details of highest paid employee in the organization?	
		Optional<Employee> employeesPaid = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		
   //5. Query 3.5 : Get the names of all employees who have joined after 2015?
		List<String> joined2015 = employeeList.stream()
				.filter(e->e.getYearOfJoining()>2015)
				.map(Employee::getName)
				.collect(Collectors.toList());
		
   //6.Query 3.6 : Count the number of employees in each department?
		Map<String, Long> employeesInEachDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		
   //7. Query 3.7 : What is the average salary of each department?
		Map<String, Double> avgSalOfEachDepartment = employeeList.stream()
   				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		
   //8.Query 3.8 : Get the details of youngest male employee in the product development department? 
		Optional<Employee> youngFromEachDepartment = employeeList.stream()
				.filter(e->e.getDepartment()=="Product Development"&&e.getGender()=="Male")
				.min(Comparator.comparingDouble(Employee::getAge));
		
   //9. Query 3.9 : Who has the most working experience in the organization?
		Optional<Employee> mostWorkingExperience = employeeList.stream()
				.sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst();
		
  //10. Query 3.10 : How many male and female employees are there in the sales and marketing team?
		Map<String, Long>  maleAndFemaleInDepartment = employeeList.stream()
				.filter(e->e.getDepartment()=="Sales And Marketing")
				.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		
  //11. Query 3.11 : What is the average salary of male and female employees?
		Map<String, Double> avgSalOfMaleAndFemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
		
  //12. Query 3.12 : List down the names of all employees in each department?
		Map<String,List<Employee>> listOfEmpEachDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		
  //13. Query 3.13 : What is the average salary and total salary of the whole organization?
		DoubleSummaryStatistics doubleSummaryStatistics = employeeList.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println(doubleSummaryStatistics.getAverage()+"  :  "+doubleSummaryStatistics.getSum());
		
  //14. Query 3.14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.		
		Map<Boolean, List<Employee>> partitionEmployeesByAge=
				employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
		
 //15. Query 3.15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?	
		Optional<Employee> oldestEmployeeWrapper = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
       
		
 //16. Query 3.16 : Short Employee with Age and Name;
		List<Employee> shortByAgeAndName = employeeList.stream()
				.sorted(Comparator.comparing(Employee::getAge)
				.thenComparing(Employee::getName)).collect(Collectors.toList());
		shortByAgeAndName.forEach((list)->System.out.println(list.getAge()+" : "+list.getName()));
		
  //17. Short Employee Salary with Department
		Map<String, List<Employee>> shortEmpSalWithDepartment = employeeList.stream()
				                                    .sorted(Comparator.comparing(Employee::getSalary))
				                                    .collect(Collectors.groupingBy(Employee::getDepartment));
	}

}
