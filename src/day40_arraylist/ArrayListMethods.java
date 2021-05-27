package day40_arraylist;

import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {

        List<String> shoppingList = new ArrayList<>();
        System.out.println(" size = " + shoppingList.size());
        System.out.println("Is empty? = " +shoppingList.isEmpty());

        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");

        }else{
            System.out.println("List is not empty, code java then go to mall");
        }

        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("Java book");
        shoppingList.add("tesla");


        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");

        }else{
            System.out.println("List is not empty, code java then go to mall");
        }



        int count = shoppingList.size();

        System.out.println("items to buy = " + count);

        System.out.println("Are shoes in my list? " + shoppingList.contains("shoes"));

        if(shoppingList.contains("shoes")){
            System.out.println("First buy it");
        }else{
            System.out.println("Shoes are not important");
        }

        System.out.println("Buying shoes ...80$");

        shoppingList.remove("shoes");  //remove(0);
        System.out.println("Shopping list-- "+ shoppingList);

        System.out.println("Done shopping, get back to coding");
        shoppingList.clear();  // cleared all the list
        System.out.println(shoppingList);



    }
}
