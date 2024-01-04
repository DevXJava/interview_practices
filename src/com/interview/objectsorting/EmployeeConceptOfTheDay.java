package com.interview.objectsorting;

import java.util.ArrayList;
import java.util.List;

public class EmployeeConceptOfTheDay
{
    int id;
     
    String name;
     
    int age;
     
    String gender;
     
    String department;
     
    int yearOfJoining;
     
    double salary;
     
    public EmployeeConceptOfTheDay(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }
     
    public int getId() 
    {
        return id;
    }
     
    public String getName() 
    {
        return name;
    }
     
    public int getAge() 
    {
        return age;
    }
     
    public String getGender() 
    {
        return gender;
    }
     
    public String getDepartment() 
    {
        return department;
    }
     
    public int getYearOfJoining() 
    {
        return yearOfJoining;
    }
     
    public double getSalary() 
    {
        return salary;
    }
     
    @Override
    public String toString() 
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }
    
    public static List<EmployeeConceptOfTheDay> getEmployeeList(){
        List<EmployeeConceptOfTheDay> employeeList = new ArrayList<EmployeeConceptOfTheDay>();

        employeeList.add(new EmployeeConceptOfTheDay(111, "Jennifer", 22, "Female", "HR", 2017, 55000.0));
        employeeList.add(new EmployeeConceptOfTheDay(112, "Rohit", 35, "Male", "Sales And Marketing", 2019, 23500.0));
        employeeList.add(new EmployeeConceptOfTheDay(113, "Shubman", 29, "Male", "Infrastructure", 2019, 28000.0));
        employeeList.add(new EmployeeConceptOfTheDay(114, "Rinku", 28, "Male", "Product Development", 2020, 62500.0));
        employeeList.add(new EmployeeConceptOfTheDay(115, "Aaditi", 41, "Female", "HR", 2022, 29700.0));
        employeeList.add(new EmployeeConceptOfTheDay(116, "Mahendra", 43, "Male", "Security And Transport", 2023, 20500.0));
        employeeList.add(new EmployeeConceptOfTheDay(117, "Nitish", 35, "Male", "Account And Finance", 2019, 37000.0));
        employeeList.add(new EmployeeConceptOfTheDay(118, "Aditya", 31, "Male", "Product Development", 2019, 34500.0));
        employeeList.add(new EmployeeConceptOfTheDay(119, "Monika", 24, "Female", "Sales And Marketing", 2021, 21500.0));
        employeeList.add(new EmployeeConceptOfTheDay(120, "Aman", 38, "Male", "Security And Transport", 2021, 31000.5));
        employeeList.add(new EmployeeConceptOfTheDay(121, "Sangeeta", 27, "Female", "Infrastructure", 2021, 35000.0));
        employeeList.add(new EmployeeConceptOfTheDay(122, "Joshi", 25, "Male", "Product Development", 2020, 29000.0));
        employeeList.add(new EmployeeConceptOfTheDay(123, "Jeddy", 27, "Female", "Account And Finance", 2020, 29000.0));
        employeeList.add(new EmployeeConceptOfTheDay(124, "Niden", 24, "Male", "Sales And Marketing", 2020, 30200.5));
        employeeList.add(new EmployeeConceptOfTheDay(125, "Saig", 23, "Male", "Infrastructure", 2019, 42700.0));
        employeeList.add(new EmployeeConceptOfTheDay(126, "Saey", 26, "Female", "Product Development", 2018, 38900.0));
        employeeList.add(new EmployeeConceptOfTheDay(127, "Shreyas", 25, "Male", "Product Development", 2018, 35700.0));

        return employeeList;
    }
}
