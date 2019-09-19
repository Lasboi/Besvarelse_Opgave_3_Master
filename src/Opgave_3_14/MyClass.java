package Opgave_3_14;

import java.util.Scanner;

public class MyClass {

    //Vores klasse variabler
    static int randomNumber;
    static int guessedNumber;
    static String headTails;

    public static void main(String[] args) {

        //Vi opretter en ny scanner
        Scanner scanner = new Scanner(System.in);

        starGenerater(); //Vi kalder vores metode
        System.out.print("** Skriv et tal mellem 0 & 1: ");
        guessedNumber = scanner.nextInt(); //Vi tager input fra brugeren og sætter værdien i guessedNumber
        starGenerater(); //Vi kalder metoden
        System.out.println("** Dit gæt er: " + guessedNumber);
        starGenerater();//Vi kalder metoden
        randomNumber = (int) (Math.random() * 2); //Vi gernere et tal mellem 0 og 1
        checkHeadTails(); //Vi kalder metoden
        System.out.println("** Vi generere nu et tal: " + randomNumber + " ("+ headTails + ")"); //Vi udskriver værdier til skærmen
        checkGuess(); //Vi kalder metoden
        madeBy(); //Vi kalder metoden

    }

    //Vores metode til at tjekke om det gæt man har lavet er korrekt
    static void checkGuess() {
        if (guessedNumber == randomNumber)
            System.out.println("** Du gættede rigtigt!");
        else
            System.out.println("** Desværre men du tog fucking fejl");
    }

    //Vores metode til at sætte Heads eller Tails fra henholdsvis 0 & 1
    static void checkHeadTails() {
        switch (randomNumber) {
            case 0:
                headTails = "Tails";
            default:
                headTails = "Heads";
        }
    }

    //Vi generere en fancy stil
    static void starGenerater() {
        System.out.println("******************************");
    }

    //Made by metoden fordi det er cool
    static void madeBy() {
        System.out.println("");
        System.out.println("******************************");
        System.out.println("******* Kodet af Lasse *******");
        System.out.println("******************************");
    }
}
