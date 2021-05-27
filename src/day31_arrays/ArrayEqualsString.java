package day31_arrays;
import java.util.*;

public class ArrayEqualsString {
    public static void main(String[] args) {
        String[] cars1 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars2 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars3 = {"toyota","honda", "tesla","bmw", "dodge"};
        String[] cars4 = {"Toyota","Honda", "Tesla"};

        System.out.println("cars1 == cars2 ---->" +Arrays.equals(cars1, cars2));
        System.out.println("cars2 == cars3 ---->" +Arrays.equals(cars2, cars3));

        if(Arrays.toString(cars2).equalsIgnoreCase(Arrays.toString(cars3))){
            System.out.println("cars2 == cars3 match - ignorecase");
        }


    }
}
