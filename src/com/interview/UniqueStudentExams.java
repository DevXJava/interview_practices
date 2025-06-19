package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/*
  Assume there are n students (India) and each student can give multiple exams (for e.g.- NEET, JEE, CDS, SSC etc.).
  Every student can give one or many exams. 
  A student has attributes like name, Date of Birth, and Place of birth. Two students can have same name  
  but may differ in DOB and Place of birth. 
  You have received the details of n students with the exam they are appearing/giving. 
  Write a code which provides unique student giving different exams. */

public class UniqueStudentExams {
	// Helper class to represent raw input data
	static class StudentExamRecord{
		String name;
        String dob;
        String placeOfBirth;
        String exam;

        StudentExamRecord(String name, String dob, String placeOfBirth, String exam) {
            this.name = name;
            this.dob = dob;
            this.placeOfBirth = placeOfBirth;
            this.exam = exam;
        }
	}
	// Unique Student based on name, dob, place of birth
	static class Student{
		String name;
        String dob;
        String placeOfBirth;

        Student(String name, String dob, String placeOfBirth) {
            this.name = name;
            this.dob = dob;
            this.placeOfBirth = placeOfBirth;
        }
        @Override
        public boolean equals(Object obj) {
        	if(this==obj) return true;
        	if(!(obj instanceof Student)) return false;
        	Student other = (Student) obj;
        	return Objects.equals(name, other.name) && Objects.equals(dob, other.dob) && Objects.equals(placeOfBirth, other.placeOfBirth);
        }
        @Override
        public int hashCode() {
        	return Objects.hash(name,dob,placeOfBirth);
        }
        @Override
        public String toString() {
            return String.format("Student{name='%s', dob='%s', place='%s'}", name, dob, placeOfBirth);
        }
	}
	public static void main(String[] args) {
		List<StudentExamRecord> records = Arrays.asList(
	            new StudentExamRecord("Rahul", "2002-05-01", "Delhi", "JEE"),
	            new StudentExamRecord("Rahul", "2002-05-01", "Delhi", "NEET"),
	            new StudentExamRecord("Asha", "2001-08-15", "Mumbai", "CDS"),
	            new StudentExamRecord("Rahul", "2003-01-10", "Delhi", "SSC"),
	            new StudentExamRecord("Asha", "2001-08-15", "Mumbai", "NEET")
	        );
		
		// Group by unique student and collect exams
       Map<Student, Set<String>> map = records.stream().collect(Collectors.groupingBy(
    		   r->new Student(r.name,r.dob,r.placeOfBirth),
    		   Collectors.mapping(r->r.exam, Collectors.toSet())
    		   ));
       map.forEach((student,exam)->{
    	   System.out.println("student: "+student+" exam: "+exam);
       });
       //---------------------------------------------------------------
       
	}

}
