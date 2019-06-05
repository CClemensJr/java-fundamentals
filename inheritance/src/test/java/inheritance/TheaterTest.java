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
}
