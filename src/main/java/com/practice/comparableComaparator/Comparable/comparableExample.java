package com.practice.comparableComaparator.Comparable;

//  Collections.sort(employees)
//        │
//        ▼
//        compareTo(e1, e2)
//        │
//        ▼
//        Double.compare(e1.salary, e2.salary)
//        │
//        ▼
//        Return:
//        < 0  → e1 comes first
//        = 0  → equal
//        > 0  → e2 comes first


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Employee implements Comparable<Employee>
{
    private int Id;

    private String name;

    private double salary;

    public Employee(int Id, String name, double salary)
    {
        this.Id = Id;
        this.name = name;
        this.salary = salary;
    }

    public int compareTo(Employee employee)
    {
        return Double.compare(this.salary,employee.salary);
    }

    // Method to print student details
    @Override
    public String toString()
    {
        return "Employee{" +
                "id=" + Id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}

public class comparableExample
{
    public static void main(String[] args)
    {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "John", 50000));
        employees.add(new Employee(102, "Jane", 70000));
        employees.add(new Employee(103, "Bob", 60000));

        System.out.println("Before Sorting:");
        System.out.println(employees);

        Collections.sort(employees);

        System.out.println("\nAfter Sorting by Salary:");
        System.out.println(employees);
    }
}
