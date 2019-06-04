package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {
    @Test
    public void canCreateAnEmptyReview() {
        Review test = new Review();

        assertTrue(test.getNumberOfStars() == 1);
    }
}
