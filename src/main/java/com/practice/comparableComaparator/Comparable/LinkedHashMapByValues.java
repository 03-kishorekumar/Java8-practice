package com.practice.comparableComaparator.Comparable;

import java.util.*;

public class LinkedHashMapByValues
{

    public static void main(String[] args)
    {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();

        map.put("kumar" , 100);
        map.put("kishore" , 200);
        map.put("venkat" , 300);

        System.out.print("Before Sorting : ");
        System.out.println(map);

        // Convert key-value from LinkedHashMap to List
        // using entryset() method
        List< Map.Entry<String,Integer> > ls = new ArrayList< Map.Entry<String,Integer> >(map.entrySet());


        // Comparable Interface function to
        // sort the values of List
        Collections.sort(
                ls,
                new Comparator< Map.Entry<String, Integer> >() {
                    @Override
                    public int compare(Map.Entry<String, Integer> entry1 , Map.Entry<String, Integer> entry2)
                    {
                            return entry1.getValue() - entry2.getValue();
                    }
                }
        );

        // Clear above LinkedHashMap
        // using clear() method
        map.clear();

        // Iterating over elements using for each loop
        for (Map.Entry<String, Integer> entry : ls) {

            // Put all sorted value back to LinkedHashMap
            map.put(entry.getKey(), entry.getValue());
        }

        // Display and print sorted value of LinkedHashMap
        System.out.println(
                "LinkedHashMap after sorting   : " + map);


    }

}
