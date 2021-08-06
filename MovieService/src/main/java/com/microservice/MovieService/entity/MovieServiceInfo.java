package com.microservice.MovieService.entity;

public class MovieServiceInfo {
    
	private int rating;
	private String MovieDescription;
	
	
	public MovieServiceInfo() {
	
	}
	
	
	public MovieServiceInfo(int rating, String movieDescription) {
		super();
		this.rating = rating;
		MovieDescription = movieDescription;
	}


	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getMovieDescription() {
		return MovieDescription;
	}
	public void setMovieDescription(String movieDescription) {
		MovieDescription = movieDescription;
	}
	@Override
	public String toString() {
		return "MovieServiceInfo [rating=" + rating + ", MovieDescription=" + MovieDescription + "]";
	}
	
	
	
	
}
