package com.practice.stream;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class printElementsStream
{
    public static void main(String[] args)
    {

        Stream<String> obj = Stream.of("Geeks", "For",
                "Geeks", "A",
                "Computer", "Portal");

        obj.forEach(System.out::println);       // Method 1

        // maintain the insertion order
        obj.forEachOrdered(System.out::println);    // Method 2

        // collect the elements
        List<String> list = obj.collect(Collectors.toList());       // Method 3
        System.out.println(list);

        Stream<String> obj2 = Stream.of("Geeks", "For", "Geeks");
        obj2.collect(Collectors.toSet())        // Default hashSet implementation does not maintain insertion order
                .forEach(System.out::println);


        Stream.of("Geeks", "For", "GeeksForGeeks", "A", "Computer", "Portal")
                .filter(s -> s.startsWith("G"))
                .peek(s -> System.out.println("Filtered: " + s))
                .map(String::toUpperCase)
                .peek(s -> System.out.println("Uppercase: " + s));
    }
}
