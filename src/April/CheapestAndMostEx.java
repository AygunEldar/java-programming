package April;
import  java.util.*;

public class CheapestAndMostEx {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));


        double max =prices[0];
        int idxMax = 0;

       for(int i =0; i < prices.length; i++){
           if(prices[i] > max){
                 max = prices[i];
               idxMax = i;
           }
       }
        System.out.println(" Max price is " +max);
        System.out.println("index of the most expensive item is " +idxMax);




        double Min = prices[0];
        int idxMin =0;

      for(int k =0; k < prices.length;k++){
          if(prices[k] < Min){
              Min= prices[k];
              idxMin = k;
          }
      }


        System.out.println("The cheapest is " +Min);
        System.out.println("The index of cheapest item is "+idxMin);






    }
}
