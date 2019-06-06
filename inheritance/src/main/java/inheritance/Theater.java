package inheritance;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Theater {
/*********
 * Instance Variables
 * */
    private String name;
    private int starRating;
    private List<String> movies;
    private List<Review> reviews;


/*********
 * Constructors
 * */
    public Theater(String name) {
        this.name = name;
        this.starRating = 0;
        this.movies = new ArrayList<>();
        this.reviews = new LinkedList<>();
    }


/*********
 * Getters and Setters
 * */
    public String getName() { return this.name; };
    public int getStarRating() { return this.starRating; }
    public List<String> getMovies() { return this.movies; }
    public List<Review> getReviews() { return this.reviews; }

    public void setName(String name) { this.name = name; }
    public void setStarRating(int starRating) { this.starRating = starRating; }

/*********
 * Instance Methods
 * */
    public void addMovie(String movie) { movies.add(movie); }

    public void removeMovie(String movie) { movies.remove(movie); }

    public String toString() {
        StringBuilder allMovies = new StringBuilder();

        allMovies.append(" - ");

        for (String movie : movies) {
            allMovies.append(movie + " - ");
        }

        return allMovies.toString();
    }

    public void addReview(Review review) {
        this.reviews.add(review);
        this.setStarRating(review.getStarRating());
    }

}
