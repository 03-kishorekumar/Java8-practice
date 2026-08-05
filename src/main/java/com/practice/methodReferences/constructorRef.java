package com.practice.methodReferences;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class constructorRef
{
    private String name;
    private int age;

    public constructorRef()
    {
        System.out.println("No-arg constructor");
    }

    public constructorRef(String name)
    {
        this.name = name;
        System.out.println("Single Argument Constructor Reference");
    }

    public constructorRef(String name, int age)
    {
        this.name=name;
        this.age=age;
        System.out.println("Two Argument Constructor Reference");
    }

    public static void main(String[] args)
    {
        Supplier<constructorRef> objj = () -> new constructorRef();     // Lambda Expression
        Supplier<constructorRef> objj2 = constructorRef::new;       // Constructor Reference (Method Reference)
        System.out.println(objj.get());


        Function<String,constructorRef> obj = (name) -> new constructorRef(name);   // Lambda Expression
        Function<String,constructorRef> obj2 = constructorRef::new;     // Constructor Reference (Method Reference)
        System.out.println(obj.apply("Sam"));


        BiFunction<String,Integer,constructorRef> object = (name, age) -> new constructorRef(name, age);        // Lambda Expression
        BiFunction<String,Integer,constructorRef> object2 = constructorRef::new;    // Constructor Reference (Method Reference)
        System.out.println(object2.apply("John", 25));
    }
}
