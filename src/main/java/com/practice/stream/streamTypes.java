package com.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class streamTypes
{
    public static void main(String[] args)
    {
        List<String> str = Arrays.asList("a", "b", "c");

        // Object stream example
        // sequential stream - process element in one by one in single thread
        str.stream()
            .forEach(System.out::println);      // Executes Sequentially


        // parallel Stream - perform operations concurrently on multiple threads
        str.stream()
                .parallel()     // stream method
                .forEach(System.out::println);      // Executes in parallel


        // parallelStream() - returns a parallel Stream
        str.parallelStream().   // used on collections
                forEach(System.out::println);


        // IntStream - primitive stream for int values
        IntStream.range(1,10)
                .forEach(System.out::println);

        // LongStream - primitive stream for long values
        LongStream.rangeClosed(1,10)
                .forEach(System.out::println);

        // DoubleStream - primitive stream for double values
        DoubleStream.of(1.0,2.0,3.0)
                .forEach(System.out::println);



        // converting object stream to primitive stream
        List<Integer> numbers =
                Arrays.asList(10,20,30);

        // converting object stream of integers into primitive stream of int using mapToInt() method.
        // mapToInt() method applies function to each element of stream and returns IntStream.
        // Integer::intValue is a method reference that maps each Integer object to its corresponding int value.
        // sum() method is then used to calculate sum of all elements in IntStream.

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);


        // Method 1 : Using IntStream.range() and boxed()
        // converting primitive stream to object stream
        IntStream intStream = IntStream.range(1, 10);   // IntStream

        Stream<Integer> objectStream = intStream.boxed();   // IntStream to object Stream
        objectStream.forEach(System.out::println);

        // Method 2 : Using IntStream.of() and boxed()
        // converting primitive stream to object stream
        IntStream.of(10,20,30)
                .boxed()
                .collect(Collectors.toList());

    }
}
