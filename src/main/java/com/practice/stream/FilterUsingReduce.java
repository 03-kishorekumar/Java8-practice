package com.practice.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterUsingReduce
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the ArrayList : ");

        int size = sc.nextInt();

        List<Integer> ls = new ArrayList<>(size);

        System.out.println("Enter the elements of the ArrayList : ");

        for(int i=0; i<size; i++)
        {
            ls.add(sc.nextInt());
        }

        System.out.println("The elements are : " + ls);


        List<Integer> result = ls.stream()
                .reduce(new ArrayList<>(),
                        (list,num) ->
                {
                    if(num % 2 == 0)
                    {
                        list.add(num);
                    }
                    return  list;
                },
                (list1,list2) ->
                {
                    list1.addAll(list2);
                    return list1;
                }
        );

        System.out.println("The filtered elements are : " + result);




        System.out.println("Enter the size of the ArrayList : ");

        int size2 = sc.nextInt();

        List<String> ls2 = new ArrayList<>(size2);

        System.out.println("Enter the elements of the ArrayList : ");

        for(int i=0; i<size2; i++)
        {
            ls2.add(sc.nextLine());
        }

        System.out.println("The elements are : " + ls2);

        List<String> result2 = ls2.stream()

                .reduce(new ArrayList<>(),      // identity
                        (list,name) ->          // Accumulator
                        {
                            if(name.startsWith("a"))
                            {
                                list.add(name);
                            }
                            return  list;
                        },
                        (list1,list2) ->    // Combiner
                        {
                            list1.addAll(list2);
                            return list1;
                        }
                );

        System.out.println("The filtered Strings are : " + result2);
    }

}
