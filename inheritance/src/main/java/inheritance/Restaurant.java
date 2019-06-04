package inheritance;

public class Restaurant {
/*********
 * Instance Variables
 * */
    private String name;
    private int numberOfStars;
    private int priceCategory;


/*********
 * Constructors
 * */
    public Restaurant(String name) {
        this.name = name;
        this.numberOfStars = 0;
        this.priceCategory = 0;
    }

    public Restaurant(String name, int numberOfStars, int priceCategory) {
        this.name = name;
        this.numberOfStars = numberOfStars;
        this.priceCategory = priceCategory;
    }


/*********
 * Getters and Setters
 * */
    public String getName() { return this.name; }
    public int getNumberOfStars() { return this.numberOfStars; }
    public int getPriceCategory() { return this.priceCategory; }

    public void setName(String name) { this.name = name; }
    public void setNumberOfStars(int numberOfStars) { this.numberOfStars = numberOfStars; }
    public void setPriceCategory(int priceCategory) { this.priceCategory = priceCategory; }

}
