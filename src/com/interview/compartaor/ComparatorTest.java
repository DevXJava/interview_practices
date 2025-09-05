package com.interview.compartaor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie implements Comparable<Movie> {
	private double rating;
	private String name;
	private int year;

	// Used to sort movies by year
	public int compareTo(Movie m) {
		return this.year - m.year;
	}

	// Constructor
	public Movie(String nm, double rt, int yr) {
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	// Getter methods for accessing private data
	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}
}

//class Name compare 
class MovieNameCompare implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {

		return o1.getName().compareTo(o2.getName());
	}

}

class RatingCompare implements Comparator<Movie> {
    public int compare(Movie m1, Movie m2)
    {
        if (m1.getRating() < m2.getRating())
            return -1;
        if (m1.getRating() > m2.getRating())
            return 1;
        else
            return 0;
    }
}

public class ComparatorTest {

	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Force Awakens", 8.3, 2015));
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));
		
		MovieNameCompare movieNameCompare = new MovieNameCompare();
		Collections.sort(list,movieNameCompare);
		list.forEach(list1->System.out.println("sorting by name : "+list1.getName()));
		
		RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        list.forEach(list1->System.out.println("sorting by rating : "+list1.getRating()));

	}

}
