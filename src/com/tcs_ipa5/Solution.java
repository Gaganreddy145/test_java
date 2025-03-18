package com.tcs_ipa5;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Movie[] arr = new Movie[4];
		for (int i = 0; i < 4; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String director = sc.nextLine();
			int rating = sc.nextInt();
			int budget = sc.nextInt();
			arr[i] = new Movie(id, director, rating, budget);
		}
		sc.nextLine();
		String director = sc.nextLine();
		int rating = sc.nextInt();
		int budget = sc.nextInt();
		sc.close();
		System.out.println(findAvgBudget(arr, director));
		Movie foundMovie = getMovieByRatingBudget(arr, rating, budget);
		if (foundMovie == null)
			System.out.println("No movie found!!!");
		else
			System.out.println(foundMovie.getMovieId());
	}

	public static double findAvgBudget(Movie[] arr, String director) {
		int sumo = 0;
		int count = 0;
		for (Movie m : arr) {
			if (m.getDirector().equalsIgnoreCase(director)) {
				sumo += m.getBudget();
				count++;
			}
		}
		double avg = sumo / count;
		return avg;
	}

	public static Movie getMovieByRatingBudget(Movie[] arr, int rating, int budget) {
		for (Movie m : arr) {
			if (m.getRating() == rating && m.getBudget() == budget) {
				if (budget % rating == 0)
					return m;
			}
		}
		return null;
	}

}
