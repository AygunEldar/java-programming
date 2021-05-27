package day31_arrays;
import java.util.*;

public class StringArray_Join {
    public static void main(String[] args) {
        String item = "wooden spoon";
        char[]itemArray = item.toCharArray();  //item.toCharArray();
        System.out.println("itemArray.length = " + itemArray.length);
        System.out.println("item.length = " + item.length());
        System.out.println(Arrays.toString(itemArray));
        System.out.println("*****************************");

        String [] fruits = {"bananas", "apples"," kiwi","mango","papaya","strawberry"};
        String fruitStr ="";
        for( String items : fruits){
            System.out.print(items + " -");
            fruitStr += items+ "-";
            System.out.println();
        }
        System.out.println("\nfruitStr = " +fruitStr);

        System.out.println("*****************JOIN********************");

        String [] languages ={"java"," python","c++","sql","ruby","javascript"};

        System.out.println(String.join("|",languages));
        System.out.println(String.join("##",languages));
        String  joinedlanguages =String.join("<>", languages);
        System.out.println("joinedlanguages = " + joinedlanguages);

    }
}
