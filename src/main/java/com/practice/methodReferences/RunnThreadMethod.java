package com.practice.methodReferences;

public class RunnThreadMethod
{

    public static void executeTask()
    {
        System.out.println("execute Task");
    }

    public static void main(String[] args)
    {
        // Anonymous Class
        Runnable obj = new Runnable() {
            @Override
            public void run() {
                System.out.println("run obj");
            }
        };

        // Lambda Expression
        Runnable obj2 = () -> System.out.println("run obj2");

        // Method Reference
        Runnable obj3 = RunnThreadMethod::executeTask;
        System.out.println("Method Reference: " + obj3);


        // Executing Threads
        new Thread(obj).start();
        new Thread(obj2).start();
        new Thread(obj3).start();

    }
}
