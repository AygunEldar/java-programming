package day32_array_split;
import java.util.*;

public class ShoppingItems {
    public static void main (String [] args){

        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        System.out.println("-------------FIND THE INDEX oF 'GLOVES' IN ITEM ARRAY--------");

        //use for loop

        for(int i =0; i < items.length; i++){
          //  System.out.println(i + " "+items[i]); for all
            if(items[i].equals("Gloves")) {

                System.out.println("The index of gloves is " + i);
                break; //exit for loop
            }
//                if(items[i].equals("iPad")){
//                    System.out.println("iPad index is " +i);
//                }


            System.out.println("---------Set boolean to true if iPad is found");
            boolean iPadexists = false;
            for(String  each : items){
                if(each.equalsIgnoreCase("iPad")){
                    iPadexists = true;
                    break;
            }

                // System.out.println("iPad index is " +i);
                }


            System.out.println("iPadexists = " +iPadexists);
            }


        System.out.println("----Print airpods of each shopping item------");

        for(int k =0; k < items.length;k++){  //item.length = prices.length ====

            System.out.println(items[k]+"-$ "+prices[k]+" -# "+itemIDs[k]);
        }


        System.out.println("************LOOK for JACKET and ALL DETAILS***********");

        for (int j =0; j < items.length; j++){

            if(items[j].equalsIgnoreCase("Jacket")){
                System.out.println(items[j]+"-$ "+prices[j]+" -# "+itemIDs[j]);
                break;
            }

            System.out.println("******Airpod*****");
            for(int i =0; i< items.length;i++){
                if(items[i].equalsIgnoreCase("airpod")){
                    System.out.println(items[i]+" "+prices[i]+" "+itemIDs[i]);
                }
            }
        }

        }






    }


