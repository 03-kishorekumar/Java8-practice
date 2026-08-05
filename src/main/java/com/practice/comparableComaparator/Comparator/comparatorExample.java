package com.practice.comparableComaparator.Comparator;

import java.util.*;

public class comparatorExample
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the array : ");

        int size = sc.nextInt();

        List<Integer> ls = new ArrayList<>(size);

        System.out.println("Enter the elements of the array : ");

        for (int i=0; i<size; i++)
        {
            ls.add(sc.nextInt());
        }

        System.out.println("The array is : " + ls);


        Comparator<Integer> comp = new Comparator<Integer>()
        {
            @Override           // Anonymous class
            public int compare(Integer i, Integer j)
            {
                if(i%10 > j%10)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        };

        Collections.sort(ls, comp);

        System.out.println("The array is : " + ls);

    }
}
