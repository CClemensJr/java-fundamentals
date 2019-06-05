package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class TheaterTest {
    @Test
    public void canCreateTheater() {
        Theater test = new Theater("The Garland Theater");

        assertTrue(test.getName() == "The Garland Theater");
    }

    @Test
    public void canAddAMovie() {
        Theater test = new Theater("The Garland Theater");

        test.addMovie("The Thing");

        assertTrue(test.getMovies().contains("The Thing"));
    }

    @Test
    public void canAddMovies() {
        Theater test = new Theater("The Garland Theater");

        test.addMovie("The Thing");
        test.addMovie("The Matrix");
        test.addMovie("The Smurfs");
        test.addMovie("The Blues Bros.");

        assertTrue(test.getMovies().contains("The Thing") &&
                test.getMovies().contains("The Matrix") &&
                test.getMovies().contains("The Smurfs") &&
                test.getMovies().contains("The Blues Bros."));
    }

    @Test
    public void canRemoveAMovie() {
        Theater test = new Theater("The Garland Theater");

        test.addMovie("The Thing");
        test.addMovie("The Matrix");
        test.addMovie("The Smurfs");
        test.addMovie("The Blues Bros.");

        test.removeMovie("The Smurfs");

        assertTrue(!test.getMovies().contains("The Smurfs"));
    }

    @Test
    public void canRemoveMovies() {
        Theater test = new Theater("The Garland Theater");

        test.addMovie("The Thing");
        test.addMovie("The Matrix");
        test.addMovie("The Smurfs");
        test.addMovie("The Blues Bros.");

        test.removeMovie("The Smurfs");
        test.removeMovie("The Blues Bros.");

        assertTrue(!test.getMovies().contains("The Smurfs") && !test.getMovies().contains("The Blues Bros."));
    }


    @Test
    public void canGetAllMovies() {
        Theater test = new Theater("The Garland Theater");

        test.addMovie("The Thing");
        test.addMovie("The Matrix");
        test.addMovie("The Smurfs");
        test.addMovie("The Blues Bros.");

        String expected = " - The Thing - The Matrix - The Smurfs - The Blues Bros. - ";
        String actual = test.toString();

        assertEquals(expected, actual);
    }


    @Test
    public void canAddAReview() {
        String testBody = "There is a lot of stuff I could say about this theater but I probably won't because I did " +
                "not want to create a full review because that would take forever.";
        String testAuthor = "Chandy La\'Twillian";
        int testRating = 4;

        Review testReview = new Review(testBody, testAuthor, testRating);
        Theater test = new Theater("The Garland Theater");

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
        Theater test = new Theater("The Garland Theater");

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
        int testRating = 4;

        Review testReview1 = new Review(testBody, testAuthor, testRating);
        Theater test = new Theater("The Garland Theater");

        test.addReview((testReview1));

        assertTrue(test.getStarRating() == 4);
    }
}
