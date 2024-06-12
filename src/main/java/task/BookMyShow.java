package task;

import SwiggiApp.Dish;

import java.util.List;

public class BookMyShow {
    public List<Movies> movies;

    public List<Movies> getMovies() {
        return movies;
    }

   // public Movies getMovie(String name){
     //  return name.stream()
       //         .findFirst()
         //       .orElse(null);
       // }
    @Override
    public String toString() {
        return "BookMyShow{" +
                "movies=" + movies +
                '}';
    }
}