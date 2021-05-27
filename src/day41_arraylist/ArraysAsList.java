package day41_arraylist;

import java.util.*;

public class ArraysAsList {
    public static void main(String[] args) {

        List<Integer>nums = Arrays.asList(23, 1, 34, 54, 654);
        System.out.println("nums = "+nums);
       // nums.add(100); UnsupportedoperationException
       // nums.remove(0);UnsupportedoperationException
      //  nums.clear();UnsupportedoperationException

        List<Integer> numsList = new ArrayList<>(Arrays.asList(4, 2, 4, 23, 5334, 100));
        numsList.add(33);
        numsList.add(56);
        System.out.println("numsList = "+numsList);
         numsList.remove(0);
         numsList.remove(new Integer(23));
        System.out.println("numsList = "+numsList);


        /**
         * List String dinksWithCoffeine   -> coffie, tea, monster,red bull, coke, pepsi,
         * mdew, kambucha, celsius
         * int coffeineAmount = 0;
         *
         * monster, red bull, celsius;
         * coffeineAmount = 150
         *
         * coffee, kambucha:
         * coffeineAmount = 112
         *
         * tea, coke, pepsi, mdew;
         * coffeineAmount = 35
         */

        List<String>drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster",
                "red bull", "coke", "pepsi", "mdew", "kambucha", "celsius"));

        System.out.println(drinksWithCaffeine);

        int caffeineAmount =0;
        for(String drink : drinksWithCaffeine){

            if(drink.equals("monster") ||drink.equals("red bull")|| drink.equals( "celsius")){

                caffeineAmount =150;
                System.out.println(drink+"--->" +caffeineAmount);


            }else if(drink.equals("coffee" )|| drink.equals("kambucha")){
                caffeineAmount =112;
                System.out.println(drink+"--->" +caffeineAmount);

            }else if(drink.equals("tea" )|| drink.equals("pepsi")||drink.equals("mdew")){
                caffeineAmount =35;
                System.out.println(drink+"--->" +caffeineAmount);
            }

        }

        for(String drink : drinksWithCaffeine){
            switch(drink){
                case "monster":
                    case "red bull":
                        case "celsius":
                    caffeineAmount =150;
                    System.out.println(drink+"--->" +caffeineAmount);
             break;
                case "coffee": case "kambucha":
                    caffeineAmount =112;
                    System.out.println(drink+"--->" +caffeineAmount);
           break;
                case "tea": case " coke": case "pepsi": case "mdew":
                    caffeineAmount =35;
                    System.out.println(drink+"--->" +caffeineAmount);
           break;

            }
        }
      // it will print each of them from new line

        drinksWithCaffeine.forEach(drink -> System.out.println(drink));
        drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase()));
       // drinksWithCaffeine.forEach(drink -> { enter then if/switch you can write } );
        drinksWithCaffeine.forEach(each ->{
            System.out.println("--------------------");
            System.out.println("each = " + each);
            System.out.println("--------------------" +
                    "");
        } );



    }
}
