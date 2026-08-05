package com.practice.functionalinterface;


@FunctionalInterface
interface personalGreet
{
    void greet(String name);

    default void  example()
    {
        System.out.println("greet");
    }

    static   void  sample()
    {
        System.out.println("main");
    }
}
public class MyClass
{

    public static void main(String[] args)
    {
        // Method 1
        personalGreet obj = (String name) -> System.out.println("Hello " + name);

        obj.greet("John");


        // Method 2
        personalGreet obj1 =name ->
        {
            System.out.println("Hello " + name);
        };
        obj1.greet("The Don");

    }

}
