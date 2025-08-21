package com.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
	private int id;
    private String name;
    private int age;
    private long salary;
    private String gender;
    private String deptName;
    private String city;
    private int yearOfJoining;
//https://medium.com/@veenaraofr/java8-stream-api-commonly-asked-questions-about-employee-highest-salary-99c21cec4d98
    public Employee(int id, String name, int age, long salary, String gender, 
                    String deptName, String city, int yearOfJoining) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.deptName = deptName;
        this.city = city;
        this.yearOfJoining = yearOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", deptName='" + deptName + '\'' +
                ", city='" + city + '\'' +
                ", yearOfJoining='" + yearOfJoining + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Yanksha", 28, 123, "F", "HR", "Blore", 2020));
		list.add(new Employee(2, "Francesca", 29, 120, "F", "HR", "Hyderabad", 2015));
		list.add(new Employee(3, "Ramesh", 30, 115, "M", "HR", "Chennai", 2014));
		list.add(new Employee(4, "Melanie", 32, 125, "F", "HR", "Chennai", 2013));
		list.add(new Employee(5, "Padma", 22, 150, "F", "IT", "Noida", 2013));
		list.add(new Employee(6, "Milad", 27, 140, "M", "IT", "Gurugram", 2017));
		list.add(new Employee(7, "Uzma", 26, 130, "F", "IT", "Pune", 2016));
		list.add(new Employee(8, "Ali", 23, 145, "M", "IT", "Trivandam", 2015));
		list.add(new Employee(9, "Ram", 25, 160, "M", "IT", "Blore", 2010));
		
		//1. Group the Employees by city.
		Map<String, List<Employee>> groupEmpByCity = list.stream().collect(Collectors.groupingBy(Employee::getCity));
		System.out.println("groupEmpByCity : "+groupEmpByCity);
		
		//2. Group Employee by age .
		Map<Integer, List<Employee>>  groupEmpByAge = list.stream().collect(Collectors.groupingBy(Employee::getAge));
		
		//3. Find the count of male and female employees present in the organization.
		Map<String, Long> counMaleAndFemale = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		
		//4. Find the count of male and female present in each department
		Map<String, Map<String, Long>> countMaleAndFemaleInEachDepartmet = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName,Collectors.groupingBy(Employee::getGender,Collectors.counting())));
		System.out.println("countMaleAndFemaleInEachDepartmet : "+countMaleAndFemaleInEachDepartmet);
		
		//5. Print the names of all distinct departments in the organization.
		List<String> distinctDepartmet = list.stream().map(d->d.getDeptName()).distinct().collect(Collectors.toList());
		
		//6. Print employee details whose age is greater than 28 in the organization.
		List<Employee> ageGreaterThan28 = list.stream().filter(a->a.getAge()>28).collect(Collectors.toList());
		System.out.println("ageGreaterThan28 : "+ageGreaterThan28);
		
		//7. Find maximum age/oldest of employee in the organisation.
		Optional<Employee> maxAgeEmp = list.stream().max(Comparator.comparingLong(Employee::getAge));
		System.out.println("maxAgeEmp : "+maxAgeEmp);
		
		//8. Print Average age of Male and Female Employees in the organisation.
		Map<String, Double> avgAgeOfMaleAndFemale = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
		
		//9. Print Average age of Male and Female Employees in each department.
		Map<String, Map<String, Double>> avgAgeOfMaleFemaleInEachDepartment = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName,Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge))));
				System.out.println("avgAgeOfMaleFemaleInEachDepartment : "+avgAgeOfMaleFemaleInEachDepartment);
				
		//10. Print the number of employees in each department.
		Map<String, Long> numberOfEmpInEachDepart = list.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));	
		
		//11. Find longest serving employees in the organization.
		Optional<Employee> oldestEmp = list.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
		System.out.println("oldest Employee : "+oldestEmp);
		
	    //12. Find longest serving employee in each department
		Map<String, Optional<Employee>> oldestEmpInEachDept = list.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining))));
		
		//13. Find average age of gender in each department.
		Map<String, Map<String,Double>> avgAgeOfGenderInEachDept = list.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.groupingBy(Employee::getGender,Collectors.averagingLong(Employee::getAge))));
		
		//14. Find youngest female employee in the organisation.
		Optional<Employee> youngestFemaleEmp = list.stream().filter(g->g.getGender().equalsIgnoreCase("F")).min(Comparator.comparingDouble(Employee::getAge));
		System.out.println("youngestFemaleEmp : "+youngestFemaleEmp);
		
		//15. Find the youngest employee in each department
		Map<String,Optional<Employee>> youngestEmpEachDept = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName,Collectors.maxBy(Comparator.comparing(Employee::getAge))));
		System.out.println("youngestEmpEachDept : "+youngestEmpEachDept);
		
		//16. Find employees whose age is greater than 30 and less than 30.
		Map<String, List<Employee>> ageGreater30AndlessThan30 = list.stream().collect(Collectors.groupingBy(emp->{
			if(emp.getAge()>30) return "Above 30";
			else if(emp.getAge()<30) return "Below 30";
			else return "Exactly 30";
		}));
		System.out.println("ageGreater30AndlessThan30 : "+ageGreater30AndlessThan30);
		
		//17. Find the department name which has the highest number of employees.
		
		Entry<String, Long> deptHasHighestEmp = list.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()))
				                               .entrySet().stream().max(Map.Entry.comparingByValue()).get();
		
		System.out.println("deptHasHighestEmp : "+deptHasHighestEmp);
		
		//18. Find if there any employees from HR Department.
		List<Employee> empFromHrDept = list.stream().filter(emp->emp.getDeptName().equalsIgnoreCase("HR")).collect(Collectors.toList());
		System.out.println("empFromHrDept : "+empFromHrDept);
		
		//19. Find the department names that these employees work for, where the number of employees in the department is over 3.
		Stream<Entry<String, Long>> deptNameWhereOver3Emp = list.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()))
				                                   .entrySet().stream().filter(entry->entry.getValue()>3);
		Map<String,Long> maps = deptNameWhereOver3Emp.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println("deptNameWhereOver3Emp : "+maps);
		
		//20. Find all employees who lives in ‘Blore’ city, sort them by their name and print the names of employees.
		List<Employee> empLivesBloreCityAndShort = list.stream().filter(emp->emp.getCity().equalsIgnoreCase("Blore"))
				.sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		
		//21. No of employees in the organisation.
		Long numberOfEmp = list.stream().count();
		
		//22. Find employee count in every department
		Map<String, Long> empCountInEveryDept = list.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
		System.out.println("empCountInEveryDept : "+empCountInEveryDept);
		
		//23. Find the department which has the highest number of employees.
		
		Optional<Entry<String, Long>> highestEmpInDept = list.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()))
				                             .entrySet().stream().max(Map.Entry.comparingByValue());
		Map<String,Long> mapHigh = highestEmpInDept.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println("highestEmpInDept : "+mapHigh);
		
		//24. 24. Sorting a Stream by age and name fields.
		List<Employee> shortByAgeAndName = list.stream().sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getName)).collect(Collectors.toList());
		
		//25. Print average and total salary of the organization.
		DoubleSummaryStatistics summaryStatistics = list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		
		//26. Print Average salary of each department.
		Map<String, Double> avgSalaryOfEachDept = list.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.averagingDouble(Employee::getSalary)));
		
		//27. Print Average salary by gender in each department .
		Map<String, Map<String, Double>> avgSalByGenderEachDepartment = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName,Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary))));
		
		//28. To get a list of employees from each department whose salary is greater than the average salary of their department
		Map<String, List<Employee>> empEachDeptWhoseSalgreaterThenAvgSal = list.stream().collect(Collectors.groupingBy(Employee::getDeptName,
				Collectors.collectingAndThen(Collectors.toList(), empList->{
					double avg = empList.stream().mapToDouble(Employee::getSalary)
							.average()
							.orElse(0.0);
					return empList.stream().filter(emp->emp.getSalary()>avg).collect(Collectors.toList());
				})));
		
		//29. Find Highest salary in the organisation.
		
		Optional<Employee> highestSalOrg = list.stream().max(Comparator.comparingLong(Employee::getSalary));
		//Or
		Optional<Employee> empHighest = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .findFirst();
		Optional<Employee> findHighestSalary = list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		
		//30. Find Second Highest salary in the organisation.
		Optional<Employee> emp2 = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)
		                         .reversed()).skip(1).findFirst();
		//System.out.println("Second Highest Salary in the organisation : " + emp2.get().getSalary());
		
		Optional<Employee> secondHighest = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
		
		//31. Nth Highest salary.
		int n = 2;
		Optional<Employee> nthHighestSalary = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(n-1).findFirst();
		
		//32. Print the top 3 highest salary earned employees in the organisation
		
		List<Employee> highets3Salary = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3).collect(Collectors.toList());
		System.out.println("highets3Salary : "+highets3Salary);
		
		//33. Print the top 2 highest salary earned employees in each department
		Map<String, List<Employee>> top2HighestFromEachDept = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName, 
						Collectors.collectingAndThen(Collectors.toList(), 
								list1 -> list1.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
								.limit(2).collect(Collectors.toList()))));
		//34. Find highest paid salary in the organisation based on gender.
		Map<String, Optional<Employee>> highestPaidGender = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
		
		//35. Find lowest paid salary in the organisation
		Employee lowestSalary = list.stream().min(Comparator.comparingDouble(Employee::getSalary)).get();
		
		//36. Find lowest paid salary in each department based on the gender.
		
		Map<String, Map<String, Optional<Employee>>> lowestSalBasedOnGenderEachDept = list.stream().collect(Collectors.groupingBy(Employee::getDeptName,
				Collectors.groupingBy(Employee::getGender,Collectors.minBy(Comparator.comparing(Employee::getSalary)))));
		
		//37. Sort the employees salary in the organisation in ascending order
		List<Employee> shortSalAscending = list.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
		
		//38. Sort the employees salary in the organisation in descending order.
		List<Employee> shortSalDescending = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
		
		//39. Highest salary based on department.
		Map<String, Optional<Employee>> highestSalBasedOnDept = list.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		
       //40. Lowest paid based in each department
		Map<String, Optional<Employee>> lowestSalBasedOnDept = list.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.minBy(Comparator.comparing(Employee::getSalary))));
		
		//41. List of employee’s second highest salary record based on department
		Map<String, Employee> secondHighRecordBasedOnDept = list.stream().collect(Collectors.groupingBy(Employee::getDeptName,
				Collectors.collectingAndThen(Collectors.toList(), l->l.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst().orElse(null))));
		
		//42. Sort the employees salary in each department in ascending order
		Map<String, List<Employee>> sortSalEachDeptAscendingOrder = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName,Collectors
						.collectingAndThen(Collectors.toList(), l->l.stream().sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList()))));
		
		//43. Sort the employees salary in each department in descending order
		Map<String, List<Employee>> sortSalEachDeptDescendingOrder = list.stream().collect(Collectors.groupingBy(Employee::getDeptName,
				Collectors.collectingAndThen(Collectors.toList(), l->l.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList()))));
		
		//44. Find list of employees whose age is less than 30 in Department HR
		List<Employee> hrEmpLessThen30Age = list.stream().filter(l->l.getDeptName().equalsIgnoreCase("HR")&&l.getAge()<30).collect(Collectors.toList());
		System.out.println("hrEmpLessThen30Age : "+hrEmpLessThen30Age);
		
		//45. Find the employees whose name start with J.
		Stream<String> nameStartWitJ = list.stream().filter(emp->emp.getName().toLowerCase().startsWith("y")).map(Employee::getName);
		nameStartWitJ.forEach(name -> System.out.println("Name starts with "+name.charAt(0)+": " + name));
				
	}

}
