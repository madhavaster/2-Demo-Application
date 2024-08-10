package com.ashokit;

import com.ashokit.bean.MovieLister;
import com.ashokit.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String bean: beanDefinitionNames){
            System.out.println(bean);
        }
        MovieLister movieLister = applicationContext.getBean(MovieLister.class);
        movieLister.listMovies();
    }
}
