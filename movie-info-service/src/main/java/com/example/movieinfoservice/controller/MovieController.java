package com.example.movieinfoservice.controller;

import com.example.movieinfoservice.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @GetMapping("/{id}")
    public Movie getMovieInfo(@PathVariable("id") int id) {
        return new Movie(3, "Wide eyes shut");
    }

}
