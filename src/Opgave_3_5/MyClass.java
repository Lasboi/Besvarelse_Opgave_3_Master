package Opgave_3_5;

import java.util.Scanner;

public class MyClass {


    //Klasse varibaler som vi kan tilgå fra vores metoder og main metoden
    static int currentDay = 0;
    static int futureDay = 0;

    public static void main(String[] args) {

        //Vi opretter en ny Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hvilken dag på ugen er det?: ");
        currentDay = scanner.nextInt(); //Vi tager input for brugeren og sætter dette input som vores data i currentDay
        System.out.print("Idag er det ");
        generateCurrentDay(); //Vi kalder metoden
        System.out.print("Hvor mange dage frem vil du gerne kigge?: ");
        futureDay = scanner.nextInt(); //Vi tager input for brugeren og sætter dette input som vores data i futureDay
        System.out.print("Om " + futureDay + " dage er det ");
        generateFutureDay(); //Vi kalder metoden

        System.out.println("");
        System.out.println("******************************");
        System.out.println("******* Kodet af Lasse *******");
        System.out.println("******************************");

    }

    //Vores metode som sætter den nuværende dag ud fra input fra brugeren
    static void generateCurrentDay(){
        if (currentDay == 0)
            System.out.println("Søndag");
        else if (currentDay == 1)
            System.out.println("Mandag");
        else if (currentDay == 2)
            System.out.println("Tirsdag");
        else if (currentDay == 3)
            System.out.println("Onsdag");
        else if (currentDay == 4)
            System.out.println("Torsdag");
        else if (currentDay == 5)
            System.out.println("Fredag");
        else if (currentDay == 6)
            System.out.println("Lørdag");
    }

    //Vores metode som sætter den fremtidige dag ud fra brugerens input
    static void generateFutureDay() {
        futureDay = currentDay + futureDay;
        if (futureDay >= 7)
            System.out.println("??? Det er for kompliceret for mig til at jeg kan regne det ud... :(");
        else if (futureDay == 1)
            System.out.println("Mandag");
        else if (futureDay == 2)
            System.out.println("Tirsdag");
        else if (futureDay == 3)
            System.out.println("Onsdag");
        else if (futureDay == 4)
            System.out.println("Torsdag");
        else if (futureDay == 5)
            System.out.println("Fredag");
        else if (futureDay == 6)
            System.out.println("Lørdag");
    }

}
