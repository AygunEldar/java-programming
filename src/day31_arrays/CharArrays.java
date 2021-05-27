package day31_arrays;
import  java.util.*;

public class
CharArrays {
    public static void main(String[] args) {
        char[]letters = {'j','a','v', 'a',' ','i','s',' ','f','u','n'};
        //print each letter using  a loop

        for( char cons : letters){
            System.out.print(cons+ " ");
        }
        System.out.println();

String sentence = new String(letters);
        System.out.println("Sentence - " +sentence);


     String item = "wooden spoon";
     char[]itemArray = item.toCharArray();  //item.toCharArray();
        System.out.println(Arrays.toString(itemArray));
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length = " + item.length());

        System.out.println();

        String [] fruits = {"bananas", "apples"," kiwi","mango","papaya","strawberry"};
        String fruitStr ="";
        for( String items : fruits){
            System.out.print(items + " -");
            fruitStr += items+ "-";
            System.out.println();
        }
        System.out.println("\nfruitStr = " +fruitStr);


        String [] languages ={"java"," python","c++","sql","ruby","javascript"};

        System.out.println(String.join("|",languages));
        System.out.println(String.join("##",languages));
        String  joinedlanguages =String.join("<>", languages);
        System.out.println("joinedlanguages = " + joinedlanguages);




    }
}



