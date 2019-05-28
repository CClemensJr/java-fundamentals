import java.time.LocalDateTime;

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

        System.out.println("It took " + countTotalFlips + " to flip " + n + " heads in a row.");
    }


    /***************
     * CLOCK
     * Constantly print out the current time to the console
     */
    public static void clock() {
        // create a LocalDateTime object
        LocalDateTime current = LocalDateTime.now();

        String time = current.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        // loop displaying the updated time each second.
        System.out.println(time);
    }
}