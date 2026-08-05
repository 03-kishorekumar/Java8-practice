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
        Supplier<ConstructorReference> obj = ConstructorReference::new;

        System.out.println(obj.get());
    }
}
