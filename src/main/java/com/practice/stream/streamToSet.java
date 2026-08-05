package com.practice.stream;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamToSet
{
    public static void main(String[] args)
    {
        // converting Stream to Set
        // Method 1
        Stream<String> obj = Stream.of("Geeks", "For", "Geeks");
        obj.collect(Collectors.toSet())     // removes duplicates elements
                .forEach(System.out::println);

        // Method 2
        obj.collect(Collectors.toCollection(LinkedHashSet::new))    // removes duplicates and maintains insertion order
                .forEach(System.out::println);


        // Method 3
        obj.collect(Collectors.toUnmodifiableSet())     // creates an immutable set
                .forEach(System.out::println);


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Set : ");

        int size = sc.nextInt();

        Set<String> str = new HashSet<>(size);

        System.out.print("Enter the elements of the Set : ");

        for (int i=0; i<size; i++)
        {
            str.add(sc.nextLine());
        }

        System.out.println("The Elements are : " + str);

        // Converting Set to Stream
        Stream<String> s = str.stream();
        s.forEach(System.out::println);


    }
}
