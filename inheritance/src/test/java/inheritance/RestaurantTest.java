package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    @Test
    public void canCreateRestaurantWithDefaultConstructor() {
        Restaurant testerant = new Restaurant("The Testerant Restaurant");

        assertTrue(testerant.getName() == "The Testerant Restaurant");
    }

    @Test
    public void canCreateRestaurantWithCustomConstructor() {
        Restaurant testerant = new Restaurant("The Testerant Restaurant", 4, "$$$");

        assertTrue(testerant.getNumberOfStars() == 4);
    }

    @Test
    public void canGetStringWithRestaurantDetails() {
        Restaurant testerant = new Restaurant("The Testerant Restaurant", 4, "$$$");

        String expected = "Name: The Testerant Restaurant | Rating: 4 | Price: $$$";
        String actual = testerant.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void canAddReviews() {
        String testBody = "There is a lot of stuff I could say about this restaurant but I probably won't because I did " +
                "not want to create a full review because that would take forever.";
        String testAuthor = "Chandy La\'Twillian";
        int testRating = 5;

        Review testReview = new Review(testBody, testAuthor, testRating);
        Restaurant testerant = new Restaurant("The Testerant Restaurant", 4, "$$$");

        testerant.addReview((testReview));

        assertTrue(testerant.getReviews().size() > 0);
    }
}
