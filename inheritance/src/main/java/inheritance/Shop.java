package inheritance;

public class Shop {
/*********
 * Instance Variables
 * */
    private String name;
    private String description;
    private String priceRating;

/*********
 * Constructors
 * */
    public Shop() {
        this.name = "Please set the shop name";
        this.description = "Please set the shop description.";
        this.priceRating = "Please set the price rating.";
    }

    public Shop(String name, String description, String priceRating) {
        this.name = name;
        this.description = description;
        this.priceRating = priceRating;
    }

/*********
 * Getters and Setters
 * */
    public String getName() { return this.name; }
    public String getDescription() { return this.description; }
    public String getPriceRating() { return this.priceRating; }

    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setPriceRating(String priceRating) { this.priceRating = priceRating; }


/*********
 * Instance Methods
 * */
    public String toString() {
        return String.format("Name: %s \n Description: %s \n Price Rating: %s", this.name, this.description, this.priceRating);
    }
}
