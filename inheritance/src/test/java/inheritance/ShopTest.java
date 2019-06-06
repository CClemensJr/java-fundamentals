package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ShopTest {
    @Test
    public void canCreateShopWithDefaultConstructor() {
        Shop test = new Shop();

        assertTrue(test.getName() == "Please set the shop name.");
    }

    @Test
    public void canCreateShopWithCustomConstructor() {
        Shop test = new Shop("The Ant Shop", "The premier shop for purchasing luxury ants.", "$$$$");

        assertTrue(test.getName() == "The Ant Shop");
    }

    @Test
    public void canGetShopDetails() {
        Shop test = new Shop("The Ant Shop", "The premier shop for purchasing luxury ants.", "$$$$");

        String expected = "Name: The Ant Shop \n Description: The premier shop for purchasing luxury ants. \n Price Rating: $$$$";
        String actual = test.toString();

        assertEquals(expected, actual);
    }


    @Test
    public void canAddAReview() {
        String testBody = "There is a lot of stuff I could say about this restaurant but I probably won't because I did " +
                "not want to create a full review because that would take forever.";
        String testAuthor = "Chandy La\'Twillian";
        int testRating = 5;

        Review testReview = new Review(testBody, testAuthor, testRating);
        Shop test = new Shop("The Ant Shop", "The premier shop for purchasing luxury ants.", "$$$$");

        test.addReview((testReview));

        assertTrue(test.getReviews().size() > 0);
    }

    @Test
    public void canAddMultipleReviews() {
        String testBody = "There is a lot of stuff I could say about this restaurant but I probably won't because I did " +
                "not want to create a full review because that would take forever.";
        String testAuthor = "Chandy La\'Twillian";
        int testRating = 5;

        Review testReview1 = new Review(testBody, testAuthor, testRating);
        Review testReview2 = new Review(testBody, testAuthor, testRating);
        Review testReview3 = new Review(testBody, testAuthor, testRating);
        Review testReview4 = new Review(testBody, testAuthor, testRating);
        Review testReview5 = new Review(testBody, testAuthor, testRating);
        Shop test = new Shop("The Ant Shop", "The premier shop for purchasing luxury ants.", "$$$$");

        test.addReview((testReview1));
        test.addReview((testReview2));
        test.addReview((testReview3));
        test.addReview((testReview4));
        test.addReview((testReview5));

        assertTrue(test.getReviews().size() == 5);
    }

    @Test
    public void canUpdateStarRating() {
        String testBody = "There is a lot of stuff I could say about this restaurant but I probably won't because I did " +
                "not want to create a full review because that would take forever.";
        String testAuthor = "Chandy La\'Twillian";
        int testRating = 5;

        Review testReview1 = new Review(testBody, testAuthor, testRating);
        Shop test = new Shop("The Ant Shop", "The premier shop for purchasing luxury ants.", "$$$$");

        test.addReview((testReview1));

        assertTrue(test.getStarRating() == 5);
    }
}
