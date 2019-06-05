package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Restaurant {
/*********
 * Instance Variables
 * */
    private String name;
    private int starRating;
    private String priceRating;
    private List<Review> reviews;

/*********
 * Constructors
 * */
    public Restaurant(String name) {
        this.name = name;
        this.starRating = 1;
        this.priceRating = "$";
        this.reviews = new ArrayList<>();
    }

    public Restaurant(String name, int numberOfStars, String priceCategory) {
        this.name = name;
        this.starRating = numberOfStars;
        this.priceRating = priceCategory;
        this.reviews = new LinkedList<>();
    }


/*********
 * Getters and Setters
 * */
    public String getName() { return this.name; }
    public int getStarRating() { return this.starRating; }
    public String getPriceRating() { return this.priceRating; }
    public List<Review> getReviews() { return this.reviews; }

    public void setName(String name) { this.name = name; }
    public void setStarRating(int starRating) { this.starRating = starRating; }
    public void setPriceRating(String priceCategory) { this.priceRating = priceCategory; }


/*********
 * Instance Methods
 * */
    public String toString() {
        return String.format("Name: %s | Rating: %d | Price: %s", this.name, this.getStarRating(), this.priceRating);
    }

    public void addReview(Review review) {
        this.reviews.add(review);
        this.setStarRating(review.getStarRating());
    }
}
