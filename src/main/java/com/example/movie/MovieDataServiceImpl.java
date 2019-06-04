package com.example.movie;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MovieDataServiceImpl implements MovieDataService {
	
	
	@Autowired
	private MovieDAO movieDAO;


	@Override
	public Movie getMovieById(Integer id) {
	    Optional<Movie> movieOptional = movieDAO.findById(id);
	    return movieOptional.get();
	}

	@Override
	public Movie addMovie(Movie movie) {
	    return movieDAO.save(movie);
	}

	@Override
	public Movie updateMovie(Movie movie) {
		// TODO Auto-generated method stub
		return movieDAO.save(movie);
	}

	@Override
	public void deleteMovie(Movie movie) {
	        movieDAO.delete(movie);
	        }

	@Override
	public List<Movie> findAll() {		
		return movieDAO.findAll();
	}

	

	}


