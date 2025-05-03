package com.interview.predicate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Student {
	int id;

	String name;

	double percentage;

	String specialization;

	public Student(int id, String name, double percentage, String specialization) {
		this.id = id;

		this.name = name;

		this.percentage = percentage;

		this.specialization = specialization;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPercentage() {
		return percentage;
	}

	public String getSpecialization() {
		return specialization;
	}

	@Override
	public String toString() {
		return id + "-" + name + "-" + percentage + "-" + specialization;
	}
}


public class Predicates {

	public static void main(String[] args) {
		List<Student> listOfStudents = new ArrayList<Student>();
        
		listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));
		listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));    
		listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));       
		listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));      
		listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));      
		listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));     
		listOfStudents.add(new Student(777, "Richards", 72.6, "Banking"));      
		listOfStudents.add(new Student(888, "Sunil", 86.7, "History"));      
		listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance"));      
		listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers"));
		
		// 1. Predicate – Tests an object
		//Takes an argument T and returns a boolean
		Predicate<Student> mathematicsPredicate = (Student student) -> student.getSpecialization().equals("Mathematics");
		List<Student> mathematicsStudent = new ArrayList<>();
		for(Student student : listOfStudents) {
			if(mathematicsPredicate.test(student)) {
				mathematicsStudent.add(student);
			}
		}
		
		// 2. Consumer – Consumes an object
		// Takes an argument and returns nothing
		Consumer<Student> percentageConsumer = (Student student) ->{
			System.out.println(student.getName()+"  "+student.getPercentage());
		};
		for(Student student : listOfStudents) {
			percentageConsumer.accept(student);
		}
		//3. Function – Applies to an object
		// Takes an argument of type T and returns a result of type R
		Function<Student, String> nameFunction = (Student student) -> student.getName();
		List<String> studentName = new ArrayList<>();
		for(Student student : listOfStudents) {
			studentName.add(nameFunction.apply(student));
		}
		
		//4. Supplier – Supplies the objects
		// Takes no argument and returns the results of type R
		Supplier<Student> studentSupplier = () -> new Student(11111, "New Student", 92.9, "Java 8");
		listOfStudents.add(studentSupplier.get());
		
       System.out.println("==================Normal Java v/s Java 8===================");	
       String message;
       String documentType = null;
       if(documentType.equals("pdf")) {
    	   message = "Processing PDF";
       }else if(documentType.equals("docx")) {
    	   message = "Processing Docx";
       }else if(documentType.equals("txt")) {
    	   message = "Processing Txt";
       }else {
    	   message = "unknown format";
       }
       System.out.println(documentType+" : "+message);
       
       // Approach with supplier
       Map<String, Supplier<String>> processors = new HashMap<>();
       processors.put("pdf", () -> "Processing PDF ...");
       processors.put("docx",() -> "Processing DOCX ...");
       processors.put("txt", () -> "Processing TXT ...");
       //Find the processors or use a default if not found
       String result = processors.getOrDefault(documentType, () -> "Unknown format").get();

	}

}
