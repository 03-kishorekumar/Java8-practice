package com.practice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class exampleStream
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");

        int size = sc.nextInt();

        List<Integer> ls = new ArrayList<>(size);

        System.out.println("Enter the elements of the array : ");

        for(int i=0; i<size; i++)
        {
            ls.add(sc.nextInt());
        }

        System.out.println("The elements are : " + ls);

        Predicate<Integer> obj = n -> n%2 == 1;

//        Predicate<Integer> obj = new Predicate<Integer>()   // predicate is functional interface that takes one argument and returns boolean
//        {
//            @Override       // Anonymous class implementation
//            public boolean test(Integer n)
//            {
//                // Method 2
//                return n%2 == 1;
//
//                // Method 1 - usual method
////                if(n%2 == 1)
////                    return true;
////                else
////                    return  false;
//            }
//        };

        // Method 1
        ls.stream()         // It will use new stream
                .filter(obj)        // It will use new stream
                .sorted()       // It will use new stream
                .map(n -> n*2)      // map - used to double the values
                .forEach(System.out::println);


//        // Method 2
//        ls.stream()     // It will use new stream
//                .filter(n -> n%2 == 1)      // It will use new stream
//                .sorted()       // It will use new stream
//                .map(n -> n*2)      // It will use new stream
//                .forEach(System.out::println);


    }

}
