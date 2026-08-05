package com.practice.methodReferences;


import java.util.Arrays;
import java.util.List;


// scenerio 2: Instance method reference
//public class instanceMethod
//{
//    void display(String msg)
//    {
//        System.out.println(msg);
//    }
//
//    public static void main(String[] args)
//    {
//        instanceMethod obj = new instanceMethod();
//
//        List<String> list = Arrays.asList("abi", "bala", "chai");
//
//        list.forEach(obj::display);
//    }
//}



// scenerio 1: Instance method reference

@FunctionalInterface
interface sample
{
    String print(String name);
}

class instance
{
    public String print(String name)
    {
        return name;
    }

}


public class instanceMethod
{

    public static void main(String[] args)
    {
        instance obj = new instance();
        sample s = obj::print;
        System.out.println(s.print("Kishore"));
    }

}
