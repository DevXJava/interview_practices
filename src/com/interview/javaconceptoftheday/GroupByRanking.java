package com.interview.javaconceptoftheday;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int rank;

    public Student(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupByRanking {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Alice", 1),
            new Student("Bob", 2),
            new Student("Charlie", 1),
            new Student("David", 3),
            new Student("Eve", 2),
            new Student("Frank", 3)
        );

        // Group students by rank
        Map<Integer, List<Student>> groupedByRank = students.stream()
                .collect(Collectors.groupingBy(Student::getRank));

        // Print grouped students
        groupedByRank.forEach((rank, studentList) -> 
            System.out.println("Rank " + rank + ": " + studentList)
        );
        
        List<Student> startWithA = students.stream().filter(s->s.getName().startsWith("A")).collect(Collectors.toList());
        
        startWithA.forEach(System.out::println);
        
        //Compare by rank
        Map<Integer,Student> compareByRank = students.stream().sorted(Comparator.comparing(Student::getRank)).collect(Collectors.toMap(Student::getRank, 
        		student->student,(existing,replacement)->existing,LinkedHashMap::new));
        
       Set<Entry<Integer, Student>>  set = compareByRank.entrySet();
       for(Entry<Integer, Student> entry:set) {
    	   System.out.println("Rank : "+entry.getKey()+"  Student Name:    "+entry.getValue());
       }
       
       String strDup ="devendra";
       Set<Character> characters = new HashSet<>();
       for(int i=0;i<strDup.length();i++) {
    	   characters.add(strDup.charAt(i));
       }
        characters.forEach(System.out::print);
        System.out.println("======================================================");
         Map<Character, Long> countChar = strDup.chars()
        		                             .mapToObj(c->(char) c)
        		                             .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
         Set<Entry<Character, Long>> entries = countChar.entrySet();
         for(Entry<Character, Long> entry:entries) {
        	 System.out.println(entry.getKey()+"  :  "+entry.getValue());
         }
       
    }
}

