// demonstrate how to Sort LinkedHashMap by
// keys using Comparable interface

package com.practice.comparableComaparator.Comparable;


import java.util.LinkedHashMap;
import java.util.TreeMap;

class stud implements Comparable<stud>
{
    String name;

    public  stud(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "stud{" +
                "name='" + name + '\'' +
                '}';
    }

    // Override compareTo method to sort LinkedHashMap keys
    // in ascending order
    @Override
    public int compareTo(stud o) {
        return this.name.compareTo(o.name);
    }

    // Override compareTo method to sort LinkedHashMap keys
    // in descending order
//    public int compareTo(stud stu)
//    {
//        return stu.name.compareTo(this.name);
//    }

}


public class LinkedHashMapByKeysComparable
{
    public static void main(String[] args)
    {
        LinkedHashMap<stud, Integer> map
                = new LinkedHashMap<>();

        // Adding elements to map
        map.put(new stud("Bina"), 200);
        map.put(new stud("Akshay"), 400);
        map.put(new stud("Chintu"), 500);

        // Before sort
        System.out.println(
                "Before sort keys in ascending order : " + map);

        // TreeMap to sort LinkedHashMap using comparable
        TreeMap<stud, Integer> tree_map
                = new TreeMap<>(map);

        // after sorting
        System.out.println(
                "After sort keys in ascending order : "
                        + tree_map);

    }
}
