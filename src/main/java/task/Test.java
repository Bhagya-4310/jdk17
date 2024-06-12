package task;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Movies movies=new Movies();
        movies.name="a";
        movies.ticket="4310";
        Movies movies1=new Movies();
        movies1.name="b";
        movies1.ticket="1234";
        Movies movies2=new Movies();
        movies2.name="c";
        movies2.ticket="5678";
        List<Movies> moviesList=new ArrayList<>();
        moviesList.add(movies);
        moviesList.add(movies1);
        moviesList.add(movies2);
        BookMyShow bookMyShow=new BookMyShow();
        bookMyShow.movies=moviesList;
        System.out.println(bookMyShow);
    }
}
