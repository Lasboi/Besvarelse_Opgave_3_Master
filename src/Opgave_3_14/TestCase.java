package Opgave_3_14;

public class TestCase {


   static int randomNumber;

    public static void main(String[] args) {

        //Test Case
        //Input: randomNumber = 0
        //Forventet Output: 0 || 1

        //Program kode
        int i = 0;
        while (i < 10) {
            randomNumber = (int) (Math.random() * 2);
            System.out.println(randomNumber);
            i++;
        }

        //Test kode
        if (randomNumber == 0 || randomNumber == 1)
            System.out.println("PASS!");
        else
            System.out.println("FAIL!");
    }
}
