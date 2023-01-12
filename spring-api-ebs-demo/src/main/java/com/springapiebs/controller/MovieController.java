package com.springapiebs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springapiebs.model.Movie;

@RestController
@RequestMapping("/api")
public class MovieController {
	
	private List<Movie> list = new ArrayList<>();
	
	
	@PostMapping("/save")
	public List<Movie> addMovie(@RequestBody Movie movie)
	{
		list.add(movie);
		
		return list;
		
	}
	
	
	@GetMapping("/get")
	public List<Movie> getdetails()
	{
		return list;
	}

}
