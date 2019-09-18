package Opgave_3_6;

import java.util.Scanner;

public class MyClass {

    //Vi instansiere 2 klasse variabler som vi kan tilgå fra vores metoder
    static String result;
    static double bmi;

    public static void main(String[] args) {

        //Vi laver to instans variabler
        int weight;
        double height;

        //Vi opretter et nyt objekt af Scanner klassen
        Scanner scanner = new Scanner(System.in);


        System.out.println("*************************");
        System.out.print("** Skriv din vægt i kg: ");
        weight = scanner.nextInt(); //Vi tager input fra brugeren og sætter dataen til variablet height
        System.out.println("*************************");
        System.out.print("** Skriv din højde i cm: ");
        height = scanner.nextInt(); //Vi tager input fra brugeren og sætter dataen til variablet height
        System.out.println("*************************");
        height = height / 100; //Vi omregner lige højden så vi kan bruge dataen i vores regnestykke
        bmi = weight / (height * height); //Vi udregner BMI
        setResult(); //Vi kalder meotden
        System.out.println("** Dit BMI er: " + bmi);
        System.out.println("** Din kropstype er " + result);
        madeBy(); //Why not?

    }

    //Vores meotde til at sætte kropstypen
    static void setResult() {
        if (bmi < 18.5)
            result = "Undervægtig";
        else if (bmi > 18.5 && bmi < 25)
            result = "Normalvægtig";
        else if (bmi > 25 && bmi < 30)
            result = "Overvægtig";
        else
            result = "Svær overvægtig";
    }

    //Made by metoden fordi det er cool
    static void madeBy() {
        System.out.println("");
        System.out.println("******************************");
        System.out.println("******* Kodet af Lasse *******");
        System.out.println("******************************");
    }
}
