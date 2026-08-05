package com.practice.functionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class funcInterface
{
    public static void main(String[] args) {

        // Predicate Example

//        Predicate<Integer> p1 = (num) -> {
//            if (num % 2 == 0)
//                return true;
//            else
//                return false;
//        };
//        System.out.println(p1.test(10));
//        System.out.println(p1.test(20));
//
//
//        Predicate<String> p2 = str -> str.isEmpty();
//
//        System.out.println(p2.test("Hello"));
//        System.out.println(p2.test(""));


        // Function Example

//        Function<String,Integer> f1 = (String str) -> {
//            return str.length();
//        };
//
//        System.out.println(f1.apply("Hello"));
//
//        Function<Integer,Integer> f2 = num -> num*num;
//        System.out.println(f2.apply(5));


        // consumer Example

//        Consumer<String> c1 = (String name) -> System.out.println(name);
//
//        c1.accept("John");
//
//        Consumer<Integer> c2 = age -> System.out.println(age);
//
//        c2.accept(20);


        // supplier Example

        Supplier<Integer> s1 = () -> (int) Math.random();

        System.out.println(s1.get());

        Supplier<String> s2 = () ->
        {
            String a = "hello";
            String b = "John";
            return a.concat(b);
        };

        System.out.println(s2.get());
    }
}
