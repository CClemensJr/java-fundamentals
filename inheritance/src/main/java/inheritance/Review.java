package inheritance;

public class Review {
/*********
 * Instance Variables
 * */
    private String body;
    private String author;
    private int starRating;



/*********
 * Constructors
 * */
    public Review() {
        this.body = "";
        this.author = "";
        this.starRating = 1;
    }

    public Review(String body, String author) {
        this.body = body;
        this.author = author;
        this.starRating = 0;
    }

    public Review(String body, String author, int numberOfStars) {
        this.body = body;
        this.author = author;
        this.starRating = numberOfStars;
    }

    public Review(String body, String author, int numberOfStars, String movieSeen) {
        this.body = body;
        this.author = author;
        this.starRating = numberOfStars;

    }


/*********
 * Getters and Setters
 * */
    public String getBody() { return this.body; }
    public String getAuthor() { return this.author; }
    public int getStarRating() { return this.starRating; }

    public void setBody(String body) { this.body = body; }
    public void setAuthor(String author) { this.author = author; }
    public void setStarRating(int numberOfStars) { this.starRating = numberOfStars; }


/*********
 * Instance Methods
 * */
    public String toString() {
        return String.format("%s says: \"%s\"  \nRating: %d", this.author, this.body, this.starRating);
    }
}
