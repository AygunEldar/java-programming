package day32_array_split;
import java.util.*;

public class Shopping_expensive {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

//        System.out.println(Arrays.toString(items));
//        System.out.println(Arrays.toString(prices));
//        System.out.println(Arrays.toString(itemIDs));



        double maxPrice =prices [0];
   int idxMaxPrice =0;
       // int count =0;
         for(int i =0; i< prices.length; i++){

             if(prices[i] > maxPrice){
             //    count++;
                 maxPrice =prices[i];
                idxMaxPrice=i;
             }
         }
        System.out.println("MAx Price "+maxPrice);
        System.out.println("Index of "+idxMaxPrice);
        System.out.println(items[idxMaxPrice ]+ " - $" + prices[idxMaxPrice] + " --"+ itemIDs[idxMaxPrice]);

        System.out.println("----------------LOWER--------------");



        double minPrice =prices [0];
        int idxMinPrice =0;

        for(int i =0; i< prices.length; i++){

            if(prices[i] < minPrice){
                //    count++;
                minPrice =prices[i];
                idxMinPrice=i;
            }
        }
        System.out.println("Min Price "+minPrice);
        System.out.println("Index of "+idxMinPrice);
        System.out.println(items[idxMinPrice ]+ " - $" + prices[idxMinPrice] + " --"+ itemIDs[idxMinPrice]);



    }
}
