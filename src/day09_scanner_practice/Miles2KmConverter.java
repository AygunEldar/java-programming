package day09_scanner_practice;


import java.util.Scanner;

public class Miles2KmConverter {
    public static void main(String[] args) {

        Scanner scan =new Scanner (System.in);

        System.out.println("##### Changed into km ###### ");

        double mile = scan.nextDouble();
        double km = mile*1.609;

        System.out.println(mile * 1.609 +" km");
        System.out.println(mile +" in kilometers is " +km);

    }

}
