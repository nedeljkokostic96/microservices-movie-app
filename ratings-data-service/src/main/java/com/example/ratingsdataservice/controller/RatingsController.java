package com.example.ratingsdataservice.controller;

import com.example.ratingsdataservice.model.Rating;
import com.example.ratingsdataservice.model.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings-data")
public class RatingsController {

    @GetMapping("/{movieId}")
    public Rating getMovieRating(@PathVariable("movieId") int movieId){
        return new Rating(1, 5);
    }

    @GetMapping("/users/{userId}")
    public UserRating getUsersRating(@PathVariable("userId") int userId) {
        List<Rating> ratings = Arrays.asList(
                new Rating(123, 5),
                new Rating(100, 3),
                new Rating(51, 4)
        );
        return new UserRating(ratings);
    }

}
