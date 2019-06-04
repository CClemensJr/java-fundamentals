package inheritance;

import java.util.List;

public class Restaurant {
/*********
 * Instance Variables
 * */
    private String name;
    private int numberOfStars;
    private String priceCategory;
    private List<Review> reviews;

/*********
 * Constructors
 * */
    public Restaurant(String name) {
        this.name = name;
        this.numberOfStars = 1;
        this.priceCategory = "$";
    }

    public Restaurant(String name, int numberOfStars, String priceCategory) {
        this.name = name;
        this.numberOfStars = numberOfStars;
        this.priceCategory = priceCategory;
    }


/*********
 * Getters and Setters
 * */
    public String getName() { return this.name; }
    public int getNumberOfStars() { return this.numberOfStars; }
    public String getPriceCategory() { return this.priceCategory; }
    public List<Review> getReviews() { return this.reviews; }

    public void setName(String name) { this.name = name; }
    public void setNumberOfStars(int numberOfStars) { this.numberOfStars = numberOfStars; }
    public void setPriceCategory(String priceCategory) { this.priceCategory = priceCategory; }


/*********
 * Instance Methods
 * */
    public String toString() {
        return String.format("Name: %s | Rating: %d | Price: %s", this.name, this.numberOfStars, this.priceCategory);
    }

    public void addReview(Review review) {
        this.reviews.add(review);
    }
}
