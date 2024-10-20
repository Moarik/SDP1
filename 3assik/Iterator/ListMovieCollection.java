package Iterator;

import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class ListMovieCollection {
    private List<String> movies;

    public ListMovieCollection(List<String> movies) {
        this.movies = movies;
    }

    public ListMovieIterator createIterator() {
        return new ListMovieIterator(movies);
    }
}
