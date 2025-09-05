package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.interview.medium.Employee;
//https://medium.com/@veenaraofr/java8-stream-api-commonly-asked-questions-about-employee-highest-salary-99c21cec4d98
public class AaPractice {

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

		//46. Youngest male in IT dept ?
		Optional<Employee> youngestMaleEmpInHrDept = list.stream()
				.filter(emp->emp.getGender().equals("M")&&emp.getDeptName().equals("HR")).min(Comparator.comparingInt(Employee::getAge));
		System.out.println("Youngest Emp : "+youngestMaleEmpInHrDept.get().getName());
		// 45. Find the employees whose name start with J.
		List<Employee> nameStartWith = list.stream().filter(emp -> emp.getName().startsWith("M"))
				.collect(Collectors.toList());
		nameStartWith.forEach((n) -> {
			System.out.println("Name start with M " + n);
		});
		// 44. Find list of employees whose age is less than 30 in Department HR
		List<Employee> ageLessThanAndHrDept = list.stream()
				.filter(emp -> emp.getAge() < 30 && emp.getDeptName().equals("HR")).collect(Collectors.toList());
		ageLessThanAndHrDept.forEach((emp) -> {
			System.out.println("emp is : " + emp);
		});
		// 43. Sort the employees salary in each department in descending order
		Map<String, List<Employee>> shortEmpSalBasedOnDeptDesc = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName,
						Collectors.collectingAndThen(Collectors.toList(),
								lst -> lst.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
										.collect(Collectors.toList()))));
		shortEmpSalBasedOnDeptDesc.forEach((dept, sal) -> {
			System.out.println(dept + " : " + sal);
		});

		// 42. Sort the employees salary in each department in ascending order
		Map<String, List<Employee>> shortEmpSalBasedOnDept = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName,
						Collectors.collectingAndThen(Collectors.toList(), list1 -> list1.stream()
								.sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList()))));
		// 41. List of employee’s second highest record based on department
		Map<String, Optional<Employee>> secondHighestBasedOnDept = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName,
						Collectors.collectingAndThen(Collectors.toList(),
								l -> l.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
										.skip(1).findFirst())));

		// 40. Lowest paid based in each department
		Map<String, Optional<Employee>> lowestPaidInEachOnDept = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName, Collectors.collectingAndThen(Collectors.toList(),
						l -> l.stream().min(Comparator.comparing(Employee::getSalary)))));

		Map<String, Optional<Employee>> lowestPaidInEachOnDept1 = list.stream().collect(Collectors
				.groupingBy(Employee::getDeptName, Collectors.minBy(Comparator.comparing(Employee::getSalary))));
		// 39. Highest salary based on department.
		Map<String, Optional<Employee>> HighestPaidInEachOnDept = list.stream().collect(Collectors
				.groupingBy(Employee::getDeptName, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

		Map<String, Optional<Employee>> HighestPaidInEachOnDept1 = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName, Collectors.collectingAndThen(Collectors.toList(),
						l -> l.stream().max(Comparator.comparing(Employee::getSalary)))));
		// 38. Sort the employees salary in the organisation in descending order.
		List<Employee> shorSalDescOrder = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.collect(Collectors.toList());

		// 37. Sort the employees salary in the organisation in ascending order
		List<Employee> shorSalAscOrder = list.stream().sorted(Comparator.comparing(Employee::getSalary))
				.collect(Collectors.toList());

		// 36. Find lowest paid salary in each department based on the gender.
		Map<String, Optional<Employee>> lowestSalEachDept = list.stream().collect(Collectors
				.groupingBy(Employee::getDeptName, Collectors.minBy(Comparator.comparing(Employee::getSalary))));

		// 35. Find lowest paid salary in the organisation
		Employee lowestSalInOrg = list.stream().min(Comparator.comparing(Employee::getSalary)).get();

		// 34. Find highest paid salary in the organisation based on gender.
		Map<String, Optional<Employee>> highestSalBasedOnGender = list.stream().collect(Collectors
				.groupingBy(Employee::getGender, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		Map<String, Optional<Employee>> highestSalBasedOnGender1 = list.stream().collect(Collectors.groupingBy(
				Employee::getGender, Collectors.maxBy((s1, s2) -> (int) (s1.getSalary() - s2.getSalary()))));

		// 33. Print the top 2 highest salary earned employees in each department
		Map<String, Stream<Employee>> top2SalEachDept = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.collectingAndThen(Collectors.toList(),
						l -> l.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(2))));

		// 32. Print the top 3 highest salary earned employees in the organisation
		Stream<Employee> top3Sal = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3);

		// 31. Nth Highest salary.
		int n = 10;
		Optional<Employee> nthHighestSalary = list.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(n - 1).findFirst();

		// 30. Find Second Highest salary in the organisation.
		Optional<Employee> secondHighestSalOrg = list.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();

		// 29. Find Highest salary in the organisation.
		Optional<Employee> findHighestSalary = list.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		Optional<Employee> findHighestSalary1 = list.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst();

		// 28. To get a list of employees from each department whose salary is greater
		// than the average salary of their department
		Map<String, List<Employee>> empEachDeptWhoseSalgreaterThenAvgSal = list.stream().collect(Collectors
				.groupingBy(Employee::getDeptName, Collectors.collectingAndThen(Collectors.toList(), empList -> {
					double avg = empList.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
					return empList.stream().filter(emp -> emp.getSalary() > avg).collect(Collectors.toList());
				})));
		// 27. Print Average salary by gender in each department .
		Map<String, Map<String, Double>> avSalByGenderInEachDept = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName,
						Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary))));
		// 26. Print Average salary of each department.
		Map<String, Double> avgSalEachDept = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName, Collectors.averagingDouble(Employee::getSalary)));

		// 25. Print average and total salary of the organization.
		DoubleSummaryStatistics empSalary = list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Average Salary in the organisation = " + empSalary.getAverage());
		System.out.println("Total Salary in the organisation  = " + empSalary.getSum());

		// 24. Sorting a Stream by age and name fields.
		Stream<Employee> sortByAgeAndName = list.stream()
				.sorted(Comparator.comparing(Employee::getAge).thenComparing(Comparator.comparing(Employee::getName)));
		sortByAgeAndName.forEach(e -> {
			System.out.println(e.getAge() + " : " + e.getName());
		});

		// 23. Find the department which has the highest number of employees.
		Optional<Entry<String, Long>> deptHighEmp = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue());
		// 22. Find employee count in every department
		Map<String, Long> employeeCountInDepartmentMap = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
		System.out.print("Employee department and its count :- \n" + employeeCountInDepartmentMap);

		// 21. No of employees in the organisation.
		Long noOfEmp = list.stream().count();

		// 20. Find all employees who lives in ‘Blore’ city, sort them by their name and
		// print the names of employees.
		List<Employee> allEmpBelongsBlore = list.stream().filter(e -> e.getCity().equalsIgnoreCase("Blore"))
				.sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());

		// 19. Find the department names that these employees work for, where the number
		// of employees in the department is over 3.
		Stream<Entry<String, Long>> dpnameEmpWorkFor3Dept = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 3);
		dpnameEmpWorkFor3Dept.forEach(empd -> {
			System.out.println("---------->" + empd.getKey() + " : " + empd.getValue());
		});

		// 18. Find if there any employees from HR Department.

		Optional<Employee> emp = list.stream().filter(e -> e.getDeptName().equalsIgnoreCase("HR")).findAny();

		// 17. Find the department name which has the highest number of employees.
		Optional<Entry<String, Long>> highEmpDept = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue());

		// 16. Find employees whose age is greater than 30 and less than 30.
		Map<Boolean, List<Employee>> ageAbove30AndAgeLess30 = list.stream()
				.collect(Collectors.partitioningBy(emp1 -> emp1.getAge() > 30));

		// 15. Find the youngest employee in each department
		Map<String, Optional<Employee>> youngestEmpEachDeprt = list.stream().collect(Collectors
				.groupingBy(Employee::getDeptName, Collectors.maxBy(Comparator.comparing(Employee::getYearOfJoining))));

		// 14. Find youngest female employee in the organisation.
		Optional<Employee> youngestFemaleEmployeeOrg = list.stream().filter(empF -> empF.getGender() == "F")
				.min(Comparator.comparing(Employee::getAge));

		// 13. Find average age of gender in each department.
		Map<String, Map<String, Double>> avgAgeOfGenderEachDept = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName,
						Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge))));

		// 12.Find longest serving employee in each department
		Map<String, Optional<Employee>> longestServEmpEachDept = list.stream().collect(Collectors
				.groupingBy(Employee::getDeptName, Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining))));

		// 11. Find longest serving employees in the organization.
		Optional<Employee> seniorEmpInOrg = list.stream().sorted(Comparator.comparing(Employee::getYearOfJoining))
				.findFirst();

		// 10. Print the number of employees in each department.
		Map<String, Long> noOfEmpEachDept = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));

		// 9. Print Average age of Male and Female Employees in each department.
		Map<String, Map<String, Double>> avgAgeOfMFEachDept = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName,
						Collectors.groupingBy(Employee::getGender, Collectors.averagingLong(Employee::getAge))));

		// 8. Print Average age of Male and Female Employees in the organisation.
		Map<String, Double> avgAgeOfMFinOrg = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
		// 7. Find maximum age/oldest of employee in the organisation.
		Optional<Employee> oldestEmpOrg = list.stream().max(Comparator.comparing(Employee::getAge));

		// 6. Print employee details whose age is greater than 28 in the organisation.
		Optional<Employee> agegeaterThen28 = list.stream().filter(e -> e.getAge() > 28).findAny();

		// 5. Print the names of all distinct departments in the organization.
		Optional<String> distinctDept = list.stream().map(Employee::getDeptName).distinct().findAny();

		// 4.Find the count of male and female present in each department
		Map<String, Map<String, Long>> counMFEachDept = list.stream().collect(Collectors
				.groupingBy(Employee::getDeptName, Collectors.groupingBy(Employee::getGender, Collectors.counting())));

		// 3. Find the count of male and female employees present in the organization.
		Map<String, Long> countMFOrg = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		// 2 Group the Employees by age.
		Map<Integer, List<Employee>> grpEmpByAge = list.stream().collect(Collectors.groupingBy(Employee::getAge));

		// 1. Group the Employees by city.
		Map<String, List<Employee>> grpEmpByCity = list.stream().collect(Collectors.groupingBy(Employee::getCity));

		// 1. Convert List to Map based on Id and name?
		Map<Integer, String> map = list.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
		map.forEach((id, name) -> {
			System.out.println("id : " + id + " name : " + name);
		});
		System.out.println("----------------------------------------------------------------------------------------");
		List<String> list2 = Arrays.asList("Alice", "Bob", "Charlie", "Alice", "David");
		List<String> length3 = list2.stream().filter(l -> l.length() > 3).distinct().sorted()
				.collect(Collectors.toList());
		length3.forEach(n1 -> {
			System.out.println(n1);
		});
		System.out.println("----------------------------------------------------------------------------------------");
		List<String> nameFilter = list2.stream().filter(name -> name.length() > 3).map(String::toUpperCase).sorted()
				.collect(Collectors.toList());
        //https://neesri.medium.com/java-8-stream-intermediate-and-terminal-operations-with-q-a-d2a0ae666b96
		// 1. What will happen if no terminal operation is invoked on a stream?
		Stream<Integer> stream = Stream.of(1, 2, 3, 4).filter(n1 -> n1 % 2 == 0);
		System.out.println("Stream created ");

		// 2. Can you explain why streams are lazy? How does this improve performance?
		Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5).filter(n2 -> {
			System.out.println("Filtering: " + n2);
			return n2 % 2 == 0;
		}).limit(2);

		stream1.forEach(System.out::println);

		// 3. How do reduce() and collect() differ in terminal operations?
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		// Using reduce to find the sum
		int sum = numbers.stream().reduce(0, Integer::sum);
		// using collect gather elements into a list
		List<Integer> list3 = numbers.stream().collect(Collectors.toList());

		// 4. What is the difference between peek() and forEach()?
		Stream<Integer> stream2 = Stream.of(1, 2, 3, 4);
		stream2.peek(System.out::println) // Prints elements but doesn't consume the stream
		         .filter(n3 -> n3 % 2 == 0)  
		         .forEach(System.out::println); // Consumes the stream and prints only even numbers
		//5. Can a stream have multiple terminal operations? No
		Stream<Integer> stream3 = Stream.of(1, 2, 3);

		stream3.forEach(System.out::println);  // Consumes the stream
		//stream3.forEach(System.out::println);  //Throws IllegalStateException
		
		//6. What are short-circuiting operations in streams? Give examples.
		boolean result = numbers.stream().anyMatch(n4->n4>3); //stop processing after finding the first match
		System.out.println(result); // true
		
		//7. How can you implement custom short-circuiting in a stream?
		//Answer:
		//You can implement custom short-circuiting using takeWhile() (introduced in Java 9) or by manually using a combination of limit() and filter().
		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> result1 = numbers1.stream().filter(n4->n4<4)
				                       .limit(2)
				                       .collect(Collectors.toList());
		
		
		//8. How does collect(Collectors.toMap()) handle duplicate keys?
		List<String> list1 = Arrays.asList("apple", "banana", "apple");

		Map<String, Integer> handleDuplicate = list1.stream().collect(Collectors.toMap(Function.identity(), String::length,
				                    (existing,duplicate)->existing));
		
		//9. How do you convert a stream into a Map where keys are strings and values are lists of elements sharing the same key?
		List<String> list4 = Arrays.asList("apple", "banana", "apricot", "blueberry");
		Map<Character, List<String>> streamToMap = list4.stream().collect(Collectors.groupingBy(s->s.charAt(0)));
		streamToMap.forEach((k,v)->{
			System.out.println(k+"  ---  "+v);
		});
		
		//10. What are the differences between findFirst() and findAny()? When should each be used?
		
		//11. What is the difference between sorted() and distinct()?
		List<Integer> numbers2 = Arrays.asList(5, 3, 1, 2, 3, 1);
		List<Integer> sorted = numbers2.stream().sorted().collect(Collectors.toList());
		
		List<Integer> distinctList = numbers2.stream().distinct().collect(Collectors.toList());
		
		//12. What is the behavior of limit() and skip() when used together?
		List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<Integer> limitSkip = numbers3.stream().skip(2).limit(3).collect(Collectors.toList());
		
		//13. How does allMatch(), anyMatch(), and noneMatch() work?
		List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5);
		boolean allEvent = numbers4.stream().allMatch(n5->n5%2==0); // false
		boolean anyEven = numbers4.stream().anyMatch(n6->n6%2==0); // true
		boolean nonNegative = numbers4.stream().noneMatch(n7->n7<0); // true
		
		//14. How do you find the maximum and minimum element in a stream?
		List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5);
		int min = numbers5.stream().min(Integer::compareTo).orElseThrow();
		
		int max = numbers5.stream().max(Integer::compareTo).orElseThrow();
		
		//15. Can you explain how partitioningBy() works in streams?
		List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4, 5);
		Map<Boolean, List<Integer>> partition = numbers6.stream().collect(Collectors.partitioningBy(n7->n7%2==0));
		
		//16. How do you collect elements into an immutable list using streams?
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6);
		List<Integer> immutableList = numList.stream().collect(Collectors.toUnmodifiableList());
		//immutableList.add(7);
		
		//17. What is the difference between collect() and toArray()?
		List<String> list5 = Arrays.asList("a", "b", "c");
		//using collect
		List<String> collectedList = list5.stream().collect(Collectors.toList());
		
		//using toArray
		String[] strings = list5.stream().toArray(String[]::new);
		
		//18. What are the differences between Stream.of() and Arrays.stream()?
		int[] array = {1, 2, 3};
		
		//Stream.of creates a stream with a single element (the array itself)
		Stream<int[]> streamOfArray = Stream.of(array);
		
		//Arrays.stream creates a stream of elements from the array 
		IntStream intStream = Arrays.stream(array);
		System.out.println("intStream : "+intStream);
		
		//19. How do parallel streams work? What are the potential downsides?
		List<Integer> numbers7 = Arrays.asList(1, 2, 3, 4, 5);
		numbers.parallelStream().forEach(System.out::println);
		System.out.println("------------------------------------");
		numbers.stream().forEach(System.out::println);
		 // Output order may vary

		//20. Can intermediate operations modify the original data source? No
		List<Integer> numbers8 = Arrays.asList(1, 2, 3, 4, 5);

		numbers8.stream()
		       .filter(n5 -> n5 % 2 == 0)
		       .forEach(System.out::println);  // Output: 2 4
		System.out.println(numbers8);  // Output: [1, 2, 3, 4, 5]
 		
		//21. count word character occurrence from string ?
		String string = "devendra";
		List<Character> characters = string.chars().mapToObj(c->(char)c).toList();
		Map<Character,Long> countWordOccur = characters.stream().collect(Collectors.groupingBy(Character::charValue,
				Collectors.counting()));
		countWordOccur.forEach((k,v)->{
			System.out.println(k+" : "+v);
		});

	}

}
