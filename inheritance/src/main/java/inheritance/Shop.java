package inheritance;

import java.util.LinkedList;
import java.util.List;

public class Shop {
/*********
 * Instance Variables
 * */
    private String name;
    private String description;
    private String priceRating;
    private int starRating;
    private List<Review> reviews;

/*********
 * Constructors
 * */
    public Shop() {
        this.name = "Please set the shop name.";
        this.description = "Please set the shop description.";
        this.priceRating = "Please set the price rating.";
        this.starRating = 1;
        this.reviews = new LinkedList<>();
    }

    public Shop(String name, String description, String priceRating) {
        this.name = name;
        this.description = description;
        this.priceRating = priceRating;
        this.starRating = 1;
        this.reviews = new LinkedList<>();
    }

/*********
 * Getters and Setters
 * */
    public String getName() { return this.name; }
    public String getDescription() { return this.description; }
    public String getPriceRating() { return this.priceRating; }
    public int getStarRating() { return this.starRating; }

    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setPriceRating(String priceRating) { this.priceRating = priceRating; }
    public void setStarRating(int starRating) { this.starRating = starRating; }


/*********
 * Instance Methods
 * */
    public String toString() {
        return String.format("Name: %s \n Description: %s \n Price Rating: %s", this.name, this.description, this.priceRating);
    }

    public void addReview(Review review) {
        this.reviews.add(review);
        this.setStarRating(review.getStarRating());
    }
}
