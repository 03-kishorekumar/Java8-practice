package com.practice.stream;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.*;

public class streamCreation
{
    public static void main(String[] args) {
        // using collection
        List<String> ls = Arrays.asList("a", "b", "c");
        Stream<String> stream1 = ls.stream();       // object stream


        // using Array
        String[] str = {"a", "b", "c"};
        Stream<String> stream2 = Arrays.stream(str);

        // using of stream.of() method
        Stream<String> stream3 = Stream.of("a", "b", "c");

        List<Integer> num = Arrays.asList(10, 20, 30, 40, 50);
        num.stream()
                .filter(n -> n > 10)
                .map(n -> n * 2)
                .distinct()            // remove duplicates
                .sorted()              // sort ascending
                .forEach(System.out::println);      // terminal operation

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of names:");

        int n = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.println("Enter names");

        List<String> names = new ArrayList<String>(n);

        for(int i = 0; i < n; i++)
        {
            names.add(sc.nextLine());
        }

        System.out.println(names.toString());

        // stream on list
        names.stream()
                .distinct()
                .forEach(System.out::println);

        // collect on List to remove duplicates
        Set<String> uniqueNames = names.stream().collect(Collectors.toSet());
        System.out.println(uniqueNames);


        // count names starts with a
        long count = names.stream()
                .filter(name -> name.startsWith("a"))
                .count();

        System.out.println( "Names start with a : " + count);

        // concatenate names using reduce() method
        String concatenatedNames = names.stream()
                .reduce("", (s1, s2) -> s1 + s2 + " ");
        System.out.println("Concatenated names: " + concatenatedNames);

    }
}
