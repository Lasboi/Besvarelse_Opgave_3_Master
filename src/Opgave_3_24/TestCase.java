package Opgave_3_24;

public class TestCase {

    //Test Case
    //Input: firstNumber
    //Forventet output 1, Ace || 2, 2 || 3,3 osv....

    static String firstString;
    static int firstNumber;

    public static void main(String[] args) {

        TestNumber();
        TestCheckNumber();

    }

    //Program kode
    static void TestNumber() {
        firstNumber = (int) (Math.random() * 13 + 1);
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

        System.out.println(firstNumber);
        System.out.println(firstString);
    }


    //Test kode
    static void TestCheckNumber() {
        if (firstNumber == 1 && firstString == "Ace ")
            System.out.println("PASS!");
        else if (firstNumber == 2 && firstString == "2 ")
            System.out.println("PASS!");
        else if (firstNumber == 3 && firstString == "3 ")
            System.out.println("PASS!");
        else if (firstNumber == 4 && firstString == "4 ")
            System.out.println("PASS!");
        else if (firstNumber == 5 && firstString == "5 ")
            System.out.println("PASS!");
        else if (firstNumber == 6 && firstString == "6 ")
            System.out.println("PASS!");
        else if (firstNumber == 7 && firstString == "7 ")
            System.out.println("PASS!");
        else if (firstNumber == 8 && firstString == "8 ")
            System.out.println("PASS!");
        else if (firstNumber == 9 && firstString == "9 ")
            System.out.println("PASS!");
        else if (firstNumber == 10 && firstString == "10 ")
            System.out.println("PASS!");
        else if (firstNumber == 11 && firstString == "Jack ")
            System.out.println("PASS!");
        else if (firstNumber == 12 && firstString == "Queen ")
            System.out.println("PASS!");
        else if (firstNumber == 13 && firstString == "King ")
            System.out.println("PASS!");
        else
            System.out.println("FAIL!");
    }
}
