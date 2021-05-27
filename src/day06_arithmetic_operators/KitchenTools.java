package day06_arithmetic_operators;

public class KitchenTools {
    public static void main (String [] args ){
        int spoons = 36;
        int forks  = 48;
        int knives = 24;
        int glasses = 12;
        int plates = 24;
        int total = spoons+ forks+knives+glasses+plates;
        System.out.println(total);
        System.out.println(forks/knives);
        System.out.println(spoons - forks);
        System.out.println(total/ glasses);
        System.out.println(total / spoons * forks);
        System.out.println("There are " + spoons + " spoons and " + knives + " knives on the table. ");
        System.out.println(glasses + " glasses and "+ plates +" plates are broken." );

    }
}
