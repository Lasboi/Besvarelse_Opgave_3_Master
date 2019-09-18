package Opgave_3_4;

public class MyClass {

    public static void main(String[] args) {

        //Vi gernere et tal mellem 0 og 11. Dette resultat plusser vi 1 til at få vores resultat mellem 1 & 12.
        int random = (int) (Math.random() * 12 + 1);

        System.out.println("Tallet der blev generet er: " + random);
        System.out.println("******************************");

        //Vores switch case som læser værdien i vores random int og hopper ned i den case som tallet lander på
        switch (random) {
            case 1:
                System.out.println("Måneden er: Januar");
                break;
            case 2:
                System.out.println("Måneden er: Februar");
                break;
            case 3:
                System.out.println("Måneden er: Marts");
                break;
            case 4:
                System.out.println("Måneden er: April");
                break;
            case 5:
                System.out.println("Måneden er: Maj");
                break;
            case 6:
                System.out.println("Måneden er: Juni");
                break;
            case 7:
                System.out.println("Måneden er: Juli");
                break;
            case 8:
                System.out.println("Måneden er: August");
                break;
            case 9:
                System.out.println("Måneden er: September");
                break;
            case 10:
                System.out.println("Måneden er: Oktober");
                break;
            case 11:
                System.out.println("Måneden er: November");
                break;
            case 12:
                System.out.println("Måneden er: December");
                break;
            default:
                System.out.println("Hov det ser ikke ud til at vi kan finde den måned...");
                break;
        }

        System.out.println("");
        System.out.println("******************************");
        System.out.println("******* Kodet af Lasse *******");
        System.out.println("******************************");

    }

}
