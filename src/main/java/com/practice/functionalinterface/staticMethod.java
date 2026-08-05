package com.practice.functionalinterface;


@FunctionalInterface
interface square
{
   int calculate(int num);

}

class calculator
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
        square obj = num ->  calculator.calculate(num);

        System.out.println(obj.calculate(5));
    }

}
