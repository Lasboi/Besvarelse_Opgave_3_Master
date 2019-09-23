package Opgave_3_6;

public class Test {
    static int weight;
    static double height;
    static double bmi;

    public static void main(String[] args) {
        testKG();
        testCmToMeter();
        testBMI();
        testBodyType();
    }

    //Test Case - Tjek vægt
    //Input: 90
    //Forventet output: 90 kg
    public static void testKG() {
        weight = 90;
        System.out.println(weight + " kg");
    }

    //Test Case - Fra Cm til Meter
    //Input: 175
    //Forventet output: 1.75 Cm
    public static void testCmToMeter() {
        height = 175;
        height = height / 100;
        System.out.println(height + " Cm");
    }

    //Test Case - Fra input til BMI
    //Input weight = 90, height = 1.75
    //Forventet output: 29.387755102040817 BMI
    public static void testBMI() {
        height = 1.75;
        weight = 90;
        bmi = weight / (height * height);
        System.out.println(bmi + " BMI");

    }

    //Test Case - Kropstype
    //Input BMI = 29.38
    //Forventet output: Overvægtig
    public static void testBodyType() {
        String result;
        bmi = 29.38;

        if (bmi < 18.5)
            result = "Undervægtig";
        else if (bmi > 18.5 && bmi < 25)
            result = "Normalvægtig";
        else if (bmi > 25 && bmi < 30)
            result = "Overvægtig";
        else
            result = "Svær overvægtig";

        System.out.println(result);
    }
}
