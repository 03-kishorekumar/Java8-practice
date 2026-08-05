//  Sorting by Multiple Fields (Name, then rating)

package com.practice.comparableComaparator.Comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movies
{
    private String name;
    private double rating;
    private int year;

    public Movies(String name, double rating, int year)
    {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName()
    {
        return name;
    }

    public double getRating()
    {
        return rating;
    }

    public int getYear()
    {
        return year;
    }

    // Method to print student details
    @Override
    public String toString() {
        return "Movies{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                '}';
    }

}

// Comparator to sort movies by rating
class Rating implements  Comparator<Movies>
{
    public int compare(Movies m1, Movies m2)
    {
        // Sort by rating in descending order
        return Double.compare(m2.getRating(), m1.getRating());

        // return Double.compare(m1.getRating(), m2.getRating()); // for ascending order
    }
}

// Comparator to sort movies by name
class NameCompare implements Comparator<Movies>
{
    public int compare(Movies m1, Movies m2)
    {
        // Sort by name in alphabetical order
        return m1.getName().compareTo(m2.getName());

        // return m2.getName().compareTo(m1.getName()); // for descending order
    }
}

public class comparatorExamp
{
    public static void main(String[] args)
    {
        List<Movies> ls = new ArrayList<>();

        ls.add(new Movies("Ayan",9.0,2009));
        ls.add(new Movies("Bheeshma",8.5,2010));
        ls.add(new Movies("Kalki",8.0,2011));

        // Sort movies by rating and display all
        Collections.sort(ls, new NameCompare());
        System.out.println("Movies sorted by rating:");
        for(Movies m : ls)
        {
            System.out.println(m.getRating() + " " + m.getName() + " " + m.getYear());
        }

        // Sort movies by name and display all
        Collections.sort(ls, new Rating());
        System.out.println("\nMovies sorted by name:");
        for (Movies m1 : ls) {
            System.out.println(m1.getName() + " " + m1.getRating() + " " + m1.getYear());
        }
    }
}
