package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {
    @Test
    public void canCreateAnEmptyReview() {
        Review test = new Review();

        assertTrue(test.getNumberOfStars() == 1);
    }

    @Test
    public void canCreateACompleteReview() {
        String testBody = "There is a lot of stuff I could say about this restaurant but I probably won't because I did " +
                          "not want to create a full review because that would take forever.";
        String testAuthor = "Chandy La\'Twillian";
        int testRating = 5;

        Review test = new Review(testBody, testAuthor, testRating);

        assertTrue(test.getAuthor() == testAuthor);
    }

    @Test
    public void canGetStringWithReviewDetails() {
        String testBody = "There is a lot of stuff I could say about this restaurant but I probably won't because I did " +
                "not want to create a full review because that would take forever.";
        String testAuthor = "Chandy La\'Twillian";
        int testRating = 5;

        Review test = new Review(testBody, testAuthor, testRating);

        assertTrue(test.getAuthor() == testAuthor);
    }
}
