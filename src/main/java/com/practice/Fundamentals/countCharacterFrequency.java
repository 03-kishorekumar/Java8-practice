package com.practice.Fundamentals;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countCharacterFrequency
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();

        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for (char ch : str.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        System.out.print("The Frequency : ");
        System.out.println(map);


    }

}
