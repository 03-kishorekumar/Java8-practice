package com.practice.comparableComaparator.Comparator;


import java.util.Arrays;
import java.util.Comparator;

class Triplet
{
    int a, b, c;

    public Triplet(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString()
    {
        return  "Triplet{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
}


class Compare implements Comparator<Triplet> {

    // Compare triplets based on the last element (z)
    @Override
    public int compare(Triplet ak, Triplet bk) {
        return Integer.compare(ak.c, bk.c);
    }
}


public class arrayTripletsComparator
{
    public static void main(String[] args)
    {
        Triplet[] arr = {
                new Triplet(10, 20, 30),
                new Triplet(40, -1, 2),
                new Triplet(30, 18, -1),
                new Triplet(50, 10, 50)
        };

        // Before sorting
        Arrays.stream(arr).forEach(System.out::println);

        // Sorting the array using Comparator
        Arrays.sort(arr, new Compare());

        // After sorting
        Arrays.stream(arr).forEach(System.out::println);

    }
}
