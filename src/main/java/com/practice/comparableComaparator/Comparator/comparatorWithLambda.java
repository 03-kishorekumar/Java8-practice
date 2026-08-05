package com.practice.comparableComaparator.Comparator;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Students
{
    String name;
    int age;

    public Students(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    // Method to print student details
    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

//Comparator.comparing() creates comparator by name.
//.thenComparing() adds secondary comparator by age.
//students.sort() sorts list using these chained comparators.

public class comparatorWithLambda
{
    public static void main(String[] args)
    {
        List<Students> obj = new ArrayList<>();
        obj.add(new Students("John", 15));
        obj.add(new Students("Jane", 3));
        obj.add(new Students("Bob", 20));


        // Original List
        System.out.println("Original List:");
        obj.stream()
                .forEach(System.out::println);

        // Sort students by name, then by age
        obj.sort(Comparator.comparing(Students::getName).thenComparing(Students::getAge));


        // Display message after sorting
        System.out.println("After Sorting:");

        obj.stream()
                .forEach(System.out::println);

    }
}
