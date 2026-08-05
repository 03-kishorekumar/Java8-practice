package com.practice.comparableComaparator.Comparable;


import java.util.Arrays;

class Triplets implements Comparable<Triplets>
{
    int x,y,z;

    public Triplets(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int compareTo(Triplets other)
    {
        return  Integer.compare(this.z, other.z);
    }

    @Override
    public String toString()
    {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}

public class arrayTripletsComparable
{
    public static void main(String[] args)
    {

        Triplets[] arr = {
                new Triplets(333, 2, 3),
                new Triplets(33, 2, 4),
                new Triplets(55, 6, 1),
                new Triplets(109, 2, 10)
        };

        // Sort array based on the last element (z)
        Arrays.sort(arr);

        // Print sorted triplets
        Arrays.stream(arr).forEach(System.out::println);
    }
}
