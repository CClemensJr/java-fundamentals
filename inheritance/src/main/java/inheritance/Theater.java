package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater {
/*********
 * Instance Variables
 * */
    private String name;
    private List<String> movies;


/*********
 * Constructors
 * */
    public Theater(String name) {
        this.name = name;
        movies = new ArrayList<>();
    }


/*********
 * Getters and Setters
 * */
    public String getName() { return this.name; };
    public List<String> getMovies() { return this.movies; }

    public void setName(String name) { this.name = name; }

/*********
 * Instance Methods
 * */
    public void addMovie(String movie) { movies.add(movie); }

    public void removeMovie(String movie) { movies.remove(movie); }

    public String toString() {
        StringBuilder allMovies = new StringBuilder();

        for (String movie : movies) {
            allMovies.append(" - " + movie + " - ");
        }

        return allMovies.toString();
    }

}
