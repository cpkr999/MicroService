package com.microservice.MovieService.service;

import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.MovieService.dao.MovieDAO;
import com.microservice.MovieService.entity.Movie;
import com.microservice.MovieService.entity.MovieServiceInfo;
import com.microservice.MovieService.entity.Ratings;


@Service
public class MovieServices {

	@Autowired
	private MovieDAO MovieDAO;
	
	@Autowired
	private RestTemplate RestTemplate;
	
	@Transactional
	public void postMovie(Movie movie)
	{
		MovieDAO.postMovie(movie);
	}
	
	@Transactional
	public List<Movie> getMovies() {
		
		return MovieDAO.getMovies();
		
	}
	
	@Transactional
	public List<MovieServiceInfo> getMovie(int id) {
		Ratings ratings = RestTemplate.getForObject("http://localhost:8484/getRatings/"+id, Ratings.class);
		Movie movie = MovieDAO.getMoviesInfo(id);
		int rateVal= ratings.getRating();
		String movieInfo = movie.getDescription();
		return Arrays.asList(new MovieServiceInfo(rateVal,movieInfo));
	}
}
