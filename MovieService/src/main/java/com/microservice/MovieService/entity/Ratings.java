package com.microservice.MovieService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ratings")
public class Ratings {
	
	@Id
    private int id;
	@Column(name = "rating")
    private int rating;
    
    public Ratings() {
		
	}
	public Ratings(int id, int rating) {
		super();
		this.id = id;
		this.rating = rating;
	}
	
	public int getid() {
		return id;
	}
	public void id(int id) {
		this.id = id;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Ratings [movieiD=" + id + ", rating=" + rating + "]";
	}
}
