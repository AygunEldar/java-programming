package repls04;
import java.util.*;

public class WaterTax {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println(waterTax(in.nextDouble()));


    }

    public static double waterTax(double units) {
        double bill = 0.0;

        //your code here
        if (units < 50) {
            return bill = units * 0.60;


        } else if (units > 50) {
            bill = units * 0.90;
            if (units > 100) {
                bill += 50;

            } else if (units > 150) {

                bill += 100;
            }


            //end your code here


        }//end waterTax
        return bill;
    }
    }

