package com.interview.javaconceptoftheday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

class Student {
	String name;

	int id;

	String subject;

	double percentage;

	public Student(String name, int id, String subject, double percentage) {
		this.name = name;
		this.id = id;
		this.subject = subject;
		this.percentage = percentage;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getSubject() {
		return subject;
	}

	public double getPercentage() {
		return percentage;
	}

	@Override
	public String toString() {
		return name + "-" + id + "-" + subject + "-" + percentage;
	}
}

public class CollectorsTest {

	public static void main(String[] args) {
		// 1) Stream.collect() Method
		List<Integer> numbers = Arrays.asList(8, 2, 5, 7, 3, 6);
		List<Integer> oddNumber = numbers.stream().filter(odd -> odd % 2 != 0).collect(Collectors.toList());
		System.out.println("odd numbers : " + oddNumber);

		List<Student> studentList = new ArrayList<Student>();

		studentList.add(new Student("Paul", 11, "Economics", 78.9));
		studentList.add(new Student("Zevin", 12, "Computer Science", 91.2));
		studentList.add(new Student("Harish", 13, "History", 83.7));
		studentList.add(new Student("Xiano", 14, "Literature", 71.5));
		studentList.add(new Student("Soumya", 15, "Economics", 77.5));
		studentList.add(new Student("Asif", 16, "Mathematics", 89.4));
		studentList.add(new Student("Nihira", 17, "Computer Science", 84.6));
		studentList.add(new Student("Mitshu", 18, "History", 73.5));
		studentList.add(new Student("Vijay", 19, "Mathematics", 92.8));
		studentList.add(new Student("Harry", 20, "History", 71.9));

		// 2. Collecting top 3 performing students into List
		List<Student> top3Student = studentList.stream()
				.sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3)
				.collect(Collectors.toList());
		top3Student.forEach(student -> System.out.print("  " + student.getName()));

		// 3.Collectors.toSet() :
		Set<String> studentSet = studentList.stream().map(Student::getSubject).collect(Collectors.toSet());
		studentSet.forEach(System.out::println);

		// 4.Collectors.toMap() :
		Map<String, Double> namePercentageMap = studentList.stream()
				.collect(Collectors.toMap(Student::getName, Student::getPercentage));
		System.out.println("to map :" + namePercentageMap);

		// 5. Collectors.toCollection() :
		LinkedList<Student> studentLinkedList = studentList.stream().limit(3)
				.collect(Collectors.toCollection(LinkedList::new));
		System.out.println("to collections :" + studentLinkedList);

		// 6. Collectors.joining() :
		String nameJoined = studentList.stream().map(Student::getName).collect(Collectors.joining("----"));
		System.out.println("Name joined is :" + nameJoined);

		// 7.Collectors.counting() :
		Long studentCount = studentList.stream().collect(Collectors.counting());

		// 8. Collectors.maxBy() :
		Optional<Double> highPercentage = studentList.stream().map(Student::getPercentage)
				.collect(Collectors.maxBy(Comparator.naturalOrder()));

		// 9. Collectors.minBy() :
		Optional<Double> minPercentage = studentList.stream().map(Student::getPercentage)
				.collect(Collectors.minBy(Comparator.naturalOrder()));

		// 10. summingInt(), summingLong(), summingDouble()
		Double summingOfPercentage = studentList.stream().collect(Collectors.summingDouble(Student::getPercentage));

		// 11. averagingInt(), averagingLong(), averagingDouble()
		DoubleSummaryStatistics averagePercentage = studentList.stream()
				.collect(Collectors.summarizingDouble(Student::getPercentage));

		// 12. Collectors.groupingBy() :
		Map<String, List<Student>> studentGroupBySubject = studentList.stream()
				.collect(Collectors.groupingBy(Student::getSubject));

		// 13. Collectors.partitioningBy() : Partitioning the students who got above
		// 80.0% from who don’t.
		Map<Boolean, List<Student>> studentspartionedByPercentage = studentList.stream()
				.collect(Collectors.partitioningBy(student -> student.getPercentage() > 80.0));

		// 14. Collectors.collectingAndThen() :

	}

}
