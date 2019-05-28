import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //call pluralize
        int numberOfDogs = 2;
        System.out.println("I have " + numberOfDogs + " " + pluralize("dog", numberOfDogs) + ".");

        int numberOfCats = 1;
        System.out.println("I have " + numberOfCats + " " + pluralize("cat", numberOfCats) + ".");

        int numberOfHamsters = 0;
        System.out.println("I have " + numberOfHamsters + " " + pluralize("hamster", numberOfHamsters) + ".");
        
        //call flipNHeads
        flipNHeads(5);

        //call clock
        clock();
    }


    /******************
     * PLURALIZE
     * Accept a string and a number and pluralize the string based on the number
     * @param word
     * @param number
     * @return String
     */

    public static String pluralize(String word, int number) {
        String pluralWord = number == 0 || number > 1 ? word + "s" : word;

        return pluralWord;
    }



    /******************
     * FLIP N HEADS
     * Take a number and simulate a coin flip until heads has appeared that number of times.
     * @param n
     */

    public static void flipNHeads(int n) {
        int countTotalFlips = 0;
        int countHeadsInARow = 0;

        while (countHeadsInARow != n) {
            String coinFace = (Math.random() < .5) ? "tails" : "heads";

            System.out.println(coinFace);

            if (coinFace == "heads") {
                countHeadsInARow++;
            } else {
                countHeadsInARow = 0;
            }

            countTotalFlips++;
        }

        System.out.println("It took " + countTotalFlips + " " + pluralize("flip", countTotalFlips) + " to flip " + n + " heads in a row.");
    }



    /***************
     * CLOCK
     * Constantly print out the current time to the console
     */
    public static void clock() 
    {
        LocalDateTime current = LocalDateTime.now();
        int currentSecond = current.getSecond();
        String time = current.format(DateTimeFormatter.ofPattern("hh:mm:ss"));

        while (current != LocalDateTime.now()) {
            current = LocalDateTime.now();
            
            if (current.getSecond() == currentSecond + 1) {
                System.out.println(time);

                current = LocalDateTime.now();
                currentSecond = current.getSecond();
                time = current.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
            }

            continue;
        }
    }
}