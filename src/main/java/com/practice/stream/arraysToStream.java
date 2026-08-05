package com.practice.stream;


import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class arraysToStream
{

    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");

        int size = sc.nextInt();

        String[] str = new String[size];

        for(int i=0; i<size; i++)
        {
            String store = sc.nextLine();
            str[i] = store;
        }

        System.out.println("The Elements in an Array is : " + str);

        // Converting String array to Stream (Method 1)
        Stream<String> obj = Arrays.stream(str);
        obj.forEach(System.out::println);

        // Converting String array to Stream (Method 2)
        Stream<String> obj2 = Stream.of(str);
        obj2.forEach(System.out::println);

        // converting String array to stream (Method 3)
        Stream<String> obj3 = StreamSupport.stream(Arrays.spliterator(str), false);
        obj3.forEach(System.out::println);

        // converting long array to stream
        long[] arrL = { 3L, 5L, 6L, 8L, 9L };
        LongStream stmL = Arrays.stream(arrL);
        stmL.forEach(System.out::println);

        // converting double array to stream
        double[] arrD = { 1, 2, 3, 4, 5 };
        DoubleStream stmD = Arrays.stream(arrD);
        stmD.forEach(System.out::println);

    }

}
