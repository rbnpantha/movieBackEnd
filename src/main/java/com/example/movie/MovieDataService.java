package com.example.movie;

import java.util.List;

public interface MovieDataService {
	
	
		List<Movie> findAll();
		Movie getMovieById(Integer id);
		Movie addMovie(Movie Movie);
		Movie updateMovie(Movie Movie);
		void deleteMovie(Movie Movie);
		
		
		
		
	
	

}
