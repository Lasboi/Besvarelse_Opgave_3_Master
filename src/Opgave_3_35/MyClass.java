package Opgave_3_35;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {

        //Vi opretter en nyt objekt scanner af Scanner klassen
        Scanner scanner = new Scanner(System.in);

        System.out.println("******************************");
        System.out.print("** Skriv et tal: ");
        int number = scanner.nextInt(); //Vi tager input fra brugeren og sætter værdien som int
        System.out.println("******************************");

        if (number % 2 == 0) { //Vi laver crazy math for at se om tallet er lige eller ulige Yay!
            System.out.println("** " + number + " er et lige tal.");
        }
        else
            System.out.println("** " + number + " er et ulige tal.");

        System.out.println("******************************");
        madeBy(); //Vi kalder metoden


    }

    //Made by metoden fordi det er cool
    static void madeBy() {
        System.out.println("");
        System.out.println("******************************");
        System.out.println("******* Kodet af Lasse *******");
        System.out.println("******************************");
    }

}
