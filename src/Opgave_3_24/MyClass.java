package Opgave_3_24;

public class MyClass {

    //Klasse variabler
    static int firstNumber;
    static int secondNumber;
    static String firstString;
    static String secondString;

    public static void main(String[] args) {

        firstNumber = (int) (Math.random() * 13 + 1); //Random nummer mellem 1 og 13
        secondNumber = (int) (Math.random() * 4 + 1); //Random nummer mellem 1 og 4
        PickNumber(); //Vi kalder metoden
        GenerateType(); //Vi kalder metoden
        System.out.println("******************************");
        System.out.println("** Dit kort er: " + firstString  + secondString);
        System.out.println("******************************");
        madeBy(); //Vi kalder metoden

    }

    //Vores metode til at finde nummert ud fra det random nummer vi har genereret mellem 1 og 13
    static void PickNumber() {
        switch (firstNumber){
            case 1:
                firstString = "Ace ";
                break;
            case 2:
                firstString = "2 ";
                break;
            case 3:
                firstString = "3 ";
                break;
            case 4:
                firstString = "4 ";
                break;
            case 5:
                firstString = "5 ";
                break;
            case 6:
                firstString = "6 ";
                break;
            case 7:
                firstString = "7 ";
                break;
            case 8:
                firstString = "8 ";
                break;
            case 9:
                firstString = "9 ";
                break;
            case 10:
                firstString = "10 ";
                break;
            case 11:
                firstString = "Jack ";
                break;
            case 12:
                firstString = "Queen ";
                break;
            case 13:
                firstString = "King ";
                break;
        }
    }

    //Vores metode til at finde typen af kort ud for det tal der er genereret mellem 1 og 4
    static void GenerateType() {
        switch (secondNumber) {
            case 1:
                secondString = "of Clubs";
                break;
            case 2:
                secondString = "of Diamonds";
                break;
            case 3:
                secondString = "of Hearts";
                break;
            case 4:
                secondString = "of Spades";
                break;
        }
    }

    //Made by metoden fordi det er cool
    static void madeBy() {
        System.out.println("");
        System.out.println("******************************");
        System.out.println("******* Kodet af Lasse *******");
        System.out.println("******************************");
    }
}
