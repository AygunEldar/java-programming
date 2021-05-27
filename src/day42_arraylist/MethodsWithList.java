package day42_arraylist;
import java.util.*;
public class MethodsWithList {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("java");
        words.add("html");
        words.add("selenium");
        words.add("a");
        words.add("input");
        words.add("title");
        //pass the words list to printStrList method
        printStrList(words);

        printStrList(Arrays.asList("selenium", "option", "br", "python", "sql", "api"));

        List<Integer> nums = Arrays.asList(23, 54, 23, 53554, 234, 11, 5, 2);
        int sum =sumIntegerList(nums);
        System.out.println("sum = " + sum);
    }
    /**
     * method name printStrList
     * param: list of String
     * return valid
     * prints all values separated by space in same line
     *
     */
    public static  void  printStrList(List<String> stringList){ //"java","apple","coffee","tea"
        for(String str : stringList){
            System.out.println(str + " ");
        }
        System.out.println();
    }


/**
 * method: sumIntegerList
 * param: list of integers
 * returns int
 * calculates sum of int in the list then return
 */

public static int  sumIntegerList(List<Integer>numList) {
    int sum =0;
    for(int each :numList){
         sum +=each;
    }
    return sum;

}

}

