package com.ashokit.config;

import com.ashokit.bean.MovieFinder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"com.ashokit"})
public class AppConfig {

    @Bean
    @Primary
    public MovieFinder movieFinder1() {
        return new MovieFinder();
    }
}
