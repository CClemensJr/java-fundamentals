//import java.time.localDateTime;

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

        System.out.println("Allo, love!");
    }

    // Accept a string and a number and pluralize the string based on the number
    public static String pluralize(String word, int number) {
        String pluralWord = number == 0 || number > 1 ? word + "s" : word;

        return pluralWord;
    }

    // Take a number and simulate a coin flip until heads has appeared that number of times.
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

    public static void clock() {
        System.out.println("Allo from clock!");
    }
}