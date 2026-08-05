package com.practice.comparableComaparator.Comparable;

//  Movie implements Comparable<Movie> to define default sort order.
//  compareTo() sorts movies by year in ascending order.
//  Collections.sort() uses compareTo() to perform sorting.


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Movie class implements Comparable interface to define default sorting
class Movie implements Comparable<Movie>
{
    private String name;

    private double rating;

    private int year;

    public Movie(String name, double rating, int year)
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
        return  rating;
    }

    public  int getYear()
    {
        return year;
    }

    // Method to print student details
    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                '}';
    }

    // Compare movies by year (for natural ordering)
    // compareTo method for default sorting by year
    public int compareTo(Movie movie)
    {
        // Sort movies in ascending order of year
        return this.year - movie.year;

        // Sort movies in descending order of year
        // return movie.year - this.year;
    }
}

public class ComparableExamp
{
    public static void main(String[] args)
    {
        List<Movie> ls = new ArrayList<>();

        ls.add(new Movie("Ayan",9.0,2009));
        ls.add(new Movie("Bheeshma",8.5,2010));
        ls.add(new Movie("Kalki",8.0,2011));

        // Sort movies using Comparable's compareTo method by year
        Collections.sort(ls);

        // Display sorted list of movies
        System.out.println("Movies after sorting by year:");
        for(Movie n : ls) {
            System.out.println(n.getName() + " " + n.getRating() + " " + n.getYear());
        }
    }
}
