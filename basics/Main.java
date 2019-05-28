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
        flipNHeads(3);
        //call clock
        clock();

        System.out.println("Allo, love!");
    }

    public static String pluralize(String word, int number) {
        String pluralWord = number == 0 || number > 1 ? word + "s" : word;

        return pluralWord;
    }

    public static void flipNHeads(int n) {
        System.out.println("Allo from flipNHeads!");
    }

    public static void clock() {
        System.out.println("Allo from clock!");
    }
}