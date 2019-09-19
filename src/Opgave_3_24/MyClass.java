package Opgave_3_24;

public class MyClass {

    static int firstNumber;
    static int secondNumber;
    static String firstString;
    static String secondString;

    public static void main(String[] args) {

        firstNumber = (int) (Math.random() * 13 + 1);
        secondNumber = (int) (Math.random() * 4 + 1);
        PickNumber();
        GenerateType();
        System.out.println("******************************");
        System.out.println("** Dit kort er: " + firstString + " " + secondString);
        madeBy();

    }

    static void PickNumber() {
        switch (firstNumber){
            case 1:
                firstString = "Ace ";
            case 2:
                firstString = "2 ";
            case 3:
                firstString = "3 ";
            case 4:
                firstString = "4 ";
            case 5:
                firstString = "5 ";
            case 6:
                firstString = "6 ";
            case 7:
                firstString = "7 ";
            case 8:
                firstString = "8 ";
            case 9:
                firstString = "9 ";
            case 10:
                firstString = "10 ";
            case 11:
                firstString = "Jack ";
            case 12:
                firstString = "Queen ";
            case 13:
                firstString = "King ";
        }
    }

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
