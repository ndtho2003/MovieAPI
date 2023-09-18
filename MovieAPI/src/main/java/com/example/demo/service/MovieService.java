package com.example.demo.service;

import com.example.demo.entity.Movie;
import com.example.demo.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;
    public List<Movie> findAllMovies(){
        return repository.findAll();
    }

    public Optional<Movie> singleMovie(String imbdId){
        return repository.findMovieByImdbId(imbdId);
    }
}
