package com.practice.methodReferences;


import java.util.Arrays;
import java.util.List;

public class instanceMethodArbitraryObj
{

    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("song","so","is");

        // lambda Expression
        list.stream()
                .map(name -> name.toUpperCase())
                .forEach(System.out::println);

        // Method Reference
        list.stream()
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }

}
