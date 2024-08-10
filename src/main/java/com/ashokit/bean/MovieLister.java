package com.ashokit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MovieLister {

    @Autowired
    @Qualifier("movieFinder")
    private MovieFinder mFinder;

    public void listMovies() {
        Map<String, String> movies = mFinder.getMovies();
        System.out.println(movies);
    }
}
