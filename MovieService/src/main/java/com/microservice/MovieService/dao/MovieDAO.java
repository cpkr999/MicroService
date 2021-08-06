package com.microservice.MovieService.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.microservice.MovieService.entity.Movie;
import com.microservice.MovieService.service.MovieServices;
//import com.microservice.ratings.entity.Ratings;

@Repository
public class MovieDAO {

	
	@Autowired
	private EntityManager EntityManager;
	
	public void postMovie(Movie movie) {
		
		Session currentSession = EntityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(movie);
	}

	public List<Movie> getMovies() {
		Session currentSession = EntityManager.unwrap(Session.class);
		Query<Movie> qlist = currentSession.createQuery("From Movie", Movie.class);
		List<Movie> list = qlist.getResultList();
		return list;
	}
	
	public Movie getMoviesInfo(int id) {
		Session currentSession = EntityManager.unwrap(Session.class);
		Movie qlist = currentSession.get(Movie.class,id);
		return qlist;
	}

	 
}
