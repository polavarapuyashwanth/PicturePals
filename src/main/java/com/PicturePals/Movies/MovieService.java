package com.PicturePals.Movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Service annotation is used to identify the Main business logic of the application
@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
    public Optional<Movie> singleMovie(ObjectId id){
        return  movieRepository.findById(id);
    }
}
