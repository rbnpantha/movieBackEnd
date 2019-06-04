package com.example.movie;

import java.util.List;

import javax.ws.rs.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieResources {
	
	@Autowired	
	private MovieDataService movieDataService;
	
	@RequestMapping("/all")
    public List<Movie> findAll( ) {
        return  movieDataService.findAll();

    }
	
	@RequestMapping (value="/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Movie getMovie(@PathVariable("id") Integer id){
		return movieDataService.getMovieById(id) ;   	
	}
		
	
	@RequestMapping (value="/update", method=RequestMethod.PUT, produces=MediaType.APPLICATION_JSON_VALUE)
	public Movie updateMovie(@RequestBody Movie movie) {
		return movieDataService.updateMovie(movie);
		}
		
		
	@POST
    @RequestMapping("/add")
    public Movie addMovie(@RequestBody Movie movie){
		return movieDataService.addMovie(movie);
    }

	@POST
    @RequestMapping("/delete")
    public Movie deleteMovieById(@RequestBody Movie movie) {
        movieDataService.deleteMovie(movie);
        return movie;

    }
	
}
