package officehour03_10;

import java.util.Scanner;

public class MovieDuration2 {
    public static void main (String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the movie: ");

        double movielength = input.nextDouble();
        double price =0;
        if (movielength == 1.0) {
            price= 8.99;
           // System.out.println("Price: " +price);
        }
        if (movielength == 1.5) {
            price=10.50;
           // System.out.println("Price: " + price);
        }
        if (movielength == 2.0) {
            price = 12.99;
           // System.out.println("Price: " + price);
        }
        if (movielength == 2.5) {
            price =14.50;
           // System.out.println("Price: " + price);
        }
        if (movielength >= 3.0) {
            price=15.0;
          //  System.out.println("Price: " + price);
        }
        if (movielength > 0){
            System.out.println("Price: " + price);
        }else{
            System.out.println("Invalid length");

        }
    }

}