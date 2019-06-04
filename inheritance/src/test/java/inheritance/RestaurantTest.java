package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    @Test
    public void canCreateRestaurantWithDefaultConstructor() {
        Restaurant testerant = new Restaurant("The Testerant Restaurant");

        assertTrue(testerant.getName() == "The Testerant Restaurant");
    }
}
