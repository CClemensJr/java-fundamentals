/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
/*********
 * roll tests
 * */
    @Test
    public void rollShouldReturnArray() {
        Library lib = new Library();
        int numOfRolls = 5;
        int[] allRolls = lib.roll(numOfRolls);

        assertTrue(allRolls.length == 5);
    }

/*********
 * containsDuplicates tests
 * */
    @Test
    public void containsDuplicatesShouldReturnTrue() {
        Library lib = new Library();
        int[] arr = { 1, 2, 2, 4, 5 };

        assertTrue(lib.containsDuplicates(arr));
    }

/*********
 * calcAvg tests
 * */
    @Test
    public void calcAvgShouldReturnAvg() {
        Library lib = new Library();
        int[] arr = { 1, 2, 2, 4, 5 };
        double expectedAvg = 2.8;

        assertTrue(lib.calcAvg(arr) == expectedAvg);
    }

/*********
 * calcAllAvgs tests
 * */
    @Test
    public void calcAllAvgsShouldReturnArray() {
        Library lib = new Library();
        int[][] arr = { { 1, 2, 2, 4, 5 }, { 5, 3, 8, 2 } };


        assertTrue(lib.calcAllAvgs(arr).length == 2);
    }
}


