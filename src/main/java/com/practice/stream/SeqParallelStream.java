package com.practice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeqParallelStream
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");

        int size = sc.nextInt();

        List<String> obj = new ArrayList<>(size);

        System.out.println("Enter the elements of the array : ");

        for(int i=0; i<size; i++)
        {
            obj.add(sc.nextLine());
        }

        System.out.println("The Elements in an Array is : " + obj);

        obj.stream()        // Sequential Stream
            .forEach(System.out::println);

        obj.parallelStream()    // Parallel Stream (collection method)
            .forEach(System.out::println);

        obj.stream().parallel()     // Parallel Stream (stream method)
            .forEach(System.out::println);

        obj.stream().parallel()     // It will follow order of elements
                .forEachOrdered(System.out::println);
    }
}
