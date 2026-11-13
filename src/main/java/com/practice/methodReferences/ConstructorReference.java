package com.practice.methodReferences;


import java.util.function.Supplier;


public class ConstructorReference
{
    ConstructorReference()
    {
        System.out.println("ConstructorReference");
    }

    public static void main(String[] args)
    {
        // Lambda Expression
        Supplier<ConstructorReference> obj1 = () -> new ConstructorReference();

        System.out.println(obj1.get());

        // Method Reference
        Supplier<ConstructorReference> obj = ConstructorReference::new;

        System.out.println(obj.get());
    }
}
