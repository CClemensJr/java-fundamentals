import sun.print.resources.serviceui;

//import java.time.localDateTime;

public class Main {
    public static void main(String[] args) {
        //call pluralize
        pluralize("Allo", 3);
        //call flipNHeads
        flipNHeads(3);
        //call clock
        clock();

        System.out.println("Allo, love!");
    }

    public static String pluralize(String word, int number) {
        System.out.println("Allo from pluralize!");

        String pluralWord = number == 0 || number > 1 ? word + s : word;

        return pluralWord;
    }

    public static void flipNHeads(int n) {
        System.out.println("Allo from flipNHeads!");
    }

    public static void clock() {
        System.out.println("Allo from clock!");
    }
}