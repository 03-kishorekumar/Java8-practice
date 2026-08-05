package com.practice.comparableComaparator.Comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student
{
    String name;
    int age;

    public student(String name, int age)
    {
        this.age = age;
        this.name = name;
    }

    public Integer getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    // Method to print student details
    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class studentCompare implements Comparator<student>
{
    public int compare(student s1, student s2)
    {
        int ageCompare = s1.getAge().compareTo(s2.getAge());
        int nameCompare = s1.getName().compareTo(s2.getName());

        return (nameCompare == 0) ? ageCompare : nameCompare;

    }
}


public class comparatorInter
{
    public static void main(String[] args)
    {
        List<student> students = new ArrayList<>();
        students.add(new student("John", 20));
        students.add(new student("Jane", 22));
        students.add(new student("Bob", 19));

        System.out.println("Original List:");
        students.stream()
                .forEach(System.out::println);

        Collections.sort(students, new studentCompare());

        System.out.println("\n After Sorting:");
        students.stream()
                .forEach(System.out::println);

    }

}
