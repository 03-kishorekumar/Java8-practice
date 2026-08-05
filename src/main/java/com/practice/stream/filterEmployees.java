package com.practice.stream;


import java.util.ArrayList;
import java.util.List;

class Employee
{
    private String name;

    private double salary;

    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }
}

public class filterEmployees
{
    public static void main(String[] args)
    {
        List<Employee> ls = List.of(
                new Employee("John", 50000),
                new Employee("Jane", 60000),
                new Employee("Bob", 70000)
        );

        List<Employee> result = ls.stream()
                .reduce(
                      new ArrayList<>(),
                        (list,employee) ->
        {
            if(employee.getSalary() > 55000)
            {
                list.add(employee);
            }

            return list;
        },
                        (list1,list2) ->
                        {
                            list1.addAll(list2);
                            return  list1;
                        }
                );


    }

}


