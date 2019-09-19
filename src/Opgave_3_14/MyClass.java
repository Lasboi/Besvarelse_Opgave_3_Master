package Opgave_3_14;

import java.util.Scanner;

public class MyClass {

    static int randomNumber;
    static int guessedNumber;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        randomNumber = (int) (Math.random());
        System.out.println(randomNumber);

    }
}
