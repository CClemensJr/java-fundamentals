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


/*********
 * Instance Methods
 * */

}
