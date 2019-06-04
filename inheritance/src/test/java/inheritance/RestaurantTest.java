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
}
