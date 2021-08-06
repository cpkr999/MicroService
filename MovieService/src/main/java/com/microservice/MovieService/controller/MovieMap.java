package com.microservice.MovieService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.MovieService.entity.Movie;
import com.microservice.MovieService.entity.MovieServiceInfo;
import com.microservice.MovieService.service.MovieServices;

@RestController
public class MovieMap {
   
	@Autowired
	private MovieServices movieService;
	
	@PostMapping("/postMovie")
	public void postMovie(@RequestBody Movie movie)
	{
		movieService.postMovie(movie);
	}
	
	@GetMapping("/getMovies")
	public List<Movie> getMovies()
	{
		return movieService.getMovies();
	}
	
	@GetMapping("/getMovies/{id}")
	public List<MovieServiceInfo> getMovie(@PathVariable int id)
	{
		return movieService.getMovie(id);
	}
}
