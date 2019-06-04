package inheritance;

public class Review {
/*********
 * Instance Variables
 * */
    private String body;
    private String author;
    private int numberOfStars;


/*********
 * Constructors
 * */
    public Review() {
        this.body = "";
        this.author = "";
        this.numberOfStars = 1;
    }

    public Review(String body, String author, int numberOfStars) {
        this.body = body;
        this.author = author;
        this.numberOfStars = numberOfStars;
    }


/*********
 * Getters and Setters
 * */
    public String getBody() { return this.body; }
    public String getAuthor() { return this.author; }
    public int getNumberOfStars() { return this.numberOfStars; }

    public void setBody(String body) { this.body = body; }
    public void setAuthor(String author) { this.author = author; }
    public void setNumberOfStars(int numberOfStars) { this.numberOfStars = numberOfStars; }


/*********
 * Instance Methods
 * */
    public String toString() {
        return String.format("%s says: \"%s\"  \nRating: %d", this.author, this.body, this.numberOfStars);
    }
}
