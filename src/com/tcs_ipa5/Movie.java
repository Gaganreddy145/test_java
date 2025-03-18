package com.tcs_ipa5;

public class Movie {
	private int movieId, rating, budget;
	private String director;

	Movie(int id, String director, int rating, int budget) {
		this.movieId = id;
		this.director = director;
		this.rating = rating;
		this.budget = budget;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getMovieId() {
		return movieId;
	}

	public int getRating() {
		return rating;
	}

	public int getBudget() {
		return budget;
	}

	public String getDirector() {
		return director;
	}

}
