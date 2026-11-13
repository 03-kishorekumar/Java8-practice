package com.practice.methodReferences;

@FunctionalInterface
interface square
{
    int calculate(int num);
}

class calculate
{
    public static int calculate(int num)
    {
        return num*num;
    }
}

public class staticMethod
{
    public static void main(String[] args)
    {
        square obj = calculate::calculate;      // Method Reference

        square obj2 = (num) -> calculate.calculate(num); // Lambda Expression

        System.out.println(obj.calculate(5));

    }

}
