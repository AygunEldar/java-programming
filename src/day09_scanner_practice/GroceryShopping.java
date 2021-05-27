package day09_scanner_practice;

import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price1 = scan.nextDouble();
        System.out.println("Enter the price for milk: "+ price1);

        double price2 = scan.nextDouble();
        System.out.println("Enter the price for bread: " +price2);

        double price3 =scan.nextDouble();
        System.out.println("Enter the price for cucumber : " +price3);

        double total =price1+price2+price3;
        System.out.println("Total price: " +total);

    }
}
