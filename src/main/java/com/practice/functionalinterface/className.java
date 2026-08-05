package com.practice.functionalinterface;


@FunctionalInterface
interface Sample
{
    void absMethod();

    String toString();

    int hashCode();

    boolean equals(Object obj);

}

public class className implements Sample
{

    @Override
    public void  absMethod()
    {
        System.out.println("absMethod");
    }

    @Override
    public String toString()
    {
        System.out.println("className");
        return "className";
    }

    @Override
    public int hashCode()
    {
        System.out.println("hashCode");
        return 1;
    }

    @Override
    public boolean equals(Object obj)
    {
        System.out.println("equals");
        return true;
    }

    public static void main(String[] args)
    {
        className obj = new className();
        obj.absMethod();
        obj.toString();
        obj.hashCode();
        obj.equals(obj);
    }

}
