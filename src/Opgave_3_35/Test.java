package Opgave_3_35;

public class Test {

    public static void main(String[] args) {
        testTalletLige();
        testTalletUlige();
    }

    //Test Case - Tjek om det er lige
    //Input 20
    //Forventet output = ** 20 er et lige tal.

    public  static void testTalletLige() {

        if (20 % 2 == 0) {
            System.out.println("** " + 20 + " er et lige tal.");
        }
        else
            System.out.println("** " + 20 + " er et ulige tal.");
    }

    //Test Case - Tjek om det er ulige
    //Input 21
    //Forventet output = ** 21 er et ulige tal.

    public  static void testTalletUlige() {

        if (21 % 2 == 0) {
            System.out.println("** " + 21 + " er et lige tal.");
        }
        else
            System.out.println("** " + 21 + " er et ulige tal.");
    }

}
