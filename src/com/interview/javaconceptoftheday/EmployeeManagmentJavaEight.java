package com.interview.javaconceptoftheday;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/
class Employee {
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
}

public class EmployeeManagmentJavaEight {

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

		// Query 3.15 Who is the oldest employee in the organization? What is his age
		// and which department he belongs to?
		Employee getOldest = employeeList.stream().max(Comparator.comparing(Employee::getAge)).get();
		System.out.println(getOldest.getAge());

		// Query 3.13 : What is the average salary and total salary of the whole
		// organization?
		DoubleSummaryStatistics summaryStatistics = employeeList.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("avg salary: " + summaryStatistics.getAverage());
		System.out.println("max salary: " + summaryStatistics.getMax());

		// Query 3.12 : List down the names of all employees in each department?

		Map<String, List<Employee>> mapEmp = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(mapEmp);

		// Query 3.11 : What is the average salary of male and female employees?

		Map<String, Double> maleFemaleAvgSal = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("maleFemaleAvgSal :" + maleFemaleAvgSal);

		// Query 3.10 : How many male and female employees are there in the sales and
		// marketing team?

		Map<String, Long> maleAndFemaleInSaleAndMarketing = employeeList.stream()
				.filter(s -> s.getDepartment() == "Sales And Marketing")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println("maleAndFemaleInSaleAndMarketing :" + maleAndFemaleInSaleAndMarketing);
       //Query 3.9 : Who has the most working experience in the organization?
		Optional<Employee> empMostExperience = employeeList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst();
		System.out.println("empMostExperience :"+empMostExperience.get().getYearOfJoining());
		// find max age employee
		Optional<Employee> maxAgeEmp = employeeList.stream().max(Comparator.comparing(Employee::getAge));
		System.out.println("max age employee :"+maxAgeEmp);
		//find min age employee 
		Optional<Employee> minAgeEmp = employeeList.stream().min(Comparator.comparing(Employee::getAge));
		System.out.println("min Age Employee :"+minAgeEmp);
		
		
		//Query 3.8 : Get the details of youngest male employee in the product development department?
		Optional<Employee> minAgeAndDepartMale = employeeList.stream()
				.filter(e->e.getGender()=="Male" && e.getDepartment()=="Product Development")
				.min(Comparator.comparing(Employee::getAge));
		
		System.out.println("minAgeAndDepartMale :"+minAgeAndDepartMale);
		 
		//Query 3.7 : What is the average salary of each department?
		
		Map<String,Double> avgSalOfEachDept = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println("avgSalOfEachDept :"+avgSalOfEachDept);
		
		//Query 3.6 : Count the number of employees in each department?
		
		Map<String, Long> cntEmpEachDept = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		
		System.out.println("cntEmpEachDept :"+cntEmpEachDept);
		
		//Query 3.5 : Get the names of all employees who have joined after 2015?
		
		List<String> empJoin2015 = employeeList.stream().filter(j->j.getYearOfJoining()==2015)
				.map(Employee::getName)
				.collect(Collectors.toList());
		
		System.out.println("empJoin2015 :"+empJoin2015);
		
		//Query 3.4 : Get the details of highest paid employee in the organization?
		
		Optional<Employee> detailsOfHighestPaid = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		
		//Query 3.3 : What is the average age of male and female employees?
		Map<String, Double> ageAvgMalefemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
		
		System.out.println("ageAvgMalefemale :"+ageAvgMalefemale);
				
		//Query 3.2 : Print the name of all departments in the organization?
		
		List<String> depatName = employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
		System.out.println("depatName :"+depatName);
		
		//Query 3.1 : How many male and female employees are there in the organization?
		
		Map<String, Long> contMaleFemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		
		System.out.println("contMaleFemale :"+contMaleFemale);
		
		
		
				
				
				
				
				
				
		
		
		
		
		
		
		
		// sorted employee by age in descending order
		List<Employee> emp = employeeList.stream().sorted((a, b) -> b.getAge() - a.getAge()).collect(Collectors.toList());

	}

}
