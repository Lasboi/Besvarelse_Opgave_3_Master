package Opgave_3_14;

import java.util.Scanner;

public class MyClass {

    static int randomNumber;
    static int guessedNumber;
    static String headTails;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        starGenerater();
        System.out.println("** Skriv et tal mellem 1 & 2: ");
        guessedNumber = scanner.nextInt();
        starGenerater();
        System.out.println("** Dit gæt er: " + guessedNumber);
        starGenerater();
        randomNumber = (int) (Math.random() * 2);
        System.out.println("** Vi generere nu et tal: " + randomNumber + " ("+ headTails + ")");
        checkGuess();

    }

    static void checkGuess() {
        if (guessedNumber == randomNumber)
            System.out.println("** Du gættede rigtigt!");
        else
            System.out.println("** Desværre men du tog fucking fejl");
    }


    static void starGenerater() {
        System.out.println("******************************");
    }
}
