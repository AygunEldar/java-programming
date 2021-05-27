package day31_arrays;
import   java.util.*;
public class StringSorting {
    public static void main(String[] args) {

String [] words ={"java","C#","C++","Kotlin","Python","Ruby","Assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println(String.join(", ", words));

        System.out.println(Arrays.toString(words));
        System.out.println("["+String.join(", ", words)+"]");



        //ABC sort
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        System.out.println("*******REVERSE ORDER*******************");

        Arrays.sort(words,Collections.reverseOrder());
        System.out.println(Arrays.toString(words));

    }
}
