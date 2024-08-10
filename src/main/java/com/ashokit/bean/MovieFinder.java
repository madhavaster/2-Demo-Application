package com.ashokit.bean;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MovieFinder {

    public Map<String, String> getMovies() {
        Map<String, String> moviesMap = new HashMap<>();
        moviesMap.put("RRR", "2022");
        moviesMap.put("Kalki", "2024");
        moviesMap.put("Tenant", "2024");
        return moviesMap;
    }
}
