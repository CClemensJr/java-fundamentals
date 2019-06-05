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
}
